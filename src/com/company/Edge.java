package com.company;

public class Edge {

    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

    public Edge(Vertex fromVertex, Vertex toVertex, Integer weight) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
        fromVertex.getOuterEdge().add(this);

    }


    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
