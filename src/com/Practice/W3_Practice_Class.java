package com.Practice;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;
/**
This is my documentation for the W3 practice class and i have solved them mostly.
 */
@SuppressWarnings("JavadocReference")
public class W3_Practice_Class  {
    /**
    This Method Multiplies 2 ints.
     */
    /*



     */
    public static void Pr5( int a, int b){
        System.out.println(a*b);
    }
    // THis method does all operations on 2 ints
    public static void Pr6(int a, int b) throws ArithmeticException{
        System.out.println("Addition "+ a+b);
        System.out.println("Subtraction "+ (a-b));
        System.out.println("Division "+ a/b);
        System.out.println("Multiplication "+ a*b);
        System.out.println("Modulus "+ a%b);
    }

    public static void Pr7 ( ) {
        for (int i = 1; i <= 10; i+= 1) {
            for (int j = 1; j <= 10; j+= 1) {
                System.out.printf(" %d x %d = %d", i, j, (i * j));
                System.out.println();
            }
        }
    }

    public static void Pr7 (int a ) {
        for (int j = 1; j <= 10; j++) {
                System.out.printf(" %d x %d = %d", a, j, (a * j));
                System.out.println();
            }

    }
    public static void pr11( int a){
        System.out.println(" FInding the area and perimeter of circle from the radius given");
        float area = (float) (3.14*a*a);
        float perimeter = (float) (2 * 3.14 * a);
        System.out.println( "Area of the circle is = "+area);
        System.out.println( "Perimeter of the circle is = "+perimeter);
    }
// This method accepts 3 Integers
    /*
    thismethod helps us to give  A BETTER UNDERSTANDING
    ON HOW AND WHY THE HUMANS WORK


     */
    public static void pr12(int a, int b){
        // Storing the sum of integers
        int bad = a+b;
        // Printing the sum of 3 integers
        System.out.println( "Sum  = " + bad);
        // Printing the Average of 3 numbers
        System.out.println( "Average  = " + (bad/2));
    }

    public static void pr13( float a, float b){
        System.out.println(" Finding the area and perimeter of Rectangle from the Dimensions given");
        float area =  (a*b);
        float perimeter =(2*(a+b));
        System.out.println( "Area of the Rectangle is = "+area);
        System.out.println( "Perimeter of the Rectangle is = "+perimeter);
    }

    public static void pr14(int a , int b){
        System.out.println( "Before Swapping a, b = "+ a +" "+ b);
        int temp;
         temp =a;
        a = b;
        b = temp;
        System.out.println( "Before Swapping a, b = "+ a +" "+ b);
    }

    public static void pr_20( int decimal ){
       int rem;
       String hex = "";
       char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (decimal>0){
            rem = decimal%16;
            decimal = decimal/16;
            hex = hexchars[rem]+ hex;
        }
        System.out.println(hex);
    }


