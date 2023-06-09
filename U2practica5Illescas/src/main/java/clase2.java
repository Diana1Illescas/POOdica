/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
/**
 *
 * @author ESPE
 */
public class clase2 {
    
    public static void main (String[] args) {
        List<Persona> persona =new ArrayList<Persona>();
        persona.add(new Persona("aaa L, 1111, hdfdhb@ffa "));
        persona.add(new Persona("aaa L, 1111, hdfdhb@ffa "));
        persona.add(new Persona("aaa L, 1111, hdfdhb@ffa "));
        ExportaCSV(persona);
        ImportarCSV();
    }

    private static void ExportaCSV(List<Persona> persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void ImportarCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
