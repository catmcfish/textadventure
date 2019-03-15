import java.util.Scanner;

import javax.swing.text.BadLocationException;

public class yeehaw {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws BadLocationException
	 */
	public static void main(String[] args) throws InterruptedException,
			BadLocationException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out
				.println("This is just going to be me asking you some questions okay");
		System.out.println("Well first off, what is your name?");
		String name = scanner.nextLine();
		System.out.print("Okay let me read that.");
		Thread.sleep(1500);
		System.out.print(".");
		Thread.sleep(1500);
		System.out.println(".");
		Thread.sleep(3000);
		System.out.println("Your name is " + name + "?");
		Thread.sleep(2500);
		System.out.println("Well, " + name + " , how was your day?(Good, Bad)");
		String day = scanner.nextLine();
		Thread.sleep(1500);
		if (("Bad").equals(day)) {
			System.out
					.println("Well, "
							+ name
							+ ", im sorry that you've had a bad day but ill try to help");
		}
		if (("Good").equals(day)) {
			System.out
					.println(name
							+ ", that's good that you've had a good day, hopefully it stays that way");
		}
		Thread.sleep(2000);
		System.out.println("Okay well i just wanted to ask how your day was, "
				+ name + ", have a good rest of your day.");
		Thread.sleep(1000);
		System.out.println("End result:");
		Thread.sleep(1000);
		System.out.println("Name:" + name);
		Thread.sleep(1000);
		System.out.println("How your day was:" + day);
		String easteregg = scanner.nextLine();
		if (("yeehaw").equals(easteregg)) {
			System.out
					.println("You found the easteregg, good job, but it ultimately does nothing and you wasted your time");
		} else {
			System.out.println("Thats not the yeehaw pardner");
		}
	}
}
