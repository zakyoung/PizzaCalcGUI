import java.awt.*;    
import javax.swing.*;    
public class MyGridLayout{
  private JPanel line2;     
  public MyGridLayout(){    
    JFrame frame = new JFrame("Pizza Servings Calculator");    
    JLabel label = new JLabel("Pizza Servings Calculator",JLabel.CENTER);
    label.setFont(new Font("Times New Roman", Font.BOLD, 18));
    label.setForeground(Color.red);
    frame.add(label);
    JLabel labelLine2 = new JLabel("Enter the size of the pizza in inches: ",JLabel.RIGHT);
    labelLine2.setFont(new Font("Times New Roman",Font.BOLD,12));
    JTextField field1 = new JTextField(4);
    line2 = new JPanel(); 
    frame.add(line2);
    line2.add(labelLine2);
    line2.add(field1);
    JButton ButtonLn3 = new JButton("Calculate Servings");  
    frame.add(ButtonLn3);
    JLabel finalLabel = new JLabel();            
    frame.add(finalLabel); 
    frame.setLayout(new GridLayout(4,1,5,5));    
    frame.setSize(350,300);    
    frame.setVisible(true);    
}
public static void main(String[] args) {    
    new MyGridLayout();    
}    
} 