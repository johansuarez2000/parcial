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
public abstract class inmueble {
    private String nombreC ;
    private int Estrato ;
    private int valorA;
    private int area;

    public inmueble(String nombreC, int Estrato, int valorA, int area) {
        this.nombreC = nombreC;
        this.Estrato = Estrato;
        this.valorA = valorA;
        this.area = area;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    
   public String DarInformacion() {
         return "inmueble{" + "nombreC=" + getNombreC() + ", Estrato=" + getEstrato() + ", valorA=" + getValorA() + ", area=" + getArea() + toString();
    }
    
    }

    
    
    
     

