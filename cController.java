import java.awt.event.*;
import javax.swing.JOptionPane;

public class cController implements ActionListener {
    private Cviews cv;
    private CModels cm;

    public cController(CModels cm, Cviews cv) {
        this.cm = cm;
        this.cv = cv;

        cv.addButton.addActionListener(this);
        cv.subButton.addActionListener(this);
        cv.mulButton.addActionListener(this);
        cv.divButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textA = cv.txta.getText().trim();
        String textB = cv.txtb.getText().trim();

        if (textA.isEmpty() || textB.isEmpty()) {
            JOptionPane.showMessageDialog(cv, "Please enter both numbers.", "Input required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double a;
        double b;

        try {
            a = Double.parseDouble(textA);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(cv, "Enter a valid number for the first value.", "Input error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            b = Double.parseDouble(textB);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(cv, "Enter a valid number for the second value.", "Input error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double result;

        if (e.getSource() == cv.addButton) {
            result = cm.add(a, b);
        } else if (e.getSource() == cv.subButton) {
            result = cm.subtract(a, b);
        } else if (e.getSource() == cv.mulButton) {
            result = cm.multiply(a, b);
        } else if (e.getSource() == cv.divButton) {
            if (b == 0) {
                JOptionPane.showMessageDialog(cv, "Cannot divide by zero.", "Math error", JOptionPane.ERROR_MESSAGE);
                cv.txtresult.setText("");
                return;
            }
            result = cm.divide(a, b);
        } else {
            return;
        }

        cv.txtresult.setText(String.valueOf(result));
    }
}
