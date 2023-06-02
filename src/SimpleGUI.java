import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SimpleGUI extends JFrame implements ActionListener, ItemListener {

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JLabel welcomeLabel;

    public SimpleGUI() {
        super("QU-WACK A MOLE");
        init();
    }

    private void init() {

        setTitle("QuWack a mole");
        setSize(540, 810);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/bg.png");
        JLabel background = new JLabel(icon);
        add(background);
        background.setLayout(new FlowLayout());
        setVisible(true);

        setLocation(100, 200);
        JPanel title = new JPanel();

        JButton start = new JButton("Start");
        title.add(start);
        setVisible(true);


        JPanel panel1 = new JPanel();
        JButton button1 = new JButton("mole1");
        button1.setPreferredSize(new Dimension(150, 40));

        //button1.setBounds(100,650,116,40);
        JButton button2 = new JButton("mole2");
        button2.setPreferredSize(new Dimension(150, 40));

        JButton button3 = new JButton("mole3");
        button3.setPreferredSize(new Dimension(150, 40));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.setOpaque(false);
        panel1.repaint();

        JPanel panel2 = new JPanel();
        JButton button12 = new JButton("mole4");
        JButton button22 = new JButton("mole5");
        JButton button32 = new JButton("mole6");
        panel2.add(button12);
        button12.setPreferredSize(new Dimension(150, 40));

        panel2.add(button22);
        button22.setPreferredSize(new Dimension(150, 40));

        panel2.add(button32);
        button32.setPreferredSize(new Dimension(150, 40));

        panel2.setOpaque(false);
        panel2.repaint();

        JPanel panel3 = new JPanel();
        JButton button13 = new JButton("mole7");
        button13.setPreferredSize(new Dimension(150, 40));

        JButton button23 = new JButton("mole8");
        button23.setPreferredSize(new Dimension(150, 40));

        JButton button33 = new JButton("mole9");
        button33.setPreferredSize(new Dimension(150, 40));

        panel3.add(button13);
        panel3.add(button23);
        panel3.add(button33);
        panel3.setOpaque(false);
        panel3.repaint();

        // create welcome label
        welcomeLabel = new JLabel("Welcome to QU-WACK A MOLE");
        welcomeLabel.setFont(new Font("Futura", Font.BOLD, 20));
        title.add(welcomeLabel);
        title.setOpaque(false);
        title.repaint();


        // add bottom components to the panel, in left-to-right order
        JPanel empty1 = new JPanel();
        empty1.setOpaque(false);
        empty1.repaint();
        JPanel empty3 = new JPanel();
        empty3.setOpaque(false);
        empty3.repaint();
        JPanel empty2 = new JPanel();
        empty2.setOpaque(false);
        empty2.repaint();
        JPanel empty11 = new JPanel();
        empty11.setOpaque(false);
        empty11.repaint();
        JPanel empty33 = new JPanel();
        empty33.setOpaque(false);
        empty3.repaint();
        JPanel empty22 = new JPanel();
        empty22.setOpaque(false);
        empty22.repaint();
        JPanel empty0 = new JPanel();
        empty0.setOpaque(false);
        empty0.repaint();
        JPanel empty00 = new JPanel();
        empty00.setOpaque(false);
        empty00.repaint();
        JPanel empty000 = new JPanel();
        empty000.setOpaque(false);
        empty000.repaint();
        JPanel empty10 = new JPanel();
        empty10.setOpaque(false);
        empty10.repaint();
        JPanel empty100 = new JPanel();
        empty100.setOpaque(false);
        empty100.repaint();
        JPanel empty1000 = new JPanel();
        empty1000.setOpaque(false);
        empty1000.repaint();

        // creating a third panel to place slider and bottom panels vertically
        // (allows two rows of UI elements to be displayed)
        JPanel combinedPanels = new JPanel();
        combinedPanels.setLayout(new GridLayout(15, 1));
        combinedPanels.add(empty0);
        combinedPanels.add(empty00);
        combinedPanels.add(empty000);
        combinedPanels.add(empty10);
        combinedPanels.add(empty100);
        combinedPanels.add(empty1000);
        combinedPanels.add(panel1);
        combinedPanels.add(empty1);
        combinedPanels.add(empty11);
        combinedPanels.add(panel2);
        combinedPanels.add(empty2);
        combinedPanels.add(empty22);
        combinedPanels.add(panel3);
        combinedPanels.add(empty3);
        combinedPanels.add(empty33);
        combinedPanels.setOpaque(false);
        combinedPanels.repaint();

        // add the menu bar to the TOP of the frame, the big white text area
        // to the MIDDLE of the frame, and the "combinedPanels" (which has
        // the label, slider, text box, buttons, and checkboxes) at the BOTTOM
        background.add(title);
        background.add(combinedPanels, BorderLayout.CENTER);
        //background.add(button2);
        //button2.setLocation(12, 371);
        //button2.setPreferredSize(new Dimension(116, 40));



        // display the frame!
        setVisible(true);
    }

    // ActionListener interface method, called when a button is clicked
    public void actionPerformed(ActionEvent ae) {
        // cast ae to a JButton object since we want to call the getText method on it;
        // casting is needed since getSource() returns Object type, NOT a JButton
        Object source = ae.getSource();
        JButton button = (JButton) source;
        String text = button.getText();

        if (text.equals("Send")) {
            welcomeLabel.setText("Send pressed!");
        } else if (text.equals("Reset")) {
            welcomeLabel.setText("Reset pressed!");
        }
    }

    // ItemListener interface method, called when EITHER check box is toggled!
    public void itemStateChanged(ItemEvent e) {

        // cast e to a JCheckBox object since we want to call the getText method on it;
        // casting is needed since getSource() returns Object type, NOT a JCheckBox
        Object source = e.getSource();
        JCheckBox cb = (JCheckBox) source;
        String cbText = cb.getText();

        int checkBoxOnOrOff = e.getStateChange(); // 1 for selected, 2 for deselected
        if (checkBoxOnOrOff == 1) {
            welcomeLabel.setText(cbText + " box SELECTED!");
        } else if (checkBoxOnOrOff == 2) {
            welcomeLabel.setText(cbText + " box DESELECTED!");
        }

        // we don't "print" with GUI based apps, but printing
        // can still be helpful for testing and debugging!
        System.out.println("Current state: yes = " + checkBox1.isSelected() + ", no = " + checkBox2.isSelected());
    }
}

