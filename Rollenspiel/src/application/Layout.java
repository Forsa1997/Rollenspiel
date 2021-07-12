package application;

import application.figures.Monster;
import application.views.CombatView;
import application.views.OutputView;
import application.views.SelectionView;
import application.views.SplashView;
import application.views.StatsView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout {

	private VBox leftBox = new VBox();
	private VBox rightBox = new VBox();
	private CombatView combatView = new CombatView(randomEncounter());
	private OutputView outputView = new OutputView();
	private StatsView statsView = new StatsView();
	private SelectionView selectionView = new SelectionView();
	private SplashView splashView = new SplashView();

	public Layout() {

	}

	public void splashScene(Stage primaryStage) {
		HBox root = new HBox();

		Button enterButton = new Button();
		enterButton.setOnKeyPressed(event -> {
			if (event.getCode().equals(KeyCode.ENTER)) {
				System.out.println("Test erfolgreich!");
				createScene(primaryStage);
			}
		});

		root.getChildren().addAll(splashView.getView(), enterButton);
		Scene scene = new Scene(root, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void createScene(Stage primaryStage) {

		this.leftBox.getChildren().addAll(this.combatView.getView(), this.outputView.getView());
		this.rightBox.getChildren().addAll(this.statsView.getView(), this.selectionView.getView());

		HBox root = new HBox();
		root.getChildren().addAll(this.leftBox, this.rightBox);
		Scene scene = new Scene(root, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();

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