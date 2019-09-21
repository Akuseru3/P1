/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Kevin
 */
public class Instruction {
    public String command;
    public int fileNumber;
    Instruction(String command, int archivo){
        this.command = command;
        this.fileNumber = archivo;
    }
}
