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
public class XeTai extends PTGT {
    private double trongtai;
    public XeTai(){
        super();
        this.trongtai = 0;
    }
    public XeTai(String HangSX, String Mau, int NamSX, double Gia, double trongtai){
        super(HangSX, Mau, NamSX, Gia);
        this.trongtai = trongtai;
    }
    
    //setters
    public void settrongtai(double trongtai){
        this.trongtai = trongtai;
    }
    
    //getter
    public double gettrongtai(){
        return trongtai;
    }
    
    //in thong tin
    @Override
    public String toString(){
        return getHangSX() + "\t" + getMau() + "\t" + trongtai + "\t" +
                    getNamSX() + "\t" + getGia() + "\n";
    }
}
