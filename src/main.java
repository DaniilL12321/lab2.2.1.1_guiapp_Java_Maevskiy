import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private JTextField textField1;
    private JTextField textField2;
    private JButton расчётButton;
    private JPanel frame;
    private JLabel label;

    public main() {
        расчётButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = textField1.getText();
                String symbol = textField2.getText();

                if (word.isEmpty() || symbol.isEmpty()) {
                    label.setText("Ошибка: Поля не могут быть пустыми");
                }
                else {
                    String word1 = word.replaceFirst("А", String.valueOf(symbol));
                    String result = symbol + word1;

                    label.setText(result);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Замена первой буквы «А» в слове на символ");
        frame.setContentPane(new main().frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.pack();
        frame.setMinimumSize(new Dimension(400,235));
        frame.pack();
        frame.setVisible(true);
    }
}

