package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Layout layout = new Layout();
			Scene scene = layout.splashScene();
			primaryStage.setScene(scene);

			primaryStage.show();

//			Scene layer = layout.createScene();
//			primaryStage.setScene(layer);
//			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}
}