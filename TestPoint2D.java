/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(2.0, 2.8);
        System.out.println(p1.getCoordX());
        p1.setCoordX(4.0);
        System.out.println(p1.getCoordX());
        Point2D p2 = new Point2D(3.0, 4.2);
        Point2D p3 = p2.soma(p1);
        System.out.println("coord p3: (" + p3.getCoordX() + ", " + p3.getCoordY() + ")");
        Point2D p4 = p3.multiplica(3.0);
        System.out.println("coord p4: (" + p4.getCoordX() + ", " + p4.getCoordY() + ")");
       
    }
    
}
