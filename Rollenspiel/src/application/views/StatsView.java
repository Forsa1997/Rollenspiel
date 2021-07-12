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
	private String textAligement = "-fx-alignment: CENTER;";
	private String fontSize = "-fx-font-size:20";

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
		TableColumn<Figure, String> hpCol = new TableColumn<>("Max LP");
		TableColumn<Figure, String> actualHpCol = new TableColumn<>("Current LP");
		TableColumn<Figure, String> attackCol = new TableColumn<>("AK");
		TableColumn<Figure, String> hitProbCol = new TableColumn<>("TC");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		hpCol.setCellValueFactory(new PropertyValueFactory<>("healthPoints"));
		actualHpCol.setCellValueFactory(new PropertyValueFactory<>("currentHealthPoints"));
		attackCol.setCellValueFactory(new PropertyValueFactory<>("attack"));
		hitProbCol.setCellValueFactory(new PropertyValueFactory<>("hitProbability"));
		nameCol.setStyle(this.textAligement);
		nameCol.setStyle(this.fontSize);
		hpCol.setStyle(this.textAligement);
		hpCol.setStyle(this.fontSize);
		actualHpCol.setStyle(this.textAligement);
		actualHpCol.setStyle(this.fontSize);
		attackCol.setStyle(this.textAligement);
		attackCol.setStyle(this.fontSize);
		hitProbCol.setStyle(this.textAligement);
		hitProbCol.setStyle(this.fontSize);
		nameCol.setMinWidth(79);
		hpCol.setMinWidth(79);
		actualHpCol.setMinWidth(120);
		attackCol.setMinWidth(40);
		hitProbCol.setMinWidth(40);

		this.attributeMonsterTable.setItems(monsterList);

		this.attributeMonsterTable.getColumns().addAll(nameCol, hpCol, actualHpCol, attackCol, hitProbCol);
		return this.attributeMonsterTable;
	}

	private TableView<Figure> createPlayerTable() {

		ObservableList<Figure> playerList = FXCollections.observableArrayList();
		playerList.add(new Player("Player", 500, 35, 34));

		TableColumn<Figure, String> nameCol = new TableColumn<>("Name");
		TableColumn<Figure, String> hpCol = new TableColumn<>("Max LP");
		TableColumn<Figure, String> actualHpCol = new TableColumn<>("Current LP");
		TableColumn<Figure, String> attackCol = new TableColumn<>("AK");
		TableColumn<Figure, String> hitProbCol = new TableColumn<>("TC");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		hpCol.setCellValueFactory(new PropertyValueFactory<>("healthPoints"));
		actualHpCol.setCellValueFactory(new PropertyValueFactory<>("currentHealthPoints"));
		attackCol.setCellValueFactory(new PropertyValueFactory<>("attack"));
		hitProbCol.setCellValueFactory(new PropertyValueFactory<>("hitProbability"));
		nameCol.setStyle(this.textAligement);
		nameCol.setStyle(this.fontSize);
		hpCol.setStyle(this.textAligement);
		hpCol.setStyle(this.fontSize);
		actualHpCol.setStyle(this.textAligement);
		actualHpCol.setStyle(this.fontSize);
		attackCol.setStyle(this.textAligement);
		attackCol.setStyle(this.fontSize);
		hitProbCol.setStyle(this.textAligement);
		hitProbCol.setStyle(this.fontSize);
		nameCol.setMinWidth(79);
		hpCol.setMinWidth(79);
		actualHpCol.setMinWidth(120);
		attackCol.setMinWidth(40);
		hitProbCol.setMinWidth(40);

		this.attributePlayerTable.setItems(playerList);

		this.attributePlayerTable.getColumns().addAll(nameCol, hpCol, actualHpCol, attackCol, hitProbCol);
		return this.attributePlayerTable;
	}
}
