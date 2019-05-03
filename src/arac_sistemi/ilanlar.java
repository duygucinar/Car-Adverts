/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arac_sistemi;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uset
 */
public class ilanlar extends javax.swing.JFrame {

    Object satirlar[]= new Object[11];
    static int sayac=0,sayac2=0,sayac3=0,sayac4=0,sayac5=0,sayac6=0,sayac7=0,sayac8=0,sayac9=0,sayac10=0,sayac11=0,sayac12=0,sayac13=0,sayac14=0,sayac15=0;
    baglanti bg = new baglanti();
  //  String sql = "select * from ilan,araba,renkler,sehirler,vites,yakit where ";
    
    public ilanlar() throws SQLException {
        this.setResizable(false);
        this.setLocation(250, 200);
        this.setTitle("İLAN LİSTELEME");
        this.setVisible(true);
        initComponents();
        myInitComponents();
        
        
    }
    
    public void myInitComponents() throws SQLException{
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        
        tablo.setRowCount(0);
        marka.removeAllItems();
        vites.removeAllItems();
        yakit.removeAllItems();
        renk.removeAllItems();
        sehir.removeAllItems();
        
        bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id order by ilan_id");
        while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
        }
        
        listeleme_turu.setText("İlan ID");
        
        bg.myRs = bg.myStat.executeQuery("select distinct araba_marka from araba");
        
        marka.addItem("Hepsi");
        while(bg.myRs.next()){
            marka.addItem(bg.myRs.getString("araba_marka"));
        }
        
        bg.myRs = bg.myStat.executeQuery("select vites_turu from vites");
        
        vites.addItem("Hepsi");
        while(bg.myRs.next()){
            vites.addItem(bg.myRs.getString("vites_turu"));
        }
              
        bg.myRs = bg.myStat.executeQuery("select yakit_turu from yakit");
        
        yakit.addItem("Hepsi");
        while(bg.myRs.next()){
            yakit.addItem(bg.myRs.getString("yakit_turu"));
        }

        bg.myRs = bg.myStat.executeQuery("select renk from renkler");
        
        renk.addItem("Hepsi");
        while(bg.myRs.next()){
            renk.addItem(bg.myRs.getString("renk"));
        }
        
        bg.myRs = bg.myStat.executeQuery("select sehir from sehirler");
        
        sehir.addItem("Hepsi");
        while(bg.myRs.next()){
            sehir.addItem(bg.myRs.getString("sehir"));
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        marka = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        model = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        vites = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        yakit = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        renk = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        sehir = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tarih = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        kmMin = new javax.swing.JTextField();
        kmMax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fmin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fmax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ara = new javax.swing.JTextField();
        bir_onceki = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        marka_listele = new javax.swing.JButton();
        model_listele = new javax.swing.JButton();
        vites_listele = new javax.swing.JButton();
        yakit_listele = new javax.swing.JButton();
        renk_listele = new javax.swing.JButton();
        sehir_listele = new javax.swing.JButton();
        tarih_listele = new javax.swing.JButton();
        km_listele = new javax.swing.JButton();
        fiyat_listele = new javax.swing.JButton();
        ara_listele = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        listeleme_turu = new javax.swing.JTextField();
        tumunu_listele = new javax.swing.JButton();
        filtrele = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İLAN ID", "İLAN ADI", "ARABA MARKA", "ARABA MODEL", "VİTES TÜRÜ", "YAKIT TÜRÜ", "RENK", "KM", "FİYAT", "ŞEHİR", "TARİH"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("MARKA :");

        marka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markaActionPerformed(evt);
            }
        });

        jLabel2.setText("MODEL :");

        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

        jLabel3.setText("VİTES TÜRÜ:");

        vites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitesActionPerformed(evt);
            }
        });

        jLabel4.setText("YAKIT TÜRÜ:");

        yakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitActionPerformed(evt);
            }
        });

        jLabel5.setText("RENK :");

        renk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkActionPerformed(evt);
            }
        });

        jLabel6.setText("ŞEHİR :");

        sehir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehirActionPerformed(evt);
            }
        });

        jLabel7.setText("TARİH :");

        tarih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belirsiz", "Son 24 Saat", "Son 1 Hafta", "Son 1 Ay" }));
        tarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarihActionPerformed(evt);
            }
        });

        jLabel8.setText("KM :");

        jLabel9.setText("-");

        jLabel10.setText("FİYAT :");

        jLabel11.setText("-");

        jLabel12.setText("ARA :");

        bir_onceki.setText("Bir Önceki Menü");
        bir_onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_oncekiActionPerformed(evt);
            }
        });

        cikis.setText("Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        marka_listele.setText("Göster");
        marka_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marka_listeleActionPerformed(evt);
            }
        });

        model_listele.setText("Göster");
        model_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                model_listeleActionPerformed(evt);
            }
        });

        vites_listele.setText("Göster");
        vites_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vites_listeleActionPerformed(evt);
            }
        });

        yakit_listele.setText("Göster");
        yakit_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakit_listeleActionPerformed(evt);
            }
        });

        renk_listele.setText("Göster");
        renk_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renk_listeleActionPerformed(evt);
            }
        });

        sehir_listele.setText("Göster");
        sehir_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir_listeleActionPerformed(evt);
            }
        });

        tarih_listele.setText("Göster");
        tarih_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarih_listeleActionPerformed(evt);
            }
        });

        km_listele.setText("Göster");
        km_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                km_listeleActionPerformed(evt);
            }
        });

        fiyat_listele.setText("Göster");
        fiyat_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyat_listeleActionPerformed(evt);
            }
        });

        ara_listele.setText("Ara");
        ara_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_listeleActionPerformed(evt);
            }
        });

        jLabel13.setText("Listeleme Türü :");

        tumunu_listele.setText("Tümünü Listele");
        tumunu_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumunu_listeleActionPerformed(evt);
            }
        });

        filtrele.setText("Filtrele");
        filtrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listeleme_turu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kmMin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(kmMax, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fmin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fmax, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiyat_listele)
                                    .addComponent(km_listele)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(bir_onceki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marka_listele)
                                            .addComponent(model_listele)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(yakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yakit_listele)
                                            .addComponent(vites_listele)
                                            .addComponent(renk_listele)
                                            .addComponent(sehir_listele)
                                            .addComponent(tarih_listele)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tumunu_listele)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(filtrele)))))))
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(ara_listele)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marka_listele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model_listele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vites_listele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(yakit_listele))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(renk_listele))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sehir_listele))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tarih_listele))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(kmMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(km_listele))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(fmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(fiyat_listele))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_listele)
                        .addGap(37, 37, 37)
                        .addComponent(filtrele)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tumunu_listele))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(listeleme_turu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bir_onceki)
                            .addComponent(cikis))
                        .addContainerGap())))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markaActionPerformed
        baglanti bg = new baglanti();
        
        model.removeAllItems();
        model.addItem("Hepsi");
        try {
            if(marka.getSelectedIndex()!=marka.getItemCount()){

                bg.myRs = bg.myStat.executeQuery("select distinct araba_model from araba where araba_marka='"+marka.getItemAt(marka.getSelectedIndex())+"'");

                while(bg.myRs.next()){
                    model.addItem(bg.myRs.getString("araba_model"));
                }
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_markaActionPerformed

    private void bir_oncekiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_oncekiActionPerformed
        this.setVisible(false);
        veri_listeleme frame = new veri_listeleme();
    }//GEN-LAST:event_bir_oncekiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    private void marka_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marka_listeleActionPerformed

        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac++;
        
        
        
        if(sayac%18==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by araba_model");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by araba_model desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac%18==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by vites_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by vites_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by yakit_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by yakit_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by renk");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by renk desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by sehir");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by sehir desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==16){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac%18==17){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac%18==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_marka_listeleActionPerformed

    private void model_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_model_listeleActionPerformed
       DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac2++;
        
        if(sayac2%16==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by vites_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac2%16==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by vites_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by yakit_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by yakit_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by renk");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by renk desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by sehir");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by sehir desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac2%16==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_model='"+model.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_model_listeleActionPerformed

    private void vites_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vites_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac3++;
        
        if(sayac3%18==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by araba_marka");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by araba_marka desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac3%18==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by araba_model");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by araba_model desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by yakit_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by yakit_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by renk");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by renk desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by sehir");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by sehir desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==16){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac3%18==17){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac3%18==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and vites_turu='"+vites.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_vites_listeleActionPerformed

    private void yakit_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakit_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac4++;
        
        if(sayac4%18==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by araba_marka");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by araba_marka desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac4%18==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by araba_model");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by araba_model desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by vites_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by vites_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by renk");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by renk desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by sehir");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by sehir desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==16){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac4%18==17){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac4%18==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_yakit_listeleActionPerformed

    private void renk_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renk_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac5++;
        
        if(sayac5%18==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by araba_marka");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by araba_marka desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac5%18==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by araba_model");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by araba_model desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by vites_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by vites_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by yakit_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by yakit_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by sehir");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by sehir desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Şehir (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==16){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac5%18==17){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac5%18==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and renk='"+renk.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_renk_listeleActionPerformed

    private void sehir_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac6++;
        
        if(sayac6%18==1){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by araba_marka");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==2){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by araba_marka desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Marka (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(sayac6%18==3){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by araba_model");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==4){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by araba_model desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Model (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==5){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by vites_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==6){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by vites_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Vites Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==7){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by yakit_turu");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==8){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by yakit_turu desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==9){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_km");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==10){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_km desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("km Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==11){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_fiyat");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==12){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_fiyat desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Fiyat Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==13){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by renk");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==14){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by renk desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Renk (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==15){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_tarih");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Artan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==16){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_tarih desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("Tarih Azalan");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(sayac6%18==17){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_adi");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (A-Z)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(sayac6%18==0){
            try {
                bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and sehir='"+sehir.getSelectedItem()+"' order by ilan_adi desc");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                    listeleme_turu.setText("İlan Adı (Z-A)");
            } catch (SQLException ex) {
                Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_sehir_listeleActionPerformed

    private void tarih_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarih_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        
        SimpleDateFormat bicim =new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date zaman = new Date();
        Calendar cal = Calendar.getInstance();
        
        if(tarih.getSelectedIndex()==1){
            cal.add(Calendar.DATE, -1);
            sayac7++;
            
            if(sayac7%18==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka");
                    listeleme_turu.setText("Marka (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==2){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka desc");
                    listeleme_turu.setText("Marka (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==3){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model");
                    listeleme_turu.setText("Model (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==4){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model desc");
                    listeleme_turu.setText("Model (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==5){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu");
                    listeleme_turu.setText("Vites Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==6){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu desc");
                    listeleme_turu.setText("Vites Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==7){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu");
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==8){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu desc");
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==9){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk");
                    listeleme_turu.setText("Renk (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==10){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk desc");
                    listeleme_turu.setText("Renk (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==11){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km");
                    listeleme_turu.setText("km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==12){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km desc");
                    listeleme_turu.setText("km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==13){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==14){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==15){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir");
                    listeleme_turu.setText("Şehir (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==16){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir desc");
                    listeleme_turu.setText("Şehir (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac7%18==17){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
                    listeleme_turu.setText("İlan Adı (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac7%18==0){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi desc");
                    listeleme_turu.setText("İlan Adı (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        else if(tarih.getSelectedIndex()==2){
            cal.add(Calendar.DATE, -7);
            sayac8++;
            
            if(sayac8%18==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka");
                    listeleme_turu.setText("Marka (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==2){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka desc");
                    listeleme_turu.setText("Marka (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==3){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model");
                    listeleme_turu.setText("Model (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==4){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model desc");
                    listeleme_turu.setText("Model (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==5){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu");
                    listeleme_turu.setText("Vites Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==6){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu desc");
                    listeleme_turu.setText("Vites Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==7){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu");
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==8){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu desc");
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==9){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk");
                    listeleme_turu.setText("Renk (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==10){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk desc");
                    listeleme_turu.setText("Renk (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==11){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km");
                    listeleme_turu.setText("km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==12){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km desc");
                    listeleme_turu.setText("km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==13){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==14){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==15){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir");
                    listeleme_turu.setText("Şehir (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==16){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir desc");
                    listeleme_turu.setText("Şehir (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac8%18==17){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
                    listeleme_turu.setText("İlan Adı (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac8%18==0){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi desc");
                    listeleme_turu.setText("İlan Adı (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        else if(tarih.getSelectedIndex()==3){
            cal.add(Calendar.DATE, -30);
            sayac9++;
            
            if(sayac9%18==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka");
                    listeleme_turu.setText("Marka (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==2){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_marka desc");
                    listeleme_turu.setText("Marka (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==3){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model");
                    listeleme_turu.setText("Model (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==4){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by araba_model desc");
                    listeleme_turu.setText("Model (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==5){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu");
                    listeleme_turu.setText("Vites Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==6){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by vites_turu desc");
                    listeleme_turu.setText("Vites Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==7){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu");
                    listeleme_turu.setText("Yakıt Türü (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==8){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by yakit_turu desc");
                    listeleme_turu.setText("Yakıt Türü (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==9){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk");
                    listeleme_turu.setText("Renk (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==10){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by renk desc");
                    listeleme_turu.setText("Renk (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==11){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km");
                    listeleme_turu.setText("km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==12){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_km desc");
                    listeleme_turu.setText("km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==13){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==14){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==15){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir");
                    listeleme_turu.setText("Şehir (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==16){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by sehir desc");
                    listeleme_turu.setText("Şehir (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(sayac9%18==17){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
                    listeleme_turu.setText("İlan Adı (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(sayac9%18==0){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_id,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi desc");
                    listeleme_turu.setText("İlan Adı (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }

                }catch (SQLException ex) {
                    Logger.getLogger(ilan_listeleme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }//GEN-LAST:event_tarih_listeleActionPerformed

    private void km_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_km_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        
        if(!"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText())){
            sayac10++;
            if(sayac10%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" order by ilan_km");
                    listeleme_turu.setText("Km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" order by ilan_km desc");
                    listeleme_turu.setText("Km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(!"-".equals(kmMin.getText())){
            sayac11++;
            if(sayac11%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km>"+Integer.parseInt(kmMin.getText())+" order by ilan_km");
                    listeleme_turu.setText("Km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km>"+Integer.parseInt(kmMin.getText())+" order by ilan_km desc");
                    listeleme_turu.setText("Km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        else if(!"-".equals(kmMax.getText())){
            sayac12++;
            if(sayac12%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km<"+Integer.parseInt(kmMax.getText())+" order by ilan_km");
                    listeleme_turu.setText("Km Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_km<"+Integer.parseInt(kmMax.getText())+" order by ilan_km desc");
                    listeleme_turu.setText("Km Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_km_listeleActionPerformed

    private void fiyat_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyat_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        
        if(!"-".equals(fmin.getText()) && !"-".equals(fmax.getText())){
            sayac12++;
            if(sayac12%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(!"-".equals(fmin.getText())){
            sayac13++;
            if(sayac13%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat>"+fmin.getText()+" order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat>"+fmin.getText()+" order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        else if(!"-".equals(fmax.getText())){
            sayac14++;
            if(sayac14%2==1){
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat<"+fmax.getText()+" order by ilan_fiyat");
                    listeleme_turu.setText("Fiyat Artan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_fiyat<"+fmax.getText()+" order by ilan_fiyat desc");
                    listeleme_turu.setText("Fiyat Azalan");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_fiyat_listeleActionPerformed

    private void ara_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_listeleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        sayac15++;
        
        if(sayac15%2==1){
            try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_adi like '%"+ara.getText()+"%' order by ilan_adi");
                    listeleme_turu.setText("İlan Adı (A-Z)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else{
            try {
                    bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and ilan_adi like '%"+ara.getText()+"%' order by ilan_adi desc");
                    listeleme_turu.setText("İlan Adı (Z-A)");
                    while(bg.myRs.next()){
                        satirlar[0]=bg.myRs.getString("ilan_id");
                        satirlar[1]=bg.myRs.getString("ilan_adi");
                        satirlar[2]=bg.myRs.getString("araba_marka");
                        satirlar[3]=bg.myRs.getString("araba_model");
                        satirlar[4]=bg.myRs.getString("vites_turu");
                        satirlar[5]=bg.myRs.getString("yakit_turu");
                        satirlar[6]=bg.myRs.getString("renk");
                        satirlar[7]=bg.myRs.getString("ilan_km");
                        satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                        satirlar[9]=bg.myRs.getString("sehir");
                        satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                        tablo.addRow(satirlar);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_ara_listeleActionPerformed

    private void tumunu_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumunu_listeleActionPerformed
        try {
            myInitComponents();
        } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tumunu_listeleActionPerformed

    private void filtreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreleActionPerformed
        DefaultTableModel tablo = (DefaultTableModel)table.getModel();
        tablo.setRowCount(0);
        
        SimpleDateFormat bicim =new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date zaman = new Date();
        Calendar cal = Calendar.getInstance();
        
        String sql = "select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id ";
        
        if(marka.getSelectedIndex()!=0){
            sql = sql + " and araba_marka = '"+marka.getSelectedItem()+"'";
        }
        
        if(model.getSelectedIndex()!=0){
            sql = sql + " and araba_model= '"+model.getSelectedItem()+"'";
        }
        
        if(vites.getSelectedIndex()!=0){
            sql = sql + " and vites_turu = '"+vites.getSelectedItem()+"'";
        }
        
        if(yakit.getSelectedIndex()!=0){
            sql = sql + " and yakit_turu = '"+yakit.getSelectedItem()+"'";
        }
        
        if(renk.getSelectedIndex()!=0){
            sql = sql + " and renk = '"+renk.getSelectedItem()+"'";
        }
        
        if(sehir.getSelectedIndex()!=0){
            sql = sql + " and sehir = '"+sehir.getSelectedItem()+"'";
        }
        
        if(tarih.getSelectedIndex()==1){
            cal.add(Calendar.DATE, -1);
            sql = sql + " and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+bicim.format(zaman)+"'";
        }
        
        else if(tarih.getSelectedIndex()==2){
            cal.add(Calendar.DATE, -7);
            sql = sql + " and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+bicim.format(zaman)+"'";
        }
        
        else if(tarih.getSelectedIndex()==3){
            cal.add(Calendar.DATE, -30);
            sql = sql + " and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+bicim.format(zaman)+"'";
        }
        
        if(kmMin.getText()!="-" && kmMax.getText()!="-"){
            sql= sql + " and ilan_km between "+kmMin.getText()+" and "+kmMax.getText();
        }
        else if(kmMin.getText()!="-"){
            sql = sql + " and ilan_km>="+kmMin.getText();
        }
        else if(kmMax.getText()!="-"){
            sql = sql + " and ilan_km<="+kmMax.getText();
        }
        
        if(fmin.getText()!="-" && fmax.getText()!="-"){
            sql = sql + " and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText();
        }
        
        else if(fmin.getText()!="-"){
            sql = sql + " and ilan_fiyat>="+fmin.getText();
        }
        
        else if(fmax.getText()!="-"){
            sql = sql + " and ilan_fiyat<="+fmax.getText();
        }
        
        if(ara.getText()!="-"){
            sql = sql + " and ilan_adi like %"+ara.getText()+"%";
        }
     //   System.out.println(sql);
        try {
            bg.myRs = bg.myStat.executeQuery(sql);
            
            while(bg.myRs.next()){
                satirlar[0]=bg.myRs.getString("ilan_id");
                satirlar[1]=bg.myRs.getString("ilan_adi");
                satirlar[2]=bg.myRs.getString("araba_marka");
                satirlar[3]=bg.myRs.getString("araba_model");
                satirlar[4]=bg.myRs.getString("vites_turu");
                satirlar[5]=bg.myRs.getString("yakit_turu");
                satirlar[6]=bg.myRs.getString("renk");
                satirlar[7]=bg.myRs.getString("ilan_km");
                satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
                satirlar[9]=bg.myRs.getString("sehir");
                satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
                tablo.addRow(satirlar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
        }    
            
            // System.out.println(sql);
            
            /* if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText()) && !"-".equals(ara.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi asc");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between'"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi asc");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between'"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi asc");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(ara.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi asc");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText()) && !"-".equals(ara.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText()) && !"-".equals(ara.getText())){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText()) && !"-".equals(ara.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText()) && !"-".equals(ara.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_adi like '%"+ara.getText()+"%' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText()) && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(kmMin.getText()) && !"-".equals(kmMax.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_km between "+kmMin.getText()+" and "+kmMax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0 && !"-".equals(fmin.getText()) && !"-".equals(fmax.getText())){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_fiyat between "+fmin.getText()+" and "+fmax.getText()+" and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0 && tarih.getSelectedIndex()!=0){
            if(tarih.getSelectedIndex()==1){
            
            cal.add(Calendar.DATE, -1);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==2){
            
            cal.add(Calendar.DATE, -7);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(tarih.getSelectedIndex()==3){
            
            cal.add(Calendar.DATE, -30);
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"' and ilan_tarih between '"+bicim.format(cal.getTime())+"' and '"+(bicim.format(zaman))+"' order by ilan_adi");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0 && sehir.getSelectedIndex()!=0){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"' and sehir='"+sehir.getSelectedItem()+"'");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0 && renk.getSelectedIndex()!=0){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"' and renk='"+renk.getSelectedItem()+"'");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0 && yakit.getSelectedIndex()!=0){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"' and yakit_turu='"+yakit.getSelectedItem()+"'");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(model.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and araba_marka='"+marka.getSelectedItem()+"' and araba_model='"+model.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"'");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            else if(yakit.getSelectedIndex()!=0 && vites.getSelectedIndex()!=0){
            listeleme_turu.setText("İlan Adı (A-Z)");
            try {
            bg.myRs = bg.myStat.executeQuery("select ilan_ID,ilan_adi,araba_marka,araba_model,vites_turu,yakit_turu,renk,ilan_fiyat,ilan_km,ilan_tarih,sehir from araba,ilan,renkler,sehirler,vites,yakit where ilan_arabaid=araba_id and ilan_sehirid=sehir_id and araba_vitesturuid=vitesturu_id and araba_yakitturuid=yakitturu_id and araba_renkid=renk_id and yakit_turu='"+yakit.getSelectedItem()+"' and vites_turu='"+vites.getSelectedItem()+"'");
            while(bg.myRs.next()){
            satirlar[0]=bg.myRs.getString("ilan_id");
            satirlar[1]=bg.myRs.getString("ilan_adi");
            satirlar[2]=bg.myRs.getString("araba_marka");
            satirlar[3]=bg.myRs.getString("araba_model");
            satirlar[4]=bg.myRs.getString("vites_turu");
            satirlar[5]=bg.myRs.getString("yakit_turu");
            satirlar[6]=bg.myRs.getString("renk");
            satirlar[7]=bg.myRs.getString("ilan_km");
            satirlar[8]=bg.myRs.getString("ilan_fiyat")+" TL";
            satirlar[9]=bg.myRs.getString("sehir");
            satirlar[10]=bg.myRs.getTimestamp("ilan_tarih");
            tablo.addRow(satirlar);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            */
        
        
        
    }//GEN-LAST:event_filtreleActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        
    }//GEN-LAST:event_modelActionPerformed

    private void vitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vitesActionPerformed

    private void yakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yakitActionPerformed

    private void renkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renkActionPerformed

    private void sehirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sehirActionPerformed

    private void tarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarihActionPerformed


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
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ilanlar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ara;
    private javax.swing.JButton ara_listele;
    private javax.swing.JButton bir_onceki;
    private javax.swing.JButton cikis;
    private javax.swing.JButton filtrele;
    private javax.swing.JButton fiyat_listele;
    private javax.swing.JTextField fmax;
    private javax.swing.JTextField fmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kmMax;
    private javax.swing.JTextField kmMin;
    private javax.swing.JButton km_listele;
    private javax.swing.JTextField listeleme_turu;
    private javax.swing.JComboBox<String> marka;
    private javax.swing.JButton marka_listele;
    private javax.swing.JComboBox<String> model;
    private javax.swing.JButton model_listele;
    private javax.swing.JComboBox<String> renk;
    private javax.swing.JButton renk_listele;
    private javax.swing.JComboBox<String> sehir;
    private javax.swing.JButton sehir_listele;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> tarih;
    private javax.swing.JButton tarih_listele;
    private javax.swing.JButton tumunu_listele;
    private javax.swing.JComboBox<String> vites;
    private javax.swing.JButton vites_listele;
    private javax.swing.JComboBox<String> yakit;
    private javax.swing.JButton yakit_listele;
    // End of variables declaration//GEN-END:variables
}
