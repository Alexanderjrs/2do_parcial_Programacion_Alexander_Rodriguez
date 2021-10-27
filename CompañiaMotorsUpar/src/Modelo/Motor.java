/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author acer
 */
public abstract class Motor {
     int NumSerial;
    String Marca;
    String ClaseCombustible;
    double NKV;

    public Motor() {
    }

    public Motor(int NumSerial, String Marca, String Combustible, double Nkilovatios) {
        this.NumSerial = NumSerial;
        this.Marca = Marca;
        this.ClaseCombustible = Combustible;
        this.NKV = Nkilovatios;
    }

    public int getNumSerial() {
        return NumSerial;
    }

    public String getMarca() {
        return Marca;
    }

    public String getClaseCombustible() {
        return ClaseCombustible;
    }

    public double getNKV() {
        return NKV;
    }

    public void setNumSerial(int NumSerial) {
        this.NumSerial = NumSerial;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setClaseCombustible(String ClaseCombustible) {
        this.ClaseCombustible = ClaseCombustible;
    }

    public void setNKV(double NKV) {
        this.NKV = NKV;
    }
    public abstract String getInfoMotor();
    public abstract String getInfoCatalogo();
}
