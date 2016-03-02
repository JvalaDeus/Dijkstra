import java.util.HashMap;

public class testDijkstra {

	public static void main(String[] args) {
		String startNode = "A";
		Graph graphObject = new Graph();
		HashMap<String, HashMap<String, Integer>> testGraph = graphObject
				.getGraph();
		Dijkstra.ShortestPathsDijkstra(testGraph, startNode);
	}
}