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
public class Edificio extends inmueble {
    
 private Persona propietario;
 private ArrayList<Pisos> pisos = new ArrayList<>();
 private ArrayList<LocalComercial> locales = new ArrayList<>();  

    public Edificio(Persona propietario, String nombreC, int Estrato, int valorA, int area) {
        super(nombreC, Estrato, valorA, area);
        this.propietario = propietario;
    }

    public ArrayList<Pisos> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Pisos> pisos) {
        this.pisos = pisos;
    }

   

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public ArrayList<LocalComercial> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<LocalComercial> locales) {
        this.locales = locales;
    }

    @Override
    public String toString() {
        return "Edificio{" + "propietario=" + propietario + ", pisos=" + pisos + ", locales=" + locales + '}';
    }
       
    
      
}
