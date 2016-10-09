import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */

// Vid 1 & 2
public class Main4 extends Application
{
    private Stage stage;

    private VBox layout1;
    private StackPane layout2;

    private Scene scene1;
    private Scene scene2;


    @Override
    public void start(Stage stage) throws Exception
    {
        layout1 = new VBox(20);
        layout2 = new StackPane();

        Label lbl1 = new Label("Scene 1");
        Label lbl2 = new Label("Scene 2");

        Button btn1 = new Button("Got to scene 2");
        btn1.setOnAction(e -> stage.setScene(scene2));

        Button btn2 = new Button("Got to scene 1");
        btn2.setOnAction(e -> stage.setScene(scene1));

        layout1.getChildren().addAll(lbl1, btn1);
        layout2.getChildren().addAll(lbl2, btn2);

        scene1 = new Scene(layout1, 200, 400);
        scene2 = new Scene(layout2, 200, 400);

        stage.setTitle("Scenes");
        stage.setScene(scene1);

        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
