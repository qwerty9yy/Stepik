import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("E:\\Китай\1.jpg");
        JOptionPane.showMessageDialog(
                null,
                "Настройки сохранены",
                "Готово",
                JOptionPane.PLAIN_MESSAGE,
                icon
        );
    }
}