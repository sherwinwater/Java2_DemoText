
package demotext;

import content.Customer;
import content.DisplayStage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DemoText extends Application {
    private Label lblName = new Label("Name:");
    private TextField txtName = new TextField();
    private Label lblCity = new Label("City");
    private TextField txtCity = new TextField();
    private Button btnDisplay = new Button("Display");
    
    private Customer one = new Customer();
    
    
    @Override
    public void start(Stage primaryStage) {
        
        btnDisplay.setOnAction((e)->{
           process(); 
           DisplayStage ds = new DisplayStage(one);
           ds.show();
           
        });
        
        Scene scene = new Scene(getGrid(),300,150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Example");
        primaryStage.show();
        
    }
    
    private GridPane getGrid(){
        GridPane pane = new GridPane();
        pane.add(lblName,0,0);
        pane.add(txtName,1,0);
        pane.add(lblCity,0,1);
        pane.add(txtCity,1,1);
        pane.add(btnDisplay,1,2);
        return pane;
    }
    
    private void process(){
        String name = txtName.getText();
        String city = txtCity.getText();
        
        one.setName(name);
        one.setCity(city);
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
