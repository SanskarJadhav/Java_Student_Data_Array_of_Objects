public class Student {
	private String name, dob;
	private long prn;
	private int marks;

	public void setName(String n) {
		this.name = n;
	}
	public void setPrn(long prn) {
		this.prn = prn;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setMarks(int marks){
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}
	public long getPrn() {
		return this.prn;
	}
	public String getDob() {
		return this.dob;
	}
	public int getMarks(){
		return this.marks;
	}
}