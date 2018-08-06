package presentation;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	/**
	 * Instructor capacitación OSB
	 * rtrivino@asesoftware.com
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panelTexto;
	private JPanel panelBotones;
	private JTextField txtTexto;
	private String[] nombreBotones= {"%","v¬","x2","1/x","CE","C","<-","/",
			"7","8","9","X","4","5","6","-","1","2","3","+","+-","0",",","="};
	private JButton[] botones = new JButton[24];
	private JMenuBar barra;
	private JMenu menuArchivo;
	private JMenuItem itemSalir;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Calculadora");
		setResizable(true);
		setSize(270,350);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 1));
		
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				close();
			}
		});
		
		barra = new JMenuBar();
		menuArchivo = new JMenu("Archivo");
		itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(this);
		
		menuArchivo.add(itemSalir);
		
		barra.add(menuArchivo);
		
		panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setBorder(BorderFactory.createTitledBorder("Calculadora"));
		
		panelTexto = new JPanel(new GridLayout(1, 1));
		panelBotones = new JPanel(new GridLayout(6,4));
		
		txtTexto = new JTextField();
		
		panelTexto.add(txtTexto);
		
		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton(nombreBotones[i]);
			botones[i].addActionListener(this);
			panelBotones.add(botones[i]);
			
		}

		panelPrincipal.add(panelTexto,BorderLayout.NORTH);
		panelPrincipal.add(panelBotones,BorderLayout.CENTER);
		
		setJMenuBar(barra);
		add(panelPrincipal);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botones[0]) {
			System.out.println("Funciona!!");
		}else
			if(e.getSource()==itemSalir) {
				close();
			}
	}
	
	public void close() {
			if (JOptionPane.showConfirmDialog(this, "¿Desea realmente desea salir de la calculadora?", "Salir del sistema", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			//JOptionPane.showC
			System.exit(0);
		}
	}

}
