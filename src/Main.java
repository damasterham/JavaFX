import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by DaMasterHam on 09-10-2016.
 */

// Vid 1 & 2
public class Main extends Application implements EventHandler<ActionEvent>
{
    private StackPane layout;
    private Scene scene;

    private Button btn;
    private int woopCount;

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("JavaFX - NewBoston tutorial");

        woopCount = 1;

        btn = new Button("Woop " + woopCount);
        btn.setOnAction(this);

        //btn.setId("btn1");

        layout = new StackPane();
        layout.getChildren().add(btn);

        scene = new Scene(layout, 1600,900);

        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void handle(ActionEvent event)
    {
        if (event.getSource() == btn)
        {
            btn.setText("Woop " + (++woopCount));
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
