package com.company;

import java.util.ArrayList;

public class AdjacencyList {

    private ArrayList<Vertex> listOfVerticies;

    public AdjacencyList() {
        this.listOfVerticies = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        listOfVerticies.add(vertex);
    }

    public void addUndirectedWeightedEdge(Vertex fromVertex, Vertex toVertex, Integer weight) {
        if (!listOfVerticies.contains(fromVertex) && listOfVerticies.contains(toVertex)) {
            System.out.println("Vertex is missing");
            return;
        }
        Edge newEdgeFromTO = new Edge(fromVertex,toVertex,weight);
        Edge newEdgeToFrom = new Edge(toVertex,fromVertex,weight);
    }

    public void printAdjacencyGraph () {
        for (int i = 0; i < listOfVerticies.size(); i++) {
            System.out.println("Vertex " + listOfVerticies.get(i).getCityName() + " is connected to: ");
            Vertex currentVertex = getListOfVerticies().get(i);
            for (Edge e: currentVertex.getOuterEdge()) {
                System.out.println("        " + e.getToVertex() + "     with weight: " + e.getWeight());
            }
        }
    }


    public ArrayList<Vertex> getListOfVerticies() {
        return listOfVerticies;
    }

    public void setListOfVerticies(ArrayList<Vertex> listOfVerticies) {
        this.listOfVerticies = listOfVerticies;
    }
}
