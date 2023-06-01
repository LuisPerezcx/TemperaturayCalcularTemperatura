package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalGUI extends JFrame{
    private JPanel panel1;
    private JPanel contenedor;
    public JTextField txtCelsius;
    private JTextField txtFarenheit;
    private JButton convertirCelsiusButton;
    private JButton convertirFarenheitButton;

    public PrincipalGUI() {
        setupFrame();
        addActionListeners();
    }
    private void setupFrame() {
        setTitle("Formulario Estudiantes");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(500, 230);
        add(panel1);
    }
    private void addActionListeners(){
        convertirCelsiusButton.addActionListener(new EventClick());
        convertirFarenheitButton.addActionListener(new EventClick());
    }
    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String btn1 = btn.getText();
            System.out.println(btn1);
            switch (btn1){
                case "Convertir a Celsius" ->{
                    String temp = txtFarenheit.getText();
                    float farenheit = Float.parseFloat(temp);
                    float celsius = (farenheit - 32) * 5/9;
                    txtCelsius.setText(String.valueOf(celsius));
                    txtFarenheit.setText("");
                }
                case "Convertir a Farenheit" ->{
                    String temp = txtCelsius.getText();
                    float celsius = Float.parseFloat(temp);
                    float farenheit = (celsius * 9/5) + 32;
                    txtFarenheit.setText(String.valueOf(farenheit));
                    txtCelsius.setText("");
                }
            }
        }
    }
}
