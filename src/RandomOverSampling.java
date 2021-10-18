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
public class RandomOverSampling {
    public ArrayList<Double>[] getdata(ArrayList<Double>[] traindata){
       ArrayList<Double>[] kelas1 = new ArrayList[11];
       ArrayList<Double>[] kelas2 = new ArrayList[11];
       ArrayList<Double>[] mayoritas = new ArrayList[11];
       ArrayList<Double>[] minoritas = new ArrayList[11];
       ArrayList<Double>[] newtraindata = new ArrayList[11];
       
       int selisih, indexduplicate;
       
       newtraindata = traindata;
       
       for(int i=0;i<11;i++) { 
            kelas1[i] = new ArrayList<Double>();
            kelas2[i] = new ArrayList<Double>(); 
       }
       
       //Memisahkan Data Per Kelas
       for(int i=0;i<traindata[0].size();i++){
            if(traindata[10].get(i)==0){
                for(int j=0;j<11;j++) { 
                    kelas1[j].add(traindata[j].get(i)); 
                }
            }else{
                for(int j=0;j<11;j++) { 
                    kelas2[j].add(traindata[j].get(i)); 
                }
            }
        }
       
       //Mencari Kelas Mayoritas dan Minoritas
       if(kelas1[0].size()>kelas2[0].size()){
           mayoritas = kelas1;
           minoritas = kelas2;
       }else{
           mayoritas = kelas2;
           minoritas = kelas1;
       }
       
       selisih = mayoritas[0].size()-minoritas[0].size();
       
       //Duplicate Kelas Minoritas
       for(int i=0;i<selisih;i++){
           indexduplicate = new Random().nextInt(minoritas[0].size());
           for(int j=0;j<11;j++) { 
                newtraindata[j].get(indexduplicate);
           }
       }
       
       return newtraindata;
    } 
}
