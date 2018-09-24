
public class StringImutable {
	public static void main(String[] args) 
    {
		Employee emp=new Employee();//Mutable Class
        emp.eno=1001;
        System.out.println(emp.eno);
        //after 100 lines
        emp.eno=3000;//changes are done for emp.eno
        System.out.println(emp.eno);
        
        String s1="java";//immutable class it cannot be changed
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println(s1.toString());
	}

}
