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
    ArrayList<Integer> memoryFiles = new ArrayList<Integer>();
    ArrayList<Integer> hardDFiles = new ArrayList<Integer>();
    
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
        /*for(int i=0;i<data.size();i++){
            
        }*/
        System.out.println(executedFiles.size()+ " Los archivos ejecutados");
        for(int y=0;y<executedFiles.size();y++){
                     
            System.out.println("Archivo "+y+"===> "+Arrays.toString(executedFiles.get(y)));
            //ArrayList<String> newFile = new ArrayList<String>();
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
            
            int flag=0;
            System.out.println("Memoria: " +sizeOfMemory);
            System.out.println("Memoria Virtual: " +sizeOfHardMemory);
            ArrayList<String> newFile = new ArrayList<String>();
            /*String[] actual= data.get(y);
            Path path = Paths.get(actual[2]);
            List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);*/
            
            sizeOfMemory = sizeOfMemory-content.size();
            if(sizeOfMemory<=0){                
                sizeOfHardMemory= sizeOfHardMemory-content.size();
                flag =1;
            }
            int spaceFlag=0;
            for(int j=0;j<content.size();j++){
                newFile.add(content.get(j));
                /*System.out.println("Espacio en memoria: "+(sizeOfMemory));
                System.out.println("Espacio en memoria: "+(sizeOfHardMemory));
                System.out.println("Valor actual: "+(content.size()));*/
                if((sizeOfMemory)>=(0)){
                    memoryData.add(content.get(j));
                    spaceFlag=0;
                }else if((sizeOfHardMemory)>=(0)){
                    hardDData.add(content.get(j));
                    spaceFlag=1;         
                }else{
                    System.out.println("no more");
                    break;                    
                }
                
            }
            if(spaceFlag==0){
                memoryFiles.add(fileCounter);
            }else{
                hardDFiles.add(fileCounter);
            }
            allData.add(newFile);
            if(flag==1 && sizeOfMemory>0){
                sizeOfMemory = sizeOfMemory+content.size();
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
        System.out.println(Arrays.toString(memoryFiles.toArray()));
        System.out.println(Arrays.toString(hardDFiles.toArray()));
        
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
    
    
    public void adaptationN1(int cant,int posInst){
        ArrayList<String> adapted = new ArrayList<String>();
        ArrayList<Instruction> adaptedInst = new ArrayList<Instruction>();
        for(int i = 0; i<posInst+1; i++){
            adapted.add(this.firstQueueData.get(i));
            adaptedInst.add(this.firstQueueObjects.get(i));
        }
        int originalFile = firstQueueObjects.get(posInst).fileNumber;
        ArrayList<Instruction> fInts = getFileInsts(originalFile,this.firstQueueObjects);
        //allData.get(firstQueueObjects.get(posInst).fileNumber).size()
        int posInFile = getFileAmount(posInst,originalFile,this.firstQueueObjects,fInts);
        ArrayList<Integer> intercal = getIntercalados(originalFile,this.firstQueueObjects);
        int adaptedPos = posInFile-(cant);
        if(adaptedPos<0){
            adaptedPos = 0;
        }
        System.out.println(adaptedPos);
        while(true){
            if(adaptedPos == fInts.size() || posInst == this.firstQueueObjects.size()){
                for(int i = adaptedPos;i<fInts.size();i++){
                    adapted.add(fInts.get(i).command);
                    adaptedInst.add(fInts.get(i));
                }
                break;
            }
            if(originalFile == firstQueueObjects.get(posInst).fileNumber){
                
                adapted.add(fInts.get(adaptedPos).command);
                adaptedInst.add(fInts.get(adaptedPos));
                adaptedPos+=1;
                posInst+=1;
            }
            else if(intercal.contains(firstQueueObjects.get(posInst).fileNumber)){
                adapted.add(firstQueueObjects.get(posInst).command);
                adaptedInst.add(firstQueueObjects.get(posInst));
                posInst+=1;
            }
            else{
                for(int i = adaptedPos;i<fInts.size();i++){
                    adapted.add(fInts.get(i).command);
                    adaptedInst.add(fInts.get(i));
                }
                break;
            }
        }
        for(int i = posInst;i<firstQueueObjects.size();i++){
            adapted.add(this.firstQueueData.get(i));
            adaptedInst.add(this.firstQueueObjects.get(i));
        }
        this.firstQueueData = adapted;
        this.firstQueueObjects = adaptedInst;
    }
    
    
    
    public void adaptationN2(int cant,int posInst){
        System.out.println(cant);
        System.out.println(posInst);
        ArrayList<String> adapted = new ArrayList<String>();
        ArrayList<Instruction> adaptedInst = new ArrayList<Instruction>();
        for(int i = 0; i<posInst+1; i++){
            adapted.add(this.secondQueueData.get(i));
            adaptedInst.add(this.secondQueueObjects.get(i));
        }
        int originalFile = secondQueueObjects.get(posInst).fileNumber;
        ArrayList<Instruction> fInts = getFileInsts(originalFile,this.secondQueueObjects);
        int posInFile = getFileAmount(posInst,originalFile,this.secondQueueObjects,fInts);
        ArrayList<Integer> intercal = getIntercalados(originalFile,this.secondQueueObjects);
        int adaptedPos = posInFile-(cant);
        if(adaptedPos<0){
            adaptedPos = 0;
        }
        while(true){
            if(adaptedPos == fInts.size() || posInst == this.secondQueueObjects.size()){
                for(int i = adaptedPos;i<fInts.size();i++){
                    adapted.add(fInts.get(i).command);
                    adaptedInst.add(fInts.get(i));
                }
                break;
            }
            if(originalFile == secondQueueObjects.get(posInst).fileNumber){
                adapted.add(fInts.get(adaptedPos).command);
                adaptedInst.add(fInts.get(adaptedPos));
                posInst+=1;
                adaptedPos+=1;
            }
            else if(intercal.contains(secondQueueObjects.get(posInst).fileNumber)){
                
                adapted.add(secondQueueObjects.get(posInst).command);
                adaptedInst.add(secondQueueObjects.get(posInst));
                posInst+=1;
            }
            else{
                for(int i = adaptedPos;i<fInts.size();i++){
                    adapted.add(fInts.get(i).command);
                    adaptedInst.add(fInts.get(i));
                }
                break;
            }
        }
        for(int i = posInst;i<secondQueueObjects.size();i++){
            adapted.add(this.secondQueueData.get(i));
            adaptedInst.add(this.secondQueueObjects.get(i));
        }
        this.secondQueueData = adapted;
        this.secondQueueObjects = adaptedInst;
    }
    
    private ArrayList<Instruction> getFileInsts(int file, ArrayList<Instruction> used){
        ArrayList<Instruction> newList = new ArrayList<Instruction>();
        for(int i=0;i<used.size();i++){
            if(used.get(i).fileNumber == file){
                newList.add(used.get(i));
            }
            if(newList.size()>allData.get(file-1).size()){
                ArrayList<Instruction> newnewList = new ArrayList<Instruction>();
                newnewList.add(newList.get(newList.size()-1));
                newList = newnewList;
            }
        }
        return newList;
    }
    
    private int getFileAmount(int pos,int file, ArrayList<Instruction> used, ArrayList<Instruction> total){
        int cont = 0;
        for(int i=0;i<pos;i++){
            if(used.get(i).fileNumber == file){
                cont+=1;
            }
            if(cont>total.size()){
                cont=0;
            }
        }
        return cont;
    }
    
    private ArrayList<Integer> getIntercalados(int file, ArrayList<Instruction> used){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        boolean flag = false;
        for(int i=0;i<used.size();i++){
            if(used.get(i).fileNumber == file){
                if(flag){
                    break;
                }
                else{
                    flag = true;
                }
            }
            else{
                if(flag){
                    newList.add(used.get(i).fileNumber);
                }
            }
        }
        return newList;
    }
}
