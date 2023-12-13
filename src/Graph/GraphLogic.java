package Graph;

import java.util.ArrayList;

public class GraphLogic {

	ArrayList<Edges> edges = new ArrayList<Edges>();
	int vertics;
	
	public GraphLogic(int vertics) {
		this.vertics= vertics;
	}
	
	public void addEdges(int source, int destination) {
		
		Edges edge = new Edges (source, destination);
		edges.add(edge);
		
	}
	public void print() {
		edges.forEach(edge -> {
			System.out.println(edge.getSource()+ " "+ edge.getDestination());
		});
	}
}
