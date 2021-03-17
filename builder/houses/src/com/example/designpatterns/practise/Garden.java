package com.example.designpatterns.practise;

public class Garden {

    private int width;
    private int length;

    public Garden(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
