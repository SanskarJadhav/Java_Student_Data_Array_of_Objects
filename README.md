# Java_Student_Data_Array_of_Objects
The following java program consists of four classes: Main, Student, InputOutput, and Database.

The Main class acts as a user interface, where the user can
- see a menu displaying all operations that can be done
- select one operation to perform
- choose to run the program again

db is an instance of the Database class created in the Main file.

Before discussing the Database class, let us take a look at the Student class and InputOutput class.

The Student class defines the following private variables:
- String name
- long prn
- String dob
- int marks
It makes use of the setter and getter methods to store and retrieve values respectively. These methods are namely:
- setName(String n), setPrn(long prn), setDob(String dob), setMarks(int marks): setter methods
- getName(), getPrn(), getDob(), getMarks(): getter methods

The InputOutput class is designed to take input from the user and display student data to the user. The methods used are:
- enterStudentData(): uses Scanner to accept values from the user for all the variables listed in the Student class, and then stores them in an array of objects.
- printStudentData(Student s): displays all relevant data of the selected student using getter methods in the Student class.

The Database class stores the methods for all operations that can be performed. It uses an ArrayList storing student data (as defined by the Student class), Scanner to take input from the user, and io as an instance of the InputOutput class.

The methods used are:
- addStudent(): uses io.enterStudentData() to get student data as an array of objects, stores each value in their respective variable using setter method, and then adds the student data to the arraylist.
- displayStudents(): for loop to print data for all students using io.printStudentData().
- searchByName(): takes name from user, then runs a for loop to compare each student's name. If name is found in arraylist, data for that student is printed, else informs user that name doesn't exist.
- searchByPrn(): similar to searchByName() but for PRN.
- searchByPosition(): takes position from user, then sees if the position is smaller than the number of students stored in the arraylist. If less, then gets the student data at that position, else informs user that position is too large.
- updateStudentData(): finds the student data based on name entered by user, asks user which feature to change, asks user to enter new value, uses setter method to update value for specified variable, and finally informs user whether update is successful or not.
- deleteStudent(): finds the student data based on name entered by user, uses .remove() to delete the student from the arraylist, and informs the user whether the deletion is successful or not.

Hence the 5 operations that the user can select in the Main file are:
1. Add a student
2. Display all students
3. Search for a student
4. Update data of a student
5. Delete a student

Note that the student data is being stored in an arraylist, though the displaying of the data with println() produces results that mimic a database format, hence the word 'database' is shown to the user for simplicity in understanding, and the application of this program can also be stated as a "Student Database System".
