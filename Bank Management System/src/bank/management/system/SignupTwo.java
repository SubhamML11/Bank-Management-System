package bank.management.system;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*; 


public class SignupTwo extends JFrame implements ActionListener {
	long random;
	JTextField pan, aadhar;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	String formno;
	//JDateChooser dc;
	JComboBox religion,category,education,occupation,income;
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		//JDateChooser;
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
	
		
		getContentPane().setBackground(Color.WHITE);
		
		
		
		JLabel additionalDetails=new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		JLabel name=new JLabel("Religion:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
		String valReligion[]={"Hindu","Christian","Sikh","Muslim","Other"};
		 religion=new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel fname=new JLabel("Category:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String valCategory[]= {"General","SC","ST","OBC","Other"};
		 category=new JComboBox(valCategory);
		category.setBackground(Color.WHITE);
		category.setBounds(300,190,400,30);
		add(category);
		
		
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String incomeCategory[]= {"Null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000"};
		 income=new JComboBox(incomeCategory);
		income.setBackground(Color.WHITE);
		income.setBounds(300,240,400,30);
		//income.setForeground(rgb(105,105,105));
		add(income);
		
		 
		
		
		JLabel gender=new JLabel("Educational:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		JLabel email=new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,315,200,30);
		add(email);
		
		String educationalValues[]= {"non-graduate","UG","PG","Docotrate","Others"};
		 education=new JComboBox(educationalValues);
		education.setBackground(Color.WHITE);
		education.setBounds(300,315,400,30);
		add(education);
		
		
		JLabel ms=new JLabel("Occupation:");
		ms.setFont(new Font("Raleway",Font.BOLD,20));
		ms.setBounds(100,390,200,30);
		add(ms);
		
		String occupationValues[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
		 occupation=new JComboBox(occupationValues);
		occupation.setBackground(Color.WHITE);
		occupation.setBounds(300,390,400,30);
		add(occupation);
		
		JLabel add=new JLabel("Pan No.:");
		add.setFont(new Font("Raleway",Font.BOLD,20));
		add.setBounds(100,440,200,30);
		add(add);
		
	    pan=new JTextField();
		pan.setFont(new Font("Arial",Font.BOLD,14));
		pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel city=new JLabel("Aadhar No.:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		 aadhar=new JTextField();
		aadhar.setFont(new Font("Arial",Font.BOLD,14));
		aadhar.setBounds(300,490,400,30);
		add(aadhar);
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		

		 syes=new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		 sno=new JRadioButton("No");
		sno.setBounds(450,540,120,30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup gg=new ButtonGroup();
		gg.add(syes);
		gg.add(sno);
		
		JLabel pc=new JLabel("Existing Account:");
		pc.setFont(new Font("Raleway",Font.BOLD,20));
		pc.setBounds(100,590,200,30);
		add(pc);
		
		    eyes=new JRadioButton("Yes");
			eyes.setBounds(300,590,60,30);
			eyes.setBackground(Color.WHITE);
			add(eyes);
			
			eno=new JRadioButton("No");
			eno.setBounds(450,590,120,30);
			eno.setBackground(Color.WHITE);
			add(eno);
			
			ButtonGroup egg=new ButtonGroup();
			gg.add(eyes);
			gg.add(eno);
		
		
		
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
	   new SignupTwo("");
	   
   }
@Override
public void actionPerformed(ActionEvent ae) {
	//String formno=""+random;
	String sreligion=(String) religion.getSelectedItem();
	String scategory=(String) category.getSelectedItem();
	String sincome=(String) income.getSelectedItem();
	String seducation=(String) education.getSelectedItem();
	String soccupation=(String) occupation.getSelectedItem();
	String seniorcitizen=null;
	if(syes.isSelected()) {
		seniorcitizen="Yes";
	}else if(sno.isSelected()) {
	     seniorcitizen="No";	
	}
	
	String existingaccount=null;
	if(eyes.isSelected()) {
		existingaccount="Yes";
	}else if(eno.isSelected()) {
	     existingaccount="No";	
	}
	String saadhar=aadhar.getText();
	String span=pan.getText();
	try {
	        Conn c=new Conn();
			String query="Insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+existingaccount+"','"+saadhar+"','"+span+"')";
		    c.s.executeUpdate(query);
		
		    setVisible(false);
		    new SignupThree(formno).setVisible(true);
	}catch (Exception e) {
		System.out.println(e);
		}

	
}
   
}
