package Question_17;

import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    String name = "Amit Kundu";
    String department = "CSE";
    String classRoll = "44";
    String collegeName = "MIT";

    public void init() {
        setLayout(new GridLayout(4, 2));
        add(new Label("Name: " + name));
        add(new Label("Department: " + department));
        add(new Label("Class Roll: " + classRoll));
        add(new Label("College Name: " + collegeName));
    }
    public void paint(Graphics g) {
        g.drawString("Name: " + name, 20, 20);
        g.drawString("Department: " + department, 20, 40);
        g.drawString("Class Roll: " + classRoll, 20, 60);
        g.drawString("College Name: " + collegeName, 20, 80);
    }
}
