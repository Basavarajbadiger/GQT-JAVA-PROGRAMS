package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class srtingcode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str.trim();
		String str2="";
		String str3="";
		String str4="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				str3=str3+str.charAt(i);
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90 ||str.charAt(i)>=97 && str.charAt(i)<=122) {
				str2=str2+str.charAt(i);
				
			}
			else
			{
				str4=str4+str.charAt(i);
				
			}
		}
		System.out.println("Alphabets in the string are " +str2);
		System.out.println("Numeric characters in the string are " +str3);
		System.out.println("special characters  in the string are " +str4);
	
	
	
	
	
	}

}
