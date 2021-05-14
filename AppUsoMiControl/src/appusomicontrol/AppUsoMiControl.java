/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.lang.reflect.*;
import java.util.Arrays;
import proyectomicontrol.MiControl;

/**
 *
 * @author Usuario
 */
public class AppUsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) throws NullPointerException {
        
            MiControl mictrl = new MiControl();
            
            // introspeccion(mictrl);
            introspect(MiControl.class, new PrintWriter(System.out));
            
            
            
            mictrl.setOnAction((MouseEvent event) -> {
                System.out.println("Estás pulsando en la zona roja");
            });
                    

            /* 
            Button btn = new Button();
            btn.setText("Say 'Hello World'");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello World!");
                }
            }); */

            Pane root = new Pane();
            root.getChildren().add(mictrl);

            Scene scene = new Scene(root, 300, 250);

            primaryStage.setTitle("AppUsoMiControl");
            primaryStage.setScene(scene);
            primaryStage.show();
        
            
        };
    
    public void introspeccion(Class aClass){
        // Mostrar por consola los constructores
        System.out.println(Arrays.toString(aClass.getClass().getConstructors()));
        
        // Mostrar por consola los métodos
        System.out.println(Arrays.toString(aClass.getClass().getMethods()));
        
        // Mostrar por consola los campos
        System.out.println(Arrays.toString(aClass.getClass().getFields()));
        
        // Mostrar por consola los modificadores
        System.out.println(aClass.getClass().getModifiers());
    }
    
    
    public static void introspect(Class aClass, PrintWriter printer) {
        printer.println("La clase '" + aClass.getSimpleName() + "'");
        
        printer.println("CONSTRUCTORES");
        for (Constructor cons : aClass.getConstructors()) {
            printer.print("\ttiene ");
            printer.print(cons.getName()+ "()");
            printer.println(" de tipo " + cons.getName());
            }
        printer.flush();

        // Muestra por consola los métodos
        printer.println("METODOS");
        for (Method m : aClass.getMethods()) {
            printer.print("\ttiene ");
            printer.print(m.getName());
            printer.println(" de tipo " + m.getName());
            }
        printer.flush();
        
        // Muestra por consola los campos
        printer.println("CAMPOS");
        for (Field field : aClass.getDeclaredFields()) {
            printer.print("\ttiene ");
            printer.print(field.getName());
            printer.println(" de tipo " + field.getType().getSimpleName());
            }
        printer.flush();
         
        // Muestra por consola los modificadores
        printer.printf("%s",aClass.getModifiers());
        printer.flush(); 
        
        
        
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
