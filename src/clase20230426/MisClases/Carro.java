
package clase20230426.MisClases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;


public class Carro {
    //Atributos
    private String Serie;
    protected String marca;
    String modelo;
    public Color color;
    private Date fecha;
    private double costo; //El costo no puede ser menor a 0
    private ArrayList<String> accesorios = new ArrayList();
    
    
    
    //Constructores
    
    public Carro(){
    }
    
    public Carro(String S){
        Serie = S;
    }
    
    public Carro(String S, String marca){
        Serie = S; 
        this.marca = marca;
        
    }
    
    //Mutadores
    
    public void setSerie(String serie){
        this.Serie = serie;
    }
    public String getSerie(){
        return Serie;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public boolean setCosto(double costo){
        if (costo > 0) {
            this.costo = costo;
            return true;
        } else{
            return false;
        }
    }
    
    public void setAccesorios(ArrayList<String> acc){
        accesorios = acc;
    }
    
    public ArrayList<String> getAccesorios(){
        return accesorios;
    }
    
    public void setAcessorio(String acc){
        accesorios.add(acc);
    }
    
    public String getAccesorio(int posicion){
        return accesorios.get(posicion);
    }
    
    //Metodos Administrativos
    @Override
    public String toString(){
        return "Mi carro bello es de marca: "
                +marca+" y su serie es: "+Serie;
    }
    
    public boolean pintar(Color color){
        this.color = color;
        return true;
    }
    
    
}
