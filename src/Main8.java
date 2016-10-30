import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main8 extends Application
{
    HBox topMenu;
    VBox leftMenu;
    BorderPane center;

    private void closeProgram(Stage window)
    {
        if (ConfirmBox.display("Closing", "Are you sure you want to close?"))
        {
            System.out.println("Closed correctly");
            window.close();
        }
    }

    private void initLayout()
    {
        topMenu = new HBox();
        Button btnA = new Button("File");
        Button btnB = new Button("Edit");
        Button btnC = new Button("View");
        topMenu.getChildren().addAll(btnA,btnB,btnC);

        leftMenu = new VBox();
        Button btnD = new Button("Sec 1");
        Button btnE = new Button("Sec 2");
        Button btnF = new Button("Sec 3");
        leftMenu.getChildren().addAll(btnD,btnE,btnF);

        center = new BorderPane();
        center.setTop(topMenu);
        center.setLeft(leftMenu);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Alert boxes");

        initLayout();

        Button btn = new Button("Close program");
        btn.setOnAction(e -> closeProgram(stage));
        stage.setOnCloseRequest(e ->
        {
            e.consume();
            closeProgram(stage);
        });


        StackPane layout = new StackPane();

        Scene scene = new Scene(center, 200, 200);

        layout.getChildren().add(btn);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
