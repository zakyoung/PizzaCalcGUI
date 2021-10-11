import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
public class MyGridLayout{
  private JPanel line2;
  private JLabel finalLabel; 
  private JLabel labelLine2;
  private String textFieldText;
  private JTextField field1;
  public MyGridLayout(){    
    JFrame frame = new JFrame("Pizza Servings Calculator");    
    JLabel label = new JLabel("Pizza Servings Calculator",JLabel.CENTER);
    label.setFont(new Font("Times New Roman", Font.BOLD, 18));
    label.setForeground(Color.red);
    frame.add(label);
    labelLine2 = new JLabel("Enter the size of the pizza in inches: ",JLabel.RIGHT);
    labelLine2.setFont(new Font("Times New Roman",Font.BOLD,12));
    field1 = new JTextField(4);
    line2 = new JPanel(); 
    frame.add(line2);
    line2.add(labelLine2);
    line2.add(field1);
    JButton ButtonLn3 = new JButton("Calculate Servings");  
    frame.add(ButtonLn3);
    finalLabel = new JLabel("",JLabel.CENTER);
    ButtonHandler handler = new ButtonHandler();
    ButtonLn3.addActionListener(handler);
    frame.add(finalLabel); 
    frame.setLayout(new GridLayout(4,1,5,5));    
    frame.setSize(350,300);    
    frame.setVisible(true);    
}
private class ButtonHandler implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent event){
    double inches = Double.parseDouble(field1.getText());
    double Servings = Math.pow((inches / 8),2);
    finalLabel.setText(String.format("A %.0f inch pizza will serve %.2f people", inches, Servings));
  }
}
public static void main(String[] args) {    
    new MyGridLayout();    
}    
} 