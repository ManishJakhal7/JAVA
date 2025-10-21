import java.awt.*;
import java.awt.event.*;
class MyFrame3 extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    MyFrame3(){
        super("Text Area Demo");

        ta = new TextArea(20,20);
        tf = new TextField(20);
        l = new Label("No Text Entered");
        b = new Button("click");
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(ta);
        add(tf);
        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}
public class TextAreaDemo {
    public static void main(String[] args){
        MyFrame3 f = new MyFrame3();
        f.setVisible(true);
        f.setSize(500,500);
    }
}