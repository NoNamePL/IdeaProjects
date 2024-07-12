
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Main implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton,subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton,negButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD,14);

    double num1=0,num2=0,res=0;
    char operator;
    boolean equalsFlag = false;


    Main() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(45,10,200,25);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        negButton = new JButton("-/+");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for(int i = 0;i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);

        }

        for(int i = 0;i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // del,neg and clear buttons
        delButton.setBounds(45,190,60,40);
        negButton.setBounds(115,190,60,40);
        clrButton.setBounds(185,190,60,40);

        // numbers panel
        panel = new JPanel();
        panel.setBounds(45,40,200,145);
        panel.setLayout(new GridLayout(4,4,2,2));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);

        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);

        panel.add(subButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);


        // add buttons to the main frame
        frame.add(panel);
        frame.add(delButton);
        frame.add(negButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Main calc = new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                if (equalsFlag)
                    textField.setText("");
                equalsFlag = false;
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton) {
            if(!textField.getText().isEmpty())
                textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if(e.getSource() == equButton) {
            equals();
        }

        if(e.getSource() == clrButton) {
            textField.setText("");
        }

        if(e.getSource() == delButton) {
            String str = textField.getText();
            if(!str.isEmpty()) {
                textField.setText("");
                textField.setText(str.substring(0, str.length()-1));
            }
        }
        if(e.getSource() == negButton) {
            double temp = Double.parseDouble(textField.getText());
            temp = -temp;
            textField.setText(String.valueOf(temp));
        }
    }

    public void equals() {
        equalsFlag = true;
        num2=Double.parseDouble(textField.getText());

        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 -num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
        }
        textField.setText(String.valueOf(res));
        num1=res;
    }
}
