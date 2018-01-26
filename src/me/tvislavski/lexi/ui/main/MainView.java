package me.tvislavski.lexi.ui.main;

import java.net.URL;
import java.util.ResourceBundle;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.Initializable;

public class MainView implements FxmlView<MainViewModel>, Initializable {

	@InjectViewModel
	private MainViewModel viewModel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("MainView initialized");
	}
}
