
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame implements ActionListener{

    JPanel windowBackground;

    JLabel programTitle, labelCelsius, labelFahrenheit;
    
    JTextField inputCelsius, inputFahrenheit;

    JButton buttonToConverter, buttonToResetConverter;
    
    public Temperature(){
        
        // Look and Feel (Nimbus or Windows)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        GUIComponents();
    }

    public void GUIComponents(){

        // Component Instantiation
        windowBackground = new JPanel();

        programTitle = new JLabel();
        labelCelsius = new JLabel();
        labelFahrenheit  = new JLabel();

        inputCelsius = new JTextField();
        inputFahrenheit  = new JTextField();

        buttonToConverter = new JButton();
        buttonToResetConverter = new JButton();

        // JFrame Declaration
        final int FrameSizeX = 500;
        final int FrameSizeY = 200;

        // JFrame Size.
            setSize(FrameSizeX, FrameSizeY);
            setMinimumSize(new Dimension(FrameSizeX, FrameSizeY));
            setPreferredSize(new Dimension(FrameSizeX, FrameSizeY));

        // JFrame Decoration.
            setUndecorated(false);
            setOpacity(1.0f);
            setTitle("Temperature Converter : Brion Tactical Systems");
            setLayout(null);
            setResizable(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CENTER POPUP MAIN WINDOW.
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dimension.width / 2 - this.getWidth() / 2, dimension.height / 2 - this.getHeight() / 2);

        // Window Background (JPanel) Decorations.
            add(windowBackground);
            windowBackground.setBounds(0, 0, 500, 200);
            windowBackground.setBackground(new Color(242, 204, 143));
            windowBackground.setLayout(null);
            windowBackground.setVisible(true);    
            
        // Program Title (JLabel) Decorations.
            windowBackground.add(programTitle);
            programTitle.setBounds(65, 10, 370, 30);
            programTitle.setForeground(new Color(88, 47, 14));
            programTitle.setFont(new Font("Times New Roman", Font.PLAIN, 25));

            programTitle.setHorizontalAlignment(SwingConstants.CENTER);
            programTitle.setText("Temperature Converter");
            programTitle.setVisible(true);
            
            // Label Celcius (JLabel) Decorations.
                windowBackground.add(labelCelsius);
                labelCelsius.setBounds(10, 50, 150, 30);
                labelCelsius.setForeground(new Color(88, 47, 14));
                labelCelsius.setFont(new Font("Times New Roman", Font.PLAIN, 18));

                labelCelsius.setHorizontalAlignment(SwingConstants.LEADING);
                labelCelsius.setText("Celsius       :");
                labelCelsius.setVisible(true);
            
                // Input Celcius (JTextField) Decorations.
                    windowBackground.add(inputCelsius);
                    inputCelsius.setBounds(110, 50, 150, 35);
                    inputCelsius.setBackground(new Color(0,0,0,0));
                    inputCelsius.setForeground(new Color(43, 45, 66));
                    inputCelsius.setOpaque(false);
                    inputCelsius.setCaretColor(new java.awt.Color(0,0,0));
                    inputCelsius.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(43, 45, 66)));
                    inputCelsius.setFont(new Font("Cambria Math", Font.BOLD, 14));
                    inputCelsius.setVisible(true);//
                    
            // Label Farenheight (JLabel) Decorations.
                windowBackground.add(labelFahrenheit);
                labelFahrenheit.setBounds(10, 100, 200, 30);
                labelFahrenheit.setForeground(new Color(88, 47, 14));
                labelFahrenheit.setFont(new Font("Times New Roman", Font.PLAIN, 18));

                labelFahrenheit.setHorizontalAlignment(SwingConstants.LEADING);
                labelFahrenheit.setText("Fahrenheit  :");
                labelFahrenheit.setVisible(true);
            
                // Input Farenheight (JTextField) Decorations.
                    windowBackground.add(inputFahrenheit);
                    inputFahrenheit.setBounds(110, 100, 150, 35);
                    inputFahrenheit.setBackground(new Color(0,0,0,0));
                    inputFahrenheit.setForeground(new Color(43, 45, 66));
                    inputFahrenheit.setOpaque(false);
                    inputFahrenheit.setCaretColor(new java.awt.Color(0,0,0));
                    inputFahrenheit.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(43, 45, 66)));
                    inputFahrenheit.setFont(new Font("Cambria Math", Font.BOLD, 14));
                    inputFahrenheit.setVisible(true);//
            
            // Button to Execute Conversion (JButton) Decorations.
                windowBackground.add(buttonToConverter);
                buttonToConverter.setBounds(330, 50, 100, 40);
                buttonToConverter.setBackground(new Color(147, 102, 57));
                buttonToConverter.setFont(new Font("Cambria Math", Font.PLAIN, 18));
                buttonToConverter.setFocusPainted(false);
                buttonToConverter.setHorizontalAlignment(SwingConstants.CENTER);
                buttonToConverter.setVerticalAlignment(SwingConstants.CENTER);
                buttonToConverter.setOpaque(false);
                buttonToConverter.setForeground(new Color(0,0,0));
                buttonToConverter.setText("Convert");
                buttonToConverter.setVisible(true);

                buttonToConverter.setContentAreaFilled(true);
                buttonToConverter.setBorderPainted(false);
                buttonToConverter.setIconTextGap(-2);
                buttonToConverter.addActionListener(this);
                
                buttonToConverter.addMouseListener(new MouseAdapter(){

                        @Override
                        public void mousePressed(MouseEvent e) {
                            buttonToConverter.setBackground(new Color(88, 47, 14));
                            buttonToConverter.setForeground(new Color(255,255,255));
                            

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                            buttonToConverter.setBackground(new Color(147, 102, 57));
                            buttonToConverter.setForeground(new Color(0,0,0));
                        }

                        @Override
                        public void mouseEntered(MouseEvent e){
                            buttonToConverter.setBackground(new Color(127, 79, 36));
                        }

                        @Override
                        public void mouseExited(MouseEvent e){
                            buttonToConverter.setBackground(new Color(147, 102, 57));
                            buttonToConverter.setForeground(new Color(0,0,0));
                        }

                });
                
                // Button to Reset Converter (JButton) Decorations.
                windowBackground.add(buttonToResetConverter);
                buttonToResetConverter.setBounds(330, 100, 100, 40);
                buttonToResetConverter.setBackground(new Color(147, 102, 57));
                buttonToResetConverter.setFont(new Font("Cambria Math", Font.PLAIN, 18));
                buttonToResetConverter.setFocusPainted(false);
                buttonToResetConverter.setHorizontalAlignment(SwingConstants.CENTER);
                buttonToResetConverter.setVerticalAlignment(SwingConstants.CENTER);
                buttonToResetConverter.setOpaque(false);
                buttonToResetConverter.setForeground(new Color(0,0,0));
                buttonToResetConverter.setText("Reset");
                buttonToResetConverter.setVisible(true);

                buttonToResetConverter.setContentAreaFilled(true);
                buttonToResetConverter.setBorderPainted(false);
                buttonToResetConverter.setIconTextGap(-2);
                
                buttonToResetConverter.addMouseListener(new MouseAdapter(){

                        @Override
                        public void mousePressed(MouseEvent e) {
                            buttonToResetConverter.setBackground(new Color(88, 47, 14));
                            buttonToResetConverter.setForeground(new Color(255,255,255));
                            inputCelsius.setText("");
                            inputFahrenheit.setText("");

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                            buttonToResetConverter.setBackground(new Color(147, 102, 57));
                            buttonToResetConverter.setForeground(new Color(0,0,0));
                        }

                        @Override
                        public void mouseEntered(MouseEvent e){
                            buttonToResetConverter.setBackground(new Color(127, 79, 36));
                        }

                        @Override
                        public void mouseExited(MouseEvent e){
                            buttonToResetConverter.setBackground(new Color(147, 102, 57));
                            buttonToResetConverter.setForeground(new Color(0,0,0));
                        }

                });


    }

    public void actionPerformed(ActionEvent e){
     
        double getCelsius = Double.parseDouble(inputCelsius.getText());
        
        double convertTemp = (getCelsius * 1.8) + 32;
        
        String doubleToString = String.format("%2.04f", convertTemp);
        
        inputFahrenheit.setText(doubleToString);
        
    }
    public static void main (String args[]) {

        Temperature Launch = new Temperature();
        Launch.setVisible(true);

    }

}
