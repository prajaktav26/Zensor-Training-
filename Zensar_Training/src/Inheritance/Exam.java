package Inheritance;

public class Exam {
	private String examName;
	String universityName;
	Exam()
	{
		examName="B.E cbs Examination";
		universityName="RTMNU Nagpur University";
		System.out.println("we are in default constructor of Exam class");
		
	}
	Exam(String s1,String s2)
	{
		examName=s1;
		universityName=s2;
		System.out.println("we are in parameterized constructor of Exam class");
	}
	protected void showExamDetails() {
		System.out.println("Exam Name is: "+examName+" University Name is: "+universityName);
		
	}
	public int takeOnlineExam(int st,int et)
	{
		System.out.println("___________________ we are in Exam class__________________");
		System.out.println("Exam Start Time is : "+st);
		System.out.println("Exam End Time is:"+et);
		int totalDuration=st-et;
		int x=Math.abs(totalDuration);

		return x;
		
		
	}
	public void examshedule(String str1,String str2)
	{
		System.out.println("Subject name is:"+str1+"Exam Date is:"+str2);
	}
	

}
