import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VelocityConverter implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	double res;
	VelocityConverter()
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		t1=new JTextField();
		t1.setBounds(100,100,200,30);
		t2=new JTextField();
		t2.setBounds(100,200,200,30);
		b1=new JButton("convert");
		b1.setBounds(140,150,100,30);
		p.add(t1);
		p.add(t2);
		p.add(b1);
		b1.addActionListener(this);
		f.setContentPane(p);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
	{
		String s=t1.getText();
		//t1.setText("");
		int num=Integer.parseInt(s);
		double i=.2778;
	    res=res+(i*num);
	    //int re=(int)res;
	    //System.out.println(res);
		t2.setText(Double.toString(res));
	}
}
public static void main(String[] args)
{
	 new VelocityConverter();
}
}
