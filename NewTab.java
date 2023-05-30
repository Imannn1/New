package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class NewTab extends JFrame implements ActionListener  {

	   JLabel me1 = new JLabel("<html> Hobbies <br> Basketball <br> Gaming <br> Travelling <br>");
	    JButton back1 = new JButton("Return");
	    Border border3 = BorderFactory.createLineBorder(Color.green,3);
	    
	public NewTab() {
		 me1.setBounds(0,0,585,561);
	        me1.setFont(new Font("MV Boli",Font.BOLD,25));
	        back1.setBounds(205, 500, 150, 40);
	        back1.setFocusable(true);
	        back1.addActionListener((ActionListener) this);
	        
	        this.add(me1);
	        this.add(back1);
	        
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(600,600);
	        this.setLayout(null);
	        this.setVisible(true);
	        this.setTitle("Hobbies");
	        this.setLocationRelativeTo(null);
	        
	        back1.setFont(new Font("MV Boli", Font.BOLD, 25));
	        back1.revalidate();
	        
	         me1.setBackground(Color.black);
	         me1.setOpaque(true);
	         me1.setBorder(border3);
	         me1.setForeground(new Color(0x00FF00));
	         me1.setVerticalAlignment(JLabel.TOP);
	         me1.setHorizontalAlignment(JLabel.CENTER);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource()==back1){
	            this.dispose();
	            LaunchPage launchpage = new LaunchPage();
	    }
	}
	
	}


