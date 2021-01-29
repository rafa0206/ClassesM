/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Point2D {
    private double coordX;
    private double coordY;
    
    public Point2D(double x, double y) {
        coordX = x; coordY = y;
    }
    
    public double getCoordX() {
        return coordX;
    }
    
    public double getCoordY() {
        return coordY;
    }
    
    public void setCoordX(double x) {
        coordX = x;
    }
    
    public void setCoordY(double y) {
        coordY = y;
    }
    
    public Point2D soma(Point2D outro) {
        return new Point2D(coordX + outro.coordX, coordY + outro.coordY);
    }
    
    public Point2D multiplica(double r) {
        return new Point2D(r * coordX, r * coordY);
    }
    
}
