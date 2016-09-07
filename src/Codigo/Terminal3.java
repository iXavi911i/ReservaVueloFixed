package Codigo;


import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Xavi
 */
public class Terminal3 extends Thread {
String name;
Semaphore s;
Vuelo v;

public Terminal3(Semaphore s, String name, Vuelo v){
    this.s = s;
    this.setName(name);
    this.v = v;
}

@Override
public void run(){
    try {
        s.acquire();
        v.reservaAsientos(new Pasajero("Yolo",v.getRandom()));
        v.reservaAsientos(new Pasajero("Ti",v.getRandom()));
        v.reservaAsientos(new Pasajero("Jorge",v.getRandom()));
        v.reservaAsientos(new Pasajero("Juan",v.getRandom()));
        v.reservaAsientos(new Pasajero("Danna",v.getRandom()));
        v.reservaAsientos(new Pasajero("Malu",v.getRandom()));
        v.reservaAsientos(new Pasajero("Francisco",v.getRandom()));
        v.reservaAsientos(new Pasajero("Carmen",v.getRandom()));
        sleep(500);
    } catch (Exception e) {
    }finally{
        s.release();
    }
}
}
