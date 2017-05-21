public class Student {
	private double gPA;
	private String name;
	private int age;
	
	public Student ( double studentGPA, String studentName, int studentAge ){
		gPA = studentGPA;
		name = studentName;
		age = studentAge;
		}

	public void setGPA ( double studentGPA ) {
		gPA = studentGPA;
   	}

	public double getGPA ( ) {
		return gPA;
		}
		
	public void setName ( String studentName ) {
		name = studentName;
		}

	public String getName ( ) {
		return name;
		}
		
	public void setAge ( int studentAge ) {
		age = studentAge;
		}
		
	public int getAge ( ) {
		return age;
		}

	} //end Sudent class
