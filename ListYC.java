/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlyptgt;
import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class ListYC {
    Scanner in = new Scanner(System.in);
    public void Nhap() throws IOException{
        int choice = -1;
        String re = "^\\w{3}\\d{2}\\.*";
        FileWriter wn = new FileWriter("F:/BaiTap/PTGT.txt", true);
        BufferedWriter out = new BufferedWriter(wn);
        while(choice <0 || choice > 3){
            System.out.println("Lọai PTGT: \n\t1.Ô tô\n\t2.Xe máy\n\t3.Xet tải\n\t0.Thoát");
            choice = in.nextInt();
            in.nextLine();
        }//end while
        String HangSX = "";
        do{
            System.out.print("Nhập hãng sản xuất: ");
            HangSX = in.nextLine();
        }while(!HangSX.matches(re)); 
        System.out.print("Nhap mau: ");
        String Mau = in.nextLine();
        System.out.print("Nam san xuat: ");
        int NamSX = in.nextInt();
        System.out.print("Gia: ");
        int Gia = in.nextInt();
        in.nextLine();
        switch(choice){
            case 1:{//oTo
                System.out.print("Kieu dong co: ");
                String KieuDongCo = in.nextLine();
                System.out.print("So cho ngoi: ");
                int SeatNum = Integer.parseInt(in.nextLine());
                OTo oto = new OTo(HangSX, Mau, NamSX, Gia, KieuDongCo, SeatNum);
                out.write(oto.toString());
                out.newLine();
                out.close();
                break;
            }//end case 1
            case 2:{//xeMay
                System.out.print("Cong suat: ");
                int congsuat = in.nextInt();
                XeMay xemay = new XeMay(HangSX, Mau, NamSX, Gia, congsuat);
                out.write(xemay.toString());
                out.newLine();
                out.close();
                // Viet vao file
                break;
            }//end case 2
            case 3:{//xeTai
                System.out.print("Trong tai: ");
                int trongtai = in.nextInt();
                XeTai xetai = new XeTai(HangSX, Mau, NamSX, Gia, trongtai);
                out.write(xetai.toString());
                out.newLine();
                out.close();
                //Viet vao file
                break;
            }//end case 3
            case 0:{
                break;
            }//end 0
        }// end switch
        System.out.print("Tiep tuc?\n\t1.Co\t2.Khong\n");
        choice = in.nextInt();
        if(choice == 1) Nhap();
        else ;
    }//end Nhap
    
    //In ra màn hình danh sách xe <chưa sửa>
    public void RaFile() throws IOException{
        FileReader fr = new FileReader("F:/BaiTap/PTGT.txt");
        BufferedReader fread = new BufferedReader(fr);
        System.out.println("DANH SACH XE O TO:\n");
        String s = null;
        while((s = fread.readLine()) != null){
            System.out.println(s);
        }
    }
    
    //Tìm gần đúng theo HangSX
    public void doc(){
        String oto[][] = new String[10][6];
        try{
            FileInputStream f = new FileInputStream("F:/BaiTap/PTGT.txt");
            Scanner in = new Scanner(f, "UTF-8");
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 6; j++){
                    if(in.next() == null) in.close();
                    else oto[i][j] = in.next();
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for(int i = 0; i < oto.length; i++){
            for(int j = 0; j < oto[0].length; j++) System.out.print(oto[i][j] + "\t");
            System.out.println("\n");
        }
    }
}// end YC(class)
