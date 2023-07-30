package sample;

public class ThisMethodHome {

	int l=10;
	public void add(int a, int b)
	{	this.print("anju",1997);
		System.out.println(a+b);
	}
	public void sub(int c, int d)
	{	//this.add(8,9);
		System.out.println(c-d);
	}
	public void display(String gender, int age)
	{	
		System.out.println(gender);
		System.out.println(age);
		this.sub(6,3);
		
	}
	public void print(String name, int dob)
	{	
		System.out.println(name);
		this.display("female",27);
		System.out.println(dob);
	}
	public static void main(String args[])
	{
		ThisMethodHome obj1=new ThisMethodHome();
		obj1.add(9,5);
		System.out.println(obj1.l);
	}
	
		
	
}
	

