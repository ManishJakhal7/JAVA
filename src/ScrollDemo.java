import java.awt.*;
import java.awt.event.*;
class ScrollFrame extends Frame implements AdjustmentListener{
    TextField tf;
    Scrollbar red, green, blue;
    ScrollFrame(){
        super("Scrollbar Demo");
        tf = new TextField(20);
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0,20, 0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0,20, 0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0,20, 0,255);

        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        tf.setBounds(50,200,300,30);
        tf.setBounds(50,250,300,30);

        setLayout(null);
        add(tf);
        add(red);
        add(blue);
        add(green);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e){
        tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }
}
public class ScrollDemo {
    public static void main(String[] args){
        ScrollFrame f = new ScrollFrame();
        f.setVisible(true);
        f.setSize(800,800);
    }
}