// Saheer AHmed
// ROll num:89

// create a login interface where user inputs its email and password to read direct on welcom screen..NOTE: where atleat 5 users should be registered we can compare their emails and password, user's detail must be stored in multi dimensional arry.

import java.util.*;
class Question5{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	String password,email;
		String [][] arry= new String[2][5];
		arry[0][0]="saheerChandio13@gmail.com";  
		arry[0][1]="saHer13";
		arry[0][2]="ahmed45@gmail.com";
		arry[0][3]="sahEER14";
		arry[0][4]="Ali110@gmail.com";
		arry[1][0]="110klI";
		arry[1][1]="sindhbook56@gmail.com";
		arry[1][2]="786ss";			
		arry[1][3]="zafar88@gmail.com";
		arry[1][4]="dfgnt10";
		System.out.println("<Welcom on saheer Website>");
		System.out.println("Enter the Email: ");
	email=ob.nextLine();
		if(email.equalsIgnoreCase(arry[0][0])|| email.equalsIgnoreCase(arry[0][2])||email.equalsIgnoreCase(arry[0][4])|| email.equalsIgnoreCase(arry[1][1])||email.equalsIgnoreCase(arry[1][3])){
			System.out.println(" Enter the password:");
			password=ob.nextLine();
			if(password.equals(arry[0][1]) && email.equalsIgnoreCase(arry[0][0]) || password.equals(arry[0][3]) && email.equalsIgnoreCase(arry[0][2]) ||password.equals(arry[1][0]) && email.equalsIgnoreCase(arry[0][4]) ||password.equals(arry[1][2])&&email.equalsIgnoreCase(arry[1][1]) ||password.equals(arry[1][4])&&email.equalsIgnoreCase(arry[1][3])){
				System.out.print("Welcom on the page..");
			}
			else
			{
				System.out.print("Invaild password");
			}	
			}
			else
			{
				System.out.print("Sorry, your  Email is not registered..");
			}			
	
}

}