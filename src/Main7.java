import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main7 extends Application
{
    private boolean answer;

    private void closeProgram(Stage window)
    {
        if (ConfirmBox.display("Closing", "Are you sure you want to close?"))
        {
            System.out.println("Closed correctly");
            window.close();
        }
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Alert boxes");


        Button btn = new Button("Close program");
        btn.setOnAction(e -> closeProgram(stage));
        stage.setOnCloseRequest(e ->
        {
            e.consume();
            closeProgram(stage);
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
