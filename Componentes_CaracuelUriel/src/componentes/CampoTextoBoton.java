
package componentes;

import java.io.IOException;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class CampoTextoBoton extends HBox{

    @FXML private TextField text;
    
    @FXML private Button btn;
    
    public CampoTextoBoton(){
        // Vista FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoBoton.fxml"));
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        };
    }

    public String getText() {
        return textProperty().get();
    }
    
    public void setText(String val){
        textProperty().set(val);
    }
    
    public StringProperty textProperty(){
        return text.textProperty();
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    
    @FXML
    protected void okButton(){
        System.out.println("OK -> " + getText());
    }


    /* 
    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty(){
        return onAction;
    }
    public final void setOnAction(EventHandler<ActionEvent> handler){
        onAction.set(handler);
    }
    
    public final EventHandler<ActionEvent> getOnAction(){
        return onAction.get();
    }
    
    private ObjectProperty<EventHandler<ActionEvent>> onAction = new ObjectPropertyBase<EventHandler<ActionEvent>>() {
        @Override
        protected void invalidated() {
            setEventHandler(ActionEvent.ACTION, get());
            // System.out.printf("No");
        }

        @Override
        public Object getBean() {
            return CampoTextoBoton.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };
    */
    
    /*
        4.5.2: Analisis del componente personalizado básico
    
        La clase CampoTextoBoton incluye los siguientes métodos get y set:
            - getText() -> Retorna el texto escrito en el TextField en un String
            - setText() -> Asigna un String al textField
            - getBtn() -> Retorna el botón
            - setBtn() -> Asigna un Button al botón
    
        La gestión de eventos está definida en el método okButton(), referenciado en el documento FXML 
        y asociado al evento onAction. 
    
        La clase javafx.beans.property.StringProperty define una propiedad del componente, en este caso el contenido del TextField.
        El método TextProperty() retorna la TextProperty() del TextField, por lo cual se puede obtener 
        y modificar el contenido del TextField desde el propio componente. 
    */
}
    


    
    

