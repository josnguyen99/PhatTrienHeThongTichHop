package ncbai1;

import java.util.Scanner;

import ncbai1.Diem;

public class SDDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diem B = new Diem();
        B.nhap();
        B.hienthi();     
        double kc=B.khoangcach();
        System.out.println("KC ->(0,0) : "+kc);
    }
}