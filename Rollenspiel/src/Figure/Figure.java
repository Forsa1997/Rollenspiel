package Figure;

public abstract class Figure {

	private int healthPoints;
	private int attack;
	private int hitProbability;
	private int currentHealthPoints;

	public Figure(int healthPoints, int attack, int hitProbability) {
		super();
		this.healthPoints = healthPoints;
		this.attack = attack;
		this.hitProbability = hitProbability;
		this.currentHealthPoints = healthPoints;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHitProbability() {
		return hitProbability;
	}

	public void setHitProbability(int hitProbability) {
		this.hitProbability = hitProbability;
	}

	public int getCurrentHealthPoints() {
		return currentHealthPoints;
	}

	public void setCurrentHealthPoints(int currentHealthPoints) {
		this.currentHealthPoints = currentHealthPoints;
	}

	private boolean hasLost() {
		if (this.healthPoints <= 0) {
			return true;
		}
		return false;
	}

}
