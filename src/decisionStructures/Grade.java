package decisionStructures;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double grade = -999;
		System.out.println("What is your homework grade?");
		double homework = input.nextDouble();
		System.out.println("What is your test grade?");
		double test = input.nextDouble();
		System.out.println("What is your teacher nice? True or False");
		boolean nice = input.nextBoolean();
		if(nice==true) {
			if(test>homework)grade=test;{
			 if(grade<45.00) {
					System.out.println("Grade: F");
			 }
					else {
						if(grade<60.00) {
							System.out.println("Grade: D");
						}
							else {
								if(grade<75.00) {
									System.out.println("Grade: B");
								}
								else {
									if(grade<92.5) {
										System.out.println("Grade: B");
								}
									else {
										if(grade>65.00) {
											System.out.println("Grade: A");
									}
					}
								}
							}
					}
			}
		}
						else {
							grade=homework;
							if(grade<45.00) {
								System.out.println("Grade: F");
						 }
								else {
									if(grade<60.00) {
										System.out.println("Grade: D");
									}
										else {
											if(grade<75.00) {
												System.out.println("Grade: B");
											}
											else {
												if(grade<92.5) {
													System.out.println("Grade: B");
											}
												else {
													if(grade>65.00) {
														System.out.println("Grade: A");
												}
								}
											}
										}
						}
					}
			 
		
		 {
			 if(grade<45.00) {
					System.out.println("Grade: F");
			 }
					else {
						if(grade<60.00) {
							System.out.println("Grade: D");
						}
							else {
								if(grade<75.00) {
									System.out.println("Grade: B");
								}
								else {
									if(grade<92.5) {
										System.out.println("Grade: B");
								}
									else {
										if(grade>65.00) {
											System.out.println("Grade: A");
									}
					}
		}
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}
