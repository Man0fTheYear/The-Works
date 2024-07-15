import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

class CalculatorGUI extends JFrame{
    static JFrame mainFrame;
    static JTextField field;

    public static void main(String args[])
    {

        mainFrame = new JFrame("calculator");

        CalculatorGUI MyCalculator = new CalculatorGUI();

        field = new JTextField(16);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        beq1 = new JButton("=");
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
        be = new JButton(".");
        JPanel panel = new JPanel();
        Border border = BorderFactory.createTitledBorder("CalculatorGUI");
        panel.add(field);
        panel.add(ba);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bs);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bm);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bd);
        panel.add(be);
        panel.add(b0);
        panel.add(beq);
        panel.add(beq1);
        panel.setBorder(border);
        panel.setBackground(Color.red);

        mainFrame.add(panel);

        mainFrame.setSize(240, 275);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

}
