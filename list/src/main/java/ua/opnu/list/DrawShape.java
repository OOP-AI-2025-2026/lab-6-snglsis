package ua.opnu.list;

import java.awt.*;
import java.awt.Point;


public abstract class DrawShape {

    public static DrawShape newInstance(int shapeType) {
        DrawShape shape = null;
        if (shapeType == DrawShape.SHAPE_RECTANGLE) {
            shape = new Rectangle();
        } else if (shapeType == DrawShape.SHAPE_ROUNDED_RECT) {
            shape = new RoundedRectangle();
        } else if (shapeType == DrawShape.SHAPE_ELLIPSE) {
            shape = new Ellipse();
        }
        return shape;
    }

    // Константи для типів фігур
    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    // Початкова та кінцева точки
    private Point startPoint;
    private Point endPoint;

    // Конструктор без параметрів
    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    // Конструктор з початковими координатами
    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Абстрактний метод — кожна фігура реалізує його по-своєму
    public abstract Shape getShape(Point startPoint, Point endPoint);

    // Метод, який повертає фігуру для малювання
    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}