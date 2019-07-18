/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jssuarezse
 */
public class FincaRaiz {
    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<inmueble> pisos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File lectura= new File("D:\\Users\\Usuario\\Documents\\NetBeansProjects\\Parcial2\\Inventario");
        Scanner flujoEntrada= null;
        String linea= null;
        flujoEntrada= new Scanner(lectura);
        while(flujoEntrada.hasNextLine()){
            linea= flujoEntrada.nextLine();
            String[] parts= linea.split(" ");
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }
        }
            
        
    }
}
