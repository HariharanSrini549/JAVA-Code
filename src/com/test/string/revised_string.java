package com.test.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class revised_string {

	public static void main(String[] args)throws IOException {
		
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		        //welcome to Java 
		        System.out.println("Please enter a string:");
		        String st=br.readLine();
		        String rev="";
		        
		        for(int i=st.length()-1;i>=0;i--)
		        {
		        	rev = rev + st.charAt(i);
		        }
				
		      System.out.println(rev);
			
			}

		}



