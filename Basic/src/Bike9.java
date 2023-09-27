
public class Bike9 {

//	final int speedlimit = 90;// final variable

	void run() {
		System.out.println("running");
	}

}

class Honda extends Bike9 {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}