import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterApp extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JComboBox<String> fromUnit, toUnit;
    private JButton convertButton, clearButton;

    public TemperatureConverterApp() {
        setTitle("Temperature Converter");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(25, 25, 25));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Temperature Converter", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(title, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        inputField = new JTextField();
        inputField.setFont(new Font("Consolas", Font.PLAIN, 18));
        inputField.setBackground(new Color(45, 45, 45));
        inputField.setForeground(Color.WHITE);
        inputField.setCaretColor(Color.WHITE);
        inputField.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
        add(inputField, gbc);

        gbc.gridx = 1;
        String[] units = {"Celsius", "Fahrenheit", "Kelvin"};
        fromUnit = new JComboBox<>(units);
        fromUnit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fromUnit.setBackground(new Color(60, 60, 60));
        fromUnit.setForeground(Color.WHITE);
        add(fromUnit, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        outputField = new JTextField();
        outputField.setFont(new Font("Consolas", Font.PLAIN, 18));
        outputField.setEditable(false);
        outputField.setBackground(new Color(45, 45, 45));
        outputField.setForeground(Color.WHITE);
        outputField.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
        add(outputField, gbc);

        gbc.gridx = 1;
        toUnit = new JComboBox<>(units);
        toUnit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        toUnit.setBackground(new Color(60, 60, 60));
        toUnit.setForeground(Color.WHITE);
        add(toUnit, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        convertButton.setBackground(new Color(0, 120, 215));
        convertButton.setForeground(Color.WHITE);
        convertButton.setFocusPainted(false);
        convertButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        convertButton.addActionListener(this);
        add(convertButton, gbc);

        gbc.gridx = 1;
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        clearButton.setBackground(new Color(220, 53, 69));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        clearButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        clearButton.addActionListener(e -> {
            inputField.setText("");
            outputField.setText("");
        });
        add(clearButton, gbc);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double input = Double.parseDouble(inputField.getText());
            String from = (String) fromUnit.getSelectedItem();
            String to = (String) toUnit.getSelectedItem();
            double result = convertTemperature(input, from, to);
            outputField.setText(String.format("%.2f", result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double convertTemperature(double value, String from, String to) {
        double celsius;

        // Convert from source to Celsius
        switch (from) {
            case "Celsius":
                celsius = value;
                break;
            case "Fahrenheit":
                celsius = (value - 32) * 5 / 9;
                break;
            case "Kelvin":
                celsius = value - 273.15;
                break;
            default:
                celsius = value;
        }

        // Convert from Celsius to target
        switch (to) {
            case "Celsius":
                return celsius;
            case "Fahrenheit":
                return (celsius * 9 / 5) + 32;
            case "Kelvin":
                return celsius + 273.15;
            default:
                return celsius;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TemperatureConverterApp::new);
    }
}
