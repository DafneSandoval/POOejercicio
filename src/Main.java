public class Main {

	public static void main(String[] args) {
		Student Charlotte = new Student ("Charlotte", "Bovier", 45630, 80, 2);
		Student Paolo = new Student("Paolo", "Sandoval", 610042, 70, 1);
		
		System.out.println(Paolo);
		System.out.println(Charlotte);
 // estudiantes
		

		
		Courses history = new Courses ("History", "Profe:Mickey", 100);
		
		
		history.enrollStudent(Charlotte);
		history.enrollStudent(Paolo);
	//inscribir estudiantes
		
		history.printEnrolledStudents();
	// estudiantes inscritos
		
		 
	}

} //main
