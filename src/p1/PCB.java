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
    public int flag;
    ArrayList<Integer> pila = new ArrayList<Integer>();
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
                if(parts[1].equals("AX")){
                   if(parts[2].equals("AX")){
                        flag =1;
                    }
                    else if(parts[2].equals("BX")){
                        if(AX == BX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("CX")){
                        if(AX == CX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else{
                        if(AX == DX)
                            flag =1;
                        else
                            flag =0;
                    }
                }
                else if(parts[1].equals("BX")){
                    if(parts[2].equals("AX")){
                        if(BX == AX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("BX")){
                        flag =1;
                    }
                    else if(parts[2].equals("CX")){
                        if(BX == CX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else{
                        if(BX == DX)
                            flag =1;
                        else
                            flag =0;
                    }
                }
                else if(parts[1].equals("CX")){
                    if(parts[2].equals("AX")){
                        if(CX == AX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("BX")){
                        if(CX == BX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("CX")){
                        flag =1;
                    }
                    else{
                        if(CX == DX)
                            flag =1;
                        else
                            flag =0;
                    }
                }
                else{
                    if(parts[2].equals("AX")){
                        if(DX == AX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("BX")){
                        if(DX == BX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else if(parts[2].equals("CX")){
                        if(DX == CX)
                            flag =1;
                        else
                            flag =0;
                    }
                    else{
                        flag =1;
                    }
                }
                break;
            case "JE":
                break;
            case "JNE":
                break;
            case "POP":
                int value = 0;
                if(pila.size()!=0){
                    value = pila.get(pila.size()-1);
                    pila.remove(pila.size()-1);
                }
                if(parts[1].equals("AX")){
                    AX=value;
                }
                else if(parts[1].equals("BX")){
                    BX=value;
                }
                else if(parts[1].equals("CX")){
                    CX=value;
                }
                else{
                    DX=value;
                }
                break;
            case "PARAM":
                for(int i = 1;i<parts.length;i++){
                    pila.add(Integer.parseInt(parts[i]));
                }
                break;
            default:
                
        }
    }
}
