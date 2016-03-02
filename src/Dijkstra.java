import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//This is the class that implements the Algorithm to find the shortest path
public class Dijkstra {
	// This is the method that actually implements the algorithm. It takes two
	// arguments, graph and current node. It then calls init and initializes the
	// graph, path, the visited Nodes arrayList, the nodeNames arraylist, the
	// predecssor (previous node) arraylist and the node distance arraylist.
	public static void ShortestPathsDijkstra(
			HashMap<String, HashMap<String, Integer>> graph, String currentNode) {

		HashMap<String, String> path = new HashMap<String, String>();
		ArrayList<Boolean> visitedNodes = new ArrayList<Boolean>();
		ArrayList<String> nodeNames = new ArrayList<String>();
		ArrayList<String> predecessors = new ArrayList<String>();
		ArrayList<Integer> nodeDistances = new ArrayList<Integer>();

		init(graph, path, visitedNodes, nodeNames, predecessors, nodeDistances,
				currentNode);

		// This while loops ends the program if all the nodes have been visited
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

				// if not visited, it checks the distance between the old
				// distance and the new. If the new is smaller, it replaces the
				// older one and if it is larger, it ignores the value

				if (visitedNodes.get(index) == false) {
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
		// prints the result of dijkstra for every arraylist, plus the graph.
		printOutput(graph, path, visitedNodes, nodeNames, predecessors,
				nodeDistances, currentNode);

	}

	// initalizes every arraylist, the graph, and start node. It also makes a
	// set of the keys for the graph
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

	// this mehtod finds the next node. It sets the distances to the max value,
	// so the next value it finds will automatically replace it.
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

	// Simply prints the result
	public static void printOutput(
			HashMap<String, HashMap<String, Integer>> graph,
			HashMap<String, String> path, ArrayList<Boolean> visitedNodes,
			ArrayList<String> nodeNames, ArrayList<String> predecessors,
			ArrayList<Integer> nodeDistances, String startNode) {

		System.out.println("Final Tables: " + "\n" + nodeNames + "\n" + nodeDistances
				+ "\n" + predecessors);
	}
}