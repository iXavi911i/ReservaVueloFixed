package Codigo;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Xavi
 */
public class Vuelo extends JFrame {
    boolean asientosDisponibles[];
    int asiento;
    Color colorT;
    Avion avion =new Avion();
    //JButton
    JButton a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40;

    public Vuelo(boolean asientosDisponibles[], JButton a1, JButton a2, JButton a3, JButton a4, JButton a5, JButton a6, JButton a7, JButton a8, JButton a9, JButton a10, JButton a11, JButton a12, JButton a13, JButton a14, JButton a15, JButton a16, JButton a17, JButton a18, JButton a19, JButton a20, JButton a21, JButton a22, JButton a23, JButton a24, JButton a25, JButton a26, JButton a27, JButton a28, JButton a29, JButton a30, JButton a31, JButton a32, JButton a33, JButton a34, JButton a35, JButton a36, JButton a37, JButton a38, JButton a39, JButton a40) {
        this.asientosDisponibles=asientosDisponibles;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a17 = a17;
        this.a18 = a18;
        this.a19 = a19;
        this.a20 = a20;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a24 = a24;
        this.a25 = a25;
        this.a26 = a26;
        this.a27 = a27;
        this.a28 = a28;
        this.a29 = a29;
        this.a30 = a30;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;
        this.a34 = a34;
        this.a35 = a35;
        this.a36 = a36;
        this.a37 = a37;
        this.a38 = a38;
        this.a39 = a39;
        this.a40 = a40;
    }
    
            
    synchronized void reservaAsientos(Pasajero p)
    {
        System.out.println(Thread.currentThread().getName() + " entrando.");
        if (asientosDisponibles[p.asiento])
        {
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println("Asiento " + p.asiento + " reservado por " + p.nombre + " en " + Thread.currentThread().getName());
            asiento=p.asiento;
            numeroAsiento(asiento, Thread.currentThread().getName());
            asientosDisponibles[p.asiento]=false;
        }
        else
        {
            System.out.println("Asiento " + p.asiento + " no disponible para " + p.nombre);
        }
        System.out.println(Thread.currentThread().getName() + " saliendo.");
        System.out.println("----------------------------------------------");
    }
    
    synchronized int getRandom(){
        return new Random().nextInt(asientosDisponibles.length);
    }
    
    public  void numeroAsiento(int asiento, String terminal){
        colorTerminal(terminal);
        switch (asiento) {
            case 1:
                a1.setBackground(colorT );
                break;
            case 2:
                a2.setBackground(colorT );
                break;
            case 3:
                a3.setBackground(colorT );
                break;
            case 4:
                a4.setBackground(colorT );
                break;
            case 5:
                a5.setBackground(colorT );
                break;
            case 6:
                a6.setBackground(colorT );
                break;
            case 7:
                a7.setBackground(colorT );
                break;
            case 8:
                a8.setBackground(colorT );
                break;
            case 9:
                a9.setBackground(colorT );
                break;
            case 10:
                a10.setBackground(colorT );
                break;
            case 11:
                a11.setBackground(colorT );
                break;
            case 12:
                a12.setBackground(colorT );
                break;
            case 13:
                a13.setBackground(colorT );
                break;
            case 14:
                a14.setBackground(colorT );
                break;
            case 15:
                a15.setBackground(colorT );
                break;
            case 16:
                a16.setBackground(colorT );
                break;
            case 17:
                a17.setBackground(colorT );
                break;
            case 18:
                a18.setBackground(colorT );
                break;
            case 19:
                a19.setBackground(colorT );
                break;
            case 20:
                a20.setBackground(colorT );
                break;
            case 21:
                a21.setBackground(colorT );
                break;
            case 22:
                a22.setBackground(colorT );
                break;
            case 23:
                a23.setBackground(colorT );
                break;
            case 24:
                a24.setBackground(colorT );
                break;
            case 25:
                a25.setBackground(colorT );
                break;
            case 26:
                a26.setBackground(colorT );
                break;
            case 27:
                a27.setBackground(colorT );
                break;
            case 28:
                a28.setBackground(colorT );
                break;
            case 29:
                a29.setBackground(colorT );
                break;
            case 30:
                a30.setBackground(colorT );
                break;
            case 31:
                a31.setBackground(colorT );
                break;
            case 32:
                a32.setBackground(colorT );
                break;
            case 33:
                a33.setBackground(colorT );
                break;
            case 34:
                a34.setBackground(colorT );
                break;
            case 35:
                a35.setBackground(colorT );
                break;
            case 36:
                a36.setBackground(colorT );
                break;
            case 37:
                a37.setBackground(colorT );
                break;
            case 38:
                a38.setBackground(colorT );
                break;
            case 39:
                a39.setBackground(colorT );
                break;
            case 40:
                a40.setBackground(colorT );
                break;
            default:
                break;
        }
    }
    
    public void colorTerminal(String terminal){
        switch (terminal) {
            case "Terminal 1":
                colorT= Color.BLACK;
                break;
            case "Terminal 2":
                colorT= Color.BLUE;
                break;
            case "Terminal 3":
                colorT= Color.GREEN;
                break;
            case "Terminal 4":
                colorT= Color.MAGENTA;
                break;
            case "Terminal 5":
                colorT= Color.RED;
                break;
            default:
                break;
        }
        
    }
            
}
