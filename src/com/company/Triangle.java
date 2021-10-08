package com.company;

import java.util.Scanner;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;
    double squareTriangle;

    Scanner input = new Scanner(System.in);

    public int getSideA() {
        return sideA;
    }

    public boolean setSideA(int sideA) {
        if(sideA < 0) {
            return  false;
        }
        else {
            this.sideA = sideA;
            return true;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public boolean setSideB(int sideB) {
        if(sideB < 0) {
            return  false;
        }
        else {
            this.sideA = sideA;
            return true;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public boolean setSideC(int sideC) {
        if(sideC < 0) {
            return  false;
        }
        else {
            this.sideA = sideA;
            return true;
        }
    }

    public boolean rightTriangle() {
        boolean notRightTriangle = true;
        if ((sideA + sideC) < sideB || (sideB + sideC) < sideA || (sideA + sideB) < sideC) {
            notRightTriangle = false;
        }

        return notRightTriangle;
    }

    public int perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double semiPerimeter = perimeter() / 2;
        return squareTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}' + "\n";
    }


}
