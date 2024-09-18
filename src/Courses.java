import java.util.ArrayList;
import java.util.List;
public class Courses {
	String courseName;
	String professorName;
	int year;
	List<Student> student;
	
	//collector list 
	List<Student> Student = new ArrayList<>();
	public void Course (String courseName, String professorName, int year){
	this.courseName = courseName;
	this.professorName = professorName;
	this.year = year;
	this.student = new ArrayList<>();
	} // collection that lists all students enrolled in them
	
	public Courses (String courseName, String professorName, int year) {
		this.courseName="History";
		this.professorName="Profe:Mickey"; 
		this.year= 100;
	}// constructor history
	
	
	
	 public void enrollStudent (Student student){
		 if (student.contains(courseName)) {
		        System.out.println(student.firstName + " " + student.lastName + "enrolled" + courseName);
		    }//if enroll 
		   } //enrollStudent
	 //
	 public void enroll(Student[] studentsArray) {
	        for (Student student : studentsArray) {
	            enrollStudent(student);
	        }
	    }
	 //

	 public void unEnroll(Student student){
		 if (student.remove(courseName)) {
	            System.out.println(student.firstName + " " + student.lastName + "unenrolled");
	        }// if unEnroll
	    }// unEnroll
			  

	public int countStudents(){
		  return student.size();
		   } //countStudents
		   
 public void printEnrolledStudents(){
	 for (Student enrollStudents : Student) {
		 System.out.print(enrollStudents);
		 
	 }// Enrollstudents
	 
 }
} // courses
