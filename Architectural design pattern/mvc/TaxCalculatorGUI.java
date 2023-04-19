import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaxCalculatorGUI extends JFrame implements ActionListener {
    private JLabel lblIncome, lblTaxRate, lblTaxAmount;
    private JTextField txtIncome, txtTaxRate, txtTaxAmount;
    private JButton btnCalculate;
    
    public TaxCalculatorGUI() {
        setTitle("Tax Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        
        lblIncome = new JLabel("Income:");
        add(lblIncome);
        txtIncome = new JTextField();
        add(txtIncome);
        
        lblTaxRate = new JLabel("Tax Rate (%):");
        add(lblTaxRate);
        txtTaxRate = new JTextField();
        add(txtTaxRate);
        
        lblTaxAmount = new JLabel("Tax Amount:");
        add(lblTaxAmount);
        txtTaxAmount = new JTextField();
        txtTaxAmount.setEditable(false);
        add(txtTaxAmount);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
        add(btnCalculate);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            try {
                double income = Double.parseDouble(txtIncome.getText());
                double taxRate = Double.parseDouble(txtTaxRate.getText()) / 100;
                double taxAmount = income * taxRate;
                txtTaxAmount.setText(String.format("%.2f", taxAmount));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a number.");
            }
        }
    }
    
    public static void main(String[] args) {
        new TaxCalculatorGUI();
    }
}
