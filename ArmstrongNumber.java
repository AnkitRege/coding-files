package com.Loops.whileLoops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num, armStrongNumber=0,rem, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		num2 = num;
		
		while(num>0) {
			rem = num%10;
			armStrongNumber = armStrongNumber+(rem*rem*rem);
			num = num/10;
			
		}
		System.out.println("ArmStrongNumber is "+armStrongNumber);
		
		if(armStrongNumber == num2)	{
				System.out.println(armStrongNumber+ " is armstrong number");
			}
		else {
			System.out.println(armStrongNumber+" is not armstrong number");
		}
			
	}
}
