import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage implements ActionListener
{
	String password="1234";
	String username="athul";
	JButton b,r;
	JTextField t,t2;
    JPasswordField pf;
	JLabel l1,l2,l3;
	LoginPage()
	{
		JFrame f=new JFrame("Login Page ");
		JPanel p=new JPanel();
		b=new JButton("LOGIN");
		b.setBounds(200,150,200,30);
		r=new JButton("RESET");
		r.setBounds(200,200,200,30);
		l1=new JLabel("UserName");	
		t=new JTextField();
		t.setBounds(200,50,200,30);
		l1.setBounds(100,50,200,30);
		l2=new JLabel("Password");
		l2.setBounds(100,100,200,30);
		pf=new JPasswordField();
		pf.setBounds(200,100,200,30);
		//t2=new JTextField();
		//t2.setBounds(200,100,200,30);
		l3=new JLabel();
		l3.setBounds(230,300,200,30);
		p.add(b);
		p.add(r);
		p.add(t);
		//p.add(t2);
		p.add(pf);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		b.addActionListener(this);
		r.addActionListener(this);
		f.setContentPane(p);
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			char[] st=pf.getPassword();
			String str=String.valueOf(st);
			//String s=t2.getText();
			String usrnme=t.getText();
			if(str.equals(password)&&usrnme.equals(username))
			{
				l3.setText(".....Welcome User.....");
			}
			else
			{
			    l3.setText("Invalid Username or password!!!!!");
			}
		}
		if(e.getSource()==r)
		{
			t.setText("");
			//t2.setText("");
			pf.setText("");
			l3.setText("");
		}
	}
	public static void main(String[] args)
	{
		new LoginPage();
	}	
}
