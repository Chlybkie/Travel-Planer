import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch(Exception ignored){}
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TravelPlaner travelPlaner = new TravelPlaner();
                travelPlaner.setVisible(true);



            }
        });

    }
}