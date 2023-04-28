
package clase20230426;

import clase20230426.MisClases.Carro;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class Clase20230426 {

    static Carro metodo(){
        Carro c = new Carro();
        return c;
        
    }
    
    static Carro armarChatarra(Carro a, Carro b){
        Carro transformer = new Carro(); 
        
        
        return transformer;
    }
    
    
   
    
    public static void main(String[] args) {
        ArrayList cosas = new ArrayList();
        
        int opcion = 0;
        
        while (opcion != 8) {
            String m = """
                       --- MENU ---
                       1- Agregar un numero a las cosas
                       2- Agregar una palabra a las cosas
                       3- Agregar un carro a las cosas
                       4- Listar solamente los carros de las cosas
                       5- Modificar el color de algun carro que se encuentre en las cosas
                       6- Eliminar una cosa
                       7- Eliminar un carro especificamente
                       9- Agregar un accesorio a un carro
                       10- Listar los accesorios de un carro
                       11- Modificar un accesorio de un carro
                       12 Eliminar un accesorio de un carro
                       
                       
                       8- Salir del programa
                       
                       """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(m));
            
            switch(opcion){
                case 1:
                    cosas.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:")));
                    break;
                case 2:
                    cosas.add(JOptionPane.showInputDialog("Ingrese una palabra: "));
                    break;
                case 3:
                    Carro c = new Carro(JOptionPane.showInputDialog("Ingrese la serie"),JOptionPane.showInputDialog("Ingrese la marca"));
                    cosas.add(c);
                    break;
                case 4:
                    String salida = "";
                    for (Object t : cosas) {
                        if (t instanceof Carro) {
                            salida += cosas.indexOf(t)+" -"+(Carro)t+"\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    
                    break;
                case 5:
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del carro a modificar: "));
                    if (pos >= 0 && pos < cosas.size()) {
                        if (cosas.get(pos) instanceof Carro) {
                            ((Carro)cosas.get(pos)).setColor(JColorChooser.showDialog(null, "Seleccione un color", Color.yellow));
                            
                        }
                        
                    } else{
                        JOptionPane.showMessageDialog(null, "La posicion ingresada es incorrecta");
                    }
                    
                    break;
                case 6:
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del objeto a eliminar"));
                    
                    if (p >= 0 && p <= cosas.size()) {
                        int conf = JOptionPane.showConfirmDialog(null, "Desea eliminar?");
                        if (conf == 0) {
                            cosas.remove(p);
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                    break;
                case 7:
                    int po = Integer.parseInt(JOptionPane.showInputDialog("Posicion del objeto a eliminar"));
                    
                    if (po >= 0 && po <= cosas.size()) {
                        if (cosas.get(po) instanceof Carro) {
                            int conf = JOptionPane.showConfirmDialog(null, "Desea eliminar?");
                            if (conf == 0) {
                                cosas.remove(po);
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                    break;
                case 9:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            String acc = JOptionPane.showInputDialog("Ingrese el accesorio: ");
                            
                            ((Carro)cosas.get(pcarro)).setAcessorio(acc);
                            
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                case 10:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para listar accesorios: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            String s = "";
                            s += cosas.get(pcarro) +"\n\nAccesorios:\n";
                            for (String t : ((Carro)cosas.get(pcarro)).getAccesorios()) {
                                s += t+"\n";
                            }
                            JOptionPane.showMessageDialog(null, s);
                            
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                
                case 11:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para modificar un accesorios: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            int posacc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion  del accesorio en "+cosas.get(pcarro)));
                            ArrayList<String> temp = ((Carro)cosas.get(pcarro)).getAccesorios();
                            if (posacc >= 0 && posacc <= temp.size()) {
                                String newacc = JOptionPane.showInputDialog("Ingrese el nuevo accessorio: ");
                                temp.set(posacc, newacc);
                                JOptionPane.showMessageDialog(null, "Exitoso");
                            }
                            
                            
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
            }
            
        }//Fin del while
    }
    
}
