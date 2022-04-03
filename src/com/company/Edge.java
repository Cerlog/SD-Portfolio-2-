package com.company;

public class Edge {

    private final Vertex fromVertex;     // edge going out from vertex1
    private final Vertex toVertex;       // edge going to vertex1
    private final Integer weight;        // cost of visiting vertex1

    public Edge(Vertex fromVertex, Vertex toVertex, Integer weight) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
        fromVertex.getOuterEdge().add(this);

    }
    public Vertex getToVertex() {
        return toVertex;
    } // getter for get incomming edge
                                                     // to a vertex
    public Integer getWeight() {
        return weight;
    }   // getter for getting the weight

    @Override
    public String toString() {
        return "Edge{" +
                "fromVertex=" + fromVertex + "-  -- to vertex    " + toVertex;
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }
}
