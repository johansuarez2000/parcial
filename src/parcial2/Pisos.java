/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author jssuarezse
 */
public class Pisos extends inmueble {
    private int numOficinas;
    private int Area;
    private ArrayList<Oficina> oficinas=new ArrayList<>();

    public Pisos(int numOficinas, int Area, String nombreC, int Estrato, int valorA, int area) {
        super(nombreC, Estrato, valorA, area);
        this.numOficinas = numOficinas;
        this.Area = Area;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    @Override
    public String toString() {
        return " Pisos{" + "numOficinas=" + numOficinas + ", Area=" + Area + ", oficinas=" + oficinas + '}';
    }
    
    
}
