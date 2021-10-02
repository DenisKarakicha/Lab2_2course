package com.company;

public class Rectangle extends Triangle {

    public boolean checkCorrectRectangle() {
        boolean rightAngle = false;
        if (Math.tan(sideA / sideB) == 0 || Math.tan(sideC / sideB) == 0 || Math.tan(sideB / sideA) == 0) {
            rightAngle = true;
        }
        return rightAngle;
    }

}
