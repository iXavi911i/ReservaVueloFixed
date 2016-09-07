package Codigo;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JButton;

public class Avion extends javax.swing.JFrame {
    
    JButton[] as;
        
    public Avion() {
        as = new JButton[40];
        initComponents();
        setLocationRelativeTo(null);
        
        for (int i = 0; i < 40; i++) {
            as[i]=(new JButton("a"+i+1));
        }
        as[1].setBackground(Color.blue);
    } 

    public JButton [] getAs() {
        return as;
    }

    public  void numeroAsiento(int asiento){
        
        
        switch (asiento) {
            case 1:
                a1.setBackground(Color.RED );
                break;
            case 2:
                a2.setBackground(Color.RED );
                break;
            case 3:
                a3.setBackground(Color.RED );
                break;
            case 4:
                a4.setBackground(Color.RED );
                break;
            case 5:
                a5.setBackground(Color.RED );
                break;
            case 6:
                a6.setBackground(Color.RED );
                break;
            case 7:
                a7.setBackground(Color.RED );
                break;
            case 8:
                a8.setBackground(Color.RED );
                break;
            case 9:
                a9.setBackground(Color.RED );
                break;
            case 10:
                a10.setBackground(Color.RED );
                break;
            case 11:
                a11.setBackground(Color.RED );
                break;
            case 12:
                a12.setBackground(Color.RED );
                break;
            case 13:
                a13.setBackground(Color.RED );
                break;
            case 14:
                a14.setBackground(Color.RED );
                break;
            case 15:
                a15.setBackground(Color.RED );
                break;
            case 16:
                a16.setBackground(Color.RED );
                break;
            case 17:
                a17.setBackground(Color.RED );
                break;
            case 18:
                a18.setBackground(Color.RED );
                break;
            case 19:
                a19.setBackground(Color.RED );
                break;
            case 20:
                a20.setBackground(Color.RED );
                break;
            case 21:
                a21.setBackground(Color.RED );
                break;
            case 22:
                a22.setBackground(Color.RED );
                break;
            case 23:
                a23.setBackground(Color.RED );
                break;
            case 24:
                a24.setBackground(Color.RED );
                break;
            case 25:
                a25.setBackground(Color.RED );
                break;
            case 26:
                a26.setBackground(Color.RED );
                break;
            case 27:
                a27.setBackground(Color.RED );
                break;
            case 28:
                a28.setBackground(Color.RED );
                break;
            case 29:
                a29.setBackground(Color.RED );
                break;
            case 30:
                a30.setBackground(Color.RED );
                break;
            case 31:
                a31.setBackground(Color.RED );
                break;
            case 32:
                a32.setBackground(Color.RED );
                break;
            case 33:
                a33.setBackground(Color.RED );
                break;
            case 34:
                a34.setBackground(Color.RED );
                break;
            case 35:
                a35.setBackground(Color.RED );
                break;
            case 36:
                a36.setBackground(Color.RED );
                break;
            case 37:
                a37.setBackground(Color.RED );
                break;
            case 38:
                a38.setBackground(Color.RED );
                break;
            case 39:
                a39.setBackground(Color.RED );
                break;
            case 40:
                a40.setBackground(Color.RED );
                break;
            default:
                break;
        }
System.out.println("Comprobandoooooooooooooooooooooooooooo");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a39 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a29 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a38 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();
        a20 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a30 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        a36 = new javax.swing.JButton();
        a35 = new javax.swing.JButton();
        a28 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a34 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a27 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a37 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a26 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a40 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a25 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a39ActionPerformed(evt);
            }
        });

        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });

        a29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a29ActionPerformed(evt);
            }
        });

        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a38ActionPerformed(evt);
            }
        });

        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });

        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });

        a19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a19ActionPerformed(evt);
            }
        });

        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });

        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });

        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });

        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });

        a30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a30ActionPerformed(evt);
            }
        });

        a33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33ActionPerformed(evt);
            }
        });

        a36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a36ActionPerformed(evt);
            }
        });

        a35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a35ActionPerformed(evt);
            }
        });

        a28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a28ActionPerformed(evt);
            }
        });

        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });

        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a27ActionPerformed(evt);
            }
        });

        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a37ActionPerformed(evt);
            }
        });

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a26ActionPerformed(evt);
            }
        });

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a40ActionPerformed(evt);
            }
        });

        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a25ActionPerformed(evt);
            }
        });

        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jMenu1.setText("Simulacion");

        jMenuItem1.setText("Iniciar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
       
    }//GEN-LAST:event_a4ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a7ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a9ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a12ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a10ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a13ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a15ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a16ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a14ActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a17ActionPerformed

    private void a19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a19ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a20ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a18ActionPerformed

    private void a35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a35ActionPerformed

    private void a28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a28ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34ActionPerformed

    private void a27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a27ActionPerformed

    private void a37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a37ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24ActionPerformed

    private void a26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a26ActionPerformed

    private void a40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a40ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a22ActionPerformed

    private void a25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a25ActionPerformed

    private void a39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a39ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a21ActionPerformed

    private void a29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a29ActionPerformed

    private void a38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a38ActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a23ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a32ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a31ActionPerformed

    private void a30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a30ActionPerformed

    private void a33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a33ActionPerformed

    private void a36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a36ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        boolean asientos[] = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        Vuelo v = new Vuelo(asientos, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40);
        Semaphore s = new Semaphore(5,true);

        //5 terminales: a cada termina se asigna un bloque de pasajeros
        Terminal1 t1 = new Terminal1(s,"Terminal 1",v);
        Terminal2 t2 = new Terminal2(s,"Terminal 2",v);
        Terminal2 t3 = new Terminal2(s,"Terminal 3",v);
        Terminal2 t4 = new Terminal2(s,"Terminal 4",v);
        Terminal2 t5 = new Terminal2(s,"Terminal 5",v);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Avion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JButton a19;
    private javax.swing.JButton a2;
    private javax.swing.JButton a20;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton a23;
    private javax.swing.JButton a24;
    private javax.swing.JButton a25;
    private javax.swing.JButton a26;
    private javax.swing.JButton a27;
    private javax.swing.JButton a28;
    private javax.swing.JButton a29;
    private javax.swing.JButton a3;
    private javax.swing.JButton a30;
    private javax.swing.JButton a31;
    private javax.swing.JButton a32;
    private javax.swing.JButton a33;
    private javax.swing.JButton a34;
    private javax.swing.JButton a35;
    private javax.swing.JButton a36;
    private javax.swing.JButton a37;
    private javax.swing.JButton a38;
    private javax.swing.JButton a39;
    private javax.swing.JButton a4;
    private javax.swing.JButton a40;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
