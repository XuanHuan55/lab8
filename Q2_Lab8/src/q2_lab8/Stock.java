/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package q2_lab8;


import java.util.*;

public interface Stock {

    public void addObserver(Investor investor);

    public void removeObserver(Investor investor);

    public void notifyInvestors(double priceChange);

    public void notifyInvestor(int i);
}
