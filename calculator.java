import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.plaf.FontUIResource;

import java.io.*;

public class calculator extends JFrame {

    static private int check = 1;
    private JTextArea numPan;
    private JButton zero;
    private JButton two;
    private JButton one;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton add,div,sub,mult;
    private JButton eql, clear;
    char opr='\u0000';
    private JPanel panel;
    static String a = "";
    static String b = "";

    calculator() {
        super("Calculator by Ansh");
        setLayout(new FlowLayout());
        Font theFont = new Font("Ink Free", Font.BOLD, 20);
        numPan = new JTextArea("0");
        numPan.setColumns(30);
        numPan.setFont(theFont);
        numPan.setEditable(false);
        add(numPan, BorderLayout.NORTH);
        numPan.setRows(2);
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");

        // defining Panel to contain the buttons

        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        add = new JButton("+");
        div=new JButton("/");
        sub=new JButton("-");
        mult=new JButton("X");
        eql = new JButton("=");
        clear = new JButton("C");
        num ob = new num();
        op ob1 = new op();
        zero.addActionListener(ob);
        one.addActionListener(ob);
        two.addActionListener(ob);
        three.addActionListener(ob);
        four.addActionListener(ob);
        five.addActionListener(ob);
        six.addActionListener(ob);
        seven.addActionListener(ob);
        eight.addActionListener(ob);
        nine.addActionListener(ob);
        add.addActionListener(ob1);
        div.addActionListener(ob1);
        sub.addActionListener(ob1);
        mult.addActionListener(ob1);
        eql.addActionListener(ob1);
        clear.addActionListener(ob1);


   eql.setBounds(50,430,40,40);

        
        panel.add(zero);
        panel.add(one );
       panel. add(two );

       panel. add(three );

        panel.add(four );

       panel. add(five  );
       panel. add(six  );

        panel.add(seven  );

        panel.add(eight );

        panel.add(nine  );

        panel.add(add);
        panel.add(div);
        panel.add(sub);
        panel.add(mult);
        panel.add(clear);
       panel. add(eql);
       add(panel);

    }





    
    private class num implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == zero) {
                if (check == 1) {
                    a += 0;
                } else {
                    b += 0;
                }
            } else if (event.getSource() == one) {
                if (check == 1)
                    a += 1;
                else
                    b += 1;
            }
            if (event.getSource() == two) {
                if (check == 1)
                    a += 2;
                else
                    b += 2;
            }
            if (event.getSource() == three) {
                if (check == 1)
                    a += 3;
                else
                    b += 3;
            }
            if (event.getSource() == four) {
                if (check == 1)
                    a += 4;
                else
                    b += 4;
            }
            if (event.getSource() == five) {
                if (check == 1)
                    a += 5;
                else
                    b += 5;
            }
            if (event.getSource() == six) {
                if (check == 1)
                    a += 6;
                else
                    b += 6;
            }
            if (event.getSource() == seven) {
                if (check == 1)
                    a += 7;
                else
                    b += 7;
            }
            if (event.getSource() == eight) {
                if (check == 1)
                    a += 8;
                else
                    b += 8;
            } else if (event.getSource() == nine) {
                if (check == 1)
                    a += 9;
                else
                    b += 9;
            }

            if (check == 1)
                numPan.setText(a);
            else
                numPan.setText(b);

        }

    }

    private class op implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            check = 0;
            
           
            if (event.getSource() == add){
                numPan.setText("+");
                opr='+';
            }
            else if (event.getSource() == eql && (calculator.b.equals(""))!=true) {
                int a = Integer.parseInt(calculator.a);
                int b = Integer.parseInt(calculator.b);

                 if(opr=='+'){
                  int  c=a+b;
                    numPan.setText(String.format("%d",c));
                 }
                 else if(opr=='-'){
                   
                
               int  c=a-b;
                numPan.setText(String.format("%d",c));

                 }
                 else if(opr=='/'){
                  
                    
                    float c1=a/b;
                    numPan.setText(String.format("%.2f",c1));
                 }
                 else if(opr=='X'){
                    
                
               int c=a*b;
                numPan.setText(String.format("%d",c));

                 }
               check=1;
            //    calculator.a=Integer.toString(c);
            } else if(event.getSource()==clear) {
                numPan.setText("");
                calculator.a = "";
                calculator.b = "";
                check = 1;
                opr=' ';
            }
            else if(event.getSource()==sub){
                
                
                
                numPan.setText("-");
                opr='-';
            }
            else if(event.getSource()==mult){
                
                numPan.setText("X");
                opr='X';
            }
            else if(event.getSource()==div){
                
                numPan.setText("/");
                opr='/';
            }

        }
    }

    public static void main(String[] args) {

        calculator ob = new calculator();
        ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ob.setVisible(true);
        ob.setResizable(false);
        ob.setSize(520, 500);
        final String sys = System.getProperty("os.name");
        JOptionPane.showMessageDialog(null, "Welcome " + sys + ",user");

    }

}
