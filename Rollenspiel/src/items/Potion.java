package items;

import application.figures.Figure;

public enum Potion {

	SMALL_HEALTH_POTION("Kleiner Heiltrank", 25), MEDIUM_HEALTH_POTION("Heiltrank", 50),
	LARGE_HEALTH_POTION("Grosser Heiltrank", 75), POISON_POTION("Gifttrank", -25);

	private String name;
	private int modifier;

	Potion(String name, int modifier) {
		this.name = name;
		this.modifier = modifier;
	}

	public void usePotion(Figure figure) {

	}

	public String getName() {
		return name;
	}

}
