package bai5cb;

import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double dSum = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhap gia tri thu "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            dSum = dSum + arr[i];
        }
        System.out.format("ket qua la : %.3f", dSum);
    }
}