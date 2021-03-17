package com.example.designpatterns.practise;

public class SwimmingPool {

    private int length;
    private int width;
    private int depth;

    public SwimmingPool(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "SwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
