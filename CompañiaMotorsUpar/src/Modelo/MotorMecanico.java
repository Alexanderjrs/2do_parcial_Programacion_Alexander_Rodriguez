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
public class MotorMecanico {
    public class MotorMecanico extends Motor implements IVendible {

    public MotorMecanico() {
    }

    public MotorMecanico(int Nserial, String Marca, String Combustible, double Nkilovatios) {
        super(Nserial, Marca, Combustible, Nkilovatios);
    }

    @Override
    public String getInfoMotor() {
        return  "Numero serial: "+ this.NumSerial+ " Marca: "+ this.Marca+ " Combustible: " +this.ClaseCombustible;
        }

    @Override
    public String getInfoCatalogo() {
        return "TIPO MOTOR: MECANICO";
    }

    @Override
    public double getValorVenta(double Tamaño, double TCombustible) {
        return Math.pow(Tamaño, TCombustible);
    }
    }
}
