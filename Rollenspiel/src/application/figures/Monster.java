package application.figures;

public class Monster extends Figure {

	private String name;
	private String imgPath;

	public Monster(String name, int healthPoints, int attack, int hitProbability, String imgPath) {
		super(healthPoints, attack, hitProbability);
		this.name = name;
		this.imgPath = imgPath;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public static Monster randomEncounter() {

		int randomNum = (int) (Math.random() * 5);
		Monster drache = new Monster("Drache", 500, 35, 34, "/dragon.png");
		Monster ente = new Monster("Ente", 400, 55, 99, "/duck.png");
		Monster affe = new Monster("Affe", 400, 55, 99, "/monkey.png");
		Monster ratte = new Monster("Ratte", 400, 55, 99, "/rat.png");
		Monster wolf = new Monster("Wolf", 400, 55, 99, "/wolf.png");
		Monster[] monster = { drache, ente, affe, ratte, wolf };

		return monster[randomNum];

	}

}
