package ders_deneme5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class deneme5 {
	
	
	public static void main(String[] args) {
		
		
		JFrame jf =new JFrame();
		jf.setSize(500,500);
		jf.setLocation(200,300);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		
		JCheckBox chbE=new JCheckBox("Evet");
		
		JCheckBox chbH=new JCheckBox("Hayır");
	
		JButton btn5=new JButton("Seç");
		
		chbE.setBounds(200,200,50,50);
		
		String dizi[]= {"Fizik","Biyoloji","Matematik","Resim"};
		
		JRadioButton rd1= new JRadioButton("Enstürmental");
		
		JComboBox cmb= new JComboBox(dizi);
		
		JButton btn8= new JButton("Kombo Box Button");
		
		jf.getContentPane().add(chbE);
		jf.getContentPane().add(chbH);
		jf.getContentPane().add(btn5);
		jf.getContentPane().add(rd1);
		jf.getContentPane().add(cmb);
		jf.getContentPane().add(btn8);
		
		
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				 if(chbE.isSelected() && chbH.isSelected()) {
						
						
						System.out.println("Birileri kararsız galiba :)");
						
					}
				
				 else if(chbE.isSelected()) {
					
					System.out.println("Evet seçildi ");
					
					
				}
				else if (chbH.isSelected()){
					
					
					System.out.println("Hayır seçildi ");
					
				} else {
				
					
					
					System.out.println("Bir seçim yapılmadı ");
					
				}
				
				
			}
		});
		
		
		
		
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String metin="Proje ödevi alınacak ders: "+cmb.getSelectedItem(); 
				
				System.out.println(metin);
				
			}
		});
		
		
		
		jf.setResizable(false);
		
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