    public static void  toHex( int decimal){
        int remainder;
        String hex ="";
        char hexchars [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         while (decimal >0){
             remainder = decimal%16;
             decimal = decimal/16;
             hex = hexchars[remainder]+ hex;
         }
        System.out.println(hex);
    }

    public static void to_octal ( int decimal){
        int rem;
        String oct = "";
        char octal[] = {'0','1','2','3','4','5','6','7'};

        while (decimal > 0){
            rem = decimal%8;
            decimal = decimal/8;
            oct = octal[rem] + oct;
        }
        System.out.println(oct);
    }

    public static void pr32(int a, int b) {
        if (a == b) {
            System.out.println(" Both Numbers are equal");
        } else if (a < b) {
            System.out.printf("%d is less than %d", a, b);
        } else if (a > b) {
            System.out.printf("%d is Greater than %d", a, b);
        }
    }

    public static void pr33(int value){
        int sum = 0;
        while (value != 0){
            sum += value%10;
            value /= 10;
        }
        System.out.println(sum);
    }
    public static void pr34(int s){
        double area = (6 * s*s)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of Hexagon is = "+ area);
    }
    public static void pr35(int n, int s){
        double area = (n * s*s)/(4*Math.tan(Math.PI/n));
        System.out.println("The area of Polygon is = "+ area);

    }

    public static void  pr37( String s){
        char nu[] = s.toCharArray();
        int j = nu.length;
        for (int i = j-1; i >= 0; i--){
            System.out.print(nu[i]);
        }

    }

    public static void pr38( String sample){
        char [] sampled = sample.toCharArray();
        int number = 0;
        int spaces = 0;
        int letters = 0;

        for ( int i =0;i<sampled.length;i++){
            if (Character.isLetter(sampled[i])) {
                letters++;
            } else if (Character.isDigit(sampled[i])){
                number++;
            } else if (Character.isSpaceChar(sampled[i])){
                spaces++;
            }
        }
        System.out.printf("Count of numbers = %d",number);
        System.out.println();
        System.out.printf("Count of spaces = %d",spaces);
        System.out.println();
        System.out.printf("Count of letters = %d",letters);
    }

    public static void sam(){
        String no = "Asphalt 8 rocks";
        char[] ni = no.toCharArray();
        Character.isLetter(ni[2]);
        System.out.println(Character.isLetter(ni[2]));
    }


    public static void pr39(){
        int amount = 0;
        for ( int i = 1;i <= 6;i++){
            for ( int j = 1;j <= 6;j++){
                for ( int k = 1;k <= 6;k++){
                    if (i!=k && i!=j && j!=k){
                        System.out.println(i+" "+j+" "+k);
                        amount++;
                    }
                }
            }
        }

        System.out.println("The Count of unique numbers generated is "+ amount);
    }
     public static void pr41(){
        int chr = 'd';
         System.out.println(chr);
     }
     public static void sam1(){
          float a =2.3f;
          float b = 3.4f;
         System.out.println(a/b);

         double c =2.3d;
         double d = 3.4;
         System.out.println(c/d);

     }
     public static void pr44(int n) {

        String neww = String.valueOf(n);
        String add = neww+neww;
        String add3 = neww+neww+neww;

        int a = Integer.parseInt(neww);
        int b = Integer.parseInt(add);
        int c = Integer.parseInt(add3);

        int sum = a+b+c;
         System.out.println(sum);

     }


     public static void pr48( ){
        for ( int i = 0;i <= 100; i ++){
            if ( i%2!=0){
                System.out.println(i);
            }
        }
     }

public static void pr49( int a){
        if ( a%2==0){
            System.out.println(0);
        } else {
            System.out.println( 1);
        }
}

public static void pr50( ) {
    for (int i = 0; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " is Divisible by 3 and 5");
        } else if (i % 3 == 0) {
            System.out.println(i + " is Divisible by 3");
        } else if (i % 5 == 0) {
            System.out.println(i + " is Divisible by 5");
        }
    }
}

public static void pr51( int number){
        String sankhya = String.valueOf(number);
    System.out.println(sankhya);

}
public static void pr52( int a, int b, int c) {

    if ((a+b) == c) {
        System.out.println("True");
    } else {
        System.out.println("False");
    }
}

public  void pr53(){
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter First Number");
        int a = scan.nextInt();
    System.out.println("Enter Second Number");
        int b = scan.nextInt();
    System.out.println("Enter Third Number");
        int c = scan.nextInt();

    System.out.println(a<b && b<c);
}


public static void pr54( int a, int b, int c){
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        String cc = String.valueOf(c);
    int x = Integer.parseInt(aa.substring(0,1));
    int y = Integer.parseInt(bb.substring(0,1));
    int z = Integer.parseInt(cc.substring(0,1));

    System.out.println(x == y || x == z || y ==z);

}

