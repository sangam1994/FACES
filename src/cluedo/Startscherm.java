package cluedo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Startscherm extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		/*Stage stage = new Stage();
		Pane pane1 = new Pane();
		Scene scene1 = new Scene(pane1);*/
		
		Button lobbyAanmaken = new Button("Lobby Maken");
		Button lobbyJoinen = new Button("Lobby Joinen");

		Image image = new Image("media/cluedo.jpg");
		ImageView img = new ImageView(image);

		Pane pane = new Pane();
		pane.getChildren().addAll(img,lobbyAanmaken, lobbyJoinen);

		lobbyAanmaken.setLayoutX(650);
		lobbyAanmaken.setLayoutY(520);

	    lobbyJoinen.setLayoutX(650);
	    lobbyJoinen.setLayoutY(601);

		Scene scene = new Scene(pane);
		scene.getStylesheets().add("stylesStartscherm.css");

		primaryStage.setTitle("Start screen");
		primaryStage.sizeToScene();
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		lobbyAanmaken.setOnAction(e->{
			//stage.show();
			Lobbymaken lm = new Lobbymaken();
			lm.start(primaryStage);
		});
	}
	

}
