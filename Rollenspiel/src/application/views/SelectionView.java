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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SelectionView extends VBox {

	GridPane gridPane = new GridPane();

	public SelectionView() {
		setVBoxAttributes();
	}

	private void setVBoxAttributes() {
		this.gridPane.setMinSize(400, 700);
		this.gridPane.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
		this.gridPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		Button items = createButton("Items");
		Button combat = createButton("Kämpfen");
		Button flee = createButton("Flüchten");
		Button defense = createButton("Verteidigen");
		this.gridPane.setHgap(3);
		this.gridPane.setVgap(3);
		this.gridPane.add(items, 0, 0);
		this.gridPane.add(combat, 0, 1);
		this.gridPane.add(flee, 1, 1);
		this.gridPane.add(defense, 1, 0);
		this.gridPane.setPadding(new Insets(3));

	}

	private Button createButton(String name) {
		Button button = new Button(name);
		button.setMinSize(194, 100);
		button.setStyle("-fx-font-size:30");
		return button;
	}

	public GridPane getView() {
		return this.gridPane;
	}

}
