package com.atishay.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	public static void main(String[] args) {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);

		// assigning neighbours
		v1.addNeighbours(v2);
		v1.addNeighbours(v4);
		v2.addNeighbours(v3);
		v4.addNeighbours(v5);

		// Performing Breadth First Search O(V+E)
		performBFS(v1);
	}

	private static void performBFS(Vertex vertex) {
		if (vertex != null) {

			Queue<Vertex> queue = new LinkedList<>();
			vertex.setVisited(true);
			queue.add(vertex);

			while (!queue.isEmpty()) {
				Vertex node = queue.poll();
				// Printing in FIFO(First In First Out)
				System.out.println(node.getData());

				if (!node.getNeighBours().isEmpty()) {
					for (Vertex tempNode : node.getNeighBours()) {
						if (!tempNode.isVisited()) {
							tempNode.setVisited(true);
							queue.add(tempNode);
						}
					}
				}
			}
		}
	}
}

class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighBours;

	public Vertex(int data) {
		super();
		this.data = data;
		neighBours = new ArrayList<>();
	}

	public void addNeighbours(Vertex vertex) {
		neighBours.add(vertex);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighBours() {
		return neighBours;
	}

	public void setNeighBours(List<Vertex> neighBours) {
		this.neighBours = neighBours;
	}
}
