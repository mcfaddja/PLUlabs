import java.io.*;

public class RSUMS {
	public static void main ( String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("Input a: ");
		String aString = br.readLine();
		System.out.println();
		System.out.print("Input b: ");
		String bString = br.readLine();
		System.out.println();
		System.out.print("Input dx: ");
		String dxString = br.readLine();
		System.out.println();
		
		double a = Double.parseDouble(aString);
		double b = Double.parseDouble(bString);
		double dx = Double.parseDouble(dxString);
		
		double x = a;
		double answerLeft = 0;
		double answerRight = 0;
		double answerTrap = 0;
		
		while (x <= b) {
			x = x + dx;
			answerLeft = answerLeft + Math.exp(x*x) * dx;
			}
		
		
		x = a;
		
		while (x <= b) {
			answerRight = answerRight + Math.exp(x*x) * dx;
			x = x + dx;
			}
			
		
		x = a;
		double x1 = a;
		
		while (x <= b) {
			x = x + dx;
			answerTrap = answerTrap + (1.0/2.0) * (Math.exp(x*x) + Math.exp(x1*x1)) * dx;
			x1 = x1 + dx;
			}
			
		
		double averageLR = (answerLeft + answerRight) / 2;
		double averageAll = 	(answerLeft + answerRight + answerTrap) / 3;
		
		System.out.println();
		System.out.println("The Left Hand sum is                      " + answerLeft );
		System.out.println();
		System.out.println("The Right Hand sum is                     " + answerRight );
		System.out.println();
		System.out.println("The Trap sum is                           " + answerTrap );
		System.out.println();
		System.out.println("The average of the left and right sums is " + averageLR );
		System.out.println();
		System.out.println("The average of all of the sums is         " + averageAll );
		System.out.println();
		
		System.exit(0);
		}
	}