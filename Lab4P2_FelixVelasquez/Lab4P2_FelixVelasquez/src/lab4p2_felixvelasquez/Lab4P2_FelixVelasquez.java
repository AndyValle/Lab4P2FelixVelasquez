
package lab4p2_felixvelasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab4P2_FelixVelasquez {

    public static void main(String[] args) {
         int resp = 0;
       ArrayList lis = new ArrayList();
      
        while (resp != 2) {
            resp = Integer.parseInt(JOptionPane.showInputDialog("----Login----\n"
                    + "1. Iniciar secion\n"
                    + "2. Salir"));

            switch (resp) {
                case 1: {
                    String user = JOptionPane.showInputDialog("Usuario").toLowerCase();
                    int code = Integer.parseInt(JOptionPane.showInputDialog("Contrasena"));
                    if ("david".equals(user) && code == 1234) {
                        JOptionPane.showMessageDialog(null, "Bienvenido a Toyota");
                        int posi = 0;
                        while (posi != 6) {
                            posi = Integer.parseInt(JOptionPane.showInputDialog("----Menu----\n"
                                    + "1. Ver Automoviles\n"
                                    + "2. Agregar Automoviles\n"
                                    + "3. Calculo\n"
                                    + "4. Modificar Automoviles\n"
                                    + "5. Borrar Automoviles\n"          
                                    + "6. Salir"));

                            switch (posi) {
                                case 1:{
                                    if (!lis.isEmpty()) {
                                        for (Object i : lis) {
                                            JOptionPane.showMessageDialog(null, "[" + lis.indexOf(i) + "]" + " " + i);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay automoviles registrado actualmente");
                                    }
                                    break;
                                }// fin case 01
                                case 2:{
                                    int po = 0;
                                    while (po != 5) {
                                        po = Integer.parseInt(JOptionPane.showInputDialog("====MEN====\n"
                                                + "1. Agregar Combustion(NEV)\n"
                                                + "2. Agregar Hibrido(HEV)\n"
                                                + "3. Agregar Hibrido enchufable(PHEV)\n"
                                                + "4. Agregar Electrico(BEV)\n"
                                                + "5. Salir"));
                                        switch (po) {
                                            case 1: {
                                                String ta = "";
                                                JOptionPane.showMessageDialog(null, "Combustion (Nev)");
                                                String modelo = JOptionPane.showInputDialog("Modelo");
                                                String vin = JOptionPane.showInputDialog("VIN");
                                                String Id = JOptionPane.showInputDialog("Carroceria");
                                                int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                                                int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));
                                                int kilo = Integer.parseInt(JOptionPane.showInputDialog("Consumo de combustible (en kilometros por litro)"));
                                                int aceite = Integer.parseInt(JOptionPane.showInputDialog("Duracion del aceite (en meses) "));
                                                int velo = Integer.parseInt(JOptionPane.showInputDialog("Velocidad maxima"));
                                                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de cambio\n"
                                                        + "1.Automatico\n"
                                                        + "2.Manual"));
                                                if (tipo == 1) {
                                                    ta = "Automatico";
                                                } else if (tipo == 2) {
                                                    ta = "Manual";
                                                }
                                                autos a = new combustion(modelo, vin, Id, pasa, male, kilo, aceite, velo, ta);
                                                a.Fallos();
                                                lis.add(a);

                                                JOptionPane.showMessageDialog(null, "Automovil creado exitosamente");
                                                break;
                                            }//fin case 001
                                            case 2: {
                                                JOptionPane.showMessageDialog(null, "Hibrido (HEv)");
                                                String modelo = JOptionPane.showInputDialog("Modelo");
                                                String vin = JOptionPane.showInputDialog("VIN (identificador unico)");
                                                String carro = JOptionPane.showInputDialog("Carroceria");
                                                int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                                                int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));
                                                int kilo = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de la bateria en litros (en kilowatt por hora)"));
                                                int aceite = Integer.parseInt(JOptionPane.showInputDialog("Capacidad del motro electronico(en kilowatt) "));
                                               autos a = new hibrido(modelo, vin, carro, pasa, male, kilo, aceite);
                                                a.Fallos2();
                                                lis.add(a);
                                               JOptionPane.showMessageDialog(null, "Automovil creado exitosamente");
                                                break;
                                            }// fin case 002
                                            case 3: {
                                                 JOptionPane.showMessageDialog(null, "Hibrido enchufable (PHEV)");
                                                String modelo = JOptionPane.showInputDialog("Modelo");
                                                String vin = JOptionPane.showInputDialog("VIN (identificador unico)");
                                                String carro = JOptionPane.showInputDialog("Carroceria");
                                                int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                                                int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero (en litros)"));
                                                int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de kilometros (en modo electronico)"));
                                                int motor = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de motores electronicos "));
                                                int remolque = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de remolque (en toneladas) "));
                                                String ta="";
                                                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Es 4X4.\n"
                                                        + "1. SI\n"
                                                        + "2. NO"));
                                                if (tipo == 1) {
                                                    ta = "SI";
                                                } else if (tipo == 2) {
                                                    ta = "NO";
                                                }
                                                autos a = new enchufable(modelo, vin, carro, pasa, male, kilo, motor,remolque,ta);
                                                a.Fallos3();
                                                lis.add(a);
                                               JOptionPane.showMessageDialog(null, "Automovil creado exitosamente");
                                                
                                               
                                                break;
                                            }//003
                                            case 4:{
                                                JOptionPane.showMessageDialog(null, "Electrico (BEV)");
                                                String modelo = JOptionPane.showInputDialog("Modelo");
                                                String vin = JOptionPane.showInputDialog("VIN (identificador unico)");
                                                String carro = JOptionPane.showInputDialog("Carroceria");
                                                int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                                                int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero (en litros)"));
                                                int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de kilometros (que puede recorrer autonomia)"));
                                                int bateria = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de bateria que almacena "));
                                                int ace = Integer.parseInt(JOptionPane.showInputDialog("Aceleracion de 1 a 100 (en segundos) "));
                                                int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Tiempo que dura una carga completa (en minutos) "));
                                                autos a = new electrico(modelo, vin, carro, pasa, male, kilo, bateria,ace,tiempo);
                                                a.Fallos4();
                                                lis.add(a);
                                                JOptionPane.showMessageDialog(null, "Automovil creado exitosamente");
                                                break;
                                            }//004
                                        }
                                    }
                                    break;
                                }//fin case 02
                                case 3: {
                                    if (!lis.isEmpty()) {
                                        int posic = Integer.parseInt(JOptionPane.showInputDialog("Que auto desea Selecionar"));
                                        if (posic >= 0 && posic <= lis.size()) {
                                            JOptionPane.showMessageDialog(null, "Para ver los dia que el auto no tendra fallos vaya se al final de las propiedades de ese auto");
                                            for (Object i : lis) {
                                                JOptionPane.showMessageDialog(null, "[" + lis.indexOf(i) + "]" + " " + i);
                                            }

                                            break;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No hay automoviles registrado actualmente");
                                        }
                                    }
                                }
                                case 4:{
                                     if (!lis.isEmpty()) {
                                        int posic = Integer.parseInt(JOptionPane.showInputDialog("Que auto desea modificar"));
                                        if (posic >= 0 && posic <= lis.size()) {
                                            if (lis.get(posic) instanceof combustion) {
                                                modificar1(lis, posic);
                                            } else if (lis.get(posic) instanceof hibrido) {
                                                modificar2(lis, posic);
                                            } else if (lis.get(posic) instanceof enchufable) {
                                                modificar3(lis, posic);
                                            } else if (lis.get(posic) instanceof electrico) {
                                                modificar4(lis, posic);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "NO hay Automoviles registrado actualmente");
                                    }
                                    break;
                                }else {
                                        JOptionPane.showMessageDialog(null, "NO hay Automoviles registrado actualmente");
                                    }
                                }
                                case 5:{
                                    if (!lis.isEmpty()) {
                                        int posic = Integer.parseInt(JOptionPane.showInputDialog("Que Auto desea Borrar"));
                                        if (posic >= 0 && posic <= lis.size()) {
                                            lis.remove(posic);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }
                                    }
                                    break;
                                }
                                
                            }//fin switch 2
                        }//fin while2
                    }////fin if 
                    }// case 1 pricipal 
                }//fin switch
            }// fin while
        }
     public static ArrayList modificar1(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 10) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Menu\n"
                    + "1. Modelo\n"
                    + "2. VIn\n"
                    + "3. Carroceria\n"
                    + "4. Cantidad de pasajeros\n"
                    + "5. Capacidad del maletero\n"
                    + "6. Consumo de combustible\n"
                    + "7. Duracion del aceite\n"
                    + "8. Velocidad maxima\n"
                    + "9. Tipo de cambio\n"
                    + "10. Salir"));
            switch (opcion) {
                case 1: {
                    String modelo = JOptionPane.showInputDialog("Ingrese su Nombre");
                    ((combustion) x.get(i)).setModelo(modelo);
                    break;
                }
                case 2: {
                    String vin = JOptionPane.showInputDialog("Ingrese su apellido");
                    ((combustion) x.get(i)).setVin(vin);
                    break;
                }
                case 3: {
                   String Id = JOptionPane.showInputDialog("Carroceria");
                    ((combustion) x.get(i)).setId(Id);
                    break;
                }
                case 4: {
                    int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                    ((combustion) x.get(i)).setPasa(pasa);
                    break;
                }
                case 5: {
                     int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));

                     ((combustion) x.get(i)).setMale(male);
                     break;
                 }
                 case 6: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Consumo en combustible en kilometeo por hora"));
                     ((combustion) x.get(i)).setKilo(kilo);
                     break;
                 }
                 case 7: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Duracion del aceite (en meses)"));
                     ((combustion) x.get(i)).setAceite(kilo);
                     break;
                 }
                 case 8: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Velocidad maxima"));
                     ((combustion) x.get(i)).setVelo(kilo);
                     break;
                 }
                 case 9: {
                     String ta = "";
                     int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de cambio\n"
                             + "1.Automatico\n"
                             + "2.Manual"));
                     if (tipo == 1) {
                         ta = "Automatico";
                     } else if (tipo == 2) {
                         ta = "Manual";
                     }
                     ((combustion) x.get(i)).setTa(ta);
                     break;
                 }
             }
         }
         ((combustion) x.get(i)).Fallos();
         return x;
    }
     public static ArrayList modificar2(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 8) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Menu\n"
                    + "1. Modelo\n"
                    + "2. VIn\n"
                    + "3. Carroceria\n"
                    + "4. Cantidad de pasajeros\n"
                    + "5. Capacidad del maletero\n"
                    + "6. Capacidad de la bateria\n"
                    + "7. Capacidad del motro electronico\n"
                   
                    + "8. Salir"));
            switch (opcion) {
                case 1: {
                    String modelo = JOptionPane.showInputDialog("Ingrese su nuevo Modelo");
                    ((hibrido) x.get(i)).setModelo(modelo);
                    break;
                }
                case 2: {
                    String vin = JOptionPane.showInputDialog("Ingrese su nuevo VIN");
                    ((hibrido) x.get(i)).setVin(vin);
                    break;
                }
                case 3: {
                   String Id = JOptionPane.showInputDialog("Carroceria");
                    ((hibrido) x.get(i)).setCarro(Id);
                    break;
                }
                case 4: {
                    int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                    ((hibrido) x.get(i)).setPasa(pasa);
                    break;
                }
                case 5: {
                     int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));

                     ((hibrido) x.get(i)).setMale(male);
                     break;
                 }
                 case 6: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de la bateria (en kilowatt)"));
                     ((hibrido) x.get(i)).setBateria(kilo);
                     break;
                 }
                 case 7: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Capacidad del motor (en kilowatt)"));
                     ((hibrido) x.get(i)).setMotor(kilo);
                     break;
                 }
             }
         }
         ((hibrido) x.get(i)).Fallos2();
         return x;
    }
     public static ArrayList modificar3(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 10) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Menu\n"
                    + "1. Modelo\n"
                    + "2. VIn\n"
                    + "3. Carroceria\n"
                    + "4. Cantidad de pasajeros\n"
                    + "5. Capacidad del maletero\n"
                    + "6. Cantidad de kilometros en modo electronico\n"
                    + "7. Cantidad de motores electronicos\n"
                    + "8. Capacidad de remolque\n"
                    + "9. Es 4X4\n"
                    + "10. Salir"));
            switch (opcion) {
               case 1: {
                    String modelo = JOptionPane.showInputDialog("Ingrese su nuevo Modelo");
                    ((enchufable) x.get(i)).setModelo(modelo);
                    break;
                }
                case 2: {
                    String vin = JOptionPane.showInputDialog("Ingrese su nuevo VIN");
                    ((enchufable) x.get(i)).setVin(vin);
                    break;
                }
                case 3: {
                   String Id = JOptionPane.showInputDialog("Carroceria");
                    ((enchufable) x.get(i)).setCarro(Id);
                    break;
                }
                case 4: {
                    int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                    ((enchufable) x.get(i)).setPasa(pasa);
                    break;
                }
                case 5: {
                     int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));

                     ((enchufable) x.get(i)).setMale(male);
                     break;
                 }
                 case 6: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de kilometros en modo electronico "));
                     ((enchufable) x.get(i)).setKilo(kilo);
                     break;
                 }
                 case 7: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantida de motores electronicos (en meses)"));
                     ((enchufable) x.get(i)).setMotores(kilo);
                     break;
                 }
                 case 8: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de remolque( en toneladas"));
                     ((enchufable) x.get(i)).setRemolque(kilo);
                     break;
                 }
                 case 9: {
                     String ta = "";
                     int tipo = Integer.parseInt(JOptionPane.showInputDialog("ES 4X4\n"
                             + "1.SI\n"
                             + "2.NO"));
                     if (tipo == 1) {
                         ta = "SI";
                     } else if (tipo == 2) {
                         ta = "NO";
                     }
                     ((enchufable) x.get(i)).setTa(ta);
                     break;
                 }
             }
         }
         ((enchufable) x.get(i)).Fallos3();
         return x;
    }
     public static ArrayList modificar4(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 10) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Menu\n"
                    + "1. Modelo\n"
                    + "2. VIn\n"
                    + "3. Carroceria\n"
                    + "4. Cantidad de pasajeros\n"
                    + "5. Capacidad del maletero\n"
                    + "6. Cantidad de kilometros que puede recorrer\n"
                    + "7. Cantidad de bateria que almacena\n"
                    + "8. Aceleracion 1 a 100\n"
                    + "9. Tiempo que dura una carga completa\n"
                    + "10. Salir"));
            switch (opcion) {
                case 1: {
                    String modelo = JOptionPane.showInputDialog("Ingrese su nuevo modelo");
                    ((electrico) x.get(i)).setModelo(modelo);
                    break;
                }
                case 2: {
                    String vin = JOptionPane.showInputDialog("Ingrese su VIn");
                    ((electrico) x.get(i)).setVin(vin);
                    break;
                }
                case 3: {
                   String Id = JOptionPane.showInputDialog("Carroceria");
                    ((electrico) x.get(i)).setCarro(Id);
                    break;
                }
                case 4: {
                    int pasa = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pasajeros"));
                    ((electrico) x.get(i)).setPasa(pasa);
                    break;
                }
                case 5: {
                     int male = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de maletero en litros"));

                     ((electrico) x.get(i)).setMale(male);
                     break;
                 }
                 case 6: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de kilometros que puede recorrer"));
                     ((electrico) x.get(i)).setKilo(kilo);
                     break;
                 }
                 case 7: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de bateria que almacena"));
                     ((electrico) x.get(i)).setBateria(kilo);
                     break;
                 }
                 case 8: {
                     int kilo = Integer.parseInt(JOptionPane.showInputDialog("Aceleracion del 1 a 100"));
                     ((electrico) x.get(i)).setAce(kilo);
                     break;
                 }
                 case 9: {
                    int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Tiempo que dura una carga completa (en minutos) "));
                     ((electrico) x.get(i)).setTiempo(tiempo);
                     break;
                 }
             }
         }
         ((electrico) x.get(i)).Fallos4();
         return x;
    }

    }// fin 
