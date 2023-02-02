
public class EmployeeMain {
public static void main(String[]args)
{
	Employee e1=new Employee();
	e1.eid=101;
	e1.dept="HR";
	e1.salary=25000;
	
	Employee e2=new Employee(102,"IT",32000);
	System.out.println(" Employee 1 Information");
	e1.displayInformation();
	
	System.out.println(" Employee 2 Information");
	e2.displayInformation();
}
}
