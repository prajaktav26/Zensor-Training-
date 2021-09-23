package Class;
import java.util.Scanner;
public class Professor2 extends Professor{
		 public String city;
		 public String stateName;
//            public Professor2(String city, String stateName) {
//			super("Balaji", "per101");
//			this.city = city;
//			this.stateName = stateName;
//		}

		 public Professor2(String personName, String personId, String city, String stateName) {
				super(personName, personId);
				this.city = city;
				this.stateName = stateName;
			}
		 
		void showData() {
			//String city="soalpur";
			System.out.println("Person Deatils.......");
			/*System.out.println("PersonId: "+ super.personId);
			System.out.println("PersonName : "+super.personName );*/
			super.display();
			//super.city="solapur";
			System.out.println("Addess: "+this.city +", "+ this.stateName);
		}
		 
		public static void main(String[] args) {
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Eneter personName");
			 String peronName=scanner.next();	 			
			 System.out.println("Eneter personID");
			 String personId=scanner.next();
			 System.out.println("Eneter city name ");
			String city=scanner.next();
			 System.out.println("Eneter  state name");
			String state=scanner.next();
			 
			Professor2 p2=new Professor2(peronName,personId,city, state);
			p2.showData();
		}
		 

}
