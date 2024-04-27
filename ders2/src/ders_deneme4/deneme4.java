package ders_deneme4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class deneme4 {

	public static void main(String[] args) {
		
		
		JFrame jf=new JFrame();
		
		jf.setSize(500,500);
		jf.setLocation(200,300);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JButton btn1= new JButton("Kontrol et");
		
		btn1.setBackground(Color.GREEN);
		btn1.setForeground(Color.BLACK);
		
		JTextArea area1= new JTextArea("Metni buraya giriniz. ");
		
		JLabel lblkelime=new JLabel();
		JLabel lblmetin=new JLabel();
		JLabel lblpass=new JLabel();
;		
		JPasswordField pass=new JPasswordField(12);
		
	    
		jf.getContentPane().add(btn1);
		jf.getContentPane().add(area1);
		jf.getContentPane().add(lblmetin);
		jf.getContentPane().add(lblkelime);
		jf.getContentPane().add(pass);
		
		//String pasword=pass.getText();   deprecated  kullanımdan kaldırılmış
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String metin=area1.getText();
				String kelime[]=metin.split("\\s");
				
				lblmetin.setText("Toplam karakter sayısı: "+ metin.length());
				lblkelime.setText("Toplam kelime sayısı: "+ kelime.length);
				
				//lblpass.setText("Girmiş olduğunuz şifre: "+pasword);
				
			}
		});
		
	
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
