package fight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import application.figures.Monster;
import application.figures.Player;
import items.Potion;

public class Fight {

	List<Integer> itemList = new ArrayList<>();

	Random rand = new Random();
	private boolean escape;
	private boolean items;
	private boolean fight;
	private static int escapeCounter;

	public boolean playerStartsFight(Monster monster, Player player) {

		int i = monster.getAttack() + player.getAttack();
		int randomNumber = this.rand.nextInt(i);
		randomNumber += 1;
		if (player.getAttack() >= randomNumber) {
			return true;
		}
		return false;
	}

	public boolean escapeProbability() {
		escapeCounter++;
		int probability = this.rand.nextInt(50);
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

	public void selectedItem(Potion potion, Player player) {

		if (potion.equals(Potion.HEALTH_POTION)) {
			selectPotion(player, 50);
		} else if (potion.equals(Potion.SUPER_POTION)) {
			selectPotion(player, 75);
		} else if (potion.equals(Potion.MEGA_POTION))
			selectPotion(player, 100);
	}

	public void selectPotion(Player player, int value) {
		int currentHealthPoints = player.getHealthPoints() / 100 * value;
		if (player.getHealthPoints() < player.getCurrentHealthPoints() + currentHealthPoints) {
			player.setCurrentHealthPoints(player.getHealthPoints());
		} else {
			player.setCurrentHealthPoints(player.getCurrentHealthPoints() + currentHealthPoints);
		}
	}
}
