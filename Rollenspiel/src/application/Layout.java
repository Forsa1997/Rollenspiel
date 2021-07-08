package application;

import application.figures.Monster;
import application.views.CombatView;
import application.views.OutputView;
import application.views.SelectionView;
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

	public Layout() {

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

		int randomNum = (int) (Math.random() * 6);
		Monster drache = new Monster("Drache", 500, 35, 34, "/drache.jpg");
		Monster ente = new Monster("Ente", 400, 55, 99, "/ente.jpg");
		Monster affe = new Monster("Affe", 400, 55, 99, "/affe.jpg");
		Monster ratte = new Monster("Ratte", 400, 55, 99, "/ratte.jpg");
		Monster wolf = new Monster("Wolf", 400, 55, 99, "/wolf.jpg");

		Monster[] monster = { drache, ente, affe, ratte, wolf };

		return monster[randomNum];

	}
}