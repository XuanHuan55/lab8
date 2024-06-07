/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2_lab8;

/**
 *
 * @author ASUS
 */
public class Q2_Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock appleStock = new ConcreteStock("APP",100);
        Stock dellStock = new ConcreteStock("DELL",100);
        
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        appleStock.notifyInvestor(100);
        appleStock.notifyInvestor(40);
        appleStock.notifyInvestor(10);
        appleStock.notifyInvestor(5);
        dellStock.notifyInvestor(300);
        dellStock.notifyInvestor(200);
    }
        
}
