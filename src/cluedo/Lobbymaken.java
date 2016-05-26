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

public class Lobbymaken{

		public void start(Stage primaryStage){
			Button terug = new Button("Terug");
			
			Image image = new Image("media/cluedo.jpg");
			ImageView img = new ImageView(image);

			Pane pane = new Pane();
			pane.getChildren().addAll(img,terug);

			terug.setLayoutX(1250);
			terug.setLayoutY(680);
			
			Scene scene = new Scene(pane);
			scene.getStylesheets().add("stylesLobbymaken.css");

			primaryStage.setTitle("Start screen");
			primaryStage.sizeToScene();
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
			terug.setOnAction(e->{
				Startscherm ss = new Startscherm();
				ss.start(primaryStage);
			});
		}

	}



