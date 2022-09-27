package com.test.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class replace {

	public static void main(String[] args) throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        //welcome to Java 
	        System.out.println("Please enter a string:");
	        String name=br.readLine();
	        System.out.println(name.replace(" ",","));
	}

}

