package com.company;

public class Rectangles {
    Rectangle[] rectangle;
    int indexMinRectangle = 0;

    public Rectangles(int quantity) {
        this.rectangle = new Rectangle[quantity];
    }

    public int indexFindMinSideC() {
        for (int i = 0; i < rectangle.length; i++) {
            if (rectangle[i].sideC < rectangle[indexMinRectangle].sideC)
                indexMinRectangle = i;
        }

        return indexMinRectangle;
    }
}
