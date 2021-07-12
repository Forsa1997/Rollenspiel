package application.figures;

public abstract class Figure {

	private String name;
	private int healthPoints;
	private int attack;
	private int hitProbability;

	public Figure(String name, int healthPoints, int attack, int hitProbability) {
		super();
		this.name = name;
		this.healthPoints = healthPoints;
		this.attack = attack;
		this.hitProbability = hitProbability;
	}

	public int getHealthPoints() {
		return this.healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHitProbability() {
		return this.hitProbability;
	}

	public void setHitProbability(int hitProbability) {
		this.hitProbability = hitProbability;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private boolean hasLost() {
		if (this.healthPoints <= 0) {
			return true;
		}
		return false;
	}

}
