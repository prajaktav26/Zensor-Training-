package Inheritance;

public class ExamResult extends OnlineExam {
	int marks;
	char grade;
	ExamResult()
	{
		super(5,100);
		marks=300;
		grade='A';
		System.out.println(" we are in default constructor of ExamResult class");

		
	}
	ExamResult(int a,char b)
	{
		marks=a;
		grade=b;
		System.out.println(" we are in parameterized constructor of ExamResult  class");
		System.out.println("Exam percentage is :"+marks/passingMarks*100);

	}
	public void showExamResult()
	{
		System.out.println("Marks is:"+marks+"Grade is:"+grade);
	}
	public int takeOnlineExam(int st,int et)
	{
		System.out.println("________________Online ExamResult class___________________ ");
		System.out.println("Exam Start Time is : "+st);
		System.out.println("Exam End Time is:"+et);
		int totalDuration=+st-et;
		int x= Math.abs(-totalDuration);

		return x;
		
		
	}
	
	public static void main(String[] args) {
//		ExamResult ER=new ExamResult();
//		ER.showExamDetails();
		
		
		
	}

}
