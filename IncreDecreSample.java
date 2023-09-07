import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class IncreDecreSample implements ActionListener
{
	JTextField t1,t2;
	JButton b1,b2;
	IncreDecreSample()
	{
     	JFrame f=new JFrame();
		JPanel p=new JPanel();
		t1=new JTextField();
		t1.setBounds(100,100,200,30);
		t2=new JTextField();
		t2.setBounds(100,150,200,30);
		b1=new JButton("+");
		b1.setBounds(100,200,50,30);
		b2=new JButton("-");
		b2.setBounds(270,200,50,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		p.add(t1);
		p.add(t2);
		f.setContentPane(p);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s=t1.getText();
		int num=Integer.parseInt(s);
		if(e.getSource()==b1)
		{
			num=num+1;
			s=Integer.toString(num);
			t2.setText(s);
		}
		if(e.getSource()==b2)
		{
			num=num-1;
			s=Integer.toString(num);
			t2.setText(s);	
		}
	}
	
		public static void main(String[] args) {
			new IncreDecreSample();
	}
}
