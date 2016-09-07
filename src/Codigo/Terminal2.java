package Codigo;

import java.util.concurrent.Semaphore;
/**
 *
 * @author Xavi
 */
public class Terminal2 extends Thread {
    String name;
    Semaphore s;
    Vuelo v;
    
    public Terminal2(Semaphore s, String name, Vuelo v){
        this.s = s;
        this.setName(name);
        this.v = v;
    }
    
    @Override
    public void run(){
        try {
            s.acquire();
            v.reservaAsientos(new Pasajero("Pablo",v.getRandom()));
            v.reservaAsientos(new Pasajero("Escobar",v.getRandom()));
            v.reservaAsientos(new Pasajero("Daniel",v.getRandom()));
            v.reservaAsientos(new Pasajero("Pedro",v.getRandom()));
            v.reservaAsientos(new Pasajero("Carlos",v.getRandom()));
            v.reservaAsientos(new Pasajero("Carmelo",v.getRandom()));
            v.reservaAsientos(new Pasajero("Antonia",v.getRandom()));
            v.reservaAsientos(new Pasajero("Alonso",v.getRandom()));
            sleep(500);
        } catch (Exception e) {
        }finally{
            s.release();
        }
    }
}
