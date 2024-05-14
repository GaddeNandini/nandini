package tnsif;

public class person {
	private String Fullname;
	private int Rollno;
	private String Grade;
	private Float Percentage;
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		this.Fullname = fullname;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		this.Rollno = rollno;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		this.Grade = grade;
	}
	public Float getPercentage() {
		return Percentage;
	}
	public void setPercentage(Float percentage) {
		this.Percentage = percentage;
	}
	@Override
	public String toString() {
		return "person [fullname=" + Fullname + ", rollno=" + Rollno + ", grade=" + Grade + ", percentage=" + Percentage
				+ "]";
	}
	
	

}
