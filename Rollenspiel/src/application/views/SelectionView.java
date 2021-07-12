package application.views;

import application.items.Potion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
		Button items = createButton("Trank benutzen");
		Button combat = createButton("Kämpfen");
		Button flee = createButton("Flüchten");
		Button defense = createButton("Verteidigen");

		ComboBox<Potion> itemList = new ComboBox<>();
		itemList.getItems().add(Potion.SMALL_HEALTH_POTION);
		itemList.getItems().add(Potion.MEDIUM_HEALTH_POTION);
		itemList.getItems().add(Potion.LARGE_HEALTH_POTION);
		itemList.getItems().add(Potion.POISON_POTION);

		this.setHgap(3);
		this.setVgap(3);
		this.add(items, 0, 1);
		this.add(combat, 0, 0);
		this.add(flee, 1, 1);
		this.add(defense, 1, 0);
		this.add(itemList, 0, 2);

		this.setPadding(new Insets(3));

		itemList.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
//				itemList.getSelectionModel().usePotion();
			}
		});

	}

	private Button createButton(String name) {
		Button button = new Button(name);
		button.setMinSize(194, 100);
		button.setStyle("-fx-font-size:20");
		return button;
	}

}
