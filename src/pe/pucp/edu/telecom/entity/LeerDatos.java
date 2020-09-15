package pe.pucp.edu.telecom.entity;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class LeerDatos {

    String archCSV = "/doc/Directorio.csv";
    CSVReader csvReader = new CSVReader(new FileReader(archCSV));
    List<String[]> datos = csvReader.readAll();

    public LeerDatos() throws IOException, CsvException {
        System.out.println("Documento vacío");
    }
}
