/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixvelasquez;

/**
 *
 * @author PERSONAL
 */
public class hibrido extends autos {

    private String modelo;
    private String vin;
    private String carro;
    private int pasa;
    private int male;

    private int bateria;
    private int motor;
    private String ta;
    private double fallos;

    public hibrido() {
        super();
    }
    public hibrido(String modelo, String vin, String carro, int pasa, int male, int bateria, int motor) {
        this.modelo = modelo;
        this.vin = vin;
        this.carro = carro;
        this.pasa = pasa;
        this.male = male;
        this.bateria = bateria;
        this.motor = motor;
        this.fallos = getFallos();
       
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getPasa() {
        return pasa;
    }

    public void setPasa(int pasa) {
        this.pasa = pasa;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public double getFallos() {
        return Fallos2();
    }

    public void setFallos(double fallos) {
        this.fallos = Fallos2();
    }
    @Override
    public String toString() {
        return "Hibrido {" + "Modelo=" + modelo + ", VIN=" + vin + ", Caroceria=" + carro + ",Cantidad de pasajeros =" + pasa
                + ", Capacidad de maleteros=" + male + ", Capacidad de la bateria =" + bateria+" kw/h" + ", Capacidade del motor electrico=" + motor+" kilowatt, " + fallos +" Dias que el vehiculo no presentara ningun fallo" + '}';
    }

    @Override
    public double Fallos() {
        return 0;
       
    }

    @Override
    public double Fallos2() {
        double aux1 = 2021-( bateria * male);
        double au2 = pasa;
        return aux1/au2;
    }

    @Override
    public double Fallos3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Fallos4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
