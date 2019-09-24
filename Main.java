import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
  private JButton buttonCounter, buttonReset;
  private JLabel labelCount;
  
  private int clicks = 0;
  
  public Main() {
    createView()
    
    setTitle("Click Me");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setResizable(false);
  }
  
  private void createView() {
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    
    labelCount = newJLabel();
    labelCount.setPreferredSize(new Dimension(200, 30));
    panel.add(labelCount);
    
    updateCounter();
    
    buttonCounter = new JButton("Click me");
    buttonCounter.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          clicks++;
          updateCounter();
        }
      }
    );
    panel.add(buttonCounter);
    
    buttonReset = new JButton("Reset");
    buttonReset.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          clicks = 0;
          updateCounter();
        }
      }
    );
    panel.add(buttonReset);
  }
  
  private void updateCounter() {
    labelCount.setText("Clicked " + clicks + " times");
  }
  
  public static void main(String[] args) {
    Swing.Utilities.invokeLater(new Runnable() {
      public void run() {
        new Main().setVisible(true);
      }
    });
  }
}
