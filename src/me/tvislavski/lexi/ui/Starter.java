package me.tvislavski.lexi.ui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Lexi");
		primaryStage.show();
	}
	
	public static void main(String...args){
        Application.launch(args);
    }

}
