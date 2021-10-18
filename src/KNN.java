/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Double.compare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author zadlyka
 */
public class KNN {
    public double getakurasi(ArrayList<Double>[] traindata, ArrayList<Double>[] testdata, int k){
        int banyaktraindata = traindata[0].size();
        int banyaktestdata = testdata[0].size();
        ArrayList<Double> labelklasifikasi = new ArrayList<Double>();
        double fitur1,fitur2,fitur3,fitur4,fitur5,fitur6,fitur7,fitur8,fitur9,fitur10;
        Double[][] D = new Double[banyaktraindata][2];
        int label1 = 0, label2 = 0;
        int TP = 0, TN = 0, FP = 0, FN = 0;
        double akurasi;
        
        for (int i=0; i<banyaktestdata; i++) { 
            for (int j=0; j<banyaktraindata; j++) { 
                fitur1 = (testdata[0].get(i) - traindata[0].get(j))*(testdata[0].get(i) - traindata[0].get(j));
                fitur2 = (testdata[1].get(i) - traindata[1].get(j))*(testdata[1].get(i) - traindata[1].get(j));
                fitur3 = (testdata[2].get(i) - traindata[2].get(j))*(testdata[2].get(i) - traindata[2].get(j));
                fitur4 = (testdata[3].get(i) - traindata[3].get(j))*(testdata[3].get(i) - traindata[3].get(j));
                fitur5 = (testdata[4].get(i) - traindata[4].get(j))*(testdata[4].get(i) - traindata[4].get(j));
                fitur6 = (testdata[5].get(i) - traindata[5].get(j))*(testdata[5].get(i) - traindata[5].get(j));
                fitur7 = (testdata[6].get(i) - traindata[6].get(j))*(testdata[6].get(i) - traindata[6].get(j));
                fitur8 = (testdata[7].get(i) - traindata[7].get(j))*(testdata[7].get(i) - traindata[7].get(j));
                fitur9 = (testdata[8].get(i) - traindata[8].get(j))*(testdata[8].get(i) - traindata[8].get(j));
                fitur10 = (testdata[9].get(i) - traindata[9].get(j))*(testdata[9].get(i) - traindata[9].get(j));
                
                //Euclidean Distance
                D[j][0] = Math.sqrt(fitur1+fitur2+fitur3+fitur4+fitur5+fitur6+fitur7+fitur8+fitur9+fitur10);
                D[j][1] = traindata[10].get(j);
            }
            
            //Sorting Jarak
            Arrays.sort(D, Comparator.comparingDouble(object -> object[0]));
            
            //Mencari Mayoritas Kelas
            for (int j=0; j<k; j++) { 
                if(D[j][1]==0){
                    label1++;
                }else{
                    label2++;
                }
            }
            
            if(label1>label2){
                labelklasifikasi.add(0.0);
            }else{
                labelklasifikasi.add(1.0);
            }
        }
        
        for (int i=0; i<banyaktestdata; i++) { 
            if(compare(labelklasifikasi.get(i), testdata[10].get(i))==0 && labelklasifikasi.get(i)==1){
                TP++;
            }else if(compare(labelklasifikasi.get(i), testdata[10].get(i))==0 && labelklasifikasi.get(i)==0){
                TN++;
            }else if(compare(labelklasifikasi.get(i), testdata[10].get(i))!=0 && labelklasifikasi.get(i)==1){
                FP++;
            }else if(compare(labelklasifikasi.get(i), testdata[10].get(i))!=0 && labelklasifikasi.get(i)==0){
                FN++;
            }
        }
        
        double temp;
        
        temp = (double) (TP+TN)/(TP+TN+FP+FN);
        akurasi = temp*100;
        
        return akurasi;
    }
}
