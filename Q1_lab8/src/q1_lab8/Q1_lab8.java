/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_lab8;

public class Q1_lab8 {

    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        companyInfo.output();
        companyInfo.setCompanyName("Dai hoc QTMD");
        companyInfo.setAddress("NAM KI KHOI NGHIA, DINH HOA, THU DAU MOT, BINH DUONG");
        companyInfo.setPhoneNumber("97418418");
        companyInfo.output();
    }
    
}
