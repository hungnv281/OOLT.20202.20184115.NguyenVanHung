package hust.soict.hedspi.gui.awt;

import java.awt.*;

public class MyGUIProgram extends Frame{

	private TextField tf;
	private Label lbl;
	
	public MyGUIProgram() {
		setLayout(new FlowLayout());
		Label xxx = new Label("Enter Name: ", Label.CENTER); // xxx assigned by compiler
		add(xxx);
		lbl = new Label("Enter a number");
		tf = new TextField("", 20);
		add(lbl);
		add(tf);
		setSize(1000,2000);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyGUIProgram a = new MyGUIProgram();
	
	}
}
