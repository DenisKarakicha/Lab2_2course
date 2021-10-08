package com.company;

import java.util.Locale;
import java.util.Scanner;

        /*Создать класс треугольник, члены класса – длины 3-х сторон. Предусмотреть в классе методы
        проверки существования треугольника, вычисления и вывода сведений о фигуре – длины сторон, углы,
        периметр, площадь. Создать производный класс – прямоугольный треугольник, предусмотреть в
        классе проверку, является ли треугольник прямоугольным. Написать программу, демонстрирующую
        работу с классом: дано N треугольников и M прямоугольных треугольников, найти треугольник с
        максимальной площадью и прямоугольный треугольник с наименьшей гипотенузой.*/

public class Main {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество треугольников: ");
        int countTriangle = input.nextInt();

        Triangles triangles = new Triangles(countTriangle);

        for (int i = 0; i < triangles.triangle.length; i++) {
            triangles.triangle[i] = new Triangle();
            System.out.print("Введите сторону А: ");
            while (true) {
               if(triangles.triangle[i].setSideA(input.nextInt()) == true){
                   break;
               }
               else{
                   System.out.print("Введите коректные данные : ");
               }
            }
            System.out.print("Введите сторону В: ");
            while (true) {
                if(triangles.triangle[i].setSideB(input.nextInt()) == true){
                    break;
                }
                else{
                    System.out.print("Введите коректные данные : ");
                }
            }
            System.out.print("Введите сторону C: ");
            while (true) {
                if(triangles.triangle[i].setSideC(input.nextInt()) == true){
                    break;
                }
                else{
                    System.out.print("Введите коректные данные : ");
                }
            }
        }

        for (int i = 0; i < triangles.triangle.length; i++) {
            System.out.print(triangles.triangle[i]);
            if (triangles.triangle[i].rightTriangle() == false)
                System.out.print("Такой треугольник не существует\n\n");
            else {
                System.out.print("Периметр: " + triangles.triangle[i].perimeter());
                System.out.print("\nПлощадь: " + String.format("%6.2f", triangles.triangle[i].area()));
            }
        }
        System.out.print("\nТреугольник под индексом " + triangles.findMaxTriangleSquare() + " c самой большой площадью");

        System.out.print("\nВведите количество прямоугольных треугольников: ");
        int countRectangle = input.nextInt();

        Rectangles rectangles = new Rectangles(countRectangle);

        for (int i = 0; i < rectangles.rectangle.length; i++) {
            rectangles.rectangle[i] = new Rectangle();
            System.out.print("Введите сторону А: ");
            while (true) {
                if(triangles.triangle[i].setSideA(input.nextInt()) == true){
                    break;
                }
                else{
                    System.out.print("Введите коректные данные : ");
                }
            }
            System.out.print("Введите сторону В: ");
            while (true) {
                if(triangles.triangle[i].setSideB(input.nextInt()) == true){
                    break;
                }
                else{
                    System.out.print("Введите коректные данные : ");
                }
            }
            System.out.print("Введите сторону C: ");
            while (true) {
                if(triangles.triangle[i].setSideC(input.nextInt()) == true){
                    break;
                }
                else{
                    System.out.print("Введите коректные данные : ");
                }
            }
        }

        for (int i = 0; i < rectangles.rectangle.length; i++) {
            System.out.print(rectangles.rectangle[i]);
            if (rectangles.rectangle[i].rightTriangle() == false)
                System.out.print("Такой треугольник не существует\n");
            if (rectangles.rectangle[i].checkCorrectRectangle() == false)
                System.out.print("Треугольник не прямоугольный");

        }
        System.out.print("\nТреугольник под индексом " + rectangles.indexFindMinSideC() + " с наименьшей гипотенузой");


    }
}
