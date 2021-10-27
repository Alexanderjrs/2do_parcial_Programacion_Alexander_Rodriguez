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
public class MotorElectrico extends Motor implements IReservable{

    public MotorElectrico() {
    }

    public MotorElectrico(int Nserial, String Marca, String Combustible, double Nkilovatios) {
        super(Nserial, Marca, Combustible, Nkilovatios);
    }

    @Override
    public String getInfoMotor() {
       return  "Numero serial: "+ this.NumSerial+ " Marca: "+ this.Marca+ " Consumo Kilovatios: " +this.NKV;
        }

    @Override
    public String getInfoCatalogo() {
        return "TIPO MOTOR: ELECTRICO";
    }

    @Override
    public double getValorReserva(int VKlv, int numKlv, double hora) {
        return Math.pow(VKlv, numKlv);
    }}