import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements ActionListener, WindowListener {
    private TextField f = new TextField();
    private JButton b8 = new JButton("8");
    private JButton b7 = new JButton("7");
    private JButton b9 = new JButton("9");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b4 = new JButton("4");
    private JButton b0 = new JButton("0");
    private JButton Equally = new JButton("=");
    private JButton Minus = new JButton("-");
    private JButton Plus = new JButton("+");
    private JButton Division = new JButton("/");
    private JButton Multiplication = new JButton("*");
    private JButton WrongSide = new JButton("±");
    private JButton D = new JButton("D");
    private JButton Del = new JButton("C");
    private int a = 0;
    private int b = 0;
    private char z;
    private int l=60;
    private int m=60;
    private String text = "";


    public window() {
        Font ex = new Font("Impact", Font.BOLD,40);
        //выбрали шрифт
        setLayout(null);
        setSize(400,600);
        setVisible(true);
        setLocation(550,150);
        // прописали параметры самого окна
        f.setFont(ex);
        f.setSize(330,60);
        f.setLocation(25,25);
        f.setVisible(true);
        add(f);
        //добавили центральное окошко
        b8.setSize(l,m);
        b8.setLocation(105,225);
        b8.setVisible(true);
        add(b8);
        b8.setFont(ex);
        //добавили кнопку 8  дали ей доступ к тому же шрифту
        b7.setSize(l,m);
        b7.setLocation(25,225);
        b7.setVisible(true);
        add(b7);
        b7.setFont(ex);
        //добавили кнопку 7  дали ей доступ к тому же шрифту
        b9.setSize(l,m);
        b9.setLocation(185,225);
        b9.setVisible(true);
        add(b9);
        b9.setFont(ex);
        //добавили кнопку 9  дали ей доступ к тому же шрифту
        b4.setSize(l,m);
        b4.setLocation(25,305);
        b4.setVisible(true);
        add(b4);
        b4.setFont(ex);
        //добавили кнопку 4  дали ей доступ к тому же шрифту
        b5.setSize(l,m);
        b5.setLocation(105,305);
        b5.setVisible(true);
        add(b5);
        b5.setFont(ex);
        //добавили кнопку 5  дали ей доступ к тому же шрифту
        b6.setSize(l,m);
        b6.setLocation(185,305);
        b6.setVisible(true);
        add(b6);
        b6.setFont(ex);
        //добавили кнопку 6  дали ей доступ к тому же шрифту
        b1.setSize(l,m);
        b1.setLocation(25,385);
        b1.setVisible(true);
        add(b1);
        b1.setFont(ex);
        //добавили кнопку 1  дали ей доступ к тому же шрифту
        b2.setSize(l,m);
        b2.setLocation(105,385);
        b2.setVisible(true);
        add(b2);
        b2.setFont(ex);
        //добавили кнопку 2  дали ей доступ к тому же шрифту
        b3.setSize(l,m);
        b3.setLocation(185,385);
        b3.setVisible(true);
        add(b3);
        b3.setFont(ex);
        //добавили кнопку 3  дали ей доступ к тому же шрифту
        b0.setSize(l,m);
        b0.setLocation(105,465);
        b0.setVisible(true);
        add(b0);
        b0.setFont(ex);
        //добавили кнопку 0  дали ей доступ к тому же шрифту
        WrongSide.setSize(l,m);
        WrongSide.setLocation(25,465);
        WrongSide.setVisible(true);
        add(WrongSide);
        WrongSide.setFont(ex);
        //добавили кнопку ± дали ей доступ к тому же шрифту
        D.setSize(l,m);
        D.setLocation(265,305);
        D.setVisible(true);
        add(D);
        D.setFont(ex);
        //добавили кнопку D дали ей доступ к тому же шрифту
        Equally .setSize(l,140);
        Equally .setLocation(265,385);
        Equally .setVisible(true);
        add(Equally );
        Equally .setFont(ex);
        //добавили кнопку Equally  дали ей доступ к тому же шрифту
        Minus.setSize(l,m);
        Minus.setLocation(105,145);
        Minus.setVisible(true);
        add(Minus);
        Minus.setFont(ex);
        //добавили кнопку Minus  дали ей доступ к тому же шрифту
        Plus.setSize(l,m);
        Plus.setLocation(25,145);
        Plus.setVisible(true);
        add(Plus);
        Plus.setFont(ex);
        //добавили кнопку Plus дали ей доступ к тому же шрифту
        Division.setSize(l,m);
        Division.setLocation(265,145);
        Division.setVisible(true);
        add(Division);
        Division.setFont(ex);
        //добавили кнопку Division дали ей доступ к тому же шрифту
        Multiplication.setSize(l,m);
        Multiplication.setLocation(185,145);
        Multiplication.setVisible(true);
        add(Multiplication);
        Multiplication.setFont(ex);
        //добавили кнопку Plus  дали ей доступ к тому же шрифту
        Del.setSize(l,m);
        Del.setLocation(265,225);
        Del.setVisible(true);
        add(Del);
        Del.setFont(ex);
        //добавили кнопку Del  дали ей доступ к тому же шрифту
        b8.addActionListener(this);
        b7.addActionListener(this);
        b9.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b0.addActionListener(this);
        Equally.addActionListener(this);
        Plus.addActionListener(this);
        Minus.addActionListener(this);
        Division.addActionListener(this);
        Multiplication.addActionListener(this);
        WrongSide.addActionListener(this);
        D.addActionListener(this);
        Del.addActionListener(this);

        //прописали параметры первого окошка и добавили их
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            text = text + b7.getText();
            f.setText(text);
        }
        if(e.getSource()==b8){
            text = text + b8.getText();
            f.setText(text);
        }
        if(e.getSource()==b9){
            text = text + b9.getText();
            f.setText(text);
        }
        if(e.getSource()==b1){
            text = text + b1.getText();
            f.setText(text);
        }
        if(e.getSource()==b2){
            text = text + b2.getText();
            f.setText(text);
        }
        if(e.getSource()==b3){
            text = text + b3.getText();
            f.setText(text);
        }
        if(e.getSource()==b4){
            text = text + b4.getText();
            f.setText(text);
        }
        if(e.getSource()==b5){
            text = text + b5.getText();
            f.setText(text);
        }
        if(e.getSource()==b6){
            text = text + b6.getText();
            f.setText(text);
        }
        if(e.getSource()==b0){
            text = text + b0.getText();
            f.setText(text);
        }
        if(e.getSource()==Plus){
            a = Integer.parseInt(text);
            f.setText(text+ Plus.getText());
            text = "";
            z = '+';
        }
        if(e.getSource()==Minus){
            a = Integer.parseInt(text);
            f.setText(text+ Minus.getText());
            text = "";
            z = '-';
        }
        if(e.getSource()==Division){
            a = Integer.parseInt(text);
            f.setText(text+ Division.getText());
            text = "";
            z = '/';
        }
        if(e.getSource()==Multiplication){
            a = Integer.parseInt(text);
            f.setText(text+ Multiplication.getText());
            text = "";
            z = '*';
        }
        if(e.getSource() == WrongSide){
            int c = Integer.parseInt(f.getText());
            c = c * -1;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }



        if(e.getSource()==Equally){
            if(z == '+'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a+b));
            }
            if(z == '-'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a-b));
            }
            if(z == '/'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a/b));
            }
            if(z == '*'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a*b));
            }

        }
        if(e.getSource()==D){
            int c = Integer.parseInt(f.getText());
            c= c/10;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if(e.getSource()==Del){
            text = "";
            f.setText(text);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
