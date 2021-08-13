
package lab4p2_felixvelasquez;

/**
 *
 * @author PERSONAL
 */
public class electrico extends autos {
    private String modelo;
    private String vin;
    private String carro;
    private int pasa;
    private int male;
    private int kilo;
    private int bateria;
    private int ace;
    private int tiempo;
    private double fallos;

    public electrico() {
        super();
    }
    
    public electrico(String modelo, String vin, String carro, int pasa, int male, int kilo, int bateria, int ace, int tiempo) {
        this.modelo = modelo;
        this.vin = vin;
        this.carro = carro;
        this.pasa = pasa;
        this.male = male;
        this.kilo = kilo;
        this.bateria = bateria;
        this.ace = ace;
        this.tiempo = tiempo;
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

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getAce() {
        return ace;
    }

    public void setAce(int ace) {
        this.ace = ace;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
     public double getFallos() {
        return Fallos4();
    }

    public void setFallos(double fallos) {
        this.fallos = Fallos4();
    }
     public String toString() {
        return "Electrico {" + "Modelo= " + modelo + ", VIN= " + vin + ", Carroceria=" + carro + ",Cantidad de pasajeros =" + pasa
                + ", Capacidad de maleteros=" + male + ", Cantidad de kilometros que puede recorrer =" + kilo+" k/h" + ", Cantidad de baterias que almacena=" + bateria+", Aceleracion de 1 a 100= " +ace+"s"+", Tiempo que dura una carga completa "+tiempo+"m ,   "+ fallos +"  Dias que el vehiculo no presentara ningun fallo=" + '}';
    }

    @Override
    public double Fallos() {
        double aux1 = 2021-( bateria + tiempo) * (pasa /ace);
        return aux1;
    }

    @Override
    public double Fallos2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Fallos3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Fallos4() {
        double aux1 = 2021-( bateria + tiempo) * (pasa /ace);
        return aux1;
    }
    
}
