import java.util.HashMap;

public class testDijkstra {

	public static void main(String[] args) {
		Graph graphObject = new Graph();
		System.out.println(graphObject);
	   	HashMap<String, HashMap<String, Integer>> testGraph = graphObject.getGraph();
		Dijkstra dijkstra = new Dijkstra(testGraph);
	}
}