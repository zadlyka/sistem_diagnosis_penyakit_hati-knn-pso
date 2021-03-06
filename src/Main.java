
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zadlyka
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    ArrayList<Double>[] data = new ArrayList[11];    
    ArrayList<Double>[] newdata = new ArrayList[11];

    
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CariFile = new javax.swing.JButton();
        LabelJumlahPartikel = new javax.swing.JLabel();
        JumlahPartikelField = new javax.swing.JTextField();
        ProsesKlasifikasi = new javax.swing.JButton();
        LabelHeader1 = new javax.swing.JLabel();
        LabelHeader2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelInputData = new javax.swing.JLabel();
        KolomNamaFile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAkurasiKNN = new javax.swing.JTable();
        LabelHasilDiagnosis1 = new javax.swing.JLabel();
        RataRataAkurasiKNN = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAkurasiKNNPSO = new javax.swing.JTable();
        LabelHasilDiagnosis2 = new javax.swing.JLabel();
        RataRataAkurasiKNNPSO = new javax.swing.JTextField();
        LabelHasilDiagnosis3 = new javax.swing.JLabel();
        LabelHasilDiagnosis = new javax.swing.JLabel();
        BobotInersiaField = new javax.swing.JTextField();
        LabelJumlahPartikel1 = new javax.swing.JLabel();
        LabelJumlahPartikel2 = new javax.swing.JLabel();
        IterasiMaxField = new javax.swing.JTextField();
        LabelHasilDiagnosis4 = new javax.swing.JLabel();
        RataRataWaktuKNN = new javax.swing.JTextField();
        LabelHasilDiagnosis5 = new javax.swing.JLabel();
        RataRataWaktuKNNPSO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CariFile.setText("Cari");
        CariFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariFileActionPerformed(evt);
            }
        });

        LabelJumlahPartikel.setText("Jumlah Partikel");

        ProsesKlasifikasi.setText("Proses");
        ProsesKlasifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesKlasifikasiActionPerformed(evt);
            }
        });

        LabelHeader1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelHeader1.setText("Liver Disease");

        LabelHeader2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelHeader2.setText("Diagnosis System");

        LabelInputData.setText("Input Data");

        TableAkurasiKNN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fold", "Akurasi", "Waktu Eksekusi"
            }
        ));
        jScrollPane1.setViewportView(TableAkurasiKNN);

        LabelHasilDiagnosis1.setText("Rata-Rata Akurasi");

        TableAkurasiKNNPSO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fold", "k Optimum", "Akurasi", "Waktu Komputasi"
            }
        ));
        jScrollPane2.setViewportView(TableAkurasiKNNPSO);

        LabelHasilDiagnosis2.setText("Rata-Rata Akurasi");

        LabelHasilDiagnosis3.setText("Klasifikasi KNN-PSO");

        LabelHasilDiagnosis.setText("Klasifikasi KNN");

        LabelJumlahPartikel1.setText("Bobot Inersia");

        LabelJumlahPartikel2.setText("Jumlah Iterasi Maksimal");

        LabelHasilDiagnosis4.setText("Rata-Rata Waktu Eksekusi");

        LabelHasilDiagnosis5.setText("Rata-Rata Waktu Eksekusi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJumlahPartikel)
                            .addComponent(JumlahPartikelField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJumlahPartikel1)
                            .addComponent(BobotInersiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IterasiMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJumlahPartikel2))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelInputData)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KolomNamaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CariFile, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ProsesKlasifikasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelHasilDiagnosis)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelHasilDiagnosis4)
                                            .addComponent(LabelHasilDiagnosis1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RataRataAkurasiKNN)
                                            .addComponent(RataRataWaktuKNN))))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelHasilDiagnosis3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelHasilDiagnosis5)
                                            .addComponent(LabelHasilDiagnosis2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RataRataAkurasiKNNPSO)
                                            .addComponent(RataRataWaktuKNNPSO))))))
                        .addContainerGap(49, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LabelHeader2))
                    .addComponent(LabelHeader1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelInputData)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KolomNamaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CariFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelJumlahPartikel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JumlahPartikelField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelJumlahPartikel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BobotInersiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelJumlahPartikel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IterasiMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ProsesKlasifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelHasilDiagnosis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHasilDiagnosis1)
                            .addComponent(RataRataAkurasiKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelHasilDiagnosis3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHasilDiagnosis2)
                            .addComponent(RataRataAkurasiKNNPSO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelHasilDiagnosis5)
                        .addComponent(RataRataWaktuKNNPSO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelHasilDiagnosis4)
                        .addComponent(RataRataWaktuKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CariFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariFileActionPerformed
        // TODO add your handling code here:
        //Baca File
        Data datainput = new Data();
        MinMaxNormalization normalisasi = new MinMaxNormalization();
        JFileChooser OpenFile = new JFileChooser();
        OpenFile.showOpenDialog(null);
        File BukaFile = OpenFile.getSelectedFile();
        String NamaFile = BukaFile.getAbsolutePath();
        
        KolomNamaFile.setText(NamaFile);
        
        //Normalisasi Data
        data = normalisasi.getdata(datainput.inputfile(NamaFile));
    }//GEN-LAST:event_CariFileActionPerformed

    private void ProsesKlasifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesKlasifikasiActionPerformed
        // TODO add your handling code here:
        int indexawal, indexakhir;
        int ukurantestdata = (int) (0.1*data[0].size());
        
        //Parameter PSO
        int jumlahpartikel = Integer.parseInt(JumlahPartikelField.getText());
        int iterasimaksimal = Integer.parseInt(IterasiMaxField.getText());
        double bobotinersia = Double.parseDouble(BobotInersiaField.getText());
        int koptimal;
        
        //Variabel Data
        ArrayList<Double>[] traindata = new ArrayList[11];
        ArrayList<Double>[] newtraindata = new ArrayList[11];
        ArrayList<Double>[] testdata = new ArrayList[11];
        
        //Variabel Performa Klasifikasi
        double hasilklasifikasiKNNperfold[][]=new double[10][2];
        double hasilklasifikasiKNNPSOperfold[][]=new double[10][3];
        double totalakurasiKNN=0,totalakurasiKNNPSO=0;
        double totalwaktuKNN=0,totalwaktuKNNPSO=0;
        
        KNN KNNKlasifikasi = new KNN();
        ParticleSwarmOptimization PSOKlasifikasi = new ParticleSwarmOptimization();
        RandomOverSampling ROS = new RandomOverSampling();
        
        Data temp = new Data();
        
        //Inisialisasi Arraylist
        for(int i=0;i<11;i++) { 
            traindata[i] = new ArrayList<Double>();
            testdata[i] = new ArrayList<Double>(); 
        }
        
        //Acak data
        newdata = temp.shuffle(data);
        
        for(int fold=0;fold<10;fold++){
            System.out.println("Fold "+(fold+1));
            
            indexawal = ukurantestdata*fold;
            indexakhir = ukurantestdata*(fold+1);
            
            for(int i=0;i<newdata[0].size();i++){
                if(i>=indexawal && i<indexakhir){
                    for(int j=0;j<11;j++) { 
                        testdata[j].add(newdata[j].get(i)); 
                    }
                }else{
                    for(int j=0;j<11;j++) { 
                        traindata[j].add(newdata[j].get(i)); 
                    }
                }
            }
            
            //Traindata ROS
            newtraindata = ROS.getdata(traindata);
            
            long StartTimeKNN = System.currentTimeMillis();
            hasilklasifikasiKNNperfold[fold][0]=KNNKlasifikasi.getakurasi(newtraindata, testdata, 3);
            long EndTimeKNN = System.currentTimeMillis();
            long TimeKNN = EndTimeKNN - StartTimeKNN;
            hasilklasifikasiKNNperfold[fold][1] = (double) TimeKNN;
            
            long StartTimeKNNPSO = System.currentTimeMillis();
            koptimal=(int) PSOKlasifikasi.getkoptimal(newtraindata, testdata, jumlahpartikel, iterasimaksimal, bobotinersia); 
            long EndTimeKNNPSO = System.currentTimeMillis();
            long TimeKNNPSO = EndTimeKNNPSO - StartTimeKNNPSO;
            
            hasilklasifikasiKNNPSOperfold[fold][0] = koptimal; //K Optimal
            hasilklasifikasiKNNPSOperfold[fold][1] = KNNKlasifikasi.getakurasi(newtraindata, testdata, koptimal);
            hasilklasifikasiKNNPSOperfold[fold][2] = (double) TimeKNNPSO; //Waktu Komputasi
            
            //Clear Arraylist
            for(int i=0;i<11;i++){
                testdata[i].clear();
                traindata[i].clear();
            }
            
            System.out.println();
        }
        
        //Insert Table
        DefaultTableModel modelKNN = (DefaultTableModel) TableAkurasiKNN.getModel();
        DefaultTableModel modelKNNPSO = (DefaultTableModel) TableAkurasiKNNPSO.getModel();
        modelKNN.setRowCount(0);
        modelKNNPSO.setRowCount(0);
        
        for(int i=0;i<10;i++){
            totalakurasiKNN = totalakurasiKNN+hasilklasifikasiKNNperfold[i][0];
            totalwaktuKNN = totalwaktuKNN+hasilklasifikasiKNNperfold[i][1];
            modelKNN.addRow(new Object[]{Integer.toString(i+1),
                String.format("%.2f", hasilklasifikasiKNNperfold[i][0]),
                hasilklasifikasiKNNperfold[i][1]});
            
            totalakurasiKNNPSO = totalakurasiKNNPSO + hasilklasifikasiKNNPSOperfold[i][1];
            totalwaktuKNNPSO = totalwaktuKNNPSO + hasilklasifikasiKNNPSOperfold[i][2];
            modelKNNPSO.addRow(new Object[]{Integer.toString(i+1),
                String.format("%.0f", hasilklasifikasiKNNPSOperfold[i][0]),
                String.format("%.2f", hasilklasifikasiKNNPSOperfold[i][1]),
                hasilklasifikasiKNNPSOperfold[i][2]});
        }
        
        RataRataAkurasiKNN.setText(String.format("%.2f", totalakurasiKNN/10));
        RataRataAkurasiKNNPSO.setText(String.format("%.2f", totalakurasiKNNPSO/10));
        
        RataRataWaktuKNN.setText(String.format("%.2f", totalwaktuKNN/10));
        RataRataWaktuKNNPSO.setText(String.format("%.2f", totalwaktuKNNPSO/10));
    }//GEN-LAST:event_ProsesKlasifikasiActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BobotInersiaField;
    private javax.swing.JButton CariFile;
    private javax.swing.JTextField IterasiMaxField;
    private javax.swing.JTextField JumlahPartikelField;
    private javax.swing.JTextField KolomNamaFile;
    private javax.swing.JLabel LabelHasilDiagnosis;
    private javax.swing.JLabel LabelHasilDiagnosis1;
    private javax.swing.JLabel LabelHasilDiagnosis2;
    private javax.swing.JLabel LabelHasilDiagnosis3;
    private javax.swing.JLabel LabelHasilDiagnosis4;
    private javax.swing.JLabel LabelHasilDiagnosis5;
    private javax.swing.JLabel LabelHeader1;
    private javax.swing.JLabel LabelHeader2;
    private javax.swing.JLabel LabelInputData;
    private javax.swing.JLabel LabelJumlahPartikel;
    private javax.swing.JLabel LabelJumlahPartikel1;
    private javax.swing.JLabel LabelJumlahPartikel2;
    private javax.swing.JButton ProsesKlasifikasi;
    private javax.swing.JTextField RataRataAkurasiKNN;
    private javax.swing.JTextField RataRataAkurasiKNNPSO;
    private javax.swing.JTextField RataRataWaktuKNN;
    private javax.swing.JTextField RataRataWaktuKNNPSO;
    private javax.swing.JTable TableAkurasiKNN;
    private javax.swing.JTable TableAkurasiKNNPSO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
