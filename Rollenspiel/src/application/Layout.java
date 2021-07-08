package application;

import application.views.CombatView;
import application.views.OutputView;
import application.views.SelectionView;
import application.views.StatsView;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Layout {

	VBox leftBox = new VBox();
	VBox rightBox = new VBox();
	CombatView combatView = new CombatView();
	OutputView outputView = new OutputView();
	StatsView statsView = new StatsView();
	SelectionView selectionView = new SelectionView();

	public Layout() {

	}

	public Scene createScene() {

		changeBackgrounds();

		this.leftBox.getChildren().addAll(this.combatView, this.outputView);
		this.rightBox.getChildren().addAll(this.statsView, this.selectionView);

		HBox root = new HBox();
		root.getChildren().addAll(this.leftBox, this.rightBox);
		Scene scene = new Scene(root, 1000, 1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		return scene;

	}

	private void changeBackgrounds() {

		this.combatView
				.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.outputView.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
		this.statsView.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.selectionView
				.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));

		this.combatView.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.outputView.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.statsView.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.selectionView.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}

}
//		Rectangle rectangle = new Rectangle(700, 700);
//		Rectangle rectangle1 = new Rectangle(700, 300);
//		Rectangle rectangle2 = new Rectangle(300, 700);
//		Rectangle rectangle3 = new Rectangle(300, 300);
//		rectangle.setFill(Color.ORANGE);
//		rectangle1.setFill(Color.RED);
//		rectangle2.setFill(Color.BLUE);
//		rectangle3.setFill(Color.GREEN);
//		Button testButton = new Button("Test");
//		Button testButton1 = new Button("Test1");
//		Button testButton2 = new Button("Test2");
//		Button testButton3 = new Button("Test3");
//		this.combatView.getChildren().add(testButton);
//		this.outputView.getChildren().add(testButton1);
//		this.statsView.getChildren().add(testButton2);
//		this.selectionView.getChildren().add(testButton3);
//		this.combatView.getChildren().add(rectangle);
//		this.outputView.getChildren().add(rectangle1);
//		this.statsView.getChildren().add(rectangle2);
//		this.selectionView.getChildren().add(rectangle3);