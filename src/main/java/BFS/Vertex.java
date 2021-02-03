package BFS;

import java.util.ArrayList;
//import java.util.List;

public class Vertex<T> {

	private T data;
	private boolean visited;
	private ArrayList<Vertex> neighbourList;
	
	public Vertex(T data){
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public ArrayList<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void addNeighbour(Vertex neighbour) {
		this.neighbourList.add(neighbour);
	}
	
	@Override
	public String toString() {
		return "" + this.data;
	}
}
