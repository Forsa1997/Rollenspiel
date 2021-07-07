package Layout;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout {

	VBox leftBox = new VBox();
	VBox rightBox = new VBox();
	VBox leftBottomBox = new VBox();
	VBox leftUpperBox = new VBox();
	VBox rightBottomBox = new VBox();
	VBox rightUpperBox = new VBox();
	HBox root = new HBox();
	Button testButton = new Button("Test Butten 123456789");
	Button testButton1 = new Button("Test Butten 123456789");
	Button testButton2 = new Button("Test Butten 123456789");
	Button testButton3 = new Button("Test Butten 123456789");
	Button testButton4 = new Button("Test Butten 123456789");
	Button testButton5 = new Button("Test Butten 123456789");

	public Scene createScene(Stage primaryStage) {

		rightBottomBox.getChildren().addAll(testButton);
		leftBottomBox.getChildren().addAll(testButton1);
		rightUpperBox.getChildren().addAll(testButton2);
		leftUpperBox.getChildren().addAll(testButton3);
		leftBox.getChildren().addAll(leftUpperBox, leftBottomBox);
		rightBox.getChildren().addAll(rightUpperBox, rightBottomBox);
		root.getChildren().addAll(leftBox, rightBox);

		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		return scene;

	}

}
