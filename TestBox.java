/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class TestBox {
    public static void main(String[] args) {
        Box b = new Box("Caixa b", 7);
        Box c = new Box("Caixa c", 5);
        System.out.println("b -> " + b.getValue() + " " + b.getNome());
        System.out.println("c -> " + c.getValue());
        Box d = c;
        b.setValue(10);
        c.setValue(5);
        System.out.println("b -> " + b.getValue());
        System.out.println("c -> " + c.getValue());
        System.out.println("d -> " + d.getValue());
        b.doubleMe();
        System.out.println("b -> " + b.getValue());        
        System.out.println("b -> " + b.ehMaiorQueZero());
        b.setValue("432");
        System.out.println(b.getValue());
        Box u = new Box("Caixa u");
    }    
}

