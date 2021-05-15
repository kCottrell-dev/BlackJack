
package blackjack;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BlackJack extends Application {

   
    public static void main(String[] args) {
        launch(args);
    }

    @Override //Sets the scene, Title and gets the FXML file.
    public void start(Stage primaryStage) throws Exception {
        
         Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("BlackJack.fxml"));
          primaryStage.setTitle("BlackJack");
        primaryStage.setScene(new Scene(root, 1200, 750));
        primaryStage.show();
         
    }
    
}
