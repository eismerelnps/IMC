import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel mainPanel;
    private JTextField weightTextField;
    private JTextField heightTextField;
    private JButton Calculate;
    private boolean pass = false;
    IMCenter imCenter = new IMCenter();

    public GUI(boolean pass){
        this.pass = pass;

    }


    public GUI() {
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ceckValue(Double.valueOf(weightTextField.getText()), Double.valueOf(heightTextField.getText()));
            }
        });
    }
    public void ceckValue(Double weight, Double high ){
        if (Integer.parseInt(weightTextField.getText()) < 1){
            pass = false;
            JOptionPane.showMessageDialog(
                    null,
                    "Insert a valid weight major than 1",
                    "Error",
                    1,
                    null);
        }else {
            pass = true;
            showIMC();
        }

    }
    public void showIMC(){
        double IMC = imCenter.calculateIMC(Double.valueOf(weightTextField.getText()), Double.valueOf(heightTextField.getText()));

        JOptionPane.showMessageDialog(
                null,
                "Your IMC is: "+IMC+ " you have a "+imCenter.Value(),
                "",
                1,
                null);
    }

    public void StartGUI() {
    JFrame window = new JFrame("IMCalculator");
    window.setContentPane(mainPanel);
    window.pack();
    window.setBounds(0, 0, 400, 400);
    window.setMinimumSize(new Dimension(400, 400));
    window.setVisible(true);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}


