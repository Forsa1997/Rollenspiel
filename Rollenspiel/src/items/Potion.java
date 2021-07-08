package items;

import java.util.function.Function;

import Figure.Player;

public enum Potion {

	HEALTH_POTION("Heiltrank", p -> p.getCurrentHealthPoints());

	private String name;

	Potion(String name, Function object) {
		this.name = name;
	}

	private Function<Player, Integer> propertyFunction;

	private Potion(Function<Player, Integer> propertyFunction) {
		this.propertyFunction = propertyFunction;
	}

	public Function<Player, Integer> getPropertyFunction() {
		return this.propertyFunction;
	}

}
