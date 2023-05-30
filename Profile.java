package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Profile extends JFrame implements ActionListener{

	 JLabel me3 = new JLabel("<html>Information: <br> Name: Emmanuel A.Tanauan <br> Course:BSIT-MWA <br> Age: 19 yrs old <br> Grade: 1st Year <br> Address: 4723 Ang Buhay St. Sta.Mesa Manila <br>");
	    JButton back3 = new JButton("Return");
	    ImageIcon icon = new ImageIcon("C:\\Users\\National University\\Downloads\\Iiman.jpg");
	    Border border = BorderFactory.createLineBorder(Color.green,3);
	    
	public Profile() {
		
		  me3.setBounds(0,0,585,600);
	        me3.setFont(new Font(null,Font.BOLD,25));
	        back3.setBounds(205, 500, 150, 40);
	        back3.setFocusable(true);
	        back3.addActionListener((ActionListener) this);
	        
	        this.add(me3);
	        this.add(back3);
	        
	        
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(600,600);
	        this.setLayout(null);
	        this.setVisible(true);
	        this.setTitle("Educational Background");
	        this.setLocationRelativeTo(null);
	        
	        me3.setIcon(icon);
	        me3.setHorizontalTextPosition(JLabel.RIGHT);
	        me3.setVerticalTextPosition(JLabel.BOTTOM);
	        me3.setForeground(new Color(0x00FF00));
	        me3.setFont(new Font("MV Boli",Font.BOLD,25));
	        me3.setIconTextGap(45);
	        me3.setBackground(Color.black);
	        me3.setOpaque(true);
	        me3.setBorder(border);
	        me3.setVerticalAlignment(JLabel.TOP);
	        me3.setHorizontalAlignment(JLabel.CENTER);
	        
	        back3.setFont(new Font("MV Boli", Font.BOLD, 25));
	        back3.revalidate();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==back3){
	            this.dispose();
	            LaunchPage launchpage = new LaunchPage();
	    }
	 }
	
	}

