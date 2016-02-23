import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {
	public HashMap<String, String> path;

	String startNode;
	private ArrayList<Boolean> k; // Selected set
	private ArrayList<String> nodes; // node names
	private ArrayList<String> prev; // previous node in the shortest path
	private ArrayList<Integer> d; // distance to this node from, the start node

	public Dijkstra(HashMap<String, HashMap<String, Integer>> nodeDistances, String start) {

		/**
		 * I want to fill those three data structures in the slides. I know I am
		 * supposed to use a priority queue, but I will not at first. Well, I
		 * will use the abstraction. I just think of priority queues as also
		 * including performance
		 */
		// nodes and prev are equivalent to path as follows
	}

	private void play() {
		String[] nodes = {"G", "H", "D"};
		HashMap<String, HashMap<String, Integer>> distanceGraph;
		/**
		 * The following hashmap needs to be printed out as a graph
		 */
		distanceGraph = new HashMap<String, HashMap<String, Integer>>();
		
		//Node initialization to be encapsulated
		String startNode = "G";
		HashMap<String, Integer> Gconnections;
		Gconnections = new HashMap<String, Integer>();
		
		String nodeH = "H";
		HashMap<String, Integer> Hconnections;
		Hconnections = new HashMap<String, Integer>();
		
		String nodeD = "D";
		HashMap<String, Integer> Dconnections;
		Dconnections = new HashMap<String, Integer>();
		
		Gconnections.put(nodeH, 3);
		Gconnections.put(nodeD, 2);
		
		distanceGraph.put(startNode, Gconnections);
		Dijkstra myD = new Dijkstra(distanceGraph, startNode);
		ArrayList<String> myPath = new ArrayList<String>();
		ArrayList<String> myPathfromnp = new ArrayList<String>();
		String nodeInPath = "B";
		myPath.add(nodeInPath);

		myPathfromnp.add(nodeInPath);

		while (!nodeInPath.equals("A")) {
			nodeInPath = path.get(nodeInPath);
			myPath.add(nodeInPath);
		}

		while (!myPathfromnp.equals("A")) {
			int indexInNode = nodes.indexOf(nodeInPath);
			nodeInPath = prev.get(indexInNode);
			nodeInPath = path.get(nodeInPath);
			myPath.add(nodeInPath);
		}
	}
}