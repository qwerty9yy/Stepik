import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{
    public void paint(Graphics g){
        // 1. Рисуем черный прямоугольник
        g.setColor(Color.black);
        g.drawRect(0, 0, 100, 100);
        // 2. Устанавливаем область отсечения
        g.clipRect(25, 25, 50, 50);
        // 3. Рисуем линию (будет видна только в области отсечения)
        g.drawLine(0, 100, 100, 0);
    }
    public static void  main(String[] args){
        JFrame frame = new JFrame();
        frame.add(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 20, 500, 500);
        frame.setVisible(true);
    }
}