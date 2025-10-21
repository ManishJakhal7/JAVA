import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Struct;

class MyFrame1 extends Frame implements ItemListener {
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;

    public MyFrame1(){
        super("CheckBox");
        l = new Label("Nothing is selected");
        cg = new CheckboxGroup();
        c1 = new Checkbox("C++",false,cg);
        c2 = new Checkbox("Java",true,cg);
        c3 = new Checkbox("Javascript",false,cg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        String str="";

        if(c1.getState()){
            str = str+" "+c1.getLabel();
        }
        if(c2.getState()){
            str = str+" "+c2.getLabel();
        }
        if(c3.getState()){
            str = str+" "+c3.getLabel();
        }
        if(str.isEmpty()){
            str = str+" "+"Nothing is selected";
        }
        l.setText(str);
    }
}
public class CheckBoxDemo {
    public static void main(String[] args){
        MyFrame1 f = new MyFrame1();
        f.setVisible(true);
        f.setSize(400,400);
    }
}