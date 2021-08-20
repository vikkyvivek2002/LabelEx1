import java.awt.*;  import java.awt.event.*;
public class LabelEx1
{
public static void main(String[] args) {  

Frame f=new Frame("Label example");
Label l1= new Label("Hi!");
Label l2=new Label("This is awt tutorial");
Label l3=new Label("Welcome to Label class!");


l1.setText("Hello"); 	//Setting the text of a l1
l1.setAlignment(Label.LEFT);
l2.setAlignment(Label.LEFT);
l3.setAlignment(Label.RIGHT);
f.setLayout(new FlowLayout());
f.add(l1);f.add(l2);f.add(l3);
f.setVisible(true);
f.setSize(600,600);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}
}