/*
    Uriel Caracuel Barrera - 2º DAM
    Main.java
 */
package visoranimales;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ucb40
 */
public class Main extends Application {
    
     
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VisorAnimales.fxml"));
        Pane rootAgendaView=fxmlLoader.load();
        

            
        StackPane root = new StackPane();
    
        root.getChildren().add(rootAgendaView);
      
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
