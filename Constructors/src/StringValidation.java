import java.util.Scanner;


public class StringValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username>>");
		String username=sc.next();
		System.out.println("Enter Password>>");
		String password=sc.next();
		boolean afterValidationResult=validateCredentials(username,password);
		System.out.println(afterValidationResult);
	}

	private static boolean validateCredentials(String userName, String password)
	{
		boolean isValid=false;
		if(!userName.contains("@gmail.com"))
		{
			userName=userName+"@gmail.com";
		}
		if(userName.equalsIgnoreCase("deep01@gmail.com")&& password.equals("0099"))
		{
			isValid=true;
		}
		return isValid;
	}

}
