import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main9 extends Application
{
    GridPane gridPane;

    private void initLayout(int space)
    {
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(space));
        gridPane.setVgap(space);
        gridPane.setHgap(space);

        Label user = new Label("Username");
        GridPane.setConstraints(user, 0, 0);

        TextField userField = new TextField();
        userField.setPromptText("Your username");
        gridPane.setConstraints(userField, 1,0);

        Label pass = new Label("Password");
        GridPane.setConstraints(pass, 0, 1);

        PasswordField passField = new PasswordField();
        gridPane.setConstraints(passField, 1,1);

        Button login = new Button("Log in");
        GridPane.setConstraints(login,1,2);

        gridPane.getChildren().addAll(user,userField,pass,passField,login);



    }


    @Override
    public void start(Stage window) throws Exception
    {
        window.setTitle("Gridpane");

        initLayout(10);

        Scene scene = new Scene(gridPane, 300, 200);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
