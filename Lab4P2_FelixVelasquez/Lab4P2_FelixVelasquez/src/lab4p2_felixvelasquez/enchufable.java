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
public class enchufable extends autos {
    private String modelo;
    private String vin;
    private String carro;
    private int pasa;
    private int male;
    private int kilo;
    private int motores;
    private int remolque;
    private String ta;
    private double fallos;

    public enchufable() {
        super();
    }
    
    public enchufable(String modelo, String vin, String carro, int pasa, int male, int kilo, int motores, int remolque, String ta) {
        this.modelo = modelo;
        this.vin = vin;
        this.carro = carro;
        this.pasa = pasa;
        this.male = male;
        this.kilo = kilo;
        this.motores = motores;
        this.remolque = remolque;
        this.ta = ta;
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

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public double getFallos() {
        return Fallos3();
    }

    public void setFallos(double fallos) {
        this.fallos = Fallos3();
    }
     @Override
    public String toString() {
        return "Hibrido enchuflado {" + "Modelo=" + modelo + ", VIN=" + vin + ", Carroceria=" + carro + ",Cantidad de pasajeros =" + pasa
                + ", Capacidad de maleteros=" + male + ", Cantidad de kilometros en modo electromico =" + kilo+" kl" + ", Cantidad de motores electronicos=" + motores+", Capacidad de remolque" + remolque+", es 4X4 "+ta +", "+fallos+" Dias que el vehiculo no presentara ningun fallo=" + '}';
    }

    @Override
    public double Fallos() {
        double aux1 = 2021-((pasa) * (motores))+kilo;
        double au2 = remolque;
        return aux1/au2;
    }

    @Override
    public double Fallos2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Fallos3() {
       double aux1 = 2021-((pasa) * (motores))+kilo;
        double au2 = remolque;
        return aux1/au2;
    }

    @Override
    public double Fallos4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
