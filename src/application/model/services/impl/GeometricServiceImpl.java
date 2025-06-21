package application.model.services.impl;

import application.model.entities.Circle;
import application.model.entities.Rectangle;
import application.model.entities.Square;
import application.model.services.GeometricService;

public class GeometricServiceImpl implements GeometricService {


    @Override
    public double createSquare(Square square) {
        return square.side() * square.side();
    }

    @Override
    public double createRectangle(Rectangle rectangle) {
        return rectangle.heigth() * rectangle.base();
    }

    @Override
    public double createCircle(Circle circle) {
        final double pi = 3.14;
        return pi * (circle.radius() * circle.radius());
    }
}
