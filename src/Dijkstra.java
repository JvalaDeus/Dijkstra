import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra implements Shorty {
	public HashMap<String, String> path;

	String startNode = "A";
	private ArrayList<Boolean> k; // Selected set
	private ArrayList<String> nodeNames; // node names
	private ArrayList<String> previousNode; // previous node in the shortest
											// path
	private ArrayList<Double> nodeDistance; // distance to this node from,
											// the start node
	public ArrayList<String> nodeIndices; // used primarily to retrieve the
											// indices of various nodes

	public Dijkstra(HashMap<String, HashMap<String, Integer>> graph) {
		init();
		buildingGraph();
		// nodes and prev are equivalent to path as follows
		/**
		 * take one node and enter value into nodename, prevnode, start
		 * nodedistance while loop to continously fill arraylists up and update
		 * information
		 */
	}

	public void init() {
		// setting all 6 nodes to false in the k arraylist, as none are selected
		// nodes yet
		k.add(0, false);
		k.add(1, false);
		k.add(2, false);
		k.add(3, false);
		k.add(4, false);
		k.add(5, false);

		// adding all the nodes in the nodeNames arrayList
		nodeNames.add(0, "A");
		nodeNames.add(1, "B");
		nodeNames.add(2, "C");
		nodeNames.add(3, "D");
		nodeNames.add(4, "E");
		nodeNames.add(5, "F");

		// All previous nodes are set to NA (Not Availabe) because there is no
		// starting yet, therefore none have a previous node
		previousNode.add(0, "NA");
		previousNode.add(1, "NA");
		previousNode.add(2, "NA");
		previousNode.add(3, "NA");
		previousNode.add(4, "NA");
		previousNode.add(5, "NA");

		// All distances are inifity because they have not been reached yet, and
		// therefore have no distance yet
		nodeDistance.add(1, Double.POSITIVE_INFINITY);
		nodeDistance.add(1, Double.POSITIVE_INFINITY);
		nodeDistance.add(2, Double.POSITIVE_INFINITY);
		nodeDistance.add(3, Double.POSITIVE_INFINITY);
		nodeDistance.add(4, Double.POSITIVE_INFINITY);
		nodeDistance.add(5, Double.POSITIVE_INFINITY);
	}

	public static void buildingGraph() {

	}

	public static void printOutput() {

	}
}