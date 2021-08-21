//import javax.swing.*;//.* import all thing from a library/package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class GUI implements KeyListener, MouseListener {

    JLabel label;

    public GUI(int w, int h, String t) {

//        JLayeredPane = Swing container that provides a third dimension for positioning components ex. depth, z-index
//        JOptionPane = a small window usually show up before jframe
//        JTextField = A GUI textbox compponent that can be used to add, set, or get text
//        JCheckBox = A GUI component that can be selected or deselected
//        JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group
//        JComboBox = A component that combines a button or editable field and a drop-down list
//        JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
//        JProgressBar = Visual aid to let the user know that an operation is processing
//        JFileChooser = A GUI mechanism that lets's a user choose a file (for opening a save)
//        JColorChooser = A GUI mechanism that let's user choose a color


//        JPanel blackpanel = new JPanel();
//        blackpanel.setBackground(Color.BLACK);

        /*
        JLabel label = new JLabel();//Labels such as text
        ImageIcon testimage = new ImageIcon("src/LOL.png");//Image
        label.setIcon(testimage);
        label.setText("Hello world");
        label.setFont(new Font("MV Boli", Font.PLAIN,20));//set the font of the text
        label.setForeground(Color.GREEN);//Set color of text
        label.setBackground(Color.BLACK);//set the background color
        label.setOpaque(true);//set color true so can be see
        Border border = BorderFactory.createLineBorder(Color.RED);//creat border
        label.setBorder(border);//set border for jframe
        label.setHorizontalTextPosition(JLabel.CENTER);//set text at left, center, right of image
        label.setVerticalTextPosition(JLabel.CENTER);//set text top, center, or buttom of imageicon
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        label.setBounds(0,0,500,500);//set x, y, position within frame as well as dimensions
         */

        /*
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,0,20,20); //x,y,l,h
        greenPanel.setPreferredSize(new Dimension(100,100)); //use for border layout
         */

        /*
        JButton button = new JButton();
        button.setBounds(50,50,200,100);
        button.setText("I am a button");
        button.setFocusable(false);//removes the bound box of the text
        button.setIcon();
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont();
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(false);
        button.addActionListener(e -> System.out.println("HELLO"));
        button.setEnabled(false);
         */

        /*
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,300,300);
        layeredPane.add(JLabel); //keep adding JLabel on same JLayeredPane will put behind the previous JLabel
        layeredPane.add(JLabel,Integer.valueOf(0)); //higher the number, higher the placement

         */

        /*
        JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.PLAIN_MESSAGE); //little window that comes before jframe
        JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null, "You have virus!", "title", JOptionPane.YES_NO_CANCEL_OPTION); //return -1 to 2 depends on what you press
        JOptionPane.showInputDialog("hello"); //you can type into this, returns a string
        JOptionPane.showOptionDialog(null, "wow", "title",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, null, 0); //icon can be replaced with ImageIcon; options can be replaced with array of strings
        while(true)
        {
            JOptionPane.showMessageDialog(null, "You have virus!", "title", JOptionPane.ERROR_MESSAGE);
        }
         */

        /*
        TextField textField = new TextField(); //frame layout can't be null
        textField.setPreferredSize(new Dimension(200,100));
        textField.setBackground(Color.WHITE);
        textField.setEditable(true);
        */

        /*
        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Hello World");
        checkBox.setFocusable(false); //remove the box around the text
        checkBox.setIcon(Icon1);
        checkBox.setSelectedIcon(Icon2); //checkBox icon will change between Icon1 and Icon2 depends on if it is toggled or not
         */

        /*
        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton hamburgerButton = new JRadioButton("hamburger");
        JRadioButton hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup(); //only allow one button to be selected in this group
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
         */

        /*
        String[] s = {"cat","dog","pig"};
        JComboBox comboBox = new JComboBox(s); //can work with arrays
        comboBox.setEditable(true);

//        comboBox.getSelectedItem(); //return whatever was selected
//        comboBox.getSelectedIndex(); //return the index of the selected
//        comboBox.getItemCount(); //return the number of item
//        comboBox.addItem("");
//        comboBox.insertItemAt("",0);
//        comboBox.setSelectedIndex(0); //set default
         */

/*
        JSlider slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
//        slider.addChangeListener(this);
 */

/*
        JProgressBar bar = new JProgressBar(0,1,100);
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); //adds a percentage for the progress bar
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);
 */

        /*
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==loadItem) {
                System.out.println("Loading...");
                }
                if(e.getSource()==exitItem) {
                    System.exit(0);
                }
                if(e.getSource()==saveItem) {
                    System.out.println("Saved!");
                }
            }
        };
        exitItem.addActionListener(actionListener);
        saveItem.addActionListener(actionListener);
        loadItem.addActionListener(actionListener);
        loadItem.setMnemonic(KeyEvent.VK_L); //keyboard shortcut, "l" key for loadItem
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
         */

        /*
        public void actionPerformed(ActionListener e)
        {
            if(e.getSource()==saveButton)
            {
                JFileChooser fileChooser = new JFileChooser();
                int response = fileChooser.showOpenDialog(null); //select file to open
                if(response==JFileChooser.APPROVE_OPTION)
                {
                    File file = new File(fileChooser.getSelectedFile().getAbsoluteFile());
                }
            }
        }
         */

        /*
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null,"Pick a color", null);
         */

        Graphics g = null;
        Graphics2D g2D = (Graphics2D) g;

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.addMouseListener(this);


        JFrame frame = new JFrame();
        frame.setSize(w, h);
        frame.setTitle(t);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//normally HIDE_ON_CLOSE which only hides it; DO_NOTHING_ON_CLOSE which do nothing
        frame.setLayout(null);
        frame.setVisible(true);


//        frame.setResizable(false);//prevent frame from resized
//        frame.add(label);//add before pack
//        frame.setLayout(null);
//        frame.pack();//auto set size for frame that fit label. Ps: .pack after .add
//        frame.setLayout(new BorderLayout());
//        frame.add(greenPanel,BorderLayout.NORTH); //set border to NSEW
//        frame.setLayout(new FlowLayout()); //adjust position of objects based on size of jFrame.
//
//        ImageIcon image = new ImageIcon("src/LOL.png");//create an ImageIcon
//        frame.setIconImage(image.getImage());//change icon of frame
//        frame.getContentPane().setBackground(Color.WHITE);
//        frame.add(greenPanel);
//        frame.add(button);
//
//        frame.add(layeredPane);
//
//        frame.add(textField);

//        frame.add(checkBox);

//        frame.add(hotdogButton);
//        frame.add(pizzaButton);
//        frame.add(hamburgerButton);

//        frame.add(comboBox);

//        frame.add(slider);

//        frame.add(bar);
//        int counter = 0;
//        while(counter<=100)
//        {
//            bar.setValue(counter);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            counter++;
//        }
//        bar.setString("done");

//        frame.setJMenuBar(menuBar);

//        frame.addKeyListener(this);
//        frame.add(label);

//        frame.pack(); //pack the Jframe to size of whatever objects that are in it

    }

    public GUI() {


        JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//normally HIDE_ON_CLOSE which only hides it; DO_NOTHING_ON_CLOSE which do nothing
        frame.setResizable(false);
        frame.setVisible(true);


        //ImageIcon image = new ImageIcon("src/LOL.png");//create an ImageIcon
        //frame.setIconImage(image.getImage());//change icon of frame
        //frame.setLayout(new GridLayout(3,3,10,10));
        //frame.getContentPane().setBackground(new Color(0,0,0));
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed. Uses KeyChar, char output

        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;

            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down. Uses KeyChar, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a button is released
//        System.out.println("You released key " +e.getKeyChar()); //getKeyCode() shows the assigned number of the key
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("Hi");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//when mouse hover over something
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
