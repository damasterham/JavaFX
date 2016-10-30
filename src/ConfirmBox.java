/**
 * Created by DaMasterHam on 23-10-2016.
 */
import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by DaMasterHam on 09-10-2016.
 */
public class ConfirmBox
{
    public static boolean answer;


    public static boolean display(String title, String message)
    {
        Stage window = new Stage();

        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(250);

        Label label = new Label(message);

        Button yes = new Button("Yes");
        yes.setOnAction(e ->
        {
            answer = true;
            window.close();
        });
        Button no = new Button("No");
        no.setOnAction(e ->
        {
            answer = false;
            window.close();
        });



        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yes, no);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setScene(scene);
        window.showAndWait();


        return answer;
    }
}

