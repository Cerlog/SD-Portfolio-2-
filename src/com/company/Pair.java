package com.company;

public class  Pair implements Comparable<Pair>{
    private Integer dist;
    Integer index;
    public Pair(Integer distance, Integer i){
        dist=distance;
        index =i;
    }
    @Override
    public int compareTo(Pair o) {
        return this.dist.compareTo(o.dist);
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public Integer getVertexIndex() {
        return index;
    }

    public void setVertexIndex(Integer vertexIndex) {
        this.index = vertexIndex;
    }
}
