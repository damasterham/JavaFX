import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class Main10 extends Application
{
    GridPane gridPane;
    TextField userField;
    PasswordField passField;

    private boolean validPass(PasswordField pass)
    {
        String woop = pass.getText().toLowerCase();

        if (woop.equals(pass.getText()))
        {
            System.out.println("You must have at least 1 uppercase letter");
            return false;
        }
        else
        {
            return true;
        }
    }

    private void initLayout(int space)
    {
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(space));
        gridPane.setVgap(space);
        gridPane.setHgap(space);

        Label user = new Label("Username");
        GridPane.setConstraints(user, 0, 0);

        userField = new TextField();
        userField.setPromptText("Your username");
        gridPane.setConstraints(userField, 1,0);

        Label pass = new Label("Password");
        GridPane.setConstraints(pass, 0, 1);

        passField = new PasswordField();
        gridPane.setConstraints(passField, 1,1);

        Button login = new Button("Sign up");
        login.setOnAction(e ->
        {
            if (validPass(passField))
            {
                System.out.println("You signed up!");
            }

            System.out.println("User: " + userField.getText()  +
                    " Pass: " + passField.getText());
        });
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
