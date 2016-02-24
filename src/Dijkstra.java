import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra implements Shorty {
	public HashMap<String, String> path;

	String startNode;
	private ArrayList<Boolean> k; // Selected set
	private ArrayList<String> nodeNames; // node names
	private ArrayList<String> previousNode; // previous node in the shortest path
	private ArrayList<Integer> startNodeDistance; // distance to this node from, the start node
	public ArrayList<String> nodeIndices; // used primarily to retrieve the
											// indices of various nodes
	public String anchorNode = "A";
	
	public Dijkstra(HashMap<String, HashMap<String, Integer>> nodeDistances,
			String start) {

		/**
		 * I want to fill those three data structures in the slides. I know I am
		 * supposed to use a priority queue, but I will not at first. Well, I
		 * will use the abstraction. I just think of priority queues as also
		 * including performance
		 */
		// nodes and prev are equivalent to path as follows
		/**
		 * take one node and enter value into nodename, prevnode, start nodedistance
		 * while loop to continously fill arraylists up and update information
		 * 
		 */
	}

}