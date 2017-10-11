/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlyptgt;

/**
 *
 * @author Administrator
 */
public class PTGT {
    private String HangSX;
    private String Mau;
    private int NamSX;
    private double Gia;
    public PTGT(String HangSX, String Mau, int NamSX, double Gia){
        this.HangSX = HangSX;
        this.Mau = Mau;
        this.Gia = Gia;
        this.NamSX = NamSX;
    }
    public PTGT(){
        this.HangSX = "";
        this.Mau = "";
        this.Gia = 0;
        this.NamSX = 0;
    };
    
    //Setters
    public void setHangSX(String HangSX){
        this.HangSX = HangSX;
    } 
    public void setMau(String Mau){
        this.Mau = Mau;
    }   
    public void setNamSX(int NamSX){
        this.NamSX = NamSX;
    }   
    public void setGia(int Gia){
        this.Gia = Gia;
    }   
    
    //Getters
    public String getHangSX(){
        return HangSX;
    } 
    public String getMau(){
        return Mau;
    }   
    public int getNamSX(){
        return NamSX;
    }   
    public double getGia(){
        return Gia;
    }   
    
    @Override
    public String toString(){
        return HangSX + "\t" + Mau + "\t" + NamSX + "\t" + Gia + "\n";
    }
}
