package hust.soict.hedspi.gui.swing;

import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame {
 
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public AWTCounter() {
      setLayout(new FlowLayout());  // "super" Frame sets to FlowLayout
      add(new Label("Counter"));    // An anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // read-only
      add(tfCount);                 // "super" Frame adds tfCount
 
      btnCount = new Button("Count");
      add(btnCount);                // "super" Frame adds btnCount
 
      // Construct an anonymous instance of BtnCountListener (a named inner class).
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounter(); // Let the constructor do the job
   }
 
   /**
    * BtnCountListener is a "named inner class" used as ActionListener.
    * This inner class can access private variables of the outer class.
    */
   private class BtnCountListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}