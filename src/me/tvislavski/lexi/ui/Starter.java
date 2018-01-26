package me.tvislavski.lexi.ui;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.tvislavski.lexi.ui.main.MainView;
import me.tvislavski.lexi.ui.main.MainViewModel;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Lexi");
		ViewTuple<MainView, MainViewModel> viewTuple = FluentViewLoader.fxmlView(MainView.class).load();
		primaryStage.setScene(new Scene(viewTuple.getView()));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String...args){
        Application.launch(args);
    }

}
