/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.ArrayList;


/**
 *
 * @author Frema
 */
public class PupilDataClass {
    String name;
    int art;
    int reading;
    int writing;
    
    ArrayList<PupilDataClass> temp =  new ArrayList();

    public PupilDataClass(String name, int art, int reading, int writing) {
        this.name = name;
        this.art = art;
        this.reading = reading;
        this.writing = writing;
    }

    @Override
    public String toString() {
        return "PupilDataClass{" + "Name=" + name + ", Art=" + art + ", Reading=" + reading + ", Writing=" + writing + ", temp=" + temp + '}';
    }
    
    public String AddStudent(PupilDataClass pupil){
        temp.add(pupil);
        return null;  
    }
    
    public String DeleteStudent(String Name){
        for(int i=0;i<temp.size();i++){
            
        }
        return null;
        
    }
    
    public String SearchRecord(String name){
         for(int i=0;i<temp.size();i++){
            if(name.equalsIgnoreCase(temp.get(i).this.name)){
                System.out.print(temp.get(i));
            }
        }
        
        return null;
    }
    
    public void String PrintRecords(){
        for(int i=0;i<temp.size();i++){
            System.out.print(temp.get(i));
        }
    }
    
    public String AllAverages(){
        int artAverage = 0 ;
        int readingAverage = 0;
        int writingAverage = 0;
        
        for(int i=0;i<temp.size();i++){
            artAverage +=temp.get(i).art;
            readingAverage +=temp.get(i).reading;
            writingAverage +=temp.get(i).writing;
        }
        
        artAverage/=temp.size();
        readingAverage/=temp.size();
        writingAverage/=temp.size();
        
        return "ArtAverage: "+ artAverage + " ReadingAverage: "+ readingAverage + " WritingAverage: "+ writingAverage; 
    
    }
    
    public static void main(String[] args) {
        String Name = "x";
        int Art = 1;
        int Reading = 1;
        int Writing = 1;
        PupilDataClass NewPupil = new PupilDataClass(Name, Art, Reading,Writing);
        NewPupil.
        
        
    }
    
}
