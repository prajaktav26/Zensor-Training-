package Array;

public class Item {
	Item a[]=new Item[5];
	Item(String s,int p,int q)
	{
		for(int i=0;i<a.length;i++)//length is the property of array  
			System.out.println(a[i]);  

	}
	
	public  void main(String[] args) {


		a[0]=new Item("car",200,2);
		a[1]=new Item("mobile",700,1);
		a[2]=new Item("laptop",800,2);
		a[3]=new Item("computer",900,3);
		a[4]=new Item("Tv",500,4);
		a[5]=new Item("Watch",200,6);
		
		

	
}

}