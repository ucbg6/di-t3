/*
    Uriel Caracuel Barrera - 2º DAM
    CeldaImagenTexto.java
 */
package visoranimales;

/**
 *
 * @author ucb40
 */
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

/*
    En particular, crearás y 
    configurarás un diseño de VBox que contiene un ImageView y una Label. El VBox 
    representa el formato de celda de ListView personalizado.
     Para obtener el mejor rendimiento de ListView, se considera mejor práctica definir controles 
    personalizados como variables de instancia en la subclase ListCell y configurar estos en el 
    constructor de la subclase. Esto minimiza la cantidad de trabajo requerido en cada llamada al 
    método updateItem.
*/
public class CeldaImagenTexto<T> extends ListCell<Animal>{
    
        private VBox vbox = new VBox();
        private ImageView imgView = new ImageView();
        private Label label = new Label();;
        
        
        
        public CeldaImagenTexto(){
        
            vbox.setMaxWidth(100);
            vbox.setMaxHeight(50);
            
            imgView.setFitHeight(vbox.getMaxWidth());
            imgView.setFitWidth(vbox.getMaxHeight());
            
            
            label.setTextAlignment(TextAlignment.CENTER);
            label.setWrapText(true); 
            
           
        
            vbox.setAlignment(Pos.CENTER);
            
            
            
        
    }

    @Override
    protected void updateItem(Animal item, boolean empty) {
        super.updateItem(item, empty);

        if (item != null) {
            System.out.println("soy " +item.getNombre());
            this.imgView.setImage(new Image(getClass().getResourceAsStream(item.getImgMiniatura())));
            this.label.setText(item.getNombre());
            vbox.getChildren().addAll(imgView,label);
            setGraphic(this.vbox);
            
        } else {
            // System.out.println("Soy nulo");
            setGraphic(null);
        }
    }


    
}
