import java.awt.*;
public class TestRun{
    public static void main(String[] args){
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());
        Button b = new Button("OK");
        f.add(b);
        TextField tf = new TextField(20);
        f.add(tf);
        f.setVisible(true);
        f.setSize(300,300);
    }
}