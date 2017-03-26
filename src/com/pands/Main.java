package com.pands;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Вычислить значение переменной ans");
        System.out.println("ans=(b+√b^2+4ac)/2a-(a^3c+b^-2)");

        System.out.println("Ввведите a,b,c:");

        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d;
        double ans;


        d=Math.sqrt(b*b+4*a*c) ;

            ans= ((b+d)/2*a) -(Math.pow(a,3) * c + Math.pow (b,-2));


            System.out.println("ans="+ans);





    }
}


