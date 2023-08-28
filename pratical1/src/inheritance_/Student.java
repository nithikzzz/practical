package inheritance_;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	public Student() {
		super();
	}
	public Student(String name, long aadharNo, String address, long phno,int rollNo, String collegeName) {
		super(name,aadharNo,address,phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return   super.toString()+"\n Roll No: " + rollNo + "\n collegeName:" + collegeName +"\n";
	}
	
	
	
	
}
