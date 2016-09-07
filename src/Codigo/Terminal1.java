package Codigo;


import java.util.concurrent.Semaphore;

/**
 *
 * @author Xavi
 */

public class Terminal1 extends Thread {
String name;
Semaphore s;
Vuelo v;

public Terminal1(Semaphore s, String name, Vuelo v){
    this.s = s;
    this.setName(name);
    this.v = v;
}

@Override
public void run(){
    try {
        s.acquire();
        v.reservaAsientos(new Pasajero("Javier",v.getRandom()));
        v.reservaAsientos(new Pasajero("Arely",v.getRandom()));
        v.reservaAsientos(new Pasajero("Otro",v.getRandom()));
        v.reservaAsientos(new Pasajero("Alguien",v.getRandom()));
        v.reservaAsientos(new Pasajero("Felipe",v.getRandom()));
        v.reservaAsientos(new Pasajero("Lili",v.getRandom()));
        v.reservaAsientos(new Pasajero("Salem",v.getRandom()));
        v.reservaAsientos(new Pasajero("Olga",v.getRandom()));
        sleep(500);
    } catch (Exception e) {
    }finally{
        s.release();
    }
}
}
