import java.io.*;
import java.text.*;

public class StudentTester {
	public static void main (String [] arg) throws IOException {
	
		//Creating the Buffered Reader for System.in
		BufferedReader br;
		br = new BufferedReader ( new InputStreamReader (System.in) );

		
		//input for student1
		Student student1;
		
		System.out.print("Please input the first student's name: ");
		String nameStudent1 = br.readLine();
		
		System.out.print("Please input the first student's GPA: ");
		String gPAStudent1 = br.readLine();
		
		System.out.print("Please input the first student's age: ");
		String AgeStudent1 = br.readLine();
		System.out.println();
		
		student1 = new Student( Double.parseDouble(gPAStudent1) , nameStudent1, Integer.parseInt(AgeStudent1) );
				
		
		//input for student2
		Student student2;
		
		System.out.print("Please input the second student's name: ");
		String nameStudent2 = br.readLine();
		
		System.out.print("Please input the second student's GPA: ");
		String gPAStudent2 = br.readLine();
		
		System.out.print("Please input the second student's age: ");
		String AgeStudent2 = br.readLine();
		System.out.println();
		
		student2 = new Student( Double.parseDouble(gPAStudent2) , nameStudent2, Integer.parseInt(AgeStudent2) );
		
				
		//input for student3
		Student student3;
		
		System.out.print("Please input the third student's name: ");
		String nameStudent3 = br.readLine();
		
		System.out.print("Please input the third student's GPA: ");
		String gPAStudent3 = br.readLine();
		
		System.out.print("Please input the third student's age: ");
		String AgeStudent3 = br.readLine();
		System.out.println();
		
		student3 = new Student( Double.parseDouble(gPAStudent3) , nameStudent3, Integer.parseInt(AgeStudent3) );
		
		//output of data
		DecimalFormat df1 = new DecimalFormat ("0.0");
		
		System.out.println( "The first student's name is:  " + student1.getName() );
		System.out.println( "The first student's GPA is:   " + student1.getGPA() );
		System.out.println( "The first student's age is:   " + student1.getAge() );
		System.out.println( "The second student's name is: " + student2.getName() );
		System.out.println( "The second student's GPA is:  " + student2.getGPA() );
		System.out.println( "The second student's age is:  " + student2.getAge() );		
		System.out.println( "The thrid student's name is:  " + student3.getName() );
		System.out.println( "The third student's GPA is:   " + student3.getGPA() );
		System.out.println( "The third student's age is:   " + student3.getAge() );
		System.out.println( "The average GPA is:           " + df1.format((student1.getGPA() + student2.getGPA() + student3.getGPA()) / 3 ) );
				
		System.exit(0);
		
		}//end main
	}//end StudentTester