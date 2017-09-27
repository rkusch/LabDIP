/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ryan
 */
public class ConsoleOutput implements Output {
    private TipCalculator calc;
    private TipService bill;
    
    

    public ConsoleOutput(TipCalculator calc, TipService bill) {
        this.calc = calc;
        this.bill = bill;
        
    }

    

    @Override
    public final void displayOutput() {
        System.out.println("Pretip bill amount: " + calc.getPretipBillAmount());
        System.out.println("Total bill amount: " + (calc.getPretipBillAmount() + calc.getTip()));
    }
    
}
