package bank.management.system;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*; 


public class SignupOne extends JFrame implements ActionListener {
	long random;
	JTextField ntf,ftf,etf,addtf, citytf,statetf,pctf;
	JButton next;
	JRadioButton married,unmarried,male,female,other;
	JDateChooser dc;
	
	SignupOne(){
		setLayout(null);
		//JDateChooser;
		
		Random ran=new Random();
		 random=Math.abs((ran.nextLong() % 9000L)+1000L);
		
		
		getContentPane().setBackground(Color.WHITE);
		
		JLabel formno=new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personalDetails=new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		
		add(name);
		
	   ntf=new JTextField();
		ntf.setFont(new Font("Arial",Font.BOLD,14));
		ntf.setBounds(300,140,400,30);
		add(ntf);
		
		JLabel fname=new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		 ftf=new JTextField();
		ftf.setFont(new Font("Arial",Font.BOLD,14));
		ftf.setBounds(300,190,400,30);
		add(ftf);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		 dc=new JDateChooser();
		dc.setBounds(300,240,400,30);
		dc.setForeground(rgb(105,105,105));
		add(dc);
		
		JLabel gender=new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		 male=new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		 female=new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gg=new ButtonGroup();
		gg.add(female);
		gg.add(male);
		
		JLabel email=new JLabel("Email Address:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		 etf=new JTextField();
		etf.setFont(new Font("Arial",Font.BOLD,14));
		etf.setBounds(300,340,400,30);
		add(etf);
		
		JLabel ms=new JLabel("Marital Status:");
		ms.setFont(new Font("Raleway",Font.BOLD,20));
		ms.setBounds(100,390,200,30);
		add(ms);
		
		 married=new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		 unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		 other=new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup mg=new ButtonGroup();
		mg.add(married);
		mg.add(unmarried);
		mg.add(other);
		
		JLabel add=new JLabel("Address:");
		add.setFont(new Font("Raleway",Font.BOLD,20));
		add.setBounds(100,440,200,30);
		add(add);
		
	    addtf=new JTextField();
		addtf.setFont(new Font("Arial",Font.BOLD,14));
		addtf.setBounds(300,440,400,30);
		add(addtf);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		 citytf=new JTextField();
		citytf.setFont(new Font("Arial",Font.BOLD,14));
		citytf.setBounds(300,490,400,30);
		add(citytf);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		 statetf=new JTextField();
		statetf.setFont(new Font("Arial",Font.BOLD,14));
		statetf.setBounds(300,540,400,30);
		add(statetf);
		
		JLabel pc=new JLabel("Pin Code:");
		pc.setFont(new Font("Raleway",Font.BOLD,20));
		pc.setBounds(100,590,200,30);
		add(pc);
		
		 pctf=new JTextField();
		pctf.setFont(new Font("Arial",Font.BOLD,14));
		pctf.setBounds(300,590,400,30);
		add(pctf);
		
		 next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		
		
		
		
		
		
		
		   setSize(850,800);
		   setLocation(350,10);
		   setVisible(true);
	}
   private Color rgb(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
public static void main (String args[]) {
	   new SignupOne();
	   
   }
@Override
public void actionPerformed(ActionEvent ae) {
	String formno=""+random;
	String name=ntf.getText();
	String fname=ftf.getText();
	String dob= ((JTextField) dc.getDateEditor().getUiComponent()).getText();
	String gender=null;
	if(male.isSelected()) {
		gender="Male";
	}else if(female.isSelected()) {
	     gender="Female";	
	}
	String email=etf.getText();
	String marital=null;
	if(married.isSelected()) {
		marital="Married";
	}else if(unmarried.isSelected()) {
		marital="Unmarried";
	}else if(other.isSelected()){
		marital="Other";
	}
	String address=addtf.getText();
	String city=citytf.getText();
	String state=statetf.getText();
	String pin=pctf.getText();
	try {
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name is Required");
		}else {
			Conn c=new Conn();
			String query="Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+state+"','"+city+"','"+pin+"')";
		    c.s.executeUpdate(query);
		    
		    
		    setVisible(false);
		    new SignupTwo(formno).setVisible(true);
		}
		
	}catch (Exception e) {
		System.out.println(e);
		}

	
}
   
}
