package Class;

public class Student {
	public int rollNo;
	private int admissionNo;
     protected int courseId;
     int age;
     
     public void setRollNo(int rn)
     {
    	 rollNo=rn;
    	 
     }
     public int getRollNo()
     {
    	 return rollNo;
     }
     private void setAdmissionNo(int ANo)
     {
    	 admissionNo=ANo;
     }
     private int getAdmissionNo()
     {
    	 return admissionNo;
     }
     protected void setcourseId(int cId)
     {
    	 courseId=cId;
     }
     protected int getcourseId()
     {
    	 return courseId;
     }
     void setage(int ag)
     {
    	 age=ag;
     }
     int getage()
     {
    	 return age;
     }
     

}
