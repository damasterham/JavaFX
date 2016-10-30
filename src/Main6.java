import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main6 extends Application
{
    private boolean answer;

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Alert boxes");


        Button btn = new Button("Click");
        btn.setOnAction(event ->
        {
            answer = ConfirmBox.display("Woop", "Do you agree?");
            if (answer)
                System.out.println("Oh so you agree!");
            else
                System.out.println("Hmmm i guess you don't agree...");
        });

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
