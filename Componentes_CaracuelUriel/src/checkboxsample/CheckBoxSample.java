/*
    Uriel Caracuel Barrera - 2º DAM
    (Módulo) - Tema X 
    Título
 */
package checkboxsample;
 
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CheckBoxSample extends Application {
 
    final String[] names = new String[]{"Security", "Project", "Chart"};

    final CheckBox[] cbs = new CheckBox[names.length];
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Checkbox Sample");
        stage.setWidth(300);
 
 
        for (int i = 0; i < names.length; i++) {
            final CheckBox cb = cbs[i] = new CheckBox(names[i]);
            cb.selectedProperty().addListener(
                    (ObservableValue<? extends Boolean> ov,
                    Boolean old_val, Boolean new_val) -> {
               
            });
        }
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(cbs);
        vbox.setSpacing(5);
 
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(0, 0, 0, 5));
 
        StackPane stack = new StackPane();
 
        stack.getChildren().add(hbox);
   
        HBox root = new HBox();
        root.getChildren().add(vbox);
        root.getChildren().add(stack);
        root.setSpacing(40);
        root.setPadding(new Insets(20, 10, 10, 20));
 
        ((Group) scene.getRoot()).getChildren().add(root);
        scene.getStylesheets().add(getClass().getResource("checkbox.css").toExternalForm());
 
        stage.setScene(scene);
        stage.show();
    }
}
