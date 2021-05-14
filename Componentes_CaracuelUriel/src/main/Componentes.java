/*
    Uriel Caracuel Barrera - 2º DAM
    (Módulo) - Tema X 
    Título
 */
package main;

import componentes.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Componentes extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        
        Label lb_ctb = new Label("CampoTextoBotón");
        CampoTextoBoton ctb = new CampoTextoBoton();
        
        Label lb_tn = new Label("CampoTextoNumerico");
        CampoTextoNumerico ctn = new CampoTextoNumerico();
        
        
        
        
        root.getChildren().addAll(lb_ctb,ctb, lb_tn, ctn);
        
        Scene scene = new Scene(root,300,300);
        
        stage.setScene(scene);
        stage.show();
    }        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
