package com.company;

import java.util.ArrayList;

public class AdjacencyList {

    private final ArrayList<Vertex> listOfVerticies;       // stores the list of verticies

    public AdjacencyList() {
        this.listOfVerticies = new ArrayList<>();
    }  // stores the list of verticies

    public void addVertex(Vertex vertex) {
        listOfVerticies.add(vertex);
    }  // method for adding vertices to the list

    public void addUndirectedWeightedEdge(Vertex fromVertex, Vertex toVertex, Integer weight) {   // method for adding undirected edges to the list
        if (!listOfVerticies.contains(fromVertex) && listOfVerticies.contains(toVertex)) {
            System.out.println("Vertex is missing");
            return;
        }
        Edge newEdgeFromTO = new Edge(fromVertex,toVertex,weight);       // creates edge from vertex1 to other vertex2
        Edge newEdgeToFrom = new Edge(toVertex,fromVertex,weight);       // creates edge from vertex2 to vertex 1
    }

    public void printAdjacencyGraph () {                                                       // method for printing the graphs
        for (int i = 0; i < listOfVerticies.size(); i++) {
            System.out.println("Vertex " + listOfVerticies.get(i).getCityName() + " is connected to: ");
            Vertex currentVertex = getListOfVerticies().get(i);
            for (Edge e: currentVertex.getOuterEdge()) {
                System.out.println("        " + e.getToVertex() + "     with weight: " + e.getWeight());
            }
        }
    }
    public ArrayList<Vertex> getListOfVerticies() {     // getter method for the list of verticies
        return listOfVerticies;
    }
}
