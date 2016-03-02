import java.util.HashMap;
/**
 * @author akhil
 * This class creates the graph that Dijkstra's algorithm will run on.
 */
public class Graph {
	// creates the graph through a hashmap The hashmap contains another hashmap.
	// It goes <NodeName, <Node connected to the nodename, distance between the
	// two>
	HashMap<String, HashMap<String, Integer>> nodesOnGraph = new HashMap<String, HashMap<String, Integer>>();

	public Graph() {
		// the 6 nodes
		HashMap<String, Integer> nodeA = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeB = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeC = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeD = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeE = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeF = new HashMap<String, Integer>();

		// the distance between each node and the nodes it is directly connected to
		nodeA.put("C", 2);
		nodeA.put("F", 3);
		nodeA.put("E", 7);

		nodeB.put("F", 6);
		nodeB.put("E", 7);
		nodeB.put("D", 9);

		nodeC.put("A", 6);
		nodeC.put("D", 13);

		nodeD.put("E", 2);
		nodeD.put("C", 2);

		nodeE.put("A", 3);
		nodeE.put("C", 15);
		nodeE.put("D", 31);

		nodeF.put("A", 1);
		nodeF.put("B", 3);
		nodeF.put("E", 6);

		// puts the nodes and their connections on the graph
		nodesOnGraph.put("A", nodeA);
		nodesOnGraph.put("B", nodeB);
		nodesOnGraph.put("C", nodeC);
		nodesOnGraph.put("D", nodeD);
		nodesOnGraph.put("E", nodeE);
		nodesOnGraph.put("F", nodeF);

	}

	// gets the graph and prints it out to see how it looks.
	public HashMap<String, HashMap<String, Integer>> getGraph() {
		System.out.println("Graph Below" + "\n" + nodesOnGraph);
		return nodesOnGraph;
	}
}