package application.views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class SelectionView extends GridPane {

	public SelectionView() {
		setVBoxAttributes();
	}

	private void setVBoxAttributes() {
		this.setMinSize(400, 700);
		this.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		Button items = createButton("Items");
		Button combat = createButton("Kämpfen");
		Button flee = createButton("Flüchten");
		Button defense = createButton("Verteidigen");
		this.setHgap(3);
		this.setVgap(3);
		this.add(items, 0, 0);
		this.add(combat, 0, 1);
		this.add(flee, 1, 1);
		this.add(defense, 1, 0);
		this.setPadding(new Insets(3));

	}

	private Button createButton(String name) {
		Button button = new Button(name);
		button.setMinSize(194, 100);
		button.setStyle("-fx-font-size:30");
		return button;
	}

}
