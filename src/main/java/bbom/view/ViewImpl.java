package bbom.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

public class ViewImpl extends JFrame implements View {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 70;
    private static final String TITLE = "My BBoM App";
    private final JButton button;
    private final JPanel panel;

    public ViewImpl() {
        super(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);

        this.panel = new JPanel();
        this.button = new JButton("Update");

        this.panel.add(this.button);
        this.setLayout(new BorderLayout());
        this.add(this.panel,BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent ev) {
                System.exit(-1);
            }
        });
    }


    @Override
    public void showGUI() {
        try {
            SwingUtilities.invokeAndWait(() -> {
                this.setVisible(true);
            });
        } catch (final InterruptedException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void showState(final int state) {
        System.out.println("[Output] State value: " + state);
    }

    @Override
    public void addClickListener(final ActionListener listener) {
        this.button.addActionListener(listener);
    }
}
