package application.views;

import java.io.InputStream;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

public class SplashView extends VBox {

	VBox vBox = new VBox();

	public SplashView() {
		InputStream input = getClass().getResourceAsStream("/splash.png");
		Image splashImg = new Image(input);
		ImageView imageView = new ImageView(splashImg);
		imageView.setFitHeight(1000);
		imageView.setFitWidth(1000);

		Button enterButton = new Button();
		enterButton.setOnKeyPressed(event -> {
			if (event.getCode().equals(KeyCode.ENTER)) {
				System.out.println("Test erfolgreich!");

			}
		});
		vBox.getChildren().addAll(imageView, enterButton);
		vBox.setMinSize(1000, 1000);

	}

	public VBox getView() {
		return this.vBox;
	}
}
