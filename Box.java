/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Box {
    private String nome;
    private int value;
    
    public Box(String n){
        nome = n;
        value = 0;
    }
    
    public Box(String n, String s) {
        nome = n; value = Integer.parseInt(s);
    }
    
    public Box(String n, int v){
        nome = n; value = v;
    }
    
    public String getNome(){ return nome; }
        
    public int getValue(){
        return value;
    }
    
     public void setValue(String s) {
        value = Integer.parseInt(s);
    }
    
    public void setValue(int v){
        value = v;
    }
    
    public void doubleMe(){
        value = value * 2;
    }
    
     public boolean ehMaiorQueZero(){
        return value > 0;
    }
}
