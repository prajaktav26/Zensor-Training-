package Inheritance;

abstract class AbstractClass {
	abstract void fun();
	abstract void salary();
	void name()
	{
		System.out.println("my name is prajakta");
	}
}

class Abc extends AbstractClass {
	public void fun() {
		System.out.println("Derived fun() called");
	}
		public void game()
		{
			System.out.println("my favourite game is criket");
		}
		@Override
		void salary() {
			System.out.println("my salary is 360000");
			
		}
	
}