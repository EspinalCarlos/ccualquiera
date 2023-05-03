
package clase20230426.MisClases;


public class Motor {
    private String serie;
    private int cilindraje;
    private int torque;

    public Motor() {
    }

    public Motor(String serie, int cilindraje, int torque) {
        this.serie = serie;
        this.setCilindraje(cilindraje);
        this.torque = torque;
    }

    public Motor(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje <= 30){
            this.cilindraje = cilindraje;
        }
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Motor{" + "serie=" + serie + ", cilindraje=" + cilindraje + ", torque=" + torque + '}';
    }
    
    
    
    
}
