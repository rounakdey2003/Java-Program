
import java.awt.*;  
import javax.swing.*;  
import javax.swing.border.*;


public class View2 extends JFrame {
    public View2(){
        this.setPreferredSize(new Dimension(600, 600));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.BLACK);

        JPanel p1 = new JPanel();
	JLabel lpassword = new JLabel("Enter the password: ");
	add(lpassword);
	JTextField tpassword = new JTextField(12);
	add(tpassword);

        p1.setSize(200, 400);
        p1.setBorder(border);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));


        panel.add(p1);

        this.add(panel);
        this.setVisible(true);
    }
    public static void main(String argv[])
	{
		View2 obj=new View2();
	}
}