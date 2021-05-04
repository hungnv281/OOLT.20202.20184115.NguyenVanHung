package hust.soict.hedspi.gui.swing;

import java.awt.*;
import java.awt.event.*;


 

public class AWTCounterAnonymousInnerClass extends Frame {
 
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   private TextField tfCount;
   private Button btnUp;
   private Button btnDown;
   private Button btnReset;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout());  // "super" Frame sets to FlowLayout
      add(new Label("Counter"));    // An anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // read-only
      add(tfCount);                 // "super" Frame adds tfCount
 
      btnDown = new Button("countDown");
      add(btnDown);            
      btnDown.addActionListener(new ActionListener() {
		
		@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				tfCount.setText(count +"");
			}
      });
      btnUp = new Button("countUp");
      add(btnUp);
      btnUp.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			++count;
			tfCount.setText(count +"");
			
		}
	});
      btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			count = 0;
			tfCount.setText("0");
		}
	});
   
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass(); // Let the constructor do the job
   }
}