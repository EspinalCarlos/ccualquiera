
package clase20230426.MisClases;

import java.util.Date;

public class Rueda {
    private int numero;
    private int lonas;
    private Date fecha;

    public Rueda() {
    }
    
    
    
    public Rueda(int numero, int lonas, Date fecha) {
        this.numero = numero;
        this.lonas = lonas;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLonas() {
        return lonas;
    }

    public void setLonas(int lonas) {
        this.lonas = lonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Rueda{" + "numero=" + numero + ", lonas=" + lonas + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
