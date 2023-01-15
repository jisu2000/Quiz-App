package quiz.app.abs;

import User.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {


    JButton submit,Close;
    public Score(String name, int score){

        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        add(image);
        image.setBounds(0, 250, 300, 250);


       JLabel heading = new JLabel("Thankyou "+name+" for playing Simple minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel sc = new JLabel("Your Score is: "+score);
        sc.setBounds(350, 200, 300, 30);
        sc.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(sc);


        submit = new JButton("Play Again");
        submit.setBounds(380, 270, 150, 50);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.yellow);
        submit.setForeground(Color.red);
        submit.addActionListener(this);
        add(submit);


        Close = new JButton("Close");
        Close.setBounds(380, 350, 150, 50);
        Close.setFont(new Font("Tahoma", Font.PLAIN, 22));
        Close.setBackground(Color.red);
        Close.setForeground(Color.white);
        Close.addActionListener(this);
        add(Close);





        setVisible(true);


    }
    public static void main(String[] args) {
        new Score("user",0);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit) {
            setVisible(false);
            new Login();
        }
        else if(e.getSource()==Close)
        {
            setVisible(false);
        }
    }
}
