package ch.makery.painters.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ch.makery.painters.MainApp;
import ch.makery.painters.model.Painters;

public class PaintersOverviewController {
    @FXML
    private TableView<Painters> paintersTable;
    @FXML
    private TableColumn<Painters, String> firstNameColumn;
    @FXML
    private TableColumn<Painters, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private Label deathdayLabel;
    @FXML
    private Label birthplaceLabel;
    @FXML
    private Label deathplace;



    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public PaintersOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        paintersTable.setItems(mainApp.getPaintersData());
    }
}