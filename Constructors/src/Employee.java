
public class Employee {
	int eno;
	String ename;
	int salary;
	Employee()//this is a default constructor
	{
		int eno;
		this.eno=10;
		this.ename="";
		this.salary=2000;
	}
	
	
	public String toString()
	{
		return "Eno :"+this.eno+" Ename :"+this.ename +" Salary :"+this.salary;
	}

}
