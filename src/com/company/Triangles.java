package com.company;

public class Triangles {

    Triangle[] triangle;
    int indexMaxSquare = 0;

    public Triangles(int quantity) {
        this.triangle = new Triangle[quantity];
    }

    public int findMaxTriangleSquare() {
        for (int i = 0; i < triangle.length; i++) {
            if (triangle[i].squareTriangle > triangle[indexMaxSquare].squareTriangle)
                indexMaxSquare = i;
        }

        return indexMaxSquare;
    }
}
