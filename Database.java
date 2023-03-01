import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	// using an ArrayList to store objects
	ArrayList <Student> students = new ArrayList<Student>();
	// creating object for InputOutput class in a has-a-relationship
	InputOutput io = new InputOutput();
	Scanner scan = new Scanner(System.in);
	int found;
	// method to add a student
	public void addStudent() {
		Object[] input = io.enterStudentData();
		// creating object for Student class in a uses-a-relationship
		Student s = new Student();
		s.setName((String)input[0]);
		s.setPrn((long)input[1]);
		s.setDob((String)input[2]);
		s.setMarks((int)input[3]);
		students.add(s);
	}
	// method to display all students
	public void displayStudents() {
		for (Student i: students) {
			io.printStudentData(i);
			System.out.println();
		}
	}
	// method to search for a student by name
	public void searchByName() {
		found = 0;
		System.out.println("Enter name: ");
		String name = scan.next();
		for(Student i: students) {
			if(i.getName().equals(name)) {
				System.out.println("Student Found");
				io.printStudentData(i);
				found = 1;
				break;
			}
		}
		// name isn't stored in the database
		if(found==0) System.out.println("Name does not exist in the database.");
	}
	// method to search for a student by PRN
	public void searchByPrn() {
		System.out.println("Enter PRN: ");
		long prn = scan.nextLong();
		for(Student i: students) {
			if(i.getPrn()==prn) {
				System.out.println("Student Found");
				io.printStudentData(i);
				found = 1;
				break;
			}
		}
		// PRN isn't stored in the database
		if(found==0) System.out.println("PRN does not exist in the database.");
	}
	// method to search for a student by position in the database (1,2,3,...)
	public void searchByPosition() {
		System.out.println("Enter position in database: ");
		int position = scan.nextInt();
		if(position <= students.size()) {
			System.out.println("Student Found");
			io.printStudentData(students.get(position-1));
		} else {
			// database size is smaller than position given
			System.out.println("Position is beyond database size");
		}
	}
	// method to update a value for a specific student
	public void updateStudentData() {
		System.out.println("Enter the name of the student: ");
		String name = scan.next();
		found = 0;
		for(Student i: students) {
			if(i.getName().equals(name)) {
				// user selects which feature to change
				System.out.println("Which value would you like to change: name/prn/dob/marks?  ");
				String str = scan.next();
				if(str.equals("name")) {
					System.out.println("Enter the new name: ");
					String newname = scan.next();
					i.setName(newname);
					System.out.println("Name has been updated successfully.");
				} else if(str.equals("prn")) {
					System.out.println("Enter the new PRN: ");
					long newprn = scan.nextLong();
					i.setPrn(newprn);
					System.out.println("PRN has been updated successfully.");
				} else if(str.equals("dob")) {
					System.out.println("Enter the new DOB: ");
					String newdob = scan.next();
					i.setDob(newdob);
					System.out.println("DOB has been updated successfully.");
				} else if(str.equals("marks")) {
					System.out.println("Enter the new marks: ");
					int newmarks = scan.nextInt();
					i.setMarks(newmarks);
					System.out.println("Marks have been updated successfully.");
				} else {
					System.out.println("Wrong input");
				}
				found = 1;
				break;
			}
		}
		// if student is not in database
		if (found==0) System.out.println("Name does not exist in the database.");
	}
	// method to delete data for a student
	public void deleteStudent() {
		System.out.println("Enter the name of the student to be deleted: ");
		String delname = scan.next();
		found = 0;
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getName().equals(delname)) {
				students.remove(i);
				System.out.println("Student had been deleted successfully");
				found = 1;
				break;
			}
		}
		// if student is not in database
		if (found==0) System.out.println("Name does not exist in the database.");
	}
}
