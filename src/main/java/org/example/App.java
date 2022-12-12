package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
//import java.util.logging.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        /*try {
            String ruta = "./filename.txt";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");


        File directorio = new File("./directorio_nuevo");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}
