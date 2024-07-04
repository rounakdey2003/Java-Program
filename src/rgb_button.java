import java.awt.*;
import java.awt.event.*;

public class rgb_button  extends Frame implements ActionListener {
    Button redButton, blueButton, greenButton, refreshButton;
    public rgb_button(){

        setLayout(new FlowLayout());

        redButton = new Button("Red");
        redButton.addActionListener(this);
        add(redButton);

        blueButton = new Button("Blue");
        blueButton.addActionListener(this);
        add(blueButton);

        greenButton = new Button("Green");
        greenButton.addActionListener(this);
        add(greenButton);

        refreshButton = new Button("Refresh");
        refreshButton.addActionListener(this);
        add(refreshButton);
        
        setTitle("rgb Button");
        setSize(500,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==redButton){
            setBackground(Color.red);
        } else if (ae.getSource()==blueButton) {
            setBackground(Color.blue);
        } else if (ae.getSource()==greenButton) {
            setBackground(Color.green);
        } else if (ae.getSource()==refreshButton) {
            setBackground(Color.white);
        }
    }

    public static void main(String[] args) {
        new rgb_button();
    }
}