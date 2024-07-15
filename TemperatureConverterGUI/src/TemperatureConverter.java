import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TemperatureConverter {
    static JTextField celInput = new JTextField("0");
    static JTextField fahrenheit, celsius;
    static private double calcCF (double c) {
            double f = c * 9/5 + 32;
            return f;
        }

    public static void main(String args[]) {
        JFrame window = new JFrame("Temperature Conversion");

        JPanel main = new JPanel();
        JPanel xPanel = new JPanel();
        JPanel yPanel = new JPanel();
        JPanel zPanel = new JPanel();
        JPanel ansPanel = new JPanel();

        main.add(xPanel);
        main.add(yPanel);
        main.add(zPanel);
        main.add(ansPanel);

        celsius = new JTextField("0", 5);

        fahrenheit = new JTextField("32", 4);
        fahrenheit.setEditable( false );

        JLabel celLabel = new JLabel("Enter Celsius:");
        JLabel fahLabel = new JLabel("Fahrenheit:");
        JButton calcBtn = new JButton("  Calculate  ");
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double inC = 0;
                try {
                    inC = Double.parseDouble(celsius.getText());
                } catch (Exception ex) {
                    celsius.setText("0");
                }
                fahrenheit.setText(String.valueOf(calcCF(inC)));
            }
            });

        JButton clearBtn = new JButton("   Clear   ");
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celsius.setText("0");
                fahrenheit.setText("0");
            }
        });

        main.setLayout(new GridLayout(3,1));
        xPanel.add(celLabel);
        xPanel.add(celsius);

        yPanel.add(fahLabel);
        yPanel.add(fahrenheit);

        zPanel.add(calcBtn);
        ansPanel.add(clearBtn);

        window.setContentPane(main);
        window.setSize(370,200);
        window.setLocation(100,100);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setVisible(true);
    }
}
