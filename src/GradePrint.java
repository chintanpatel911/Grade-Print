
/*
 * Name : Chintan Patel
 * CSU ID : 2473177	
 * Assigment 6 : Grade Print 
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class GradePrint {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new FileReader("C:\\Users\\chintan\\Desktop\\CIS 260\\Programs\\data.txt"));
		
		int [] grades = new int[29];
		int i = 0;
		int number;
		
		while (input.hasNextInt())
		{
			number = input.nextInt();
			grades [i] = number;
			i++;
		}
		
		Arrays.sort(grades);
		int line = 0;
		
		
		for (i = 0 ; i < grades.length ; i++){
						
			if (line == 8){
				
				System.out.println();
				
				line = 0;
			}
			
			System.out.print(grades [i] + "      ");
			line++;
		}
	}
}
