package com.company;

public class Main {

    public static void main(String[] args) {
        AdjacencyList adjacencyGraph = new AdjacencyList();

        Vertex V0 =new Vertex("Eskildstrup");
        Vertex V1 =new Vertex("Haslev");
        Vertex V2 =new Vertex("Holbæk");
        Vertex V3 =new Vertex("Jærgerspris");
        Vertex V4 =new Vertex("Kalundborg");
        Vertex V5 =new Vertex("Korsør");
        Vertex V6 =new Vertex("Køge");
        Vertex V7 =new Vertex("Maribo");
        Vertex V8 =new Vertex("Nakskov");
        Vertex V9 =new Vertex("NykøbingF");
        Vertex V10 =new Vertex("Næstved");
        Vertex V11 =new Vertex("Ringsted");
        Vertex V12 =new Vertex("Roskilde");
        Vertex V13 =new Vertex("Slagelse");
        Vertex V14 =new Vertex("Sorø");
        Vertex V15 =new Vertex("Vordingborg");

        adjacencyGraph.addVertex(V0);
        adjacencyGraph.addVertex(V1);
        adjacencyGraph.addVertex(V2);
        adjacencyGraph.addVertex(V3);
        adjacencyGraph.addVertex(V4);
        adjacencyGraph.addVertex(V5);
        adjacencyGraph.addVertex(V6);
        adjacencyGraph.addVertex(V7);
        adjacencyGraph.addVertex(V8);
        adjacencyGraph.addVertex(V9);
        adjacencyGraph.addVertex(V10);
        adjacencyGraph.addVertex(V11);
        adjacencyGraph.addVertex(V12);
        adjacencyGraph.addVertex(V13);
        adjacencyGraph.addVertex(V14);
        adjacencyGraph.addVertex(V15);

        adjacencyGraph.addUndirectedWeightedEdge(V0,V7,28); // Eskildstrup -> Maribo = 28km
        adjacencyGraph.addUndirectedWeightedEdge(V0,V9,13); // Eskildstrup -> Nykøbing F = 13km
        adjacencyGraph.addUndirectedWeightedEdge(V0, V15,24); // Eskildstrup -> Vordinborg = 24km
        adjacencyGraph.addUndirectedWeightedEdge(V1,V5,60); //
        adjacencyGraph.addUndirectedWeightedEdge(V1,V6,24); //
        adjacencyGraph.addUndirectedWeightedEdge(V1,V10,25); //
        adjacencyGraph.addUndirectedWeightedEdge(V1,V11,19);
        adjacencyGraph.addUndirectedWeightedEdge(V1,V12,47);
        adjacencyGraph.addUndirectedWeightedEdge(V1,V13,48);
        adjacencyGraph.addUndirectedWeightedEdge(V1,V14,34);
        adjacencyGraph.addUndirectedWeightedEdge(V1,V15,40);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V3,34);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V4,44);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V5,66);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V11,36);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V12,32);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V13,46);
        adjacencyGraph.addUndirectedWeightedEdge(V2,V14,34);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V5,95);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V6,58);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V11,56);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V12,33);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V13,74);
        adjacencyGraph.addUndirectedWeightedEdge(V3,V14,63);
        adjacencyGraph.addUndirectedWeightedEdge(V4,V11,62);
        adjacencyGraph.addUndirectedWeightedEdge(V4,V12,70);
        adjacencyGraph.addUndirectedWeightedEdge(V4,V13,39);
        adjacencyGraph.addUndirectedWeightedEdge(V4,V14,51);
        adjacencyGraph.addUndirectedWeightedEdge(V5,V10,45);
        adjacencyGraph.addUndirectedWeightedEdge(V5,V13,20);
        adjacencyGraph.addUndirectedWeightedEdge(V6,V10,45);
        adjacencyGraph.addUndirectedWeightedEdge(V6,V11,28);
        adjacencyGraph.addUndirectedWeightedEdge(V6,V12,25);
        adjacencyGraph.addUndirectedWeightedEdge(V6,V15,60);
        adjacencyGraph.addUndirectedWeightedEdge(V7,V8,27);
        adjacencyGraph.addUndirectedWeightedEdge(V7,V9,26);
        adjacencyGraph.addUndirectedWeightedEdge(V10,V12,57);
        adjacencyGraph.addUndirectedWeightedEdge(V10,V11,26);
        adjacencyGraph.addUndirectedWeightedEdge(V10,V13,37);
        adjacencyGraph.addUndirectedWeightedEdge(V10,V14,32);
        adjacencyGraph.addUndirectedWeightedEdge(V10,V15,28);
        adjacencyGraph.addUndirectedWeightedEdge(V11,V12,31);
        adjacencyGraph.addUndirectedWeightedEdge(V11,V14,15);
        adjacencyGraph.addUndirectedWeightedEdge(V11,V15,58);
        adjacencyGraph.addUndirectedWeightedEdge(V13,V14,14);

        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm(adjacencyGraph);
        primsAlgorithm.primMinimumSpanningTree();

}

}
