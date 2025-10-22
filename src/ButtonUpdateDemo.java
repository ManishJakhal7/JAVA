import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

class ButtonFrame extends Frame implements ActionListener {
    int count =0;
    Label l;
    Button plusButton, minusButton;
    public ButtonFrame(){
        super("Button Update Demo");
        l = new Label(" "+count);
        plusButton = new Button("+");
        minusButton = new Button("-");

        setLayout(new FlowLayout());
        add(l);
        add(plusButton);
        add(minusButton);

        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == plusButton){
                count++;
        } else if (actionEvent.getSource() == minusButton) {
            if(count != 0){
                count--;
            }
        }
        l.setText(" "+count);
    }
}

public class ButtonUpdateDemo {
    public static void main(String[] args){
        ButtonFrame b = new ButtonFrame();
        b.setVisible(true);
        b.setSize(400,400 );
    }
}