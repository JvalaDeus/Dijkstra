import java.util.HashMap;

public class testDijkstra {

	public static void main(String[] args){
		testDijkstra tD = new testDijkstra();
	}
	public testDijkstra(){
		Graph graphObject = new Graph();
		HashMap<String, HashMap<String, Integer>> graph = Graph.getGraph();
		Dijkstra dijkstra = new Dijkstra(graph);
	}
}