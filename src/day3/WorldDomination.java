package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to code plz answer or you fail at Harry Potter");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			System.out.println("You will rule the world and create 5.0 Pokemon Go");
		}

		// 3. Otherwise, wish them good luck washing dishes.
		else {
			System.out.println("good luck pluming toilets");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
