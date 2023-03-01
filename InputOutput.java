import java.util.Scanner;

public class InputOutput {
	String name, dob;
	long prn;
	int marks;
	Object[] obj = new Object[4];
	public Object[] enterStudentData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the student: ");
		name = sc.next();
		System.out.println("Enter PRN of the student: ");
		prn = sc.nextLong();
		System.out.println("Enter date of birth of the student (DDMMYYYY): ");
		dob = sc.next();
		System.out.println("Enter marks of the student: ");
		marks = sc.nextInt();
		obj[0] = name;
		obj[1] = prn;
		obj[2] = dob;
		obj[3] = marks;
		return obj;
	}
	public void printStudentData(Student s) {
		System.out.println("Name:\t" + s.getName());
		System.out.println("PRN:\t" + s.getPrn());
		System.out.println("DOB:\t" + s.getDob());
		System.out.println("Marks:\t" + s.getMarks());
	}
}
