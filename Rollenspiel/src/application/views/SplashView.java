package application.views;

import java.io.InputStream;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SplashView extends VBox {

	public SplashView() {
		InputStream input = getClass().getResourceAsStream("/splash.png");
		Image splashImg = new Image(input);
		ImageView imageView = new ImageView(splashImg);
		imageView.setFitHeight(1000);
		imageView.setFitWidth(1000);

		this.getChildren().add(imageView);
		this.setMinSize(1000, 1000);

	}

}
