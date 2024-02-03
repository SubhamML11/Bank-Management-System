package bank.management.system;

import java.awt.*;
//import java.util.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;


public class MiniStatement  extends JFrame implements ActionListener {
	
	String pinnumber;
	MiniStatement (String pinnumber){
		this.pinnumber=pinnumber;
		setTitle("Mini Statement");
		
		
		JLabel mini=new JLabel();
		add(mini);
		
		JLabel bank=new JLabel("Indian Bank");
		bank.setBounds(150, 20, 100, 20);
		add(bank);
		
		JLabel card=new JLabel("Indian Bank");
		card.setBounds(20, 80, 300, 20);
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from login where pin='"+pinnumber+"'");
			
			while(rs.next()) {
				card.setText("Card Number: "+ rs.getString("cardnumber").substring(0,4) + "xxxxxxxx"+rs.getString("cardnumber").substring(12));
				
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
			int bal=0;
			while(rs.next()) {
				mini.setText(mini.getText()+"<html>"+ rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
				if(rs.getString("type").equals("Deposit")) {
					bal+=Integer.parseInt(rs.getString("amount"));
							
				}else {
					bal-=Integer.parseInt(rs.getString("amount"));
				}
			}
			balance.setText("Your Current Available Balance is Rs.: "+bal);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		mini.setBounds(20,140,400,200);
		
		
		
		
		
		setLayout(null);
		setSize(400,500);
		setLocation(20,20);
		getContentPane().setBackground(Color.WHITE);
		//setUndecorated(true);
		setVisible(true);
		
		

}
	
	public static void main (String args[]) {
		   new BalanceEnquiry("");
		   
	   }

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
	}

}
	
	
