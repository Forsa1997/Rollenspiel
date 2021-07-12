package application.views;

import application.figures.Figure;
import application.figures.Monster;
import application.figures.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class StatsView extends VBox {

	private TableView<Figure> attributeMonsterTable = new TableView<>();
	private TableView<Figure> attributePlayerTable = new TableView<>();

	public StatsView(Monster monster) {
		setVBoxAttributes();
		createMonsterTable(monster);
		createPlayerTable();
		this.getChildren().addAll(this.attributeMonsterTable, this.attributePlayerTable);
	}

	private void setVBoxAttributes() {
		this.setMinSize(400, 700);
		this.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}

	private TableView<Figure> createMonsterTable(Monster monster) {

		ObservableList<Figure> monsterList = FXCollections.observableArrayList();
//		monsterList.add(new Monster("Drache", 500, 35, 34, "/drache.jpg"));
//		monsterList.add(new Monster("Kobold", 400, 30, 90, "/kobold.jpg"));
		monsterList.add(monster);

		TableColumn<Figure, String> nameCol = new TableColumn<>("Name");
		TableColumn<Figure, String> hpCol = new TableColumn<>("Lebenspunkte");
		TableColumn<Figure, String> attackCol = new TableColumn<>("Angriffskraft");
		TableColumn<Figure, String> hitProbCol = new TableColumn<>("Trefferchance");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		hpCol.setCellValueFactory(new PropertyValueFactory<>("healthPoints"));
		attackCol.setCellValueFactory(new PropertyValueFactory<>("attack"));
		hitProbCol.setCellValueFactory(new PropertyValueFactory<>("hitProbability"));
		nameCol.setMinWidth(99);
		hpCol.setMinWidth(99);
		attackCol.setMinWidth(99);
		hitProbCol.setMinWidth(99);

		this.attributeMonsterTable.setItems(monsterList);

		this.attributeMonsterTable.getColumns().addAll(nameCol, hpCol, attackCol, hitProbCol);
		return this.attributeMonsterTable;
	}

	private TableView<Figure> createPlayerTable() {

		ObservableList<Figure> playerList = FXCollections.observableArrayList();
		playerList.add(new Player(500, 35, 34));

		TableColumn<Figure, String> hpCol = new TableColumn<>("Lebenspunkte");
		TableColumn<Figure, String> attackCol = new TableColumn<>("Angriffskraft");
		TableColumn<Figure, String> hitProbCol = new TableColumn<>("Trefferchance");
		hpCol.setCellValueFactory(new PropertyValueFactory<>("healthPoints"));
		attackCol.setCellValueFactory(new PropertyValueFactory<>("attack"));
		hitProbCol.setCellValueFactory(new PropertyValueFactory<>("hitProbability"));
		hpCol.setMinWidth(99);
		attackCol.setMinWidth(99);
		hitProbCol.setMinWidth(99);

		this.attributePlayerTable.setItems(playerList);

		this.attributePlayerTable.getColumns().addAll(hpCol, attackCol, hitProbCol);
		return this.attributePlayerTable;
	}
}
