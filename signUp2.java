package bank.management.system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 
public class signUp2 extends JFrame implements ActionListener{
	
	
		JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
		JTextField textPan;
		JTextField textAdhar;
		JRadioButton r1,r2,e1,e2;
		String formno;
		
		
		signUp2(String first){
			
		super("APPLICATION FORM");
		ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icon/bank.png")); 
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		setLayout(null);
		image.setBounds(150,5,100,100);
		add(image);
		
		this.formno=first;
		
		JLabel l1=new JLabel("page 2 : ");
		l1.setFont(new Font("raleway",Font.BOLD,22));
		l1.setBounds(300,30,600,40);
		add(l1);
		
		JLabel l2=new JLabel("Additional Details ");
		l2.setFont(new Font("raleway",Font.BOLD,22));
		l2.setBounds(300,60,600,40);
		add(l2);
		
		
		JLabel l3=new JLabel("Religion :  ");
		l3.setFont(new Font("raleway",Font.BOLD,18));
		l3.setBounds(100,120,100,30);
		add(l3);
		
		
		
		String rel[]={"Hindu","Muslim","Sikh","Khristian","others"};
		combobox=new JComboBox(rel);
		combobox.setBackground(new Color(252,208,76));
		combobox.setFont(new Font("raleway",Font.BOLD,14));
		combobox.setBounds(350,120,320,30);
		add(combobox);
		
		
		JLabel l4=new JLabel("Category :  ");
		l4.setFont(new Font("raleway",Font.BOLD,18));
		l4.setBounds(100,170,100,30);
		add(l4);
		
		String cat[]={"General","OBC","SC","ST","Others"};
		combobox2=new JComboBox(cat);
		combobox2.setBackground(new Color(252,208,76));
		combobox2.setFont(new Font("raleway",Font.BOLD,14));
		combobox2.setBounds(350,170,320,30);
		add(combobox2);
		
		
		
		JLabel l5=new JLabel("Income :  ");
		l5.setFont(new Font("raleway",Font.BOLD,18));
		l5.setBounds(100,220,100,30);
		add(l5);
		
		String inc[]={"Null","< 1,50,000 ","< 2,50,000 ","< 5,00,000","Upto 10,00,000","Abobe 10,00,000"};
		combobox3=new JComboBox(inc);
		combobox3.setBackground(new Color(252,208,76));
		combobox3.setFont(new Font("raleway",Font.BOLD,14));
		combobox3.setBounds(350,220,320,30);
		add(combobox3);
		
		
		JLabel l6=new JLabel("Educational :  ");
		l6.setFont(new Font("raleway",Font.BOLD,18));
		l6.setBounds(100,270,100,30);
		add(l6);
		
		String edu[]={"Non graduate","graduage","post graduate","doctotrate","other"};
		combobox4=new JComboBox(edu);
		combobox4.setBackground(new Color(252,208,76));
		combobox4.setFont(new Font("raleway",Font.BOLD,14));
		combobox4.setBounds(350,270,320,30);
		add(combobox4);
		
		JLabel l7=new JLabel("Ocupation :  ");
		l7.setFont(new Font("raleway",Font.BOLD,18));
		l7.setBounds(100,340,150,30);
		add(l7);
		
		String ocu[]={"salaried","self employee","Buissness","student","retired","Other"};
		combobox5=new JComboBox(ocu);
		combobox5.setBackground(new Color(252,208,76));
		combobox5.setFont(new Font("raleway",Font.BOLD,14));
		combobox5.setBounds(350,340,320,30);
		add(combobox5);
		
		JLabel l8=new JLabel("PAN Number :  ");
		l8.setFont(new Font("raleway",Font.BOLD,18));
		l8.setBounds(100,390,150,30);
		add(l8);
		
		textPan = new JTextField();
		textPan.setFont(new Font("raleway",Font.BOLD,18));
		textPan.setBounds(350,390,320,30);
		add(textPan);
		
		
		JLabel l9=new JLabel("Adhar Number :  ");
		l9.setFont(new Font("raleway",Font.BOLD,18));
		l9.setBounds(100,440,180,30);
		add(l9);
		
		textAdhar=new JTextField();
		textAdhar.setFont(new Font("raleway",Font.BOLD,18));
		textAdhar.setBounds(350,440,320,30);
		add(textAdhar);
		
		
		JLabel l10=new JLabel("Senior CityZen :  ");
		l10.setFont(new Font("raleway",Font.BOLD,18));
		l10.setBounds(100,490,180,30);
		add(l10);
		
		
		r1=new JRadioButton("yes");
		r1.setFont(new Font("raleway",Font.BOLD,14));
		r1.setBounds(350,490,100,30);
		r1.setBackground(new Color(252,208,76));
		add(r1);
		
		
		r2=new JRadioButton("No");
		r2.setFont(new Font("raleway",Font.BOLD,14));
		r2.setBounds(460,490,100,30);
		r2.setBackground(new Color(252,208,76));
		add(r2);
		
		ButtonGroup c1=new ButtonGroup();
		c1.add(r1);
		c1.add(r2);
		
		
		
		JLabel l11=new JLabel("Existing Account :  ");
		l11.setFont(new Font("raleway",Font.BOLD,18));
		l11.setBounds(100,540,180,30);
		add(l11);
		
		
		e1=new JRadioButton("yes");
		e1.setFont(new Font("raleway",Font.BOLD,14));
		e1.setBounds(350,540,100,30);
		e1.setBackground(new Color(252,208,76));
		add(e1);
		
		
		e2=new JRadioButton("No");
		e2.setFont(new Font("raleway",Font.BOLD,14));
		e2.setBounds(460,540,100,30);
		e2.setBackground(new Color(252,208,76));
		add(e2);
		
		ButtonGroup g1=new ButtonGroup();
		g1.add(e1);
		g1.add(e2);
		
		
		JLabel l12=new JLabel("Form No :  ");
		l12.setFont(new Font("raleway",Font.BOLD,12));
		l12.setBounds(700,10,100,30);
		add(l12);
		
		JLabel l13=new JLabel(formno);
		l13.setFont(new Font("raleway",Font.BOLD,12));
		l13.setBounds(760,10,100,30);
		add(l13);
		
		JButton next=new JButton("Next");
		next.setFont(new Font("raleway",Font.BOLD,14));
		next.setBackground(Color.WHITE);
		next.setForeground(Color.BLACK);
		next.setBounds(570,648,100,30);	
		next.addActionListener(this);
		add(next);
		
		
		
		setLayout(null);
		setSize(850,750);
		setLocation(450,80);
		//setTitle();
		getContentPane().setBackground(new Color(252,208,76));
		setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			String rel = (String) combobox.getSelectedItem();
	        String cate = (String) combobox2.getSelectedItem();
	        String inc = (String) combobox3.getSelectedItem();
	        String edu = (String) combobox4.getSelectedItem();
	        String occ = (String) combobox5.getSelectedItem();
	        String pan = textPan.getText();
	        String addhar = textAdhar.getText();
	        String scitizen = " ";
	        if ((r1.isSelected())){
	            scitizen = "Yes";
	        } else if (r2.isSelected()) {
	            scitizen ="No";
	        }
	        String eAccount = " ";
	        if ((r1.isSelected())){
	            eAccount = "Yes";
	        } else if (r2.isSelected()) {
	            eAccount ="No";
	        }

	        try{
	            if (textPan.getText().equals("") || textAdhar.getText().equals("")){
	                JOptionPane.showMessageDialog(null,"Fill all the fields");
	            }else {
	                TestDB c = new TestDB();
	                String q = "insert into SignUp2 values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
	                c.statement.executeUpdate(q);
	                new SignUp3(formno);
	                setVisible(false);
	            }
	        }catch (Exception E){
	            E.printStackTrace();
	        }
	    }
	public static void main(String[] args) {
		new signUp2("");
	}

}
