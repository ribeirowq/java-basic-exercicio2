package application.model.services;


import application.model.entities.Circle;
import application.model.entities.Rectangle;
import application.model.entities.Square;

import java.util.Scanner;

public class UserInteractionService {
    private final Scanner sc;
    private final GeometricService geometricService;

    public UserInteractionService(Scanner sc, GeometricService geometricService) {
        this.sc = sc;
        this.geometricService = geometricService;
    }

    public void handleSquareInteraction(){
        System.out.println("Digite o lado do quadrado: ");
        double side = sc.nextDouble();
        sc.nextLine();

        Square square = new Square(side);
        double area = geometricService.createSquare(square);

        System.out.printf("Área: %.2f%n", area);
    }

    public void handleRectangleInteraction(){
        System.out.println("Digite a altura: ");
        double heigth = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a base: ");
        double base = sc.nextDouble();
        sc.nextLine();

        Rectangle rectangle = new Rectangle(heigth, base);
        double area = geometricService.createRectangle(rectangle);

        System.out.printf("Área: %.2f%n", area);
    }

    public void handleCircleInteraction(){
        System.out.println("Digite o raio do seu circulo: ");
        double radius = sc.nextDouble();
        sc.nextLine();

        Circle circle = new Circle(radius);
        double area = geometricService.createCircle(circle);

        System.out.printf("Área: %.2f%n", area);
    }
}

