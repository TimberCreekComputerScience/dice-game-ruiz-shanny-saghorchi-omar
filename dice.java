package dice;
import java.util.*;

public class dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		int dieOne = (int)(Math.random()*6) + 1;
		int dieTwo =  (int)(Math.random()*6) + 1;
		int totalDie = dieOne + dieTwo;
		System.out.println("The user is "+ age +" years old");
		System.out.println("Your die numbers are " +dieOne + " and "+ dieTwo);
		System.out.println("Together the sum of the die are "+ totalDie);
		if(totalDie % 2 == 0){
			System.out.println("Therefore, your total number is even and you win.");
			
		}else{
			System.out.println("Too bad, you lost since your total was odd.");
		}
		

	}

}
