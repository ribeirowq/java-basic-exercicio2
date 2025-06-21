package application;

import application.model.services.GeometricService;
import application.model.services.UserInteractionService;
import application.model.services.impl.GeometricServiceImpl;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        GeometricService gs = new GeometricServiceImpl();
        UserInteractionService service = new UserInteractionService(sc, gs);

        int option = -1;
        while (true) {
            System.out.println("======= Escolha a opção que deseja calcular =======");
            System.out.println("#1 - Quadrado");
            System.out.println("#2 - Retângulo");
            System.out.println("#3 - Circulo");
            System.out.println("#0 - Sair do programa");
            System.out.println("====== xxx ===== xxx ===== xxx =====");
            if (sc.hasNextInt()) {
                option = sc.nextInt();
                sc.nextLine();

                if (option == 1) {
                    service.handleSquareInteraction();
                }
                else if (option == 2) {
                    service.handleRectangleInteraction();
                }
                else if (option == 3) {
                    service.handleCircleInteraction();
                }
                else if (option == 0) {
                    System.out.println("Encerrando programa...");
                    break;
                }
                else {
                    System.out.println("Opção inválida! Digite um número entre 0 e 3.");
                }
            }
            else {
                System.out.println("Erro! Por favor, insira um número válido.");
                sc.next();
            }
        }
    }
}