import java.io.*;

public class PrimeNumbers {
	public static void main (String [] arg ) throws IOException {
	
		System.out.println();
		System.out.println("This program will determine all of the prime numbers that lie \n"+
								 "with in a given range.");
		
		System.out.println();
		
		//get range
		
		BufferedReader br;
		br = new BufferedReader( new InputStreamReader(System.in));
		
		String lowString;
		System.out.print("Input the lowest number in the range: ");
		lowString = br.readLine();
		
		String highString;
		System.out.print("Input the largest number in the range: ");
		highString = br.readLine();
		
		System.out.println();
		
		//convert String to int
		
		int low;
		low = Integer.parseInt(lowString);
		
		int high;
		high = Integer.parseInt(highString);
		
		//initalize variables
		
		int num;
		num = low;
		
		int i;
		i = 2;
		
		int t;
		t = 1;
				
		//calculate
		while (high >= num){
			if (num == 2) {
				System.out.println(num);
				}
			
			else if (num == 3) {
				System.out.println(num);
				}
				
			else while (num > i) {
				if (num % i != 0) {
					i++;
					}
				else break;
				if (num == i + 1) {
					System.out.println(num);
					}
				}
			
			i=2;
			num = num + 1;
			}
		System.exit(0);	
		}
	}
	