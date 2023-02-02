
public class Employee {
int eid;
String dept;
double salary;

public Employee() {
}
public Employee(int eid,String dept,double salary) {
	this.eid=eid;
	this.dept=dept;
	this.salary=salary;
}
public void displayInformation() {
	System.out.println("Employee ID: "+ eid);
	System.out.println("Depatment: "+ dept);
	System.out.println("Salary: "+ salary);
}
}
