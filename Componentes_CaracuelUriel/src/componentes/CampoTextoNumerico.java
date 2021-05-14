/*
    Uriel Caracuel Barrera - 2º DAM
    (Módulo) - Tema X 
    Título
 */
package componentes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class CampoTextoNumerico extends TextField implements Initializable {

    public CampoTextoNumerico(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumerico.fxml"));
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        };
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.setOnKeyPressed((value) -> {
        if (!Character.isDigit(value.getText().charAt(0)) ){
            System.out.println("No valido");
        }
    });
    }    
    
}
