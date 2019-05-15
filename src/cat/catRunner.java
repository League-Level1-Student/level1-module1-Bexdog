package cat;
public class catRunner {
 public static void main(String[] args) {
	Cat cat = new Cat("Bob");
	cat.meow();
	cat.printName();
	for(int i = 0; i<99; i++) {
	cat.kill();
	}
}
}
