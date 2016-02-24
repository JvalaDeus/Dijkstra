import java.util.HashMap;

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
		HashMap<String, Integer> nodeF = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeG = new HashMap<String, Integer>();

		nodeA.put("A", 0);
		nodeA.put("C", 2);
		nodeA.put("G", 3);
		nodeA.put("F", 7);

		nodeB.put("B", 0);
		nodeB.put("G", 6);
		nodeB.put("F", 7);
		nodeB.put("D", 9);

		nodeC.put("C", 0);
		nodeC.put("A", 6);
		nodeC.put("D", 13);

		nodeD.put("D", 0);
		nodeD.put("F", 2);
		nodeD.put("C", 2);

		nodeF.put("F", 0);
		nodeF.put("A", 3);
		nodeF.put("C", 15);
		nodeF.put("D", 31);

		nodeG.put("G", 0);
		nodeG.put("A", 1);
		nodeG.put("B", 3);
		nodeG.put("F", 6);

		nodesOnGraph.put("A", nodeA);
		nodesOnGraph.put("B", nodeB);
		nodesOnGraph.put("C", nodeC);
		nodesOnGraph.put("D", nodeD);
		nodesOnGraph.put("F", nodeF);
		nodesOnGraph.put("G", nodeG);

		getGraph();
	}

	public HashMap<String, HashMap<String, Integer>> getGraph() {
		System.out.println("Here are the connections for node A: "
				+ nodesOnGraph.get("A"));
		return nodesOnGraph;
	}
}