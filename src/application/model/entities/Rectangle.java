package application.model.entities;

public record Rectangle(double heigth, double base){
    public Rectangle {
        if (heigth <= 0 || base <=0){
            throw new IllegalArgumentException("Dimensões precisam ser positivas");
        }
    }
}
