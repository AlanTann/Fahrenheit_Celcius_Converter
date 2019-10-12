import java.util.Scanner;

public class Week5Ex2 {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner( System.in );
    	
    	int choose; //switch choice of Fahrenheit temperature and celcius temperature
    	double fah; //variable of Fahrenheit temperature
    	double cel; //variable of celcius temperature
    	
    	System.out.print("Press 1 to enter Fahrenheit temperature or Press 2 to enter Celcius temperature:");
    	choose = input.nextInt();
    	
    	switch(choose){
    		case 1: 
    			System.out.print("\nEnter Fahrenheit temperature:");
    			fah = input.nextDouble();
    			cel = celcius(fah);
    			System.out.printf("The Celcius temperature is %.2f", cel);
    			break;
    		case 2:
    			System.out.print("\nEnter Celcius temperature:");
    			cel = input.nextDouble();
    			fah = fahrenheit(cel);
    			System.out.printf("The Fahrenheit temperature is %.2f", fah);
    			break;
    		default:
    			System.out.print("\nInvalid choice");
    			break;
    	}
    }	
    public static double celcius(double fah){
    	
    	double cel; //variable of calcius temperature
    	
    	cel = (5.0/9.0) * (fah-32); //calculate the celcius temperature by the value of the fahrenheit temperature
    	
    	return cel; //return the value of calcius temperature
    }
    public static double fahrenheit(double cel){
    	
    	double fah; //variable of fahrenheit temperature
    	
    	fah = (9.0/5.0) * cel + 32 ; //calculate the fahrenheit temperature by the value of celcius temperature
    		
    	return fah;	//variable of fahrenheit temperature
    }
}
