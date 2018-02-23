/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Fynnba
 */
public class TestGUIClass implements ActionListener{
    JFrame frame; 
    JLabel label2;
    JButton button;
    JTextField num2;
    JTextField num1;
    
   public TestGUIClass(){
       frame = new JFrame("GUI Practice");
       JLabel label1 = new JLabel("Enter First Number");
       num1 = new JTextField("First Number");
       num2 = new JTextField("Second Number");
       label2 = new JLabel("Enter Second Number");
       JButton btn = new JButton("Click me");
       frame.setLayout(new FlowLayout());
       
       frame.getContentPane().add(label1);
       frame.getContentPane().add(label2);
       frame.getContentPane().add(num1);
       frame.getContentPane().add(num2);
       frame.getContentPane().add(btn);
       
       btn.addActionListener(this);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.pack();
       frame.setVisible(true);
       
       
       
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestGUIClass test = new TestGUIClass();
        

        // TODO code application logic here
    }
    


    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.println("Working");
        label2.setText(num2.getText());
        int val1 = Integer.parseInt(num1.getText());
        int val2 = Integer.parseInt(num2.getText());
        int sum = val1+val2;
        
        JOptionPane.showMessageDialog(frame, sum, "Sum of numbers", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
