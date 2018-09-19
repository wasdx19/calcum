/*
*
* created by Azatkhanov Ansar
* WaSDX  10.05.2018
*/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
  private JButton pushB;
  private JButton pushB1;
  private JButton pushB2;
  private JTextArea txt;
  private JTextArea txt1;
  private JTextArea txt2;
  private JTextArea txt3;
  private JTextArea txt4;
  private JLabel lbl;
  private JLabel lbl1;
  private JLabel lbl2;
  private JLabel lbl3;
  private JLabel lbl4;
  private JLabel lbl5;

  public Gui(){
    setSize(400,400);
    setTitle("calcum");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    JPanel panel=new JPanel();

    lbl=new JLabel("Enter RK1:");
    lbl.setBounds(30,15,150,30);
    add(lbl);

    lbl1=new JLabel("Enter RK2:");
    lbl1.setBounds(30,75,150,30);
    add(lbl1);

    lbl2=new JLabel("Enter RKAverage: ");
    lbl2.setBounds(30,135,150,30);
    add(lbl2);

    lbl3=new JLabel("You want to take: ");
    lbl3.setBounds(30,195,150,30);
    add(lbl3);

    lbl4=new JLabel("Result: ");
    lbl4.setBounds(30,295,150,30);
    add(lbl4);

    txt=new JTextArea();
    txt.setBounds(30,45,120,25);
    txt.setLineWrap(true);
    txt.setWrapStyleWord(true);
    add(txt);

    txt1=new JTextArea();
    txt1.setBounds(30,105,120,25);
    txt1.setWrapStyleWord(true);
    txt1.setLineWrap(true);
    add(txt1);

    txt2=new JTextArea();
    txt2.setBounds(30,165,120,25);
    txt2.setWrapStyleWord(true);
    txt2.setLineWrap(true);
    add(txt2);

    txt3=new JTextArea();
    txt3.setBounds(30,225,120,25);
    txt3.setWrapStyleWord(true);
    txt3.setLineWrap(true);
    add(txt3);

    txt4=new JTextArea();
    txt4.setBounds(30,325,120,25);
    txt4.setWrapStyleWord(true);
    txt4.setLineWrap(true);
    add(txt4);

    pushB=new JButton("EXIT");
    pushB.setBounds(275,325,100,25);
    add(pushB);

    pushB1=new JButton("CALC");
    pushB1.setBounds(30,262,120,30);
    add(pushB1);

    pushB2=new JButton("CLEAR");
    pushB2.setBounds(170,325,100,25);
    add(pushB2);

    pushB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        System.exit(0);
      }
    });

    pushB2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        txt.setText("0");
        txt1.setText("0");
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
      }
    });

    pushB1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        double mid=0.6;
        double ses=0.4;

        double rk1=Double.parseDouble(txt.getText());
        double rk2=Double.parseDouble(txt1.getText());
        double aver=Double.parseDouble(txt2.getText());
        double dream=Double.parseDouble(txt3.getText());

        double result=(dream-(aver*mid))/ses;
        String res=String.valueOf(result);
        txt4.setText(res);
      }
    });
  }
}
