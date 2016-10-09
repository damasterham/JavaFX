import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main5 extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Alert boxes");


        Button btn = new Button("Click");
        btn.setOnAction(event -> Alert.display("Woop", "... DiDoodle"));

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, 200, 200);

        layout.getChildren().add(btn);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
