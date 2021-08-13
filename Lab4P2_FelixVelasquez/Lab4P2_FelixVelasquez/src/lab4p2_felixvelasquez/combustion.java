
package lab4p2_felixvelasquez;


public class combustion extends autos {

    private String modelo;
    private String vin;
    private String id;
    private int pasa;
    private int male;
    private int kilo;
    private int aceite;
    private int velo;
    private String ta;
    private double fallos;

    public combustion() {
        super();
    }

    public combustion(String modelo, String vin, String id, int pasa, int male, int kilo, int aceite, int velo, String ta) {
        this.modelo = modelo;
        this.vin = vin;
        this.id = id;
        this.pasa = pasa;
        this.male = male;
        this.kilo = kilo;
        this.aceite = aceite;
        this.velo = velo;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getVelo() {
        return velo;
    }

    public void setVelo(int velo) {
        this.velo = velo;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public double getFallos() {
        return Fallos();
    }

    public void setFallos(double fallos) {
        this.fallos = Fallos();
    }

    @Override
    public String toString() {
        return "Combustion {" + "Modelo=" + modelo + ", VIN=" + vin + ", Caroceria=" + id + ",Cantidad de pasajeros =" + pasa
                + ", Capacidad de maleteros=" + male + ", Consumo de combustible=" + kilo + " Kilometros por litro " + ", Duracion del aceite =" + aceite + " Meses" + ", Velocidad Maxima=" + velo + ", Tipo de cambio=" + ta + " , Dias que el vehiculo no presentara ningun fallo=" + fallos + '}';
    }

    @Override
    public double Fallos() {
        double aux1 = ((pasa) * (kilo));
        double aux2 = ((aceite) * (kilo));
        double au3 = 2021 - aux1;
        double fina = au3 - aux2;
        return fina;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
