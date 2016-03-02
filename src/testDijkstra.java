import java.util.HashMap;

/**
 * @author akhil 
 * This is the class that runs Dijkstra's algorithm on the graph I
 * created. It sets the starting node as the node A. Then it runs the
 * shortest paths dijkstra method in the dijkstra class to find the
 * shortest path from A to each node.
 *
 */
public class testDijkstra {

	public static void main(String[] args) {
		String startNode = "A";
		Graph graphObject = new Graph();
		HashMap<String, HashMap<String, Integer>> testGraph = graphObject
				.getGraph();
		Dijkstra.ShortestPathsDijkstra(testGraph, startNode);
	}
}