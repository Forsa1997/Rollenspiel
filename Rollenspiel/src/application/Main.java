package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
<<<<<<< HEAD

=======
>>>>>>> refs/heads/Nico
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Servus Christoph!");
		
	}
<<<<<<< HEAD

=======
	
	
>>>>>>> refs/heads/Nico
	public static void main(String[] args) {
		launch(args);

		System.out.println("Servus Nico");
	}
}
