import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelPlaner extends JFrame{
    private JPanel contentPane;
    private JButton hiButton;

    public TravelPlaner(){

        setTitle("Travel Planer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        setLocationRelativeTo(null);
        setSize(500,500);
        /*hiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I was clicked!");
            }
        });*/

        setVisible(true);





    }

}
