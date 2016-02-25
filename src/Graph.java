import java.util.HashMap;
import java.util.Set;

public class Graph {
	HashMap<String, HashMap<String, Integer>> nodesOnGraph = new HashMap<String, HashMap<String, Integer>>();

	public static void main(String[] args) {
		Graph graph = new Graph();
	}

	public Graph() {

		HashMap<String, Integer> nodeA = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeB = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeC = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeD = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeE = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeF = new HashMap<String, Integer>();

		nodeA.put("A", 0);
		nodeA.put("C", 2);
		nodeA.put("F", 3);
		nodeA.put("E", 7);

		nodeB.put("B", 0);
		nodeB.put("F", 6);
		nodeB.put("E", 7);
		nodeB.put("D", 9);

		nodeC.put("C", 0);
		nodeC.put("A", 6);
		nodeC.put("D", 13);

		nodeD.put("D", 0);
		nodeD.put("E", 2);
		nodeD.put("C", 2);

		nodeE.put("E", 0);
		nodeE.put("A", 3);
		nodeE.put("C", 15);
		nodeE.put("D", 31);

		nodeF.put("F", 0);
		nodeF.put("A", 1);
		nodeF.put("B", 3);
		nodeF.put("E", 6);

		nodesOnGraph.put("A", nodeA);
		nodesOnGraph.put("B", nodeB);
		nodesOnGraph.put("C", nodeC);
		nodesOnGraph.put("D", nodeD);
		nodesOnGraph.put("E", nodeE);
		nodesOnGraph.put("F", nodeF);

		getGraph();
	}

	public HashMap<String, HashMap<String, Integer>> getGraph() {
		System.out.println("Here are the connections for node A: "
				+ nodesOnGraph.get("A"));
		Set keys = nodesOnGraph.keySet();
		System.out.println(keys);
		return nodesOnGraph;
	}
}