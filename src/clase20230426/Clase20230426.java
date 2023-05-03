
package clase20230426;

import clase20230426.MisClases.Carro;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import clase20230426.MisClases.Motor;
import clase20230426.MisClases.Rueda;
import java.util.Date;


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
                       12- Eliminar un accesorio de un carro
                       13- Agregarle un motor a algun carro
                       14- Modificar las propiedad del motor de un carro
                       15- Agregarle Ruedas a algun carro
                       16- Modificar las propiedades de alguna rueda de algun carro.
                       17- Eliminar una rueda de algun carro
                       18- Imprimir el carro con mayor cilindraje
                       19- Imprimir los carros con llantas nuevas(asuminedo que se llama nuevo  a las fechas mayores o iguales a la fecha actual).
                       
                       
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
                
                case 13:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para agregarle un motor: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            String s = JOptionPane.showInputDialog("Ingrese la serie del motor: ");
                            int cil = Integer.parseInt(JOptionPane.showInputDialog("Ingrse el cilindraje del motor: "));
                            System.out.println(cil);
                            int tor = Integer.parseInt(JOptionPane.showInputDialog("Ingrse el torque del motor: "));
                            
                            ((Carro)cosas.get(pcarro)).setMotor(new Motor(s,cil,tor));
                            JOptionPane.showMessageDialog(null, "Motor Agregado correctamente");
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                
                case 14:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para modificarle el motor: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            int poscmotor = Integer.parseInt(JOptionPane.showInputDialog("1. Serie \n2. Cilindraje \n3. Torque"));
                            switch(poscmotor){
                                case 1:
                                    ((Carro)cosas.get(pcarro)).getMotor().setSerie(JOptionPane.showInputDialog("Ingrese el nuevo numero de serie: "));
                                    JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                    break;
                                case 2:
                                    ((Carro)cosas.get(pcarro)).getMotor().setCilindraje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de cilindraje")));
                                    JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                    break;
                                case 3:
                                    ((Carro)cosas.get(pcarro)).getMotor().setTorque(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de torque: ")));
                                    JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                    break; 
                                    
                            }
                            
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                
                case 15:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para agregarle ruedas: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas: "));
                            int lon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lonas: "));
                            String fe = JOptionPane.showInputDialog("Ingrese la fehca de fabricacion de las ruedas (yyyy/MM/dd): ");
                            String[] f1 = fe.split("/");
                            ((Carro)cosas.get(pcarro)).getRuedas().add(new Rueda(cant,lon,new Date(Integer.parseInt(f1[0])-1900,Integer.parseInt(f1[1])-1,Integer.parseInt(f1[2]))));
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                case 16:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para editar sus ruedas: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            int indrueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice de las ruedas del Carro: "));
                            if (indrueda >= 0 && indrueda <= ((Carro)cosas.get(pcarro)).getRuedas().size()) {
                                int opcmodr = Integer.parseInt(JOptionPane.showInputDialog("1. Numero de ruedas \n2. Numero de Lonas \n3. Fecha de fabricacion"));
                                switch(opcmodr){
                                    case 1:
                                        ((Carro)cosas.get(pcarro)).getRuedas().get(indrueda).setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de ruedas: ")));
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        
                                        break;
                                    case 2:
                                         ((Carro)cosas.get(pcarro)).getRuedas().get(indrueda).setLonas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de lonas: ")));
                                         JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;

                                    case 3:
                                        String nf = JOptionPane.showInputDialog("Ingrese la nueva fecha yyyy/MM/dd: ");
                                        String[] nft = nf.split("/");
                                        Date newfecha = new Date(Integer.parseInt(nft[0])-1900,Integer.parseInt(nft[1])-1,Integer.parseInt(nft[2]));
                                        ((Carro)cosas.get(pcarro)).getRuedas().get(indrueda).setFecha(newfecha);
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Posicion invalida");
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                }break;
                case 17:{
                    int pcarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro para eliminar alguna rueda: "));
                    if (pcarro >= 0 && pcarro <= cosas.size()) {
                        if (cosas.get(pcarro) instanceof Carro) {
                            int indrueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice de las ruedas del Carro: "));
                            if (indrueda >= 0 && indrueda <= ((Carro)cosas.get(pcarro)).getRuedas().size()) {
                                ((Carro)cosas.get(pcarro)).getRuedas().remove(indrueda);
                            } else{
                                JOptionPane.showMessageDialog(null, "Posicion invalida");
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "El objeto en esta posicion no es un carro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion invalida");
                    }
                    
                    
                }break;
                
                case 18:{
                    int conta = 0;
                    if (!cosas.isEmpty()) {
                        for (Object cosa : cosas) {
                            if (cosa instanceof Carro) {
                                if (((Carro) cosa).getMotor() != null) {
                                    conta++;
                                }
                            }
                        }
                    }
                    if(conta > 0){
                        Carro fin = null;
                        for (Object cosa : cosas) {
                            if (cosa instanceof Carro) {
                                int t = ((Carro)cosa).getMotor().getCilindraje();
                                if (fin == null || t > fin.getMotor().getCilindraje()) {
                                    fin = (Carro)cosa;
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Carro con mayor cilindraje: \n"+fin);

                    }
                }break;
                
                case 19:{ 
                    Date d = new Date();
                    String fin = "--- Carros con ruedas nuevas --- \n";
                    int cont = 0;
                    for (Object cosa : cosas) {
                        if (cosa instanceof Carro) {
                            for (Rueda object : ((Carro)cosa).getRuedas()) {
                                Date fr = object.getFecha();
                                int comp = fr.compareTo(d);
                                if (comp > 0 ) {
                                    cont++;
                                } else if(comp < 0){    
                                } else{
                                    cont++;
                                }
                            }
                            if (cont > 0) {
                                fin+= cosa;
                                cont = 0;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, fin);
                    
                    
                    
                }break;
            }
            
        }//Fin del while
    }
    //idsfbjdsbfdskbfdksbfdsk
}
