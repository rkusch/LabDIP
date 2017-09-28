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
public class FileInputReader implements InputReader {
    private String input;

    @Override
    public final void inputData(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Please input some information.");
        }
        this.input = input;
    }

    @Override
    public final String getData() {
        return input;
    }
    
}
