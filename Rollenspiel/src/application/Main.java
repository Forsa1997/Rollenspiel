package application;

import Figure.Monster;
import Figure.Player;
import fight.Fight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Layout combatView = new Layout();

			Scene scene = combatView.createScene();

			Monster testMonster = new Monster(120, 60, 40);
			Player testPlayer = new Player(130, 80, 60);

			Fight fightOne = new Fight();

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}
}
