import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame2 extends Frame implements TextListener, ActionListener {
    Label l1, l2;
    TextField tf;
    MyFrame2(){
        super("TextFiled Demo");

        l1 = new Label("No Text is Entered Yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(30);
        tf.addActionListener(this);
        tf.addTextListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }
    public void textValueChanged(TextEvent te){
      l1.setText(tf.getText());
    }
    public  void actionPerformed(ActionEvent ae){
        l2.setText(tf.getText());
    }
}
public class TextFiledDemo {
    public static void main(String[] args){
        MyFrame2 f = new MyFrame2();
        f.setSize(400,400);
        f.setVisible(true);
    }
}