package application.model.entities;

public record Square(double side){
    public Square {
        if (side <= 0) {
            throw new IllegalArgumentException("Lado precisa ser positivo");
        }
    }
}
