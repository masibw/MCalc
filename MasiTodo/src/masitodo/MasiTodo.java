package masitodo;

import javax.swing.JFrame;


public class MasiTodo extends JFrame {
public static void main(String args[]) {
	MasiTodo app = new MasiTodo("MasiTodo");
	}

	MasiTodo(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,300);
		this.setVisible(true);
	}

}