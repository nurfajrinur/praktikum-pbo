package laporan9;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class GUI_java extends JFrame{

	private static final long serialVersionUID = 1L;
	JLabel label1 = new JLabel("Formulir Aplikasi");
	JLabel ket1 = new JLabel("Nama");
	JLabel ket2 = new JLabel("Nim");
	JLabel ket3 = new JLabel("Kelas");
	JLabel ket4 = new JLabel("Alamat");
	
	JEditorPane isi1 = new JEditorPane();
	JEditorPane isi2 = new JEditorPane();
	JEditorPane isi3 = new JEditorPane();
	JEditorPane isi4 = new JEditorPane();
	
	JButton save = new JButton("Save");
	JButton reset = new JButton("Reset");
	JButton close = new JButton("Close");
	
	
	public GUI_java() {
		super("Formulir Mahasiswa");
		this.setSize(390, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
	}
	
	public void add(){
		this.add(label1);
		this.add(ket1);
		this.add(ket2);
		this.add(ket3);
		this.add(ket4);
		
		this.add(isi1);
		this.add(isi2);
		this.add(isi3);
		this.add(isi4);
		
		this.add(save);
		this.add(reset);
		this.add(close);
		
		label1.setFont(new Font("Dialog", 1, 24));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		
		label1.setBounds(1, 10, 400, 30);
		ket1.setBounds(10, 70, 100, 25);
		ket2.setBounds(10, 110, 100, 25);
		ket3.setBounds(10, 150, 100, 25);
		ket4.setBounds(10, 190, 100, 25);		
		
		isi1.setBounds(100, 70, 150, 25);
		isi2.setBounds(100, 110, 150, 25);
		isi3.setBounds(100, 150, 150, 25);
		isi4.setBounds(100, 190, 200, 45);
		
		save.setBounds(50, 250, 85, 30);
		reset.setBounds(150, 250, 85, 30);
		close.setBounds(250, 250, 85, 30);
		
				
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				isi1.setText("");
				isi2.setText("");
				isi3.setText("");
				isi4.setText("");				
			}
		});
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				System.exit(0);
			}
		});
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		GUI_java act = new GUI_java();
		act.add();
		act.show();
	}

}
