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
public class KeyboardInputReader implements InputReader {
    private String data;

    @Override
    public final void inputData(String data) {
        if (data == null) {
            throw new UnsupportedOperationException("No input was entered");
        }
        this.data = data;
    }

    @Override
    public final void getData() {
        return this.data;
    }
    
}
