/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package spc.edu;

import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class HocJava {
    public static void main(String[] args) {
        System.out.println("chương trình tính hiệu 2 số");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        int a = sc.nextInt();
        System.out.println("nhập số b");
        int b = sc.nextInt();
        System.out.println(a + " - " + b + "=" );
            
        }
    public static int tinhtong(int a, int b)
    {
        return a + b;
    }
      public static int tinhhieu(int a, int b)
    {
        return a - b;
    }
        public static int tinhtich(int a, int b)
    {
        return a * b;
    }
          public static int tinhthuong(int a, int b)
    {
        return a / b;
    }
     public class Bai5_Tinhthuong {
     public static void main(String[] args) {
        System.out.println("PHEP TINH CO BAN");
        int a,b;
        Scanner     nhap = new Scanner (System.in);
        
        System.out.print("Nhap so a");
        a = nhap.nextInt();
        
         System.out.print("Nhap so b");
        b = nhap.nextInt();
           
        System.out.println(a + " + "+ b + " = " + Tinhtong(a,b));
        System.out.println(a + " - "+ b + " = " + Tinhhieu(a,b));
        System.out.println(a + " * "+ b + " = " + Tinhtich(a,b));
        System.out.println(a + " / "+ b + " = " + Tinhthuong(a,b));
     }
     public static int Tinhtong(int a, int b){
         return a+b;
     }
     public static int Tinhhieu(int a, int b){
         return a-b;
}
     public static int Tinhtich(int a, int b){
         return a*b;
}    
     public static String Tinhthuong(int a, int b){
         if (b !=0){
             return"" + (double)a/b;
         }
         else
             return a + "Khong the chia cho 0";
     }
     public static double Tinhthuong1(int a, int b){
         if(b == 0)
             return 0;
         return (double) a/b;
         
}
     }
}
     

