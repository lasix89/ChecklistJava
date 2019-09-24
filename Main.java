import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {
  private JCheckBox check;
  private JTextField tf;
  private JLabel l;
  private Scanner myObj;
  
  public Main() {
    createView();
    
    setTitle("CheckList");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setResizable(false);
  }
  
  private void createView() {
    tf = new JTextField();
    tf.setBounds(50, 50, 150, 20);
    l = new JLabel();
    l.setBounds(50, 100, 250, 20);
    myObj = new Scanner(System.in);
    System.out.println("Enter a list item: ");
    String listItem = myObj .nextLine();
    check = new JCheckBox(listItem);
    
  }
  
  public static void main(String[] args) {
    swingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Main().setVisible(true);
      }
    });
  }
}
