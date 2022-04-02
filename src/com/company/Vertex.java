package com.company;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private String cityName;              // city name
    private Integer distance;             // distance
    private Vertex predecessor;           // predecessor
    private ArrayList<Edge> outerEdge;    //

    public Vertex(String cityName) {
        this.cityName = cityName;
        this.outerEdge = new ArrayList<>();
    }

    @Override                        // compareTo method for comparing the verticies
    public int compareTo(Vertex other) {
        return this.distance.compareTo(other.distance)
    }


    // generated getters and setters

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public ArrayList<Edge> getOuterEdge() {
        return outerEdge;
    }

    public void setOuterEdge(ArrayList<Edge> outerEdge) {
        this.outerEdge = outerEdge;
    }

}
