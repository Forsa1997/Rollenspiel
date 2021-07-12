package application;

import application.figures.Monster;
import application.views.CombatView;
import application.views.OutputView;
import application.views.SelectionView;
import application.views.SplashView;
import application.views.StatsView;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Layout {

	VBox leftBox = new VBox();
	VBox rightBox = new VBox();
	CombatView combatView = new CombatView(randomEncounter());
	OutputView outputView = new OutputView();
	StatsView statsView = new StatsView();
	SelectionView selectionView = new SelectionView();
	SplashView splashView = new SplashView();

	public Layout() {

	}

	public Scene splashScene() {
		HBox root = new HBox();
		root.getChildren().add(splashView.getView());
		Scene scene = new Scene(root, 1000, 1000);

		return scene;
	}

	public Scene createScene() {

		this.leftBox.getChildren().addAll(this.combatView.getView(), this.outputView.getView());
		this.rightBox.getChildren().addAll(this.statsView.getView(), this.selectionView.getView());

		HBox root = new HBox();
		root.getChildren().addAll(this.leftBox, this.rightBox);
		Scene scene = new Scene(root, 1000, 1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		return scene;

	}

	public Monster randomEncounter() {

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