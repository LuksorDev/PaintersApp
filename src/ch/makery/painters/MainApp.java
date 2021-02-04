package ch.makery.painters;



import java.io.IOException;

import ch.makery.painters.model.Painters;
import ch.makery.painters.view.PaintersOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private ObservableList<Painters> paintersData = FXCollections.observableArrayList();
    private Stage primaryStage;
    private AnchorPane paintersOverview;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Przegl¹darka Obrazków");
        primaryStage.setResizable(false);

        initPaintersOverview();

    }

    public void initPaintersOverview() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();        
            loader.setLocation(MainApp.class.getResource("view/PaintersOverview2.fxml"));         
            paintersOverview = (AnchorPane) loader.load();


            // Show the scene containing the root layout.
            Scene scene = new Scene(paintersOverview);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public MainApp() {

	}

	public ObservableList<Painters> getPaintersData() {
	    return paintersData;
	}    
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}