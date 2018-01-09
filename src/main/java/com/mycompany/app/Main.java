package com.mycompany.app;
import java.io.*;
public class Main 
{
    public static void main( String[] args )throws Exception
    {
    	try{
		PrintWriter writer = new PrintWriter("test_out.txt", "UTF-8");
		writer.println("Ornek Dosya , Deployment");
		writer.close();
	}catch (Exception e)
	{
	}
		
    }

    public static int sum(int a, int b) {
    	return a+b;
    }

    public static int sub(int a, int b) {
    	return a-b;
    }

    public static int mult(int a, int b) {
   	return a*b;
    }
 
    public static double sumDouble (double a, double b){
    	return a + b ;
    }
 
    public static String retString(String a){
    	return a;
    }
 
    public static String StringAdder(String a,String b){
    	return a+b;
    }


}
