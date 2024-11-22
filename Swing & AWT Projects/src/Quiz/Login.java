package Quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
	JButton back,next;
	JTextField jtf;
   Login()
   {
	   getContentPane().setBackground(Color.white);
	   setLayout(null);
	   ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("images/login.jpeg"));
	   JLabel j = new JLabel(i);
	   add(j);
	   j.setBounds(0,0,600,365);
	   
	   JLabel jl= new JLabel("Simple Minds Game");
	   jl.setBounds(700,60,500,45);
	   jl.setFont(new Font("Viner Hand ITC",Font.ITALIC, 40));
	   jl.setForeground(new Color(30,144,254));
	   add(jl);
	   
	   JLabel jl2= new JLabel("Enter your name");
	   jl2.setBounds(700,150,500,35);
	   jl2.setFont(new Font("Mongolian Baiti",Font.BOLD, 30));
	   jl2.setForeground(new Color(30,184,200));
	   add(jl2);
	   
	   jtf = new JTextField();
	   jtf.setBounds(700,200,360,25);
	   jtf.setFont(new Font("Times New Roman",Font.BOLD, 25));
	   add(jtf);
	   
	   back= new JButton("Back");
	   back.setBounds(735,270,120,25);
	   back.setBackground(new Color(30,144,254));
	   back.setForeground(Color.white);
	   back.addActionListener(this);
	   add(back);
	   
	   next= new JButton("Next");
	   next.setBounds(915,270,120,25);
	   next.setBackground(new Color(30,144,254));
	   next.setForeground(Color.white);
	   next.addActionListener(this);
	   add(next);
	   
	   setSize(1200,400);
	   setLocation(175,195);
	   setVisible(true);
   }
	   public void actionPerformed(ActionEvent ae)
	   {
		   if(ae.getSource()==next) {
			   String name=jtf.getText();
			   setVisible(false);
			   new Rules(name);
		   }
		   else if(ae.getSource()==back)
		   {
			   setVisible(false);
		   }
	   }
	public static void main(String[] args) {
		new Login();
	}

}
