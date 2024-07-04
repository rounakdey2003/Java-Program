import java.awt.*;
import java.awt.event.*;

public class bg_change_button  extends Frame implements ActionListener {
        Button button;
        Panel panel;

        public bg_change_button(){
            setTitle("Bg Button");
            setSize(500,400);


            panel = new Panel();
            add(panel);

            button = new Button("Color");
            button.addActionListener(this);
            panel.add(button);

        setVisible(true);
        }

        public void actionPerformed(ActionEvent a){
            if(a.getSource()==button){
                Color random = new Color(
                        (int)(Math.random()*256),
                        (int)(Math.random()*256),
                        (int)(Math.random()*256)
                );
                panel.setBackground(random);
            }
        }

    public static void main(String[] args) {
        new bg_change_button();
    }
}