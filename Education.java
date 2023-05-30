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

public class Education extends JFrame implements ActionListener{

	   JLabel me2 = new JLabel("<html>Educational Background: <br> Pre Elementary:Manila Christian Day School (MCDS) <br> Primary Education: Padre Burgos Elementary School <br> Secondary Education: Victorino Mapa High School <br> Senior High School: La Consolacion College Manila <br> Higher Education: National University Manila (Current School)<br>");
	    JButton back2 = new JButton("Return");
	    Border border4 = BorderFactory.createLineBorder(Color.green,3);
	    
	public Education() {
		 me2.setBounds(0,0,585,561);
	        me2.setFont(new Font("MV Boli",Font.BOLD,24));
	        back2.setBounds(205, 500, 150, 40);
	        back2.setFocusable(true);
	        back2.addActionListener((ActionListener) this);
	        
	        
	        this.add(me2);
	        this.add(back2);
	       
	        
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(600,600);
	        this.setLayout(null);
	        this.setVisible(true);
	        this.setTitle("Educational Background");
	        this.setLocationRelativeTo(null);
	        
	        back2.setFont(new Font("MV Boli", Font.BOLD, 24));
	        back2.revalidate();
	        
	        me2.setBackground(Color.black);
	        me2.setOpaque(true);
	        me2.setBorder(border4);
	        me2.setForeground(new Color(0x00FF00));
	        me2.setVerticalAlignment(JLabel.TOP);
	        me2.setHorizontalAlignment(JLabel.CENTER);
	}

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==back2){
	            this.dispose();
	            LaunchPage launchpage = new LaunchPage();
	    }
	}
	
	}


