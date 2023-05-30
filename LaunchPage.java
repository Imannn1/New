package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JLabel;


public class LaunchPage extends JFrame implements ActionListener {

	   JFrame frame = new JFrame ();
	    JButton mybtn = new JButton("Skills");
	    JButton mybtn1 = new JButton("Hobbies");
	    JButton mybtn2 = new JButton("Educational Background");
	    JButton mybtn3 = new JButton("Profile");
	    JButton mybtn4 = new JButton("Exit");
	    Border border1 = BorderFactory.createLineBorder(Color.black,5);
	    JLabel me4 = new JLabel("MENU");
	    
	public LaunchPage() {
		
		    mybtn.setBounds(10,300,125,40);
	        mybtn.setFocusable(false);
	        mybtn.addActionListener((ActionListener) this);
	        mybtn1.setBounds(10,400,150,40);
	        mybtn1.setFocusable(false);
	        mybtn1.addActionListener((ActionListener) this);
	        mybtn2.setBounds(10,200,350,40);
	        mybtn2.setFocusable(false);
	        mybtn2.addActionListener((ActionListener) this);
	        mybtn3.setBounds(10,100,140,40);
	        mybtn3.setFocusable(false);
	        mybtn3.addActionListener((ActionListener) this);
	        mybtn.setFont(new Font("MV Boli", Font.BOLD, 25));
	        mybtn.revalidate();
	        mybtn1.setFont(new Font("MV Boli", Font.BOLD, 25));
	        mybtn1.revalidate();
	        mybtn2.setFont(new Font("MV Boli", Font.BOLD, 25));
	        mybtn2.revalidate();
	        mybtn3.setFont(new Font("MV Boli", Font.BOLD, 25));
	        mybtn3.revalidate();
	        mybtn4.setBounds(10,500,100,40);
	        mybtn4.setFocusable(false);
	        mybtn4.addActionListener((ActionListener) this);
	        mybtn4.setFont(new Font("MV Boli", Font.BOLD, 25));
	        mybtn4.revalidate();
	        
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500,600);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        frame.setTitle("Portfolio");
	        frame.setLocationRelativeTo(null);
	        
	       
	        frame.add(mybtn);
	        frame.add(mybtn1);
	        frame.add(mybtn2);
	        frame.add(mybtn3);
	        frame.add(mybtn4);
	        frame.add(me4);
	        
	        
	        me4.setBackground(new Color(0xAA6F73));
	        me4.setOpaque(true);
	        me4.setBorder(border1);
	        me4.setForeground(new Color(0x000000));
	        me4.setBounds(0,0,485,561);
	        me4.setVerticalAlignment(JLabel.TOP);
	        me4.setHorizontalAlignment(JLabel.CENTER);
	        me4.setFont(new Font("MV Boli",Font.BOLD,25));
	        
	      
	        
	        
	        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource()==mybtn){
	            frame.dispose();
	            NewWindow myWindow = new NewWindow();
	        }
	        if(e.getSource()==mybtn1){
	            frame.dispose();
	            NewTab myTab = new NewTab();
	    }
	        if(e.getSource()==mybtn2){
	            frame.dispose();
	            Education myEduc = new Education();
	    }
	        if(e.getSource()==mybtn3){
	            frame.dispose();
	            Profile myProfile = new Profile();
	    }  
	        if (e.getSource()==mybtn4){
	            frame.dispose();
	  
	  }
	} 
	
	       
	    

	    

	}


