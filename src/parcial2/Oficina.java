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
public class Oficina extends inmueble{
    private String tipoO;

    public Oficina(String tipoO, String nombreC, int Estrato, int valorA, int area) {
        super(nombreC, Estrato, valorA, area);
        this.tipoO = tipoO;
    }

    public String getTipoO() {
        return tipoO;
    }

    public void setTipoO(String tipoO) {
        this.tipoO = tipoO;
    }

    @Override
    public String toString() {
        return "Oficina{" + "tipoO=" + tipoO + '}';
    }

  
   
    
}
