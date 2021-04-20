package com.blurdel.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
		
	@Override
	public void start(Stage pStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("hello.fxml"));
		pStage.setTitle("Hello JavaFX");
		pStage.setScene(new Scene(root, 400, 200));
		pStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
