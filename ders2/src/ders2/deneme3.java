package ders2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;



public class deneme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame jf =new JFrame();
		 
		jf.setSize(500,500);
		
		jf.setLocation(200,300);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JButton btn1= new JButton("Buton");
		
		jf.getContentPane().add(btn1);
		
		
		
		btn1.setBackground(Color.pink);
		btn1.setForeground(Color.white);
		
		Color butonrenk=btn1.getBackground();
		
		btn1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				
				btn1.setBackground(Color.GREEN);
			}
			
			public void mousePressed(MouseEvent e) {
				
				btn1.setBackground(Color.YELLOW);
			}
			
			
			public void mouseExited(MouseEvent e) {
				
				btn1.setBackground(butonrenk);
			}
			
			
			public void mouseEntered(MouseEvent e) {

				btn1.setBackground(Color.magenta);
			}
			
			
			public void mouseClicked(MouseEvent e) {
				btn1.setBackground(Color.BLACK);
				
			}
		});
		
		
		
		
		JLabel lbl1=new JLabel();
		
		lbl1.setSize(50,50);
		
		Image ımg1=new ImageIcon(deneme3.class.getResource("/image/labelicon.png")).getImage();
		
		lbl1.setIcon(new ImageIcon(ımg1));
		
		
		
		
		jf.getContentPane().add(lbl1);
		
		Color yenirenk=new Color(151,255,255);
		
		
		jf.getContentPane().setBackground(yenirenk);// Red Green Yellow
		//jf.getContentPane().setBackground(new Color(56,56,56)); There is an another way that set background
		
		
		jf.setResizable(false);
		
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

	

}
