package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int n=-5;

        try {
            System.out.println(factorial(n));
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());

        }
        finally{

            System.out.println("Got some final work here");


        }
        System.out.println(fibonachi(7));



    }




    public static int factorial (int n) throws Exception{

        if (n<=0) throw new Exception("Incorrect value, n<0");

        if (n==1 || n==0)
            return 1;

        return n*factorial(n-1);

    }

    public static int fibonachi(int n){

        if(n<=1)
            return 1;
       /* if(n<=0)
            return 0;*/

        return fibonachi(n-1)+fibonachi(n-2);

    }

}
