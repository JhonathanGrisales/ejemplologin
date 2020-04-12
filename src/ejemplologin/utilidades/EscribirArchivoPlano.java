/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplologin.utilidades;

import com.csvreader.CsvWriter;
import ejemplologin.modelo.Materia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhonathan_G
 */
public class EscribirArchivoPlano {

    public static void ExportarMaterias(List<Materia> materias){

        CsvWriter csvWriter = new CsvWriter("src/materias.txt");

        for (Materia materia : materias) {

            String[] datos = materia.getArray();

            try {
                csvWriter.writeRecord(datos);
            } catch (IOException ex) {
                Logger.getLogger(EscribirArchivoPlano.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        csvWriter.close();

    }

}
