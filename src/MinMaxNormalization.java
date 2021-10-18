/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zadlyka
 */
public class MinMaxNormalization {
    public ArrayList<Double>[] getdata(ArrayList<Double>[] data){
        ArrayList<Double>[] newdata = new ArrayList[11]; 
        double max[] = new double[11];
        double min[] = new double[11];
        double temp;
        
        // Inisialisasi ArrayList
        for (int i=0; i<11; i++) { 
            newdata[i] = new ArrayList<Double>(); 
            max[i] = data[i].get(0);
            min[i] = data[i].get(0);
        }
       
        //Cari Max Min tiap atribut
        for (int i=0; i<data[0].size(); i++) { 
            for(int j=0;j<11;j++){
                if(data[j].get(i)> max[j]){
                    max[j] = data[j].get(i);
                }
                if(data[j].get(i)< min[j]){
                    min[j] = data[j].get(i);
                }
            }
        }
        
        //Rumus Min-Max Normalisasi
        for (int i=0; i<data[0].size(); i++) { 
            for(int j=0;j<11;j++){
                temp = (data[j].get(i)- min[j])/(max[j]-min[j]);
                newdata[j].add(temp);
            }
        }
        
        return newdata;
    } 
}
