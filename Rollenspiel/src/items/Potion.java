package items;

import application.figures.Figure;

public enum Potion {
//
	SMALL_HEALTH_POTION("Kleiner Heiltrank", 25), MEDIUM_HEALTH_POTION("Heiltrank", 50),
	LARGE_HEALTH_POTION("Grosser Heiltrank", 75), POISON_POTION("Gifttrank", -25);

//			, p -> p.getCurrentHealthPoints());
//
	private String name;
	private int modifier;

	Potion(String name, int modifier) {
		this.name = name;
		this.modifier = modifier;
	}
//
//	private Function<Player, Integer> propertyFunction;
//
//	private Potion(Function<Player, Integer> propertyFunction) {
//		this.propertyFunction = propertyFunction;
//	}
//
//	public Function<Player, Integer> getPropertyFunction() {
//		return this.propertyFunction;
//	}

	public void usePotion(Figure figure) {

	}

	public String getName() {
		return name;
	}

}
