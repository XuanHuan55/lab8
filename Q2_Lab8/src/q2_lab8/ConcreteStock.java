/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_lab8;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class ConcreteStock implements Stock {

    private String symbol;
    private double currentPrice;
    private List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    @Override
    public void addObserver(Investor investor) {
        this.investors.add(investor);
    }

    @Override
    public void removeObserver(Investor investor) {
        this.investors.remove(investor);
    }

    @Override
    public void notifyInvestors(double priceChange) {
        currentPrice = priceChange;
        for (Investor investor : investors) {
            investor.update(symbol, priceChange);
        }
    }

    @Override
    public void notifyInvestor(int priceChange) {
        currentPrice = priceChange;
        for (Investor investor : investors) {
            investor.update(symbol, priceChange);
        }
    }
}
