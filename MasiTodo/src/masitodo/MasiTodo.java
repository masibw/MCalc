package masitodo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class MasiTodo extends JFrame  implements ActionListener{
	JButton addTodoButton;
	JTabbedPane tab;

	public static void main(String args[]) {

		MasiTodo app = new MasiTodo("MasiTodo");

	}

	MasiTodo(String title){
		super(title);//JFrameを継承しているためJFrameのコンストラクタを使用する


		//windowの初期設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		addTodoButton = new JButton("Create Root List");

		addTodoButton.addActionListener(this);

		tab = new JTabbedPane();
		tab.addTab("tab1",null);
		tab.addTab("tab2",new JLabel("Tab2"));
		this.add(tab);
		this.add(addTodoButton);
	}

	public void actionPerformed(ActionEvent ae) {
		JButton source = (JButton)ae.getSource();
		if(source==addTodoButton) {

		}
	}


	}


