import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Vault {
	static int realCode ;
public static void main(String[] args) {
 realCode = new Random().nextInt(1000001);    
String Guess = JOptionPane.showInputDialog("Try to guess the code, hint it's a number between 1 and a million");
int guess = Integer.parseInt(Guess);
	if(!tryCode(guess)) {
		System.out.println("Now James Bond will try");
		int i =1;
		for(int b = 0; b<1000001; b++) {
			tryCode(b);
		}
	}
}
static boolean tryCode(int code) {
	if(code==realCode) {
		System.out.println(code+" is right!");
		System.out.println("You Win! Nice Job");
		System.exit(0);
		return true;
	}
	else {
		System.out.println(code +" is wrong");

		return false;
	}
}
}