public static void pr55(int seconds){
        int current_seconds = seconds%60;
        int minutes = seconds/60;
        int current_minutes = minutes%60;
        int hours = minutes/60;
        int current_hours = hours%60;

    System.out.printf("Current Time is %d : %d : %d \n",current_hours,current_minutes,current_seconds);

}
public static void  pr56 ( int x, int y, int z){
                for ( int i =x; i <=y;i++){
                    if (i%z==0){
                        System.out.printf("%d is divisible by %d\n", i,z);
                    }
                }
}


    public static void pr57(int value){
        int count = 0;
        for( int i = 0 ; i <= value ; i++){
            for ( int j = 0; j <= value; j++){
                if( (i*j)==value){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
    public static void pr58(String h){}

    public static void Emi(int P, float AnnualROI, int N){

     float R = (AnnualROI/12/100);
     float val = 1 + R;
     int power = N;

     float EMI  = (float) (P * R *(Math.pow(val,power))/((Math.pow(val,power))-1));
        System.out.println(EMI);
    }


/**This Method take number of participants as input and divides them into 4 teams based
 on the constraints
 @param Takes one int input.
 @return This method returns null.
 @throws This method throws niente.
 @deprecated Nothing has depricated.

 */

    /**
     *
     *
     */
    public static void group_Division(int P){
//       Specifying the range of participants
        if ( P<=100 || P>=200 ){
            System.out.println("Invalid Input");
//            If the participants are in even number, then the groups are equally
//            into four groups
        } else if ( P%2==0){
            int Q = P/4;
            System.out.printf(" Group A has %d Participants\n",Q);
            System.out.printf(" Group B has %d Participants\n",Q);
            System.out.printf(" Group C has %d Participants\n",Q);
            System.out.printf(" Group D has %d Participants\n",Q);
//             If the participants are in Odd number, then 4 teams will be divided by
//            4 and the excess will be adjusted in the 4th group
        } else if ( P%2!=0){
            int Excess = P%4;
            int Participants = (P-Excess)/4;
            System.out.printf(" Group A has %d Participants\n",Participants);
            System.out.printf(" Group B has %d Participants\n",Participants);
            System.out.printf(" Group C has %d Participants\n",Participants);
            System.out.printf(" Group D has %d Participants\n",(Participants+Excess));
        }
    }




    public synchronized void practic2(){
        String[] names = {"abrar", "Ironman","Captain"};
        String[] numes = {"muddu", "SHinchan","NInja KHatori"};

        for( int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for ( String element : numes){
            System.out.println(element);
        }
    }

    /**
     *
     * @param input
     * @return
     */
    public static boolean containsVowesls( String input){
        return input.toLowerCase().matches(".*[m]*.");
    }



    public static void prime( int a) {
        System.out.println(2);

        for (int i = 1; i < a; i++) {
            if (i <= 2) {
                System.out.println(2 * i + 1);
            } else {
                int prime = (2 * i) + 1;
                if (prime % 2 == 0 || prime % 3 == 0 || prime % 5 == 0) {
                } else {
                    System.out.println(prime);
                }
            }
        }
    }

    

    /**
     *
     * @param a this is a first of a kind
     * @param b This follows the first of a kind
     * @param c Beta you are a follower of a follower
     * @param g  are bhaiii,, ghar chale jaa
     * @throws ArithmeticException it is cause nothing is divisible 0
     * @return this returns bhaichara
     */
    public static int  Docs( int a, int b, int c, String g) throws ArithmeticException{
         int z = a;
        return z;
    }

    public static void rectangArea(int a, int b){
        System.out.println(" The Area of a rectNGLE IS "+a*b);
    }

    public static void myname (String a){
        System.out.println("My name is "+a);
    }
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("I am Abrar");
//        System.out.println(20+30);
//        System.out.println(19/3);
//        System.out.println(-5+8*6);
//        System.out.println((55+9)%9);
//        System.out.println(20+-3*5/8);
//        System.out.println();
//        Pr5(5,10);
//  Pr6(10,2);
        // Pr7(5);
        // Pr7(6);
        //Pr7(7);


//        System.out.println("       J     ");
//        System.out.println("       J     ");
//        System.out.println("       J     ");
//        System.out.println("   J   J     ");
//        System.out.println("   J   J     ");
//        System.out.println("    JJJJ     ");
//        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
//        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//            pr11(10);
//        pr12(10,20,30);
//        pr13(10,4);
//        pr14(11,99);
//        toHex(289);
//        pr_20(775);
//        to_octal(775);
//        to_octal(1256);
//        System.out.println(System.getProperty("java.runtime.version"));
//        pr32( 6700,844);
//        System.out.println(2%10);
//        pr33(234);
//        pr34(6);
//        pr35(4,4);
//        pr37("sum");
// pr37(" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
//        pr38("I am abrar888   ");
//        sam();
//        pr39();
// 43 - System.out.println("Twinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are");
//        pr48();
//        pr49(23);
//        pr49(22);
//        pr50();
//        pr51(88856);
//        pr52(10,20,30);
//        pr52(10,20,40);
//        pr53();
//        pr54(10,40,29);
//        pr54(10,420,1988);
//        pr55(86400);
//        pr55(8640);
//        pr56(10,20,2);
//        pr57(441);
//        Emi(500000, 10.5F,60);
//        Emi(25000, 24F,15);
//        group_Division(201);
//        group_Division(180);
        //group_Division(183);
//        practic2();
        //   System.out.println(containsVowesls("abrar"));
        //Pr7();
        //  prime(100);
        //String ab = "Abrar";
        //int ba = Integer.parseInt(ab);
        //System.out.println(ba);
//        int[] marks = new int[3];
//        marks[0] = 80;
//        marks[1] = 90;
//        marks[2] = 70;
//        Scanner scan = new Scanner(System.in);
//
//        boolean flag = true;
//        while (flag) {
//            int index = scan.nextInt();
//            try {
//                try {
//                    System.out.println(marks[index]);
//                    flag = false;
//                } catch (Exception e) {
//                    System.out.println(" regular exception");
//                    System.out.println(e);
//                }
//            } catch (Exception c) {
//                System.out.println(c);
//            }}
        //W3_Practice_Class we = new W3_Practice_Class();
        //we.practic2();
        //we.pr53();
       // pr12(1,2);
        rectangArea(10,20);
       // myname("Chari");

    }

}