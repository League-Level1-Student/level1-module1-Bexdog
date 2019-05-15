package popcorn;

import javax.swing.JOptionPane;

public class popcornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
Popcorn popcorn = new Popcorn(flavor);
Microwave microwave = new Microwave();
String Time = JOptionPane.showInputDialog("How long do you want to cook your popcorn?");
int time = Integer.parseInt(Time);
microwave.putInMicrowave(popcorn);
microwave.setTime(time);
microwave.startMicrowave();
}
}
