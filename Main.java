import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NullPointerException {
		Scanner scan = new Scanner(System.in);
		// creating object for Database class in a uses-a-relationship
		Database db = new Database();
		int r;
		do {
			System.out.println("\nMENU\n==== ");
			System.out.println("1. Add students");
			System.out.println("2. Display all students");
			System.out.println("3. Search for a student");	
			System.out.println("4. Update a value for a student");		
			System.out.println("5. Delete a student");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					int j;
					do {
						db.addStudent();
						System.out.println("Would you like to add another student?  Yes - 1, No - 0  ");;
						j = scan.nextInt();
					} while(j==1);
					break;
				case 2:
					System.out.println("Database of Students\n--------------------\n");
					db.displayStudents();
					break;
				case 3:
					System.out.println("Search by name/prn/position: ");
					String npp = scan.next();
					int found = 0;
					if(npp.equals("name")) {
						db.searchByName();
					} else if(npp.equals("prn")) {
						db.searchByPrn();
					} else if(npp.equals("position")) {
						db.searchByPosition();
					} else {
						System.out.println("Wrong input");
					}
					break;
				case 4:
					db.updateStudentData();
					break;
				case 5:
					db.deleteStudent();
					break;
				default:
					System.out.println("Wrong input");
			}
			System.out.println("\nRun again?  Yes - 1, No - 0  ");
			r = scan.nextInt();
		} while(r==1);
	}
}