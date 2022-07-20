import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cgpatopercentage {
    private JTextField textField1;
    private JButton enterButton;
    private JTextField textField2;
    private JPanel Main;
    private JTextField textField3;
    private JTextField textField4;

    public Cgpatopercentage() {
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cgpa = Double.parseDouble(textField1.getText());
                double percentage;
                if (cgpa >= 9.5 && cgpa <= 10) {
                    percentage = (20 * cgpa) - 100;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("O / Outstanding");
                } else if (cgpa >= 8.25 && cgpa <= 9.5) {
                    percentage = (12 * cgpa) - 25;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("A+ / Excellent");
                } else if (cgpa >= 6.75 && cgpa <= 8.25) {
                    percentage = (10 * cgpa) - 7.5;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("A / Very good");
                } else if (cgpa >= 5.75 && cgpa <= 6.75) {
                    percentage = (5 * cgpa) + 26.25;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("B+ / good");
                } else if (cgpa >= 5.25 && cgpa <= 5.75) {
                    percentage = (10 * cgpa) - 2.5;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("B / Above Average");
                } else if (cgpa >= 4.75 && cgpa <= 5.25) {
                    percentage = (10 * cgpa) - 2.5;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("C / Average");
                } else if (cgpa >= 4 && cgpa <= 4.75) {
                    percentage = (6.6 * cgpa) + 13.6;
                    textField2.setText(Double.toString(percentage));
                    textField3.setText("D / Pass");
                } else if (cgpa > 10) {
                    textField2.setText("Error");
                    textField3.setText("N/A");
                } else {
                    textField2.setText("Failed");
                    textField3.setText("N/A");
                }
                if (cgpa >= 7.75 && cgpa <= 10) {
                    textField4.setText("First Class With Distinction");
                } else if (cgpa >= 6.75 && cgpa < 7.75) {
                    textField4.setText("First Class");
                } else if (cgpa >= 6.25 && cgpa < 6.75) {
                    textField4.setText("Higher Second Class");
                } else if (cgpa >= 5.5 && cgpa < 6.25) {
                    textField4.setText("Second Class");
                } else {
                    textField4.setText("N/A");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cgpatopercentage");
        frame.setContentPane(new Cgpatopercentage().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
