import java.util.Scanner;

public class BMIcalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int feet,inches;
		float lbs;
		double change;
		String str1="\nPlease enter your height:\n\tFeet: ";
		String str2="\tInches: ";
		String str3="Please enter your weight:\n\tPounds: ";
		String str4="\nYour BMI is ... ";
		String str5="\nRecommendation: ";
		String type="";
		double tracker=0;
		
		
		System.out.print("\nWelcome to the BMI Calculator.\n");
		sleep(3000);
		
		for(int i=0;i<str1.length();i++){
			System.out.print(str1.substring(i,i+1));
			sleep(50);
		}
		feet=keyboard.nextInt();
		
		for(int i=0;i<str2.length();i++){
			System.out.print(str2.substring(i,i+1));
			sleep(50);
		}
		inches=keyboard.nextInt();
		for(int i=0;i<str3.length();i++){
			System.out.print(str3.substring(i,i+1));
			sleep(50);
		}
		lbs=keyboard.nextFloat();
		for(int i=0;i<str4.length();i++){
			System.out.print(str4.substring(i,i+1));
			sleep(50);
		}
		float kg=lbs*0.453592f;
		float m=((feet*12)+inches)*0.0254f;
		float BMI=kg/(m*m);
		if(BMI>30){type="Obese";}
		if(BMI>25 && BMI<=30){type="Overweight";}
		if(BMI>20 &&  BMI<=25){type="Healthy";}
		if(BMI<=20){type="Underweight";}
		System.out.println(BMI);
		sleep(2000);
		System.out.println("\nYou are *"+type+"*");
		sleep(3000);
		for(int i=0;i<str5.length();i++){
			System.out.print(str5.substring(i,i+1));
			sleep(50);
		}
		sleep(1500);
		if(BMI>=25){
			for(float i=lbs;BMI>25;i=i-.1f){
				BMI=(i*0.453592f)/(m*m);
				tracker+=.1;
			}
			tracker=Math.round(tracker*10)/10.0;
			System.out.println("Lose "+tracker+" Lbs.");
		}
		else if(BMI<=20){
			for(float i=lbs;BMI<=20;i=i+.1f){
				BMI=(i*0.453592f)/(m*m);
				tracker+=.1;
			}
			tracker=Math.round(tracker*10)/10.0;
			System.out.println("Gain "+tracker+" Lbs.");
		}
		else{ System.out.println("Don't change a thing!"); }
		
		sleep(2000);
		
		System.out.println("\nThank you, goodbye.");
		keyboard.next();
	}
	
	public static void sleep(int time){
		try{
			Thread.sleep(time);
		} catch(Exception e){}
	}
	
}











