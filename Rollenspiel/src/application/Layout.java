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

	private Monster startMonster = Monster.randomEncounter();
	private VBox leftBox = new VBox();
	private VBox rightBox = new VBox();
	private CombatView combatView = new CombatView(this.startMonster);
	private OutputView outputView = new OutputView();
	private StatsView statsView = new StatsView(this.startMonster);
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

		root.getChildren().addAll(this.splashView, enterButton);
		Scene scene = new Scene(root, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void createScene(Stage primaryStage) {

		this.leftBox.getChildren().addAll(this.combatView, this.outputView);
		this.rightBox.getChildren().addAll(this.statsView, this.selectionView);

		HBox root = new HBox();
		root.getChildren().addAll(this.leftBox, this.rightBox);
		Scene scene = new Scene(root, 1000, 1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();

	}
}