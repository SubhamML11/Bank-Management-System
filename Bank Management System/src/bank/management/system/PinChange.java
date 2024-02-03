package bank.management.system;
import java.awt.*;
//import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
	
	JPasswordField repin,pin;
	 JButton change,back;
	 String pinnumber;
	
	PinChange(String pinnumber ){
		this.pinnumber=pinnumber;
		
		setLayout(null);
		setSize(900,900);
		setLocation(300,0);
		//setUndecorated(true);
		setVisible(true);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("Change Your Pin");
		text.setBounds(250,280,500,35);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		JLabel pintext=new JLabel("New Pin: ");
		pintext.setBounds(165,320,180,25);
		pintext.setFont(new Font("Raleway",Font.BOLD,16));
		pintext.setForeground(Color.WHITE);
		image.add(pintext);
		
		 pin=new JPasswordField();
		pin.setFont(new Font("Raleway",Font.BOLD,25));
		pin.setBounds(330,320,180,25);
		image.add(pin);
		
		JLabel repintext=new JLabel("Re-Enter New Pin: ");
		repintext.setBounds(165,360,180,25);
		repintext.setFont(new Font("Raleway",Font.BOLD,16));
		repintext.setForeground(Color.WHITE);
		image.add(repintext);
		
		 repin=new JPasswordField();
		repin.setFont(new Font("Raleway",Font.BOLD,25));
		repin.setBounds(330,360,180,25);
		image.add(repin);
		
		  change=new JButton("Change");
		 change.setBounds(355, 485, 150, 30);
		 change.addActionListener(this);
			image.add(change);
			
			 back=new JButton("Back");
			back.setBounds(355, 520, 150, 30);
			back.addActionListener(this);
			image.add(back);
		
		
	}
	
	public static void main (String args[]) {
		   new PinChange("").setVisible(true);
		   
	   }

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==change) {
		try {
			//Conn c=new Conn();
			String npin=pin.getText();
			String rpin=repin.getText();
			
			if(!npin.equals(rpin)) {
				JOptionPane.showMessageDialog(null,"Your new Pin & Re-Entered pin doesn't match!! ");
				return;
			}
			else if(npin.equals("")) {
				JOptionPane.showMessageDialog(null,"Please Enter Pin ");
				return;
			}
			else if(rpin.equals("")) {
				JOptionPane.showMessageDialog(null,"Please Re-Enter new Pin ");
				return;
			}
		
		
		   Conn c=new Conn();
		   String query1="update bank set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
		   String query2="update login set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
		   String query3="update signupthree set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
		   c.s.executeUpdate(query1);
		   c.s.executeUpdate(query2);
		   c.s.executeUpdate(query3);
		   
		   JOptionPane.showMessageDialog(null,"Pin has been changed successfully.");
		   
		   
		   setVisible(false);
		   new  Transactions(rpin).setVisible(true);
		   
		
		
		}catch(Exception e) {
		    	System.out.println(e);
		    }
		}else {
			setVisible(false);
			new  Transactions(pinnumber).setVisible(true);
		}
		
	}

}
