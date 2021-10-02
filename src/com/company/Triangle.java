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

    public void setSideA(int sideA) {
        int trueSideA = sideA;
        if (trueSideA < 0) {
            System.out.print("Введите значение больше 0! : ");
            trueSideA = input.nextInt();
        }
        this.sideA = trueSideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        int trueSideB = sideB;
        if (trueSideB < 0) {
            System.out.print("Введите значение больше 0! : ");
            trueSideB = input.nextInt();
        }
        this.sideB = trueSideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        int trueSideC = sideC;
        if (trueSideC < 0) {
            System.out.print("Введите значение больше 0! : ");
            trueSideC = input.nextInt();
        }
        this.sideC = trueSideC;
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
