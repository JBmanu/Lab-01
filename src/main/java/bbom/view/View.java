package bbom.view;

import java.awt.event.ActionListener;

public interface View {

    void showGUI();
    void showState(int state);
    void addClickListener(ActionListener listener);
}
