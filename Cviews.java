import javax.swing.*;
public class Cviews extends JFrame {
    JLabel a, b, result;
    JTextField txta, txtb, txtresult;
    JButton addButton, subButton, mulButton, divButton;

    Cviews() {
        setTitle("Calculator");
        setSize(500, 500);
        setLayout(null);

        a= new JLabel("Enter a:");
        a.setBounds(30, 30, 100, 30);
        add(a);
        txta =new JTextField();
        txta.setBounds(100, 30, 100, 30);
        add(txta);

        b = new JLabel("Enter b:");
        b.setBounds(30, 60, 100, 30);
        add(b);
        txtb = new JTextField();
        txtb.setBounds(100, 60, 100, 30);
        add(txtb);

        addButton = new JButton("Add");
        addButton.setBounds(30, 110, 120, 30);
        add(addButton);

        subButton = new JButton("Subtract");
        subButton.setBounds(170, 110, 120, 30);
        add(subButton);

        mulButton = new JButton("Multiply");
        mulButton.setBounds(30, 150, 120, 30);
        add(mulButton);

        divButton = new JButton("Divide");
        divButton.setBounds(170, 150, 120, 30);
        add(divButton);

        result = new JLabel("Result:");
        result.setBounds(20, 200, 100, 30);
        add(result);
         
        txtresult = new JTextField();
        txtresult.setBounds(100, 200, 180, 30);
        txtresult.setEditable(false);
        add(txtresult);
        setVisible(true);
    }
}