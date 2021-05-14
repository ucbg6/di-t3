/*
    Uriel Caracuel Barrera - 2º DAM

 */
package visoranimales;

/**
 *
 * @author ucb40
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;



/*
    Variables de instancia de Animal: Se deberá definir una variable de instancia de animales 
    como de tipo ObservableList<Animales> y se inicializará llamando al método estático 
    FXCollections.observableArrayList(). Este método devuelve un objeto vacío de colección 
    (similar a ArrayList) que implementa la interfaz de la Lista observable. 

    Inicializando los animales del ObservableList: se añadirán (add) objetos de animales a la 
    colección de animales. Se pasa esta colección al método ListViewsetItems, que vincula el 
    ListView al ObservableList. Este enlace de datos permite que ListView muestre los objetos 
    de los animales automáticamente. De forma predeterminada, ListView muestra la 
    representación de cada String de animal
*/


public class VisorAnimalesController implements Initializable {

    @FXML
    private BorderPane myBpane;
    @FXML
    private ListView<Animal> mylistview;
    @FXML
    private ImageView myImage;
    
    
    //IMAGEN
    Image imagen;
    /*ANIMALES*/
    
    Animal leon = new Animal("Leon","imagenes/leonMin.jpg","imagenes/leonGrande.jpg");
    // Animal tiburon = new Animal("Tiburon","imagenes/tiburonMin.png","imagenes/tiburon.jpg");
    // Animal lobo = new Animal("Lobo","imagenes/loboMin.png","imagenes/lobo.jpg");
    
    //LISTA
    ObservableList<Animal> animalesObsList;
    
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        animalesObsList = FXCollections.observableArrayList();
        
        animalesObsList.addAll(leon);
       //animalesObsList.add(tiburon);
       //animalesObsList.add(lobo);
        
        
        mylistview.setItems(animalesObsList);
        
        //CELLFACTORY
        mylistview.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        
        //EVENTOS LISTA
        mylistview.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            imagen = new Image(getClass().getResourceAsStream(newValue.getImgGrande()));
            myImage.setImage(imagen);
        });



    }

}
