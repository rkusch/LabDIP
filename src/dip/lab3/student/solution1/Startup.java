/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author ryan
 */
public class Startup {

    public static void main(String[] args) {

        InputReader input = new KeyboardInputReader("This is my message");
        DisplayOutput output = new DisplayConsoleOutput(input);
        output.showOutput();
    }

}
