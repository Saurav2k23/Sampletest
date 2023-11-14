package coreJavaWeek1;

public class Employee
{
	// modified 14-11-2023
	//data
	int empid;
	String empname;
	
	//function
	public void empDisplay()
	{
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee name is: "+empname);
	}
	
	
	public static void main(String args[])
	{
		//Object Creation
		Employee e1=new Employee();
		e1.empid=101;
		e1.empname="Seema";
		e1.empDisplay();
		System.out.println("***************");
		Employee e2=new Employee();
		e2.empid=102;
		e2.empname="Sarita";
		e2.empDisplay();
		System.out.println("***************");
		Employee e3=new Employee();
		e3.empid=103;
		e3.empname="Rakesh";
		e3.empDisplay();
		
		
	}
	

}
