/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class InstructionConsultor {
    ArrayList<Integer> values = new ArrayList<Integer>();
    InstructionConsultor(ArrayList<Integer> values){
        this.values = values;
    }
    
    public int checkWeight(String instruction){
        String[] parts = instruction.split(" ");
        String command = parts[0];
        switch(command){
            case "LOAD":
                return values.get(0);
            case "STORE":
                return values.get(1);
            case "MOV":
                return values.get(2);
            case "ADD":
                return values.get(3);
            case "SUB":
                return values.get(4);
            case "INC":
                return values.get(5);
            case "DEC":
                return values.get(6);
            case "JUMP":
                return values.get(7);
            case "CMP":
                return values.get(8);
            case "JE":
                return values.get(9);
            case "JNE":
                return values.get(9);
            case "POP":
                return values.get(10);    
            case "PARAM":
                return values.get(11);
            default:
                return 0;
        }
    }
}
