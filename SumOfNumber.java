package bai4cb;

import java.util.Scanner;
public class SumOfNumber{
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        int iN;
        System.out.println("Nhập N:");
        iN = sc.nextInt();
        int iSum=0;
        for(int i=1;i<=iN;i++){
            iSum+=i;
        }
        System.out.println(iSum);
    }
}