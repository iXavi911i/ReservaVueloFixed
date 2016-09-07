package Codigo;


import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;


/**
 *
 * @author Xavi
 */
public class Terminal4 extends Thread {
String name;
Semaphore s;
Vuelo v;

public Terminal4(Semaphore s, String name, Vuelo v){
    this.s = s;
    this.setName(name);
    this.v = v;
}

@Override
public void run(){
    try {
        s.acquire();
        v.reservaAsientos(new Pasajero("Tono",v.getRandom()));
        v.reservaAsientos(new Pasajero("Armando",v.getRandom()));
        v.reservaAsientos(new Pasajero("Nico",v.getRandom()));
        v.reservaAsientos(new Pasajero("Jade",v.getRandom()));
        v.reservaAsientos(new Pasajero("Andres",v.getRandom()));
        v.reservaAsientos(new Pasajero("Rogelio",v.getRandom()));
        v.reservaAsientos(new Pasajero("Rigo",v.getRandom()));
        v.reservaAsientos(new Pasajero("Sebastian",v.getRandom()));
        sleep(500);
    } catch (Exception e) {
    }finally{
        s.release();
    }
}
}
