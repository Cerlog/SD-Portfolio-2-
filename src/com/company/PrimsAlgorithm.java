package com.company;

import java.util.ArrayList;

public class PrimsAlgorithm {
    private MinHeap<Vertex> minHeap; // Min heap for storing the min vertex with min edge cost
    private ArrayList<Vertex> minimumSpanningTree; // list for the verticies in Prims MST
    private Integer mstCount = 0;                  // total cost of MST
    private ArrayList<Vertex> verticies;           // list of vertices

    public PrimsAlgorithm(AdjacencyList graph) {   // constructor
        this.minHeap = new MinHeap<>();            // initializing min heap
        this.minimumSpanningTree = new ArrayList<>(); // initializing the MST list
        this.verticies = graph.getListOfVerticies();  // getting the list of verticies
    }

    public void primMinimumSpanningTree() {
        for (Vertex vertex : verticies) {       // looping through verticies
            vertex.setDistance(Integer.MAX_VALUE); // setting all vertexes distance to max
            vertex.setPredecessor(null);         // setting all predecessors to null
        }

        verticies.get(0).setDistance(0);       // setting the distance of 0th vertex to 0

        for (Vertex vertex : verticies) {     // adding all verticies to heap
            minHeap.Insert(vertex);
        }

        while (!minHeap.isEmpty()) {        // executing prims while minheap is not empty
            Vertex minVertexInHeap = minHeap.extractMin();  // extracting minimum vertex
            minimumSpanningTree.add(minVertexInHeap);       // adding that min vertex to MST

            for (Edge vertexInMinHeap : minVertexInHeap.getOuterEdge()) {  //

                Vertex getToVertex = vertexInMinHeap.getToVertex();

                if (vertexInMinHeap.getWeight() < getToVertex.getDistance()) {
                    getToVertex.setDistance(vertexInMinHeap.getWeight());
                    getToVertex.setPredecessor(minVertexInHeap);
                    int position = minHeap.getPosition(getToVertex);
                    minHeap.decreasekey(position);
                }
            }
            mstCount += minVertexInHeap.getDistance();
            System.out.println(mstCount);
            System.out.println(minimumSpanningTree);
        }
    }



}
