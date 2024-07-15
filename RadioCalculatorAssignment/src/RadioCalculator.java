import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioCalculator extends JFrame implements ActionListener {
    JButton calcBtn;
    JButton clearBtn;
    JRadioButton multiRbtn;
    JRadioButton addRbtn;
    JRadioButton subRBtn;
    JRadioButton divRBtn;
    JTextField num1Text;
    JTextField num2Text;
    JTextField resText;

    public RadioCalculator() {
        ButtonGroup bg = new ButtonGroup();

        JPanel main = new JPanel();
        JPanel xPanel = new JPanel();
        JPanel yPanel = new JPanel();
        JPanel zPanel = new JPanel();
        JPanel ansPanel = new JPanel();
        this.add(main);

        main.setLayout(new GridLayout(4,1));
        JLabel label1 = new JLabel("First Number:");
        JLabel label2 = new JLabel("Second Number:");

        xPanel.add(label1);
        xPanel.add(num1Text =new JTextField("0",5));
        xPanel.add(label2);
        xPanel.add(num2Text =new JTextField("0",5));

        yPanel.add(multiRbtn =new JRadioButton("Multiplication"));
        yPanel.add(addRbtn =new JRadioButton("Addition"));
        yPanel.add(subRBtn =new JRadioButton("Subtraction"));
        yPanel.add(divRBtn =new JRadioButton("Division"));

        zPanel.add(calcBtn =new JButton("Calculate"));
        zPanel.add(clearBtn =new JButton("Clear"));
        JLabel labelRes = new JLabel("Result:");

        ansPanel.add(labelRes);
        ansPanel.add(resText =new JTextField("0",5));
        main.add(xPanel);
        main.add(yPanel);
        main.add(zPanel);
        main.add(ansPanel);

        calcBtn.addActionListener(this);
        clearBtn.addActionListener(this);
    }

    public static void main(String[] args) {
        RadioCalculator calculator = new RadioCalculator();
        calculator.setVisible(true);
        calculator.setSize(350,350);
        calculator.setTitle("GUI Radio Calculator");
        calculator.setResizable(true);
        int a, b, c, d;

        a = 4;

        b = 12;

        c = 37;

        d = 51;

        if ( a < b )

            System.out.print( "a < b " );

        if ( a > b )

            System.out.print( "a > b " );

        if ( d <= c )

            System.out.print( "d <= c " );

        if ( c != d )

            System.out.print( "c != d " );
    }

    public void actionPerformed(ActionEvent e) {
        double ans=0;
        if(e.getSource() == calcBtn) {
            if(multiRbtn.isSelected()) {
                ans=Double.parseDouble(num2Text.getText()) * Double.parseDouble(num1Text.getText());
                resText.setText(String.valueOf(ans));

            }else if(addRbtn.isSelected()) {
                ans=Double.parseDouble(num2Text.getText()) + Double.parseDouble(num1Text.getText());
                resText.setText(String.valueOf(ans));
            }else if(subRBtn.isSelected()) {
                ans=Double.parseDouble(num1Text.getText()) - Double.parseDouble(num2Text.getText());
                resText.setText(String.valueOf(ans));
            }else if(divRBtn.isSelected()) {
                ans=Double.parseDouble(num1Text.getText()) / Double.parseDouble(num2Text.getText());
                resText.setText(String.valueOf(ans));
            }else {
                num1Text.setText("0");
                num2Text.setText("0");
                resText.setText("0");
            }
        }else if(e.getSource() == clearBtn) {
            num1Text.setText("0");
            num2Text.setText("0");
            resText.setText("0");
        }
    }
}
