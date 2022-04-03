package com.company;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private final String vertexName;             // name of the city/vertex
    private Integer distance;                   // distance field - used in the Prims algorithm
    private Vertex predecessor;                 // predecessor field - used in the Prims algorithm
    private final ArrayList<Edge> outerEdge;    // stores the outer edges

    public Vertex(String vertexName) {         // constructor
        this.vertexName = vertexName;          // assingmets the name to Vertex
        this.outerEdge = new ArrayList<>();    // addes the outer edges to the list
    }

    @Override                        // compareTo method for comparing the verticies
    public int compareTo(Vertex other) {
        return this.distance.compareTo(other.distance);
    }

    public String getVertexName() {
        return vertexName;
    } // getter method for the vertex name


    public Integer getDistance() {
        return distance;
    }   // getter method for the vertex distance

    public void setDistance(Integer distance) {        // setter method for the set distance
        this.distance = distance;                      // used in prims algorithm
    }

    public ArrayList<Edge> getOuterEdge() {          // getter for getting outer edges
        return outerEdge;
    }

    public void setPredecessor(Vertex predecessor) {  //setter method for setting the predecessor
        this.predecessor = predecessor;               // used in prims algorithm
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "vertexName='" + vertexName + '\'' +
                '}';
    }
}
