package BFS;

import java.util.*;

public class BreadthFirstSearch {

	public void bfs(Vertex root){
		
		Queue<Vertex> queue = new LinkedList<>();
                
		root.setVisited(true);
		queue.add(root);
		               
		while( !queue.isEmpty() ){
			
			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex + " ");
			
                        ArrayList<Vertex> neighbours = actualVertex.getNeighbourList();
                        
                        for (int i = 0; i < neighbours.size(); i++) { 		      
                            Vertex v = neighbours.get(i);
                            
                            if( !v.isVisited() ){
				v.setVisited(true);
				queue.add(v);
                            }
			}			
		}
	}
}
