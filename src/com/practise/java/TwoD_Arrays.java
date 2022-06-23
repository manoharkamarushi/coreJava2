/**
 * 
 */
package com.practise.java;

/**
 * @author Mano
 *
 */
public class TwoD_Arrays {

	public static void main(String[] args) {

		String a[][]=new String[2][4];
		
		System.out.println("No.of rows:"+a.length);
		System.out.println("No. of cols:" +a[1].length); // to find column length
		
		a[0][0]="one";
		a[0][1]="two";
		a[0][2]="three";
		a[0][3]="four";
		
		a[1][0]="one";
		a[1][1]="two";
		a[1][2]="three";
		a[1][3]="four";
		
		for (int i=0;i<a.length;i++){
			
			for (int j=0;j<a[0].length;j++){
				
				System.out.println(a[i][j]);
			}
			
		}
	}

}
