package application.model.services;

import application.model.entities.Circle;
import application.model.entities.Rectangle;
import application.model.entities.Square;

public interface GeometricService {
    double createSquare(Square square);
    double createRectangle(Rectangle rectangle);
    double createCircle(Circle circle);
}
