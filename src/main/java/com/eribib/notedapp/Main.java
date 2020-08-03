package com.eribib.notedapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	 public void start(Stage primaryStage) throws Exception{
		 GridPane myGrid = new GridPane();
		 Button myButton = new Button("I am a button!");
		 Label label = new Label("I am a label!");
		 Text text = new Text("Hello, I am text");
		 TextField field = new TextField();
		 myGrid.add(myButton, 0, 0);
		 Scene myScene = new Scene(myGrid, 400, 400);
		 primaryStage.setScene(myScene);
		 primaryStage.show();
	 }
}
