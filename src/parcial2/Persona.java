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
public class Persona {
    public String nombre;
    public int cedula;
    public String sexo;
    public boolean aval;
    public boolean contrato;
    public boolean nomina;
    public boolean avalOtraPersona;

    public Persona(String nombre, int cedula, String sexo, boolean aval, boolean contrato, boolean nomina, boolean avalOtraPersona) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.aval = aval;
        this.contrato = contrato;
        this.nomina = nomina;
        this.avalOtraPersona = avalOtraPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAval() {
        return aval;
    }

    public void setAval(boolean aval) {
        this.aval = aval;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }

    public boolean isNomina() {
        return nomina;
    }

    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    public boolean isAvalOtraPersona() {
        return avalOtraPersona;
    }

    public void setAvalOtraPersona(boolean avalOtraPersona) {
        this.avalOtraPersona = avalOtraPersona;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", sexo=" + sexo + ", aval=" + aval + ", contrato=" + contrato + ", nomina=" + nomina + ", avalOtraPersona=" + avalOtraPersona + '}';
    }
    
}
