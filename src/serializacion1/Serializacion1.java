/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class Serializacion1 {

    static String ruta="/home/local/DANIELCASTELAO/otorradomiguez/NetBeansProjects/serializacion1/serial.otm";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mclase miPrimerObjeto=new Mclase("ola",-7,2.7E10);
        escribir(ruta,miPrimerObjeto);        
        Mclase miSegundoObjeto=leer(ruta);
        System.out.println(miSegundoObjeto.toString());
    }
    
    public static void escribir(String ruta,Mclase objeto){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(ruta));
            oos.writeObject(objeto);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Mclase leer(String ruta){
        Mclase objetoLeido = null;
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(ruta));
            objetoLeido=(Mclase)ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objetoLeido;
    }
}
