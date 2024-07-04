import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class TotalAverage extends JFrame implements ActionListener{
	static JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;

	public TotalAverage(){
		p1 = new JPanel();
		f1.getContentPane().add(p1);
		
		l1 = new JLabel("Enter marks1      : ");
		p1.add(l1);
		t1 = new JTextField(10);
		p1.add(t1);

		l2 = new JLabel("Enter marks2   : ");
		p1.add(l2);
		t2 = new JTextField(10);
		p1.add(t2);

		l3 = new JLabel("Enter marks3 : ");
		p1.add(l3);
		t3 = new JTextField(10);
		p1.add(t3);		

	
		b1=new JButton("Calculate Total");
		p1.add(b1);
		t4 = new JTextField(10);
		p1.add(t4);
		b1.addActionListener(this);


		b2=new JButton("Calculate Average");
		p1.add(b2);
		t5 = new JTextField(10);
		p1.add(t5);		
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae){
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int c = Integer.parseInt(t3.getText());
		int d = 0;
		float avg = 0;
		if(ae.getSource().equals(b1)){
			d = a+b+c;
			t4.setText(String.valueOf(d));
		}
		
		else if(ae.getSource().equals(b2)){
			avg = a+b+c/3;
			t5.setText(String.valueOf(avg));
		}
		else{
			System.out.println("Input is not Correct!!!");
		}
	}
	public static void main(String args[])
	{	
		f1=new JFrame("Calculation of total and average of marks");
		TotalAverage s1=new TotalAverage();
		f1.setSize(800,800);
		f1.setVisible(true);
	}
}