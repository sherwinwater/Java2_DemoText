package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayStage extends Stage {

    public DisplayStage(Customer one) {
        setScene(getScene(one));
    }

    private Scene getScene(Customer one) {
        
        String name = "customer's name is: " + one.getName();
        String city = one.getCity();

        Label lblName = new Label(name);
        Label lblCity = new Label(city);
        VBox pane = new VBox(lblName, lblCity);
        Scene scene = new Scene(pane, 200, 150);
        return scene;
    }
}
