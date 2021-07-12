package application.views;

import java.io.InputStream;

import application.figures.Monster;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CombatView extends VBox {

	VBox vBox = new VBox();

	public CombatView(Monster monster) {

		InputStream input = getClass().getResourceAsStream(monster.getImgPath());
		System.out.println(monster.getImgPath());
		Image monsterImage = new Image(input);
		ImageView monsterView = new ImageView(monsterImage);
		vBox.getChildren().add(monsterView);
	}

	public CombatView() {
		setVBoxAttributes();
	}

	private void setVBoxAttributes() {
	}

	public VBox getView() {
		return this.vBox;
	}

}
