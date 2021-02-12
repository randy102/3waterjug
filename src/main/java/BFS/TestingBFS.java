package BFS;

public class TestingBFS {

	public static void main(String[] args) {
		
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addAdjacentVertex(vertex3);
		vertex1.addAdjacentVertex(vertex5);
		vertex3.addAdjacentVertex(vertex4);
		vertex5.addAdjacentVertex(vertex2);
		
		breadthFirstSearch.bfs(vertex1);

	}
}
