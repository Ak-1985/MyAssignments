package week3.day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Students student = new Students();
           student.getStudentInfo(10002001);
           student.getStudentInfo(10002001, "kiruthika");
           student.getStudentInfo("student@gmail.com", 668666567);
	}
	public void getStudentInfo(int id) {
		System.out.println("The student id is \t " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The student id and name is \t " + id +"\t and \t" + name);
	}
	
	public void getStudentInfo(String email,long phoneNum) {
		System.out.println("The student email is \t " + email + "\t and \t" + phoneNum);
	}
}
