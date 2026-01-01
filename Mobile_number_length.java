package com.index;

import java.util.Scanner;

public class Mobile_number_length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		do {
			System.out.println("Enter mobile number: ");
			num=sc.nextLine();
			if(num.length()!=10) {
				System.out.println("Enter 10 digit mobile number");
			}
		}while(num.length()!=10);
		System.out.println("Mobile number accepted  " + num);
		sc.close();
	}

}
