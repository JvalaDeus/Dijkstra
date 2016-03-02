import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Dijkstra {

	public static void ShortestPathsDijkstra(
			HashMap<String, HashMap<String, Integer>> graph, String currentNode) {

		HashMap<String, String> path = new HashMap<String, String>();
		ArrayList<Boolean> visitedNodes = new ArrayList<Boolean>();
		ArrayList<String> nodeNames = new ArrayList<String>();
		ArrayList<String> predecessors = new ArrayList<String>();
		ArrayList<Integer> nodeDistances = new ArrayList<Integer>();

		init(graph, path, visitedNodes, nodeNames, predecessors, nodeDistances,
				currentNode);

		while (true) {

			if (!(visitedNodes.contains(false))) {
				break;
			}

			currentNode = nodeNames.get(getNextCurrentNodeIndex(nodeDistances,
					visitedNodes));

			HashMap<String, Integer> edgeSet = graph.get(currentNode);
			Set<String> adjacentNodes = edgeSet.keySet();

			for (String Key : adjacentNodes) {

				int index = nodeNames.indexOf(Key);

				if (visitedNodes.get(index) == false) { // if not visited

					int oldDistance = nodeDistances.get(index);
					int newDistance = graph.get(currentNode).get(Key)
							+ nodeDistances.get(nodeNames.indexOf(currentNode));

					if (oldDistance > newDistance) {
						nodeDistances.set(index, newDistance);
						predecessors.set(index, currentNode);
					}

				}

				visitedNodes.set(nodeNames.indexOf(currentNode), true);

			}

		}
		printOutput(graph, path, visitedNodes, nodeNames, predecessors,
				nodeDistances, currentNode);

	}

	public static void init(HashMap<String, HashMap<String, Integer>> graph,
			HashMap<String, String> path, ArrayList<Boolean> visitedNodes,
			ArrayList<String> nodeNames, ArrayList<String> predecessors,
			ArrayList<Integer> nodeDistances, String startNode) {

		Set<String> keys = graph.keySet();

		for (String key : keys) {
			visitedNodes.add(false);
			predecessors.add(null);
			nodeDistances.add(Integer.MAX_VALUE);
			nodeNames.add(key);
		}

		visitedNodes.set(nodeNames.indexOf(startNode), true);
		nodeDistances.set(nodeNames.indexOf(startNode), 0);
		predecessors.set(nodeNames.indexOf(startNode), "-");

	}

	private static int getNextCurrentNodeIndex(
			ArrayList<Integer> nodeDistances, ArrayList<Boolean> visitedNodes) {
		if (visitedNodes.size() < 1) {
			System.err.println("ArrayList<Double> not long enough");
		}
		int index = 0;
		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < nodeDistances.size(); i++) {
			if (nodeDistances.get(i) < minDistance
					&& visitedNodes.get(i) == false) {
				minDistance = nodeDistances.get(i);
				index = i;
			}
		}
		// System.out.println("nextCurrentNodeIndex " + index);
		return index;
	}

	public static void printOutput(
			HashMap<String, HashMap<String, Integer>> graph,
			HashMap<String, String> path, ArrayList<Boolean> visitedNodes,
			ArrayList<String> nodeNames, ArrayList<String> predecessors,
			ArrayList<Integer> nodeDistances, String startNode) {

		System.out.println("Final Tables: " + nodeNames + "\n" + nodeDistances
				+ "\n" + predecessors);
	}
}