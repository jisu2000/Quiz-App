/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import quiz.app.abs.Rules;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

/**
 *
 * @author spjis
 */


public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image =new JLabel(i1);
        add(image);
        image.setBounds(0,0,600,500);

        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        add(heading);
        heading.setFont(new Font("Viner Hand ITC", BOLD,40));
        heading.setForeground(Color.BLUE);


        JLabel name=new JLabel("Enter Your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);



         tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", BOLD,20));
        add(tfname);


        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.red);
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);




        setSize(1200,500);
        setLocation(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules)
        {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(e.getSource()==back)
        {
            setVisible(false);
        }
    }
}
