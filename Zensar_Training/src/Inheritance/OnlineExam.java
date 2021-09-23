package Inheritance;

public class OnlineExam extends Exam{
	int userId;
	int passingMarks;
	int statTime;
	int endTime;
	OnlineExam()
	{
		super("B.E fifth sem","RTMNU");
		userId=3;
		passingMarks=200;
		statTime=9;
		endTime=12;
		System.out.println(" we are in default constructor of OnlineExam class");
	}
	OnlineExam(int i1,int i2)
	{
		super("b.s.c","RTMNU");
		userId=i1;
		passingMarks=i2;
		System.out.println(" we are in parameterized constructor of OnlineExam class");

		
		
	}
	public int takeOnlineExam(int st,int et)
	{
		System.out.println("________________Online exam class___________________ ");
		System.out.println("Exam Start Time is : "+st);
		System.out.println("Exam End Time is:"+et);
		int totalDuration=st-et;
		int x=Math.abs(-totalDuration);
		return x;
		
		
	}
	
public static void main(String[] args) {
	OnlineExam OE=new OnlineExam();
	//DYNAMIC PLOYMORPHISM
	Exam E;
	E=new ExamResult();
	System.out.println(E.takeOnlineExam(9, 12));
//	OE.showExamDetails();
	
	E=new ExamResult2();
	System.out.println(E.takeOnlineExam(3, 5));
	
}
	

}
