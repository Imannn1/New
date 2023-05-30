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


public class NewWindow extends JFrame implements ActionListener {

	JLabel me = new JLabel("<html> Skills <br> Time Management <br> Adaptability ");
    JButton back = new JButton("Return");
    Border border2 = BorderFactory.createLineBorder(Color.green,3);
    
	public NewWindow() {
		
		me.setBounds(0,0,585,561);
        me.setFont(new Font("MV Boli",Font.BOLD,25));
        back.setBounds(205, 500, 150, 40);
        back.setFocusable(true);
        back.addActionListener((ActionListener) this);
        
        this.add(me);
        this.add(back);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Achievements");
        this.setLocationRelativeTo(null);
        
        back.setFont(new Font("MV Boli", Font.BOLD, 25));
        back.revalidate();
        
         me.setBackground(Color.black);
         me.setOpaque(true);
         me.setBorder(border2);
         me.setForeground(new Color(0x00FF00));
         me.setVerticalAlignment(JLabel.TOP);
         me.setHorizontalAlignment(JLabel.CENTER);
         
       
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            this.dispose();
            LaunchPage launchpage = new LaunchPage();

   }
 }

	}


