package application.views;

import java.io.InputStream;

import application.figures.Monster;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class CombatView extends VBox {

	public CombatView(Monster monster) {

		InputStream input = getClass().getResourceAsStream(monster.getImgPath());
		System.out.println(monster.getImgPath());
		Image monsterImage = new Image(input);
		ImageView monsterView = new ImageView(monsterImage);
		this.getChildren().add(monsterView);
	}

	public CombatView() {
		setVBoxAttributes();
	}

	private void setVBoxAttributes() {
		this.setMinSize(600, 700);
		this.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

	}

}
