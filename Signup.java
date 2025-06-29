package bank.management.system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.lang.Exception;  


public class Signup extends JFrame implements ActionListener{
	
	JTextField textname,textFname,textEmail,textAdd,textcity,textpin,textState;
	JDateChooser dateChooser;
	JRadioButton r1,r2,m1,m2,m3;
	JButton next;
	
	Random ran=new Random();
	long first4=(ran.nextLong() % 9000L) + 1000L;
	String first=" "+ Math.abs(first4);
	
	
	Signup(){
		super("APPLICATION FORM");
		
		
		
		ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icon/bank.png")); 
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);
		
		JLabel label1=new JLabel("APPLICATION FORM NO : "+ first);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("Raleway",Font.BOLD,38));
		add(label1);
		
		JLabel label2=new JLabel("PAGE 1");
		label2.setBounds(330,70,600,30);
		label2.setFont(new Font("Raleway",Font.BOLD,22));
		add(label2);
		
		JLabel label3=new JLabel("Personal Details :");
		label3.setBounds(290,90,600,30);
		label3.setFont(new Font("Raleway",Font.BOLD,22));
		add(label3);
		
		JLabel labelname=new JLabel("NAME");
		labelname.setFont(new Font("Raleway",Font.BOLD,20));
		labelname.setBounds(100,190,100,30);
		add(labelname);
		
		textname=new JTextField();
		textname.setFont(new Font("Raleway",Font.BOLD,14));
		textname.setBounds(300,190,400,30);
		add(textname);
		
		
		JLabel labelFname=new JLabel("Father's Name : ");
		labelFname.setFont(new Font("Raleway",Font.BOLD,20));
		labelFname.setBounds(100,240,200,30);
		add(labelFname);
		
		textFname=new JTextField();
		textFname.setFont(new Font("Raleway",Font.BOLD,14));
		textFname.setBounds(300,240,400,30);
		add(textFname);
		
		
		JLabel dob=new JLabel("Date of Birth : ");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,340,200,30);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,340,400,30);
		add(dateChooser);
		
		JLabel gender=new JLabel("Gender : ");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Arial",Font.BOLD,14));
		r1.setBounds(300,290,60,30);
		r1.setBackground(new Color(222,255,228));
		add(r1);
		
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Arial",Font.BOLD,14));
		r2.setBounds(450,290,90,30);
		r2.setBackground(new Color(222,255,228));
		add(r2);
		
		ButtonGroup buttongroup=new ButtonGroup();
		buttongroup.add(r1);
		buttongroup.add(r2);
		
		JLabel labelEmail=new JLabel("Email Adress : ");
		labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
		labelEmail.setBounds(100,390,200,30);
		add(labelEmail);
		
		textEmail=new JTextField();
		textEmail.setFont(new Font("Raleway",Font.BOLD,14));
		textEmail.setBounds(300,390,200,30);
		add(textEmail);
		
		
		
		JLabel labelMs=new JLabel("Married Status : ");
		labelMs.setFont(new Font("Raleway",Font.BOLD,20));
		labelMs.setBounds(100,440,200,30);
		add(labelMs);
		
		m1=new JRadioButton("Married");
		m1.setBounds(300,440,100,30);
		m1.setBackground(new Color(222,255,228));
		m1.setFont(new Font("Raleway",Font.BOLD,14));
		add(m1);
		
		
		m2=new JRadioButton("Unmarried");
		m2.setBounds(450,440,100,30);
		m2.setBackground(new Color(222,255,228));
		m2.setFont(new Font("Raleway",Font.BOLD,14));
		add(m2);
		
		m3=new JRadioButton("other");
		m3.setBounds(635,440,100,30);
		m3.setBackground(new Color(222,255,228));
		m3.setFont(new Font("Raleway",Font.BOLD,14));
		add(m3);
		
		ButtonGroup buttongroup1=new ButtonGroup();
		buttongroup1.add(m1);
		buttongroup1.add(m2);
		buttongroup1.add(m3);
		
		//textMs=new JTextField();
		//textMs.setFont(new Font("Raleway",Font.BOLD,14));
		//textMs.setBounds(300,440,400,30);
		//add(textMs);
		
		
		JLabel labelAdd=new JLabel("Address : ");
		labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
		labelAdd.setBounds(100,490,200,30);
		add(labelAdd);
		
		textAdd=new JTextField();
		textAdd.setFont(new Font("Raleway",Font.BOLD,14));
		textAdd.setBounds(300,490,400,30);
		add(textAdd);
		
		
		JLabel labelcity=new JLabel("City : ");
		labelcity.setFont(new Font("Raleway",Font.BOLD,20));
		labelcity.setBounds(100,540,200,30);
		add(labelcity);
		
		textcity=new JTextField();
		textcity.setFont(new Font("Raleway",Font.BOLD,14));
		textcity.setBounds(300,540,400,30);
		add(textcity);
		
		
		JLabel labelpin=new JLabel("Pin code : ");
		labelpin.setFont(new Font("Raleway",Font.BOLD,20));
		labelpin.setBounds(100,590,200,30);
		add(labelpin);
		
		textpin=new JTextField();
		textpin.setFont(new Font("Raleway",Font.BOLD,14));
		textpin.setBounds(300,590,400,30);
		add(textpin);
		
		
		JLabel labelstate=new JLabel("State : ");
		labelstate.setFont(new Font("Raleway",Font.BOLD,20));
		labelstate.setBounds(100,640,200,30);
		add(labelstate);
		
		textState=new JTextField();
		textState.setFont(new Font("Raleway",Font.BOLD,14));
		textState.setBounds(300,640,400,30);
		add(textState);
		
		
		next=new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setForeground(Color.WHITE);
		next.setBackground(Color.BLACK);
		next.setBounds(620,710,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String formNo1=first;
		String name1=textname.getText();
		String fname1=textFname.getText();
		String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		
		String gender=null;
		if(r1.isSelected()) {
			gender="Male";
		}
		else if(r2.isSelected()) {
			gender="Female";
		}
		
		
	String Email=textEmail.getText();
	String maritalStatus="null";
	if(m1.isSelected()) {
		maritalStatus="Married";
	}
	else if(m2.isSelected()) {
		maritalStatus="Unmarried";
	}
	else {
		maritalStatus="Other";
	}
	String address=textAdd.getText();
	String city=textcity.getText();
	String pin=textpin.getText();
	String state=textState.getText();
	
try {
		if(textname.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "fill all the fields");
			
		}else {
			TestDB con1=new TestDB();
			String q="insert into SignUp values('"+formNo1+"','"+name1+"','"+fname1+"','"+dob+"','"+gender+"','"+Email+"','"+maritalStatus+"','"+address+"','"+city+"','"+pin+"','"+state+"')";  
			con1.statement.executeUpdate(q);
			
			new signUp2(first);
			setVisible(false);
		}
		
	}catch(Exception E1) {
		E1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Signup();
	}

}
