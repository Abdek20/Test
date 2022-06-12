package Date;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date); //15/10/2013
		
		Date d=new Date();
		System.out.println(d);
		
	       SimpleDateFormat sd = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	   	String dateInString = "19-03-2019 10:20:56";
	   	Date date1 = sd.parse(dateInString);
	   	System.out.println(date1); //Tue Mar 19 10:20:56 EAT 2019

	   	SimpleDateFormat abdek=new SimpleDateFormat("E dd-MM-yyyy");
	   	System.out.println("Saisir ta date de naissance ");
	   	String a=sc.next();
	   			
	   			Date date2=abdek.parse(a);
	   			SimpleDateFormat f1=new SimpleDateFormat("dd-MMM-yyyy");
	   			String d2=f1.format(date2);
	   			System.out.println(d2);
	   	


	}

}
