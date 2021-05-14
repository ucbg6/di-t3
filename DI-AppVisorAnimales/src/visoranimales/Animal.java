/*
    Uriel Caracuel Barrera - 2º DAM
    Animal.java
 */
package visoranimales;

/**
 *
 * @author ucb40
 */
public class Animal {
    
    private String nombre;
    private String imgMiniatura;
    private String imgGrande;
    
    
    public Animal(){
    
    }
    
    public Animal(String nombre,String imgMin,String imgGrande){
        
        this.nombre = nombre;
        this.imgMiniatura = imgMin;
        this.imgGrande = imgGrande;
    
    
    }

    /*GETTERS AND SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImgMiniatura() {
        return imgMiniatura;
    }

    public void setImgMiniatura(String imgMiniatura) {
        this.imgMiniatura = imgMiniatura;
    }

    public String getImgGrande() {
        return imgGrande;
    }

    public void setImgGrande(String imgGrande) {
        this.imgGrande = imgGrande;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
