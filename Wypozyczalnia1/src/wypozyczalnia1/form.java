package wypozyczalnia1;


import java.awt.Color;
import java.sql.*;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.net.aso.g;


public class form extends javax.swing.JFrame {
    
    

    public form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wypożyczalnia - Oracle");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setText("ADMIN");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText("Hasło:");

        jButton1.setText("Zaloguj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPasswordField1.setText("pass");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Rzeszów");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Kraków");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Warszawa");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Krzysztof Ćmiel ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 397, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(499, 499, 499))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Logowanie", jPanel1);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Imie", "Nazwisko"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setText("DODAJ KLIENTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Telefon:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nazwisko:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Imię:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Rok urodzenia:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setName(""); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Miasto:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setName(""); // NOI18N

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 50)); // NOI18N
        jLabel16.setText("Dodaj klienta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel4.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Klienci", jPanel2);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Katalog aut", jPanel4);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton4.setText("Oblicz koszt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 51));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Nr vin:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Czas [d] :");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 50)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Dodaj wypożyczenie");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton5.setText("Dodaj");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("ID klienta");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setText("ID pracownika");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wypożyczenia trwające", jPanel3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 50)); // NOI18N
        jLabel17.setText("Zakończ wypożyczenie");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("ID wypożyczenia:");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setText("ID pracownika:");

        jButton6.setText("Oblicz koszt ostateczny");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Zakończ wypożyczenie");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(880, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wypożyczenia zakończone", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String funkcja_auto;
    String funkcja_wyp;
    String funkcja_zwr;
    String login;
    char[] haslo;
    int wypozyczalnia = -1;
    Boolean stanPolaczenia;
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dodaj_Klient(jTextField2.getText(), jTextField3.getText(), Integer.parseInt(jTextField4.getText()), jTextField5.getText(), Integer.parseInt(jTextField6.getText()));
        Polaczenie_Klient(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Oblicz_Cena(Integer.parseInt(jTextField9.getText()), Integer.parseInt(jTextField8.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Polaczenie_Klient();
        if(jRadioButton1.isSelected())
        {
            Polaczenie_Klient();
            Polaczenie_Auto("BEGIN :1 := SHOW_AUTO_RZESZOW(); END;");
            Polaczenie_Wypozyczenie("BEGIN :1 := SHOW_WYPOZYCZENIE_WYP_RZESZOW(); END;");
            wypozyczalnia = 1;
            Polaczenie_Zwrot("BEGIN :1 := SHOW_WYPOZYCZENIE_ZWR_RZESZOW(); END;");
            
            if(stanPolaczenia)
            {
                jLabel3.setText("Połączono z bazą Rzeszów!");
            }else
            {
                jLabel3.setForeground(Color.red);
                jLabel3.setText("Błąd połączenia!");
            }
        }else

        if(jRadioButton2.isSelected())
        {
            Polaczenie_Klient();
            Polaczenie_Auto("BEGIN :1 := SHOW_AUTO_KRAKOW(); END;");
            Polaczenie_Wypozyczenie("BEGIN :1 := SHOW_WYPOZYCZENIE_WYP_KRAKOW(); END;");
            wypozyczalnia = 2;
            Polaczenie_Zwrot("BEGIN :1 := SHOW_WYPOZYCZENIE_ZWR_KRAKOW(); END;");
            
            if(stanPolaczenia)
            {
                jLabel3.setText("Połączono z bazą Kraków!");
            }else
            {
                jLabel3.setForeground(Color.red);
                jLabel3.setText("Błąd połączenia!");
            }
        }else

        if(jRadioButton3.isSelected())
        {
            Polaczenie_Klient();
            Polaczenie_Auto("BEGIN :1 := SHOW_AUTO_WARSZAWA(); END;");
            Polaczenie_Wypozyczenie("BEGIN :1 := SHOW_WYPOZYCZENIE_WYP_WARSZAWA(); END;");
            wypozyczalnia = 3;
            Polaczenie_Zwrot("BEGIN :1 := SHOW_WYPOZYCZENIE_ZWR_WARSZAWA(); END;");
            
            if(stanPolaczenia)
            {
                jLabel3.setText("Połączono z bazą Warszawa!");
            }else
            {
                jLabel3.setForeground(Color.red);
                jLabel3.setText("Błąd połączenia!");
            }
        }else
        {
            jLabel3.setText("Wybierz wypożyczalnię!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Dodaj_Wypozyczenie(Integer.parseInt(jTextField9.getText()), Integer.parseInt(jTextField10.getText()), wypozyczalnia,  Integer.parseInt(jTextField11.getText()), Integer.parseInt(jTextField8.getText()));
        //Odswiez_Wypozyczenie("BEGIN :1 := SHOW_WYPOZYCZENIE_WYP_RZESZOW(); END;");
        Odswiez_Wypozyczenie(funkcja_wyp);
        Odswiez_Auto(funkcja_auto);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Oblicz_Koszt(Integer.parseInt(jTextField7.getText()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Dodaj_Zwrot(Integer.parseInt(jTextField7.getText()), Integer.parseInt(jTextField12.getText()));
        Odswiez_Zwrot(funkcja_zwr);
        Odswiez_Wypozyczenie(funkcja_wyp);
        Odswiez_Auto(funkcja_auto);
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    
    

    
    void Dodaj_Klient(String imie, String nazwisko, int tel, String miasto, int rok)
    {
        try
        {
        String QueryDodaj = "{call ADD_KLIENT (?,?,?,?,?)}";
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
        PreparedStatement pst = con.prepareCall(QueryDodaj);
        pst.setString(1, imie);
        pst.setString(2, nazwisko);
        pst.setInt(3, tel);
        pst.setString(4, miasto);
        pst.setInt(5, rok);
        pst.execute();
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog (jPanel1, "Błąd dodawania klienta!", "Błąd!",JOptionPane.WARNING_MESSAGE);
            } 
    }
    void Dodaj_Wypozyczenie(int vin,int klient,int wypozyczalnia,int pracownik, int dni)
    {
        try
        {
        String QueryDodaj = "{call ADD_WYPOZYCZENIE(?,?,?,?,?)}";
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
        PreparedStatement pst = con.prepareCall(QueryDodaj);
        pst.setInt(1, vin);
        pst.setInt(2, klient);
        pst.setInt(3, wypozyczalnia);
        pst.setInt(4, pracownik);
        pst.setInt(5, dni);
        pst.execute();
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog (jPanel1, "Sprawdź stan, ubezpieczenie oraz przegląd wypożyczanego auta!", "Błąd!",JOptionPane.WARNING_MESSAGE);
            } 
    }
    void Dodaj_Zwrot(int id_wyp, int id_prac)
    {
        try
        {
        String QueryDodaj = "{call ADD_ZWROT(?,?)}";
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
        PreparedStatement pst = con.prepareCall(QueryDodaj);
        pst.setInt(1, id_wyp);
        pst.setInt(2, id_prac);
        pst.execute();
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog (jPanel1, "Sprawdź pola 'ID wypożyczenia' oraz 'ID pracownika'", "Błąd!",JOptionPane.WARNING_MESSAGE);
            } 
    }
    void Dodaj_Auto(String imie, String nazwisko, int tel, String miasto, int rok)
    {
        try
        {
        String QueryDodaj = "{call ADD_KLIENT (?,?,?,?,?)}";
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
        PreparedStatement pst = con.prepareCall(QueryDodaj);
        pst.setString(1, imie);
        pst.setString(2, nazwisko);
        pst.setInt(3, tel);
        pst.setString(4, miasto);
        pst.setInt(5, rok);
        pst.execute();
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog (jPanel1, "Błąd dodawania klienta!", "Błąd!",JOptionPane.WARNING_MESSAGE);
            } 
    }
    void Oblicz_Cena(int nr_vin, int ile_dni)
    {
       try
       {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));

            CallableStatement ocstAuto =  con.prepareCall("{? = call CENA_WYPOZYCZENIE(?,?)}");
                    ocstAuto.registerOutParameter(1, OracleTypes.NUMBER);
                    ocstAuto.setInt(2, nr_vin);
                    ocstAuto.setInt(3, ile_dni);
                    ocstAuto.execute();
           int cenaa = ocstAuto.getInt(1);
            jLabel13.setText("Koszt = " + ocstAuto.getString(1) + " zł");
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd obliczania ceny wypożyczenia! Sprawdź czy pola 'nr vin' oraz 'czas' zostały prawidłowo wypełnione.", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Oblicz_Koszt(int id_wyp)
    {
       try
       {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));

            CallableStatement ocstAuto =  con.prepareCall("{? = call CENA_ZWROT(?)}");
                    ocstAuto.registerOutParameter(1, OracleTypes.NUMBER);
                    ocstAuto.setInt(2, id_wyp);
                    ocstAuto.execute();
           int cenaa = ocstAuto.getInt(1);
            jLabel20.setText("Koszt wypożyczenia jest równy: " + ocstAuto.getString(1) + " zł");
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd obliczania kosztów wypożyczenia! Sprawdź czy pola 'ID wypożyczenia' oraz 'id_pracownika' zostały prawidłowo wypełnione.", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Polaczenie()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", jTextField1.getText() , String.valueOf(jPasswordField1.getPassword()));
            OracleCallableStatement ocstKlient = (OracleCallableStatement) con.prepareCall("BEGIN :1 := SHOW_KLIENT(); END;");
                    ocstKlient.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstKlient.execute();
            ResultSet rsKlient = ocstKlient.getCursor(1);
            jTable1.setModel(DbUtils.resultSetToTableModel(rsKlient));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall("BEGIN :1 := SHOW_AUTO1(); END;");
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable2.setModel(DbUtils.resultSetToTableModel(rsAuto));
            login = jTextField1.getText();
            haslo = jPasswordField1.getPassword();
            System.out.println(haslo);
            stanPolaczenia = true;
            
            con.close();
        }
        catch(Exception e)
        {
            stanPolaczenia = false;
        }    
    }
    void Polaczenie_Klient()
    {
      try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", jTextField1.getText() , String.valueOf(jPasswordField1.getPassword()));
            OracleCallableStatement ocst = (OracleCallableStatement) con.prepareCall("BEGIN :1 := SHOW_KLIENT(); END;");
                    ocst.registerOutParameter(1, OracleTypes.CURSOR);
                    ocst.execute();
            ResultSet rs = ocst.getCursor(1);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            login = jTextField1.getText();
            haslo = jPasswordField1.getPassword();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(jPanel1, "Błąd wczytywania spisu klientów!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }  
    } 
    void Polaczenie_Auto(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", jTextField1.getText() , String.valueOf(jPasswordField1.getPassword()));
            OracleCallableStatement ocst = (OracleCallableStatement) con.prepareCall(func);
                    ocst.registerOutParameter(1, OracleTypes.CURSOR);
                    ocst.execute();
            ResultSet rs = ocst.getCursor(1);
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            funkcja_auto = func;
            login = jTextField1.getText();
            haslo = jPasswordField1.getPassword();
            stanPolaczenia = true;
            con.close();
        }
        catch(Exception e)
        {
            stanPolaczenia = false;
            JOptionPane.showMessageDialog (jPanel1, "Błąd wczytywania katalogu aut!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Odswiez_Auto(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall(func);
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable2.setModel(DbUtils.resultSetToTableModel(rsAuto));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd odświeżania katalogu aut!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Polaczenie_Wypozyczenie(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  jTextField1.getText() , String.valueOf(jPasswordField1.getPassword()));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall(func);
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable3.setModel(DbUtils.resultSetToTableModel(rsAuto));
            jLabel3.setText("Połączono!");
            funkcja_wyp = func;
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd wczytywania wypożyczeń!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Odswiez_Wypozyczenie(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall(func);
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable3.setModel(DbUtils.resultSetToTableModel(rsAuto));
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd odświeżania wypożyczeń!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    void Polaczenie_Zwrot(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  jTextField1.getText() , String.valueOf(jPasswordField1.getPassword()));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall(func);
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable4.setModel(DbUtils.resultSetToTableModel(rsAuto));
            jLabel3.setText("Połączono!");
            funkcja_zwr = func;
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd wczytywania historii wypożyczeń!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    } 
    void Odswiez_Zwrot(String func)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", login, String.valueOf(haslo));
            OracleCallableStatement ocstAuto = (OracleCallableStatement) con.prepareCall(func);
                    ocstAuto.registerOutParameter(1, OracleTypes.CURSOR);
                    ocstAuto.execute();
            ResultSet rsAuto = ocstAuto.getCursor(1);
            jTable4.setModel(DbUtils.resultSetToTableModel(rsAuto));
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (jPanel1, "Błąd odświeżania historii wypożyczeń!", "Błąd!",JOptionPane.WARNING_MESSAGE);
        }    
    }
    
    
    
    
    
    

    
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    
    

}
