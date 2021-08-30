package HomeWork4;

import java.util.Scanner;

public class TriangleSquare {
    static double function(double sideA, double sideB, double sideC) throws BadTringleExeption, BadTringleExeption2 {
        if (sideA < 0 || sideB < 0 || sideC < 0) throw new BadTringleExeption();
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) throw new BadTringleExeption2();
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double square= Math.sqrt(halfPerimeter * (halfPerimeter - sideA) *
                (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа рассчитывает периметр треугольника по трем сторонам");
        System.out.println("Введите длины сторон треугольника: ");
        System.out.println("sideA= ");
        double sideA = scanner.nextInt();
        System.out.println("sideB= ");
        double sideB = scanner.nextInt();
        System.out.println("sideC= ");
        double sideC = scanner.nextInt();
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            System.out.println("Эти стороны не образуют треугольника");
            System.exit(0);
        }
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        System.out.println("Площадь треугольника = " + Math.sqrt(halfPerimeter * (halfPerimeter - sideA) *
                (halfPerimeter - sideB) * (halfPerimeter - sideC)));
    }
}

