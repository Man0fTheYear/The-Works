import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class FinalCalculator extends JFrame {
JTextField screen = new JTextField("", 10);
double operand1;
double operand2;
double answer;
char operator = ' ';
JButton b0 = new JButton("0");
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
JButton beq1 = new JButton("=");
JButton ba = new JButton("+");
JButton bs = new JButton("-");
JButton bd = new JButton("/");
JButton bm = new JButton("*");
JButton beq = new JButton("C");
JButton be = new JButton(".");
JButton bsi = new JButton("+/-");

public FinalCalculator() {
    JPanel main = new JPanel();
    JPanel aPanel = new JPanel();
    JPanel bPanel = new JPanel();
    JPanel cPanel = new JPanel();
    JPanel dPanel = new JPanel();
    JPanel ePanel = new JPanel();
    JPanel fPanel = new JPanel();
    this.add(main);
    main.setLayout(new GridLayout(6,1));

    aPanel.add(screen);
    screen.setHorizontalAlignment(JTextField.RIGHT);
    bPanel.add(b1);
    bPanel.add(b2);
    bPanel.add(b3);
    bPanel.add(b4);
    cPanel.add(b5);
    cPanel.add(b6);
    cPanel.add(b7);
    cPanel.add(b8);
    dPanel.add(b9);
    dPanel.add(b0);
    dPanel.add(ba);
    dPanel.add(bs);
    ePanel.add(bd);
    ePanel.add(bm);
    ePanel.add(bsi);
    ePanel.add(be);
    fPanel.add(beq);
    fPanel.add(beq1);
    main.add(aPanel);
    main.add(bPanel);
    main.add(cPanel);
    main.add(dPanel);
    main.add(ePanel);
    main.add(fPanel);

    b0.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("0");
            } else {
                screen.setText(ans + "0");
            }
        }
    });
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("1");
            } else {
                screen.setText(ans + "1");
            }
        }
    });
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("2");
            } else {
                screen.setText(ans + "2");
            }
        }
    });
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("3");
            } else {
                screen.setText(ans + "3");
            }
        }
    });
    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("4");
            } else {
                screen.setText(ans + "4");
            }
        }
    });
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("5");
            } else {
                screen.setText(ans + "5");
            }
        }
    });
    b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("6");
            } else {
                screen.setText(ans + "6");
            }
        }
    });
    b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("7");
            } else {
                screen.setText(ans + "7");
            }
        }
    });
    b8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("8");
            } else {
                screen.setText(ans + "8");
            }
        }
    });
    b9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
            if (screen.getText() == "") {
                screen.setText("9");
            } else {
                screen.setText(ans + "9");
            }
        }
    });
    be.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (screen.getText() == "") {
                screen.setText(".");
            } else
                if (!(screen.getText().contains("."))) {
                    screen.setText(screen.getText() + ".");
            }
        }
    });
    bsi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String ans = screen.getText();
           int num = Integer.valueOf(ans) * -1;
           screen.setText(String.valueOf(num));
        }
    });
    ba.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            operand1 = Double.parseDouble(screen.getText());
            screen.setText("");
            if (operator == ' ') {
                operator = '+';
            } else {

            }
        }
    });
    bs.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            operand1 = Double.parseDouble(screen.getText());
            screen.setText("");
            if (operator == ' ') {
                operator = '-';
            } else {

            }
        }
    });
    bm.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            operand1 = Double.parseDouble(screen.getText());
            screen.setText("");
            if (operator == ' ') {
                operator = '*';
            } else {

            }
        }
    });
    bd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            operand1 = Double.parseDouble(screen.getText());
            screen.setText("");
            if (operator == ' ') {
                operator = '/';
            } else {

            }
        }
    });
    beq.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            screen.setText("");
            operator = ' ';
            operand1 = 0;
            operand2 = 0;
        }
    });
    beq1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            operand2 = Double.parseDouble(screen.getText());
            switch (operator) {
                case '+': answer = operand1 + operand2;
                    System.out.println("operand1: " + operand1 + " + " + "operand2: " + operand2 + " = " + answer);
                break;
                case '-': answer = operand1 - operand2;
                    System.out.println("operand1: " + operand1 + " - " + "operand2: " + operand2 + " = " + answer);
                break;
                case '*': answer = operand1 * operand2;
                    System.out.println("operand1: " + operand1 + " * " + "operand2: " + operand2 + " = " + answer);
                break;
                case '/': answer = operand1 / operand2;
                    DecimalFormat df = new DecimalFormat("0.000000");
                    answer = Double.valueOf( df.format(answer));
                    System.out.println("operand1: " + operand1 + " : " + "operand2: " + operand2 + " = " + answer);
                break;
            }

            screen.setText(String.valueOf(answer));
        }
    });
    }

    public static void main(String[] args) {
        FinalCalculator calculator = new FinalCalculator();
        calculator.setVisible(true);
        calculator.setSize(230,270);
        calculator.setTitle("Functioning GUI Calculator");
        calculator.setResizable(false);
    }
}

