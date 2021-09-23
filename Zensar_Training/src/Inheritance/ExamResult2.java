package Inheritance;

public class ExamResult2 extends ExamResult{
	float cgpa;
	float sgpa;
	public ExamResult2() {
		cgpa=8.54f;
		sgpa=8.56f;
		
		
	}
	public ExamResult2(float c,float s)
	{
		cgpa=c;
		sgpa=s;
	}
	void showExamResult2Dtails()
	{
		System.out.println("CGPA:"+cgpa+"SGPA:"+sgpa);
	}
	public int takeOnlineExam(int st,int et)
	{
		System.out.println("________________Online ExamResult2 class___________________ ");
		System.out.println("Exam Start Time is : "+st);
		System.out.println("Exam End Time is:"+et);
		int totalDuration=st-et;
		int x=Math.abs(-totalDuration);

		return x;
		
		
	}
	
	public static void main(String[] args) {
		ExamResult2 ER2=new ExamResult2();
		ER2.showExamDetails();
	}

}
