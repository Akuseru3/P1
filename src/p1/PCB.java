/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;

/**
 *
 * @author Akuseru
 */
public class PCB {
    public int PC;
    public int AC;
    public String IR;
    public int AX;
    public int BX;
    public int CX;
    public int DX;
    public int stack;
    public JTable table;
    public int file;
    public PCB(int fileI){
        PC = 0;
        AC = 0;
        IR = "-------";
        AX = 0;
        BX = 0;
        CX = 0;
        DX = 0;
        file = fileI;
    }
    public void operation(String instruction){
        String[] parts = instruction.split("\\s+|,");
        System.out.println(Arrays.toString(parts));
        String command = parts[0];
        switch(command){
            case "LOAD":
                if(parts[1].equals("AX")){
                    AC = AX;
                }
                else if(parts[1].equals("BX")){
                    AC = BX;
                }
                else if(parts[1].equals("CX")){
                    AC = CX;
                }
                else{
                    AC = DX;
                }
                break;
            case "STORE":
                if(parts[1].equals("AX")){
                    AX = AC;
                }
                else if(parts[1].equals("BX")){
                    BX = AC;
                }
                else if(parts[1].equals("CX")){
                    CX= AC;
                }
                else{
                    DX = AC;
                }
                break;
            case "MOV":
                System.out.println(Arrays.toString(parts));
                if(parts[1].equals("AX")){
                    if(parts[2].equals("BX")){
                        AX = BX;
                    }
                    else if(parts[2].equals("CX")){
                        AX= CX;
                    }
                    else if(parts[2].equals("DX")){
                        AX= DX;
                    }
                    else{
                        AX = Integer.parseInt(parts[2]);
                    }
                }
                else if(parts[1].equals("BX")){
                    if(parts[2].equals("AX")){
                        BX = AX;
                    }
                    else if(parts[2].equals("CX")){
                        BX= CX;
                    }
                    else if(parts[2].equals("DX")){
                        BX= DX;
                    }
                    else{
                        BX = Integer.parseInt(parts[2]);
                    }
                }
                else if(parts[1].equals("CX")){
                    if(parts[2].equals("AX")){
                        CX = AX;
                    }
                    else if(parts[2].equals("BX")){
                        CX= BX;
                    }
                    else if(parts[2].equals("DX")){
                        CX= DX;
                    }
                    else{
                        CX = Integer.parseInt(parts[2]);
                    }
                }
                else{
                    if(parts[2].equals("AX")){
                        DX = AX;
                    }
                    else if(parts[2].equals("CX")){
                        DX= CX;
                    }
                    else if(parts[2].equals("BX")){
                        DX= BX;
                    }
                    else{
                        DX = Integer.parseInt(parts[2]);
                    }
                }
                break;
            case "ADD":
                if(parts.length==2){
                    if(parts[1].equals("AX")){
                        AC= AX + AC;
                    }
                    else if(parts[1].equals("BX")){
                        AC = BX + AC;
                    }
                    else if(parts[1].equals("CX")){
                        AC = CX+ AC;
                    }
                    else{
                        AC = DX + AC;
                    }
                }else{
                    if(parts[1].equals("AX")){
                        if(parts[2].equals("AX")){
                            AX = AX+AX;
                        }
                        else if(parts[2].equals("BX")){
                            AX= BX+AX;
                        }
                        else if(parts[2].equals("CX")){
                            AX= CX+AX;
                        }
                        else{
                            AX = DX+AX;
                        }
                    }
                    else if(parts[1].equals("BX")){
                        if(parts[2].equals("AX")){
                            BX = AX+BX;
                        }
                        else if(parts[2].equals("BX")){
                            BX = BX+BX;
                        }
                        else if(parts[2].equals("CX")){
                            BX = CX+BX;
                        }
                        else{
                            BX = DX+BX;
                        }
                    }
                    else if(parts[1].equals("CX")){
                        if(parts[2].equals("AX")){
                            CX = AX+CX;
                        }
                        else if(parts[2].equals("BX")){
                            CX = BX+CX;
                        }
                        else if(parts[2].equals("CX")){
                            CX = CX+CX;
                        }
                        else{
                            CX = DX+CX;
                        }
                    }
                    else{
                        if(parts[2].equals("AX")){
                            DX = AX+DX;
                        }
                        else if(parts[2].equals("BX")){
                            DX = BX+DX;
                        }
                        else if(parts[2].equals("CX")){
                            DX = CX+DX;
                        }
                        else{
                            DX = DX+DX;
                        }
                    }
                }
                break;
            case "SUB":
                if(parts.length==2){
                    if(parts[1].equals("AX")){
                        AC= AC-AX;
                    }
                    else if(parts[1].equals("BX")){
                        AC = AC-BX;
                    }
                    else if(parts[1].equals("CX")){
                        AC = AC-CX;
                    }
                    else{
                        AC = AC-DX;
                    }
                }else{
                    if(parts[1].equals("AX")){
                        if(parts[2].equals("AX")){
                            AX = AX-AX;
                        }
                        else if(parts[2].equals("BX")){
                            AX= AX-BX;
                        }
                        else if(parts[2].equals("CX")){
                            AX= AX-CX;
                        }
                        else{
                            AX = AX-DX;
                        }
                    }
                    else if(parts[1].equals("BX")){
                        if(parts[2].equals("AX")){
                            BX = BX-AX;
                        }
                        else if(parts[2].equals("BX")){
                            BX = BX-BX;
                        }
                        else if(parts[2].equals("CX")){
                            BX = BX-CX;
                        }
                        else{
                            BX = BX-DX;
                        }
                    }
                    else if(parts[1].equals("CX")){
                        if(parts[2].equals("AX")){
                            CX = CX-AX;
                        }
                        else if(parts[2].equals("BX")){
                            CX = CX-BX;
                        }
                        else if(parts[2].equals("CX")){
                            CX = CX-CX;
                        }
                        else{
                            CX = CX-DX;
                        }
                    }
                    else{
                        if(parts[2].equals("AX")){
                            DX = DX-AX;
                        }
                        else if(parts[2].equals("BX")){
                            DX = DX-BX;
                        }
                        else if(parts[2].equals("CX")){
                            DX = DX-CX;
                        }
                        else{
                            DX = DX-DX;
                        }
                    }
                }
                break;
            case "INC":
                if(parts.length==2){
                    if(parts[1].equals("AX")){
                        AX+=1;
                    }
                    else if(parts[1].equals("BX")){
                        BX+=1;
                    }
                    else if(parts[1].equals("CX")){
                        CX+=1;
                    }
                    else{
                        DX+=1;
                    }
                }else{
                    AC+=1;
                }
                break;
            case "DEC":
                if(parts.length==2){
                    if(parts[1].equals("AX")){
                        AX-=1;
                    }
                    else if(parts[1].equals("BX")){
                        BX-=1;
                    }
                    else if(parts[1].equals("CX")){
                        CX-=1;
                    }
                    else{
                        DX-=1;
                    }
                }else{
                    AC-=1;
                }
                break;
            case "JUMP":
                break;
            case "CMP":
                break;
            case "JE":
                break;
            case "JNE":
                break;
            case "POP":
                break;
            case "PARAM":
                break;
            default:
                
        }
    }
}
