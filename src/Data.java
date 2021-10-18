
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zadlyka
 */
public class Data {
    public ArrayList<Double>[] inputfile(String NamaFile){
       int i,n=11;
       ArrayList<Double>[] data = new ArrayList[n]; 
  
        // initializing 
        for (i = 0; i < n; i++) { 
            data[i] = new ArrayList<Double>(); 
        }
       
        //reading file
        String delimiter = ",";
        try {
           File file = new File(NamaFile);
           FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           String line = "";
           String[] tempArr;
           while((line = br.readLine()) != null) {
              i = 0;
              tempArr = line.split(delimiter);
              for(String tempStr : tempArr) {
                 data[i].add(Double.parseDouble(tempStr.replaceAll("\"", "")));
                 i++;
              }
           }
        } catch(IOException ioe) {
           ioe.printStackTrace();
        }
        
        return data;
    }
    
    public ArrayList<Double>[] shuffle(ArrayList<Double>[] data){
       
        ArrayList<Double>[] newdata = new ArrayList[11];
        
        for(int i=0;i<11;i++) { 
            newdata[i] = new ArrayList<Double>();
        }
        
        Random randNum = new Random();
        Set<Integer>set = new LinkedHashSet<Integer>();
        
        while (set.size() < data[0].size()) {
           set.add(randNum.nextInt(data[0].size()));
        }
        
        for (Integer value : set){
            for(int j=0;j<11;j++) { 
                newdata[j].add(data[j].get(value)); 
            }
        }
        
        return newdata;
    }
}
