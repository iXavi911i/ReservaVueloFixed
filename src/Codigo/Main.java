//package Codigo;
//
//import java.util.ArrayList;
//import java.util.concurrent.Semaphore;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//
///**
// *
// * @author Xavi
// */
//public class Main extends Thread {
//    public static void main(String[] args) {
//        
//    
//        boolean asientos[] = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
//        Vuelo v = new Vuelo(asientos);
//        Semaphore s = new Semaphore(5,true);
//        
//        //5 terminales: a cada termina se asigna un bloque de pasajeros
//        Terminal1 t1 = new Terminal1(s,"Terminal 1",v);
//        Terminal2 t2 = new Terminal2(s,"Terminal 2",v);
//        Terminal2 t3 = new Terminal2(s,"Terminal 3",v);
//        Terminal2 t4 = new Terminal2(s,"Terminal 4",v);
//        Terminal2 t5 = new Terminal2(s,"Terminal 5",v);
//        
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//            t4.join();
//            t5.join();
//        } catch (Exception e) {
//        }
//        
//    }
//}