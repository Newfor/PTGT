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
public class XeMay extends PTGT {
    private double congsuat;
    public XeMay(){
        super();
        this.congsuat = 0;
    }
    public XeMay(String HangSX, String Mau, int NamSX, double Gia, double congsuat){
        super(HangSX, Mau, NamSX, Gia);
        this.congsuat = congsuat;
    }
    
    //setter
    public void setcongsuat(double congsuat){
        this.congsuat = congsuat;
    }
    
    //getter
    public double getcongsuat(){
        return congsuat;
    }
    
    //
    @Override
    public String toString(){
        return getHangSX() + "\t" + getMau() + "\t" + congsuat + "\t" +
                    getNamSX() + "\t" + getGia() + "\n";
    }
}
