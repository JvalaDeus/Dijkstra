import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Graph {
	HashMap<String, HashMap<String, Integer>> nodesOnGraph = new HashMap<String, HashMap<String, Integer>>();

	public Graph() {
		HashMap<String, Integer> nodeA = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeB = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeC = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeD = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeE = new HashMap<String, Integer>();
		HashMap<String, Integer> nodeF = new HashMap<String, Integer>();

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

		nodesOnGraph.put("A", nodeA);
		nodesOnGraph.put("B", nodeB);
		nodesOnGraph.put("C", nodeC);
		nodesOnGraph.put("D", nodeD);
		nodesOnGraph.put("E", nodeE);
		nodesOnGraph.put("F", nodeF);

		// System.out.println("in contructor" + nodesOnGraph);
		// System.out.println("testing startnode " +nodesOnGraph.get("A"));
	}

	public HashMap<String, HashMap<String, Integer>> getGraph() {
		System.out.println(nodesOnGraph);
		return nodesOnGraph;
	}
}