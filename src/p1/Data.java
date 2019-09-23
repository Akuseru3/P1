/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Akuseru
 */
public class Data {
    
    int memory;int hardDMemory;int fileCounter =0;
    ArrayList<String> memoryData = new ArrayList<String>();
    ArrayList<String> hardDData = new ArrayList<String>();
    ArrayList<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();
    int memoryCounter =0;int hardDCounter=0;
    List<String[]> executedFiles = new ArrayList<String[]>();
    ArrayList<Integer> valuesWeights = new ArrayList<Integer>();
    ArrayList<List<String>> firstQueue = new ArrayList<List<String>>();
    ArrayList<List<String>> secondQueue = new ArrayList<List<String>>();
    
    ArrayList<ArrayList<Instruction>> firstQueueObjectsList = new ArrayList<ArrayList<Instruction>>();
    ArrayList<ArrayList<Instruction>> secondQueueObjectsList = new ArrayList<ArrayList<Instruction>>();
    ArrayList<Instruction> firstQueueObjects = new ArrayList<Instruction>();
    ArrayList<Instruction> secondQueueObjects = new ArrayList<Instruction>();
    
    ArrayList<String> firstQueueData = new ArrayList<String>();
    ArrayList<String> secondQueueData = new ArrayList<String>();
    int sizeOfMemory = memory;int sizeOfHardMemory = hardDMemory;
    public Data(){
    }
    public Data(int valueMemory,int valueMemory2,ArrayList<Integer> list){
        memory=valueMemory;
        hardDMemory = valueMemory2;
        valuesWeights = list;
        sizeOfMemory = memory;sizeOfHardMemory = hardDMemory;
        
    }
    
    
    public void dataFromFiles(List<String[]> data) throws IOException{
        executedFiles = data;
        for(int i=0;i<data.size();i++){
            int flag=0;
            System.out.println("Memoria: " +sizeOfMemory);
            System.out.println("Memoria Virtual: " +sizeOfHardMemory);
            ArrayList<String> newFile = new ArrayList<String>();
            String[] actual= data.get(i);
            Path path = Paths.get(actual[2]);
            List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
            sizeOfMemory = sizeOfMemory-content.size();
            if(sizeOfMemory<=0){                
                sizeOfHardMemory= sizeOfHardMemory-content.size();
                flag =1;
            }
            for(int j=0;j<content.size();j++){
                newFile.add(content.get(j));
                /*System.out.println("Espacio en memoria: "+(sizeOfMemory));
                System.out.println("Espacio en memoria: "+(sizeOfHardMemory));
                System.out.println("Valor actual: "+(content.size()));*/
                if((sizeOfMemory)>=(0)){
                    memoryData.add(content.get(j));                    
                }else if((sizeOfHardMemory)>=(0)){
                    hardDData.add(content.get(j));                    
                }else{
                    System.out.println("no more");
                    break;                    
                }
                
            }
            allData.add(newFile);
            if(flag==1 && sizeOfMemory>0){
                sizeOfMemory = sizeOfMemory+content.size();
            }
        }
        System.out.println(executedFiles.size()+ " Los archivos ejecutados");
        for(int y=0;y<executedFiles.size();y++){
            System.out.println("Archivo "+y+"===> "+Arrays.toString(executedFiles.get(y)));
            ArrayList<String> newFile = new ArrayList<String>();
            String[] actual= executedFiles.get(y);
            Path path = Paths.get(actual[2]);
            List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
            
            
            Random r = new Random();
            int value = r.nextInt(2)+1;
            System.out.println("Random: "+value);
            if(value==1){     
                fileCounter+=1;
                //executedFiles.get(y)[0];                
                firstQueue.add(content);
                //tempFirstQueue.add(content);
                ArrayList<Instruction> fileContent = new ArrayList<Instruction>();
                for(int k=0;k<content.size();k++){
                    Instruction object = new Instruction(content.get(k),fileCounter);
                    fileContent.add(object);
                }
                firstQueueObjectsList.add(fileContent);
            }
            else if(value==2){
                fileCounter+=1;
                secondQueue.add(content);
                //tempSecondQueue.add(content);
                ArrayList<Instruction> fileContent = new ArrayList<Instruction>();
                for(int k=0;k<content.size();k++){
                    Instruction object = new Instruction(content.get(k),fileCounter);
                    fileContent.add(object);
                }
                secondQueueObjectsList.add(fileContent);
            }
            else{
                System.out.println("Wrong random");
            }
        }
        System.out.println(allData.size()+" = Lista de archivos");
        //System.out.println(Arrays.toString(firstQueue.toArray())+" = first size");
        System.out.println(secondQueue.size()+" = second size");
        executedFiles.clear();
        /*firstQueueData.clear();
        secondQueueData.clear();
        firstQueueObjects.clear();
        secondQueueObjects.clear();*/
        
        createWorkQueues();
    }
    
    public int getLargest(ArrayList<List<String>> list){
        int largestValue = 0;
        for(int i=0;i<list.size();i++){
            List<String> item=list.get(i);
            if(item.size()>largestValue){                
                largestValue = item.size();
            }
        }
        return largestValue;
    }
    public void createWorkQueues(){
        /*for(int l=0;l<firstQueueObjectsList.size();l++){
            ArrayList<Instruction> fileObject = firstQueueObjectsList.get(l);
            for(int k=0;l<fileObject.size()-1;k++){
                Instruction object = fileObject.get(k);
                System.out.println(object.command+"--"+object.fileNumber);
            }
        }*/
        
        
        
        int value1 = getLargest(firstQueue);
        int value2 = getLargest(secondQueue);
        //System.out.println(value1 + " queue1 lista tiene");
        //System.out.println(value2 + " queue2 lista tiene");
        
        for(int i=0;i<value1;i++){
            //System.out.println("Pos: "+i);
            for(int y=0;y<firstQueue.size();y++){
                //System.out.println("List: "+y);
                //System.out.println(Arrays.toString(firstQueue.toArray()));
                
                try{
                    List<String> fileData = firstQueue.get(y);
                    String instruction = fileData.get(i);
                    //System.out.println(instruction);
                    firstQueueData.add(instruction);
                    ArrayList<Instruction> fileObjects = firstQueueObjectsList.get(y);
                    Instruction object = fileObjects.get(i);
                    //System.out.println("INST1: "+object.command);
                    firstQueueObjects.add(object);
                }catch(Exception e){
                    //System.out.println("No entró");
                    //System.out.println(e);
                }
            }
        }
        for(int i=0;i<value2;i++){
            //System.out.println("Pos: "+i);
            
            for(int y=0;y<secondQueue.size();y++){
                //System.out.println("List: "+y);
                //System.out.println(Arrays.toString(secondQueue.toArray()));
                try{
                    List<String> fileData = secondQueue.get(y);
                    String instruction = fileData.get(i);
                    //System.out.println(instruction);
                    secondQueueData.add(instruction);
                    ArrayList<Instruction> fileObjects = secondQueueObjectsList.get(y);
                    Instruction object = fileObjects.get(i);
                    //System.out.println("INST2: "+object.command);
                    secondQueueObjects.add(object);
                }catch(Exception e){
                    //System.out.println("No entró");
                }
            }
        }
        System.out.println("Tamaño Cola1:" + firstQueueObjects.size());
        System.out.println("tamaño Cola2:" + secondQueueObjects.size());
        System.out.println("----------------------------------------");
        System.out.println("Tamaño Cola1:" + firstQueueData.size());
        System.out.println("tamaño Cola2:" + secondQueueData.size());
        
        /*for(int l=0;l<firstQueueObjects.size();l++){
            Instruction object = firstQueueObjects.get(l);
            System.out.println("FILE ==> "+object.fileNumber);
            System.out.println("Intrs ==> "+object.command);
        }*/
        
        
        firstQueue.clear();
        secondQueue.clear();
        firstQueueObjectsList.clear();
        secondQueueObjectsList.clear();
    }
    
}
