import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaxCalculator extends JFrame implements ActionListener {
    private JButton oldButton;
    private JButton newButton;
    private JLabel taxLabel;
    private JTextField amountField;

    public TaxCalculator() {
        super("Tax Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        oldButton = new JButton("Old Tax");
        oldButton.addActionListener(this);
        newButton = new JButton("New Tax");
        newButton.addActionListener(this);
        taxLabel = new JLabel("Click a button to calculate tax");
        amountField = new JTextField(10);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Amount: "));
        inputPanel.add(amountField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(oldButton);
        buttonPanel.add(newButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(taxLabel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == oldButton) {
            double amount = Double.parseDouble(amountField.getText());
            double tax1;
            double taxRate1 = 0.05;
            double taxRate2 = 0.18;
            double taxRate3 = 0.27;
            if(amount<=500000){
                 tax1 = amount * taxRate1;
            }else if(amount>500000 && amount<1000000){
                 tax1 = amount * taxRate2;
            }else{
                 tax1 = amount * taxRate3;
            }
            

            taxLabel.setText(String.format("Old Tax: %.2f", tax1));
        } else if (e.getSource() == newButton) {
            double amount = Double.parseDouble(amountField.getText());
            double taxRate = 0.18;
            double tax = amount * taxRate;
            taxLabel.setText(String.format("New Tax: %.2f", tax));
        }
    }
    public static void main(String[] args) {
        new TaxCalculator();
    }
}
