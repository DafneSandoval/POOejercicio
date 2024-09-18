   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       public Student (String firstName, String lastName, int registration) {
    	   this.firstName = firstName;
           this.lastName = lastName;
           this.registration = registration;
           this.grade= 0;
           this.year=1;
           }// constructor 1

       public Student (String firstName, String lastName, int registration, int grade) {
    	   this.firstName = firstName;
           this.lastName = lastName;
           this.registration = registration;
           this.grade= grade;
           this.year= 1;
           }// constructor 2

       public Student (String firstName, String lastName, int registration, int grade, int year) {
    	   this.firstName = firstName;
           this.lastName = lastName;
           this.registration = registration;
           this.grade= grade;
           this.year= 1;
           }
    		// constructor 3
       
       
       
       public void printFullName(){
 
    	   System.out.println(firstName + " " + lastName);
    	   } // printFullName

     //public void isApproved() {   
   	// if  (grade >=60) {
   	//	 System.out.println("True");
   	// }
   	//}
    	   public boolean isApproved(){
    		   return grade >=60;
    		   } // Aprovado 
    	
    	       
    		public void changeYearIfApproved() {
    		        if (isApproved()) {
    		            year++;
    		            System.out.println("Congratulations"); } 
    	  } // change year
    		        
    	   @Override
           public String toString() {
               return firstName + " " + lastName + ", Registration: " + registration + ", Grade: " + grade + ", Year: " + year;
           }// toString

		public boolean contains(String courseName) {
			// TODO Auto-generated method stub
			return courseName.contains(courseName);
		}

		public boolean remove(String courseName) {
			return false;
		}
    	   
   } // class Student
