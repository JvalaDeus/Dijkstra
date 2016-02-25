import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra implements Shorty {
	public HashMap<String, String> path;

	String startNode;
	private ArrayList<Boolean> k; // Selected set
	private ArrayList<String> nodeNames; // node names
	private ArrayList<String> previousNode; // previous node in the shortest
											// path
	private ArrayList<Double> nodeDistance; // distance to this node from,
											// the start node
	public ArrayList<String> nodeIndices; // used primarily to retrieve the
											// indices of various nodes

	public Dijkstra(HashMap<String, HashMap<String, Integer>> nodeDistances,
			String start) {
		// setting all 6 nodes to false in the k arraylist, as none are terminal
		// nodes yet
		k.set(0, false);
		k.set(1, false);
		k.set(2, false);
		k.set(3, false);
		k.set(4, false);
		k.set(5, false);

		// adding all the nodes in the nodeNames arrayList
		nodeNames.set(0, "A");
		nodeNames.set(1, "B");
		nodeNames.set(2, "C");
		nodeNames.set(3, "D");
		nodeNames.set(4, "E");
		nodeNames.set(5, "F");

		// All previous nodes are set to NA (Not Availabe) because there is no
		// starting yet, therefore none have a previous node
		previousNode.set(0, "NA");
		previousNode.set(1, "NA");
		previousNode.set(2, "NA");
		previousNode.set(3, "NA");
		previousNode.set(4, "NA");
		previousNode.set(5, "NA");

		// All distances are inifity because they have not been reached yet, and
		// therefore have no distance yet
		nodeDistance.set(0, Double.POSITIVE_INFINITY);
		nodeDistance.set(1, Double.POSITIVE_INFINITY);
		nodeDistance.set(2, Double.POSITIVE_INFINITY);
		nodeDistance.set(3, Double.POSITIVE_INFINITY);
		nodeDistance.set(4, Double.POSITIVE_INFINITY);
		nodeDistance.set(5, Double.POSITIVE_INFINITY);

		/**
		 * I want to fill those three data structures in the slides. I know I am
		 * supposed to use a priority queue, but I will not at first. Well, I
		 * will use the abstraction. I just think of priority queues as also
		 * including performance
		 */
		// nodes and prev are equivalent to path as follows
		/**
		 * take one node and enter value into nodename, prevnode, start
		 * nodedistance while loop to continously fill arraylists up and update
		 * information
		 */
	}
}