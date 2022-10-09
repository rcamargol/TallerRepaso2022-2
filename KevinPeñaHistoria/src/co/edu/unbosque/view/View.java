 package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View {
	
	public String seleccionar (String msg) {
		Object [] sel = {"Ver todo","Ver Heroes", "Ver Mortales", "Ver Desterrados", "Ver Kira","Ver Astar","Ver Renk", "Ver Kevin"};
		Object infoSel = JOptionPane.showInputDialog(null, msg, "Días del mes", JOptionPane.QUESTION_MESSAGE, null, sel, sel[0]);
		
		String resp = (String) infoSel;
		
		if ( resp == null) {
			resp="c";
		}
		return resp;
	}
	
	public void mostrarTodos (String msg) {
		ImageIcon icono = new ImageIcon("img/todos.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	
	public void mostrarHeroes (String msg) {
		ImageIcon icono = new ImageIcon("img/heroe.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarMortales (String msg) {
		ImageIcon icono = new ImageIcon("img/mortales.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarDesterrados (String msg) {
		ImageIcon icono = new ImageIcon("img/desterrado.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarKira (String msg) {
		ImageIcon icono = new ImageIcon("img/Kira.png");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarAstar (String msg) {
		ImageIcon icono = new ImageIcon("img/Astar.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarRenk (String msg) {
		ImageIcon icono = new ImageIcon("img/renk.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public void mostrarKevin (String msg) {
		ImageIcon icono = new ImageIcon("img/kevin.jpg");
		JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE, icono);
	}
	public int volverAElegir(String msg) {
		return JOptionPane.showConfirmDialog(null, msg);
		
	}
}
