/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohelloworld;
import java.util.Scanner;
/**
 *
 * @author kduyvu
 */
public class DemoHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bankinh;
        int a = 10;
        int b = 4;
        int c = a + b;
        int d = a*b;
        int e = a - b;
        int f = a%b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        a -= 10;
        b *= 2;
        System.out.println("a = "+  a);
        System.out.println("b = " + b);
        
        a++;
        b --;
        System.out.println("a2 = "+  a);
        System.out.println("b2 = "+  b);
        
        int i = 10;
        int j =10;
        int newNum =10*i++;
        int newNum2 =10*(++j);
        
        //int x =5/(int)2.0;
        char y = 'A';
        char tab ='\t';
        char numChar = '\u0034';
        int z = 'a';
        char t = 97;
        
        boolean x1 = false;
        boolean x2 = false;
        boolean x12 =x1 || x2;
        boolean x34 =x1 ^ x2;
        
        
        
        System.out.println("newNum = "+  newNum);
        System.out.println("newNum2 = "+  newNum2);
        System.out.println("y = "+  y);
        System.out.println("numChar = "+  numChar);
        System.out.println("z = "+  z);
        System.out.println("t = "+  t);
        System.out.println("x12 = "+  x12);
        System.out.println("x34 = "+  x34);
        System.out.println("Welcome to Java JSP Servlet");
        // Khai báo đối tượng
        Scanner sc = new Scanner(System.in);
        
        // Dữ liệu nhập vào là số nguyên
        
//        System.out.print("Nhập năm = ");
//        int nam = sc.nextInt();
        // Dữ liệu nhập vào số thực
//        double nam2 = sc.nextDouble();
//        float nam3 = sc.nextFloat();
        // Dữ liệu nhập vào là chuỗi
//        String str =sc.nextLine();
        
//        boolean NamNhuan =((nam %4 ==0) && (nam%100 !=0)) ||(nam%400 ==0);
//        if( NamNhuan== true){
//            System.out.println("Là năm nhuận");
//        }else{
//            System.out.println("Không phải Là năm nhuận");
//        }
        int x =1;
//        boolean bt1 = (x > 1) & (x++ < 10);
//        System.out.println("x sau = " + x);
//        System.out.println("bt1 = " + bt1);
        
        boolean bt2 = (1 > x) && ( 1 > x++);
        System.out.println("x sau = " + x);
        System.out.println("bt2 = " + bt2);
        
        


    }
    
}
