/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author zadlyka
 */
public class ParticleSwarmOptimization {
    public double getkoptimal(ArrayList<Double>[] traindata, ArrayList<Double>[] testdata, int jumlahpartikel, int iterasimaksimal, double bobotinersia){
        double[][] partikel = new double[jumlahpartikel][3];
        double[][] pbest = new double[jumlahpartikel][3];
        KNN KNNKlasifikasi = new KNN();
        double[] gbest = new double[3];
        
        int Xmax = 50;
        int Xmin = 1;
        
        double  Vmax;
        Vmax = (Xmax - Xmin)/2;
       
        double kecepatan,fitness;
        int posisi;
        double c1=2.0,c2=2.0,r1,r2;
        
       
        //populasi awal
        for(int i=0;i<jumlahpartikel;i++){
            partikel[i][0] = new Random().nextInt(Xmax-Xmin)+Xmin; //Posisi
            partikel[i][1] = 0; //Kecepatan
            partikel[i][2] = KNNKlasifikasi.getakurasi(traindata,testdata,(int) partikel[i][0]); //Fitness
        }
        
        //Inisialisasi Awal Pbest
        pbest = partikel;
       
        for(int i=0;i<3;i++){
            gbest[i]=pbest[0][i];
        }
        
        //Mencari Gbest
        for(int i = 0; i < jumlahpartikel; i++) {
            if (pbest[i][2] > gbest[2]){
              for(int j=0;j<3;j++){
                gbest[j]=pbest[i][j];
              }
            }
        }
        
        for(int i=0;i<iterasimaksimal;i++){
            r1 = Math.random();
            r2 = Math.random();

            for(int j=0;j<jumlahpartikel;j++){
                kecepatan = (bobotinersia*partikel[j][1])
                        +(c1*r1*(pbest[j][0]-partikel[j][0]))
                        +(c2*r2*(gbest[0]-partikel[j][0]));

                if(kecepatan>=Vmax){
                    kecepatan = Vmax;
                }else if(kecepatan<=-Vmax) {
                    kecepatan = -Vmax;
                }

                kecepatan = Math.round(kecepatan);

                posisi = (int) (partikel[j][0]+kecepatan);
                if(posisi<=Xmin){
                    posisi = Xmin;
                }else if(posisi>=Xmax){
                    posisi = Xmax;
                }
                
                System.out.println("Posisi = "+posisi);
                fitness = KNNKlasifikasi.getakurasi(traindata,testdata,posisi);
                if(fitness > pbest[j][2]){
                    pbest[j][0] = posisi;
                    pbest[j][1] = kecepatan;
                    pbest[j][2] = fitness;
                }
                
                partikel[j][0] = posisi;
                partikel[j][1] = kecepatan;
                partikel[j][2] = fitness;
            }


            //Mencari Gbest
            for(int j=0;j<3;j++){
                gbest[j]=pbest[0][j];
            }

            for(int j=0; j<jumlahpartikel; j++) {
                if (pbest[j][2] > gbest[2]){
                    for(int k=0;k<3;k++){
                      gbest[k]=pbest[j][k];
                    }
                }
            }
        }

        return gbest[0];
    }
}
