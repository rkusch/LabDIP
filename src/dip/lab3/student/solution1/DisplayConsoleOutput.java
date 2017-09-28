/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author rkusch
 */
public class DisplayConsoleOutput implements DisplayOutput {
    private InputReader input;

    public DisplayConsoleOutput(InputReader input) {
        this.input = input;
    }

    @Override
    public final void showOutput() {
        System.out.println(input.getData());
    }

   
    
    
}
