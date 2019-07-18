/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author jssuarezse
 */
public class LocalComercial extends inmueble{
    private boolean ubicaionViaC;

    public LocalComercial(boolean ubicaionViaC, String nombreC, int Estrato, int valorA, int area) {
        super(nombreC, Estrato, valorA, area);
        this.ubicaionViaC = ubicaionViaC;
    }

    public boolean isUbicaionViaC() {
        return ubicaionViaC;
    }

    public void setUbicaionViaC(boolean ubicaionViaC) {
        this.ubicaionViaC = ubicaionViaC;
    }

    @Override
    public String toString() {
        return "LocalComercial{" + "ubicaionViaC=" + ubicaionViaC + '}';
    }    

    
    
    
}
