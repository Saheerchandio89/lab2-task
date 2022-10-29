
// Saheer AHmed
// roll num:89

//Create a restaurant manu in switch case where if we select any option the program should the price of that food item....



import java.util.*;
class Question6{
	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println(" Welcom to chandio super star hotel...");
	System.out.println(" ");
	System.out.println("This is manu: \n \n1)potato chips.\n2)Zinger Burger.\n3)tea.\n4)chicken soup.\n5)White chiken korma.\n6)Beaf pulao.\n7)kawa chai.\n8)Cold Drinks.");
System.out.println("\nPlease order! Would you wanna know prize about items\n" +
 " Enter the number of item.. ");
     int z=ob.nextInt();
	switch(z){
		case 1:
	 	System.out.println("potato chips. \f Rs.50.0"); 
		break;
		case 2:
		 System.out.println("zinger burgur. \f Rs.400.0"); 
		 break;
		 	case 3:
	 	System.out.println("tea.\f Rs.150.0"); 
	 	break;
	 		case 4:
	 	System.out.println("Chicken soup\f Rs.1200.0"); 
	 	break;
	 		case 5:
	 	System.out.println("White chiken karahi.\f Rs.1300.0"); 
	 	break;
	 		case 6:
	 	System.out.println("Beaf pulao plate.\f Rs.400.0"); 
	 	break;
	 		case 7:	
	 	System.out.println("kawwa chai one cup.\f Rs.120"); 
	 	break;
	 		case 8:
	 	System.out.println("250ml Cold Drinks.\fRs.80"); 
		default:
		System.out.println("Sorry, This item is not available. please select among above items..");
	}
	                                                                                                                                     	                		
	}
}
