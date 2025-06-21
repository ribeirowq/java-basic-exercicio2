package application.model.entities;


public record Circle(double radius){
    public Circle {
        if (radius <= 0){
            throw new IllegalArgumentException("Raio precisa ser positivo");
        }
    }
}
