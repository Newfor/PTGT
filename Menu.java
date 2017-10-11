/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlyptgt;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Menu {
    Scanner in = new Scanner(System.in);
    ListYC yc = new ListYC();
    public void menu() throws IOException{
        int choice = -1;
        while(choice < 0 || choice > 5){
            System.out.println("Menu: \n\t1.Nhập sản phẩm\n\t2.In danh sách\n\t3.Tìm kiếm\n\t4.Sắp xếp\n\t5.Tính toán\n\t0.Thoát");
            choice = in.nextInt();
        }
        switch(choice){
            case 1:{
                yc.Nhap();
                break;
            }//end case 1 
            
            case 2:{
                yc.RaFile();
                break;
            }//end case 2
            
            case 3:{
                yc.doc();
                break;
            }//end case 3
            
            case 4:{
                break;
            }//end case 4
            
            case 5:{
                break;
            }//end case 5
            
            case 0:{
                System.exit(0);
            }//end 0
        }
    }
}
