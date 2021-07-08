package application;

import application.views.CombatView;
import application.views.OutputView;
import application.views.SelectionView;
import application.views.StatsView;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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

		this.leftBox.getChildren().addAll(this.combatView.getView(), this.outputView.getView());
		this.rightBox.getChildren().addAll(this.statsView.getView(), this.selectionView.getView());

		HBox root = new HBox();
		root.getChildren().addAll(this.leftBox, this.rightBox);
		Scene scene = new Scene(root, 1000, 1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		return scene;

	}
}