package fight;

import java.util.Random;

import application.figures.Monster;
import application.figures.Player;

public class Fight {

	Random rand = new Random();
	private boolean escape;
	private boolean items;
	private boolean fight;
	private static int escapeCounter;

	public boolean playerStartsFight(Monster monster, Player player) {

		int i = monster.getAttack() + player.getAttack();
		int randomNumber = rand.nextInt(i);
		randomNumber += 1;
		if (player.getAttack() >= randomNumber) {
			return true;
		}
		return false;
	}

	public boolean escapeProbability() {
		escapeCounter++;
		int probability = rand.nextInt(50);
		probability += 0;
		if (escapeCounter > 1) {
			probability = probability + (15 * escapeCounter);
		}
		if (probability >= 40) {
			return true;
		} else {
			return false;
		}
	}

}
