import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyListFrame extends Frame implements ItemListener, ActionListener{
    List l;
    Choice c;
    TextArea ta;
    MyListFrame(){
        super("List Frame Demo");
        l = new List(4, true); //false means only one select at a time
        c = new Choice();
        ta = new TextArea(20,30);
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l){
            ta.setText(l.getSelectedItem());
        }else{
            ta.setText(c.getSelectedItem());
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String txt = " ";
        String List[] = l.getSelectedItems();
        for(String x:List){
            txt = txt+x;
        }
        ta.setText(txt);
    }
}
public class ListBoxDemo {
    public static void main(String[] args){
        MyListFrame f = new MyListFrame();
        f.setSize(400,400);
        f.setVisible(true);
     }
}