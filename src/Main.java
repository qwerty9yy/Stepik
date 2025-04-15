import javax.swing.*;

public class Main extends JFrame{
    private static final long serialVersionUID = 1L;

    public Main(){
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contents = new JPanel();
        contents.add(new JButton("Школа"));

        JButton button = new JButton("Семья");
        button.addActionListener(e -> System.out.println("Кнопка нажата!"));
        contents.add(button);

        setContentPane(contents);

        setSize(200,100);

        setVisible(true);
    }
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}