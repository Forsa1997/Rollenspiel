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
//		int currentHealthPoints = figure.getHealthPoints() / 100 * this.modifier;
//		if (figure.getHealthPoints() < figure.getCurrentHealthPoints() + currentHealthPoints) {
//			figure.setCurrentHealthPoints(figure.getHealthPoints());
//		} else {
//			figure.setCurrentHealthPoints(figure.getCurrentHealthPoints() + currentHealthPoints);
//		}
	}

	public String getName() {
		return name;
	}

}
