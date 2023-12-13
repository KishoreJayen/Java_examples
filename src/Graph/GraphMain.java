package Graph;

public class GraphMain {

	
public static void main(String[] args) {
	
	GraphLogic mn = new GraphLogic(3);
	
	mn.addEdges(3, 7);
	mn.addEdges(3, 6);
	mn.addEdges(3, 2);
	mn.addEdges(7 ,4);
	mn.addEdges(7, 2);
	mn.addEdges(6, 2);
	mn.addEdges(4, 9);
	
	mn.print();
}
}
