import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * WEEK 08_HOME WORK_CALCULATOR GUI.
 * WEEK 09_HOME CALCULATOR GUI TO SHOW THE USER EXPRESSION.
 * 
 * @author : Anuradhi Jayasekara 23618130
 * @version : V_02 10th Sept 2021

 */
public class CalcGUI extends JFrame implements ActionListener, KeyListener
{
    JPanel panelTop;
    JPanel panelLeft;
    JPanel panelRight;
    JPanel panelBottom;
    
    JTextField calcDisplay;
    
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    JButton buttonFive;
    JButton buttonSix;
    JButton buttonSeven;
    JButton buttonEight;
    JButton buttonNine;
    JButton buttonZero;
    JButton buttonSign;
    JButton buttonDot;
    JButton buttonEqual;

    JButton buttonAdd;
    JButton buttonSub;
    JButton buttonMul;
    JButton buttonDiv;
    JButton buttonFac;
    
    JButton buttonBackspace;
    JButton buttonClear;
    JButton buttonOpenBracket;
    JButton buttonCloseBracket;
    JButton buttonOff;
    
    String expression = "";
   
    
    public CalcGUI()
    {
        super("My PROG 5001 Calc");
        setLayout(null);
        // Top panel
        panelTop = new JPanel();
        panelTop.setBackground(Color.green);
        panelTop.setBounds(20,15,360,35);
        add(panelTop);
        
        // Bottom panel
        panelBottom = new JPanel();
        panelBottom.setBackground(Color.red);
        panelBottom.setBounds(20,63,360,300);
        add(panelBottom);
        
        // Top panel text box
        calcDisplay = new JTextField();
        calcDisplay.setPreferredSize(new Dimension(350, 25));
        panelTop.add(calcDisplay);
        
        // Calculator buttons for numbers 
        buttonOne = new JButton("1");
        buttonOne.setActionCommand("CMD_1");
        buttonOne.addActionListener(this);
        
        buttonTwo = new JButton("2"); 
        buttonTwo.setActionCommand("CMD_2");
        buttonTwo.addActionListener(this);
        
        buttonThree = new JButton("3");
        buttonThree.setActionCommand("CMD_3");
        buttonThree.addActionListener(this);
        
        buttonFour = new JButton("4");
        buttonFour.setActionCommand("CMD_4");
        buttonFour.addActionListener(this);
        
        buttonFive = new JButton("5");
        buttonFive.setActionCommand("CMD_5");
        buttonFive.addActionListener(this);
        
        buttonSix = new JButton("6");
        buttonSix.setActionCommand("CMD_6");
        buttonSix.addActionListener(this);
        
        buttonSeven = new JButton("7");
        buttonSeven.setActionCommand("CMD_7");
        buttonSeven.addActionListener(this);
        
        buttonEight = new JButton("8");
        buttonEight.setActionCommand("CMD_8");
        buttonEight.addActionListener(this);
        
        buttonNine = new JButton("9");
        buttonNine.setActionCommand("CMD_9");
        buttonNine.addActionListener(this);
        
        buttonZero = new JButton("0");
        buttonZero.setActionCommand("CMD_ZERO");
        buttonZero.addActionListener(this);
        
        // Calculaor buttons for signs
        buttonDot = new JButton(".");
        buttonDot.setActionCommand("CMD_DOT");
        buttonDot.addActionListener(this);
        
        buttonSign = new JButton("+/-");
        buttonSign.setActionCommand("CMD_PLUSMINUS");
        buttonSign.addActionListener(this);
        
        buttonEqual = new JButton("=");
        buttonEqual.setActionCommand("CMD_EQUAL");
        buttonEqual.addActionListener(this);
        
        buttonAdd = new JButton("+");
        buttonAdd.setActionCommand("CMD_PLUS");
        buttonAdd.addActionListener(this);
        
        buttonSub = new JButton("-");
        buttonSub.setActionCommand("CMD_MINUS");
        buttonSub.addActionListener(this);
        
        buttonMul = new JButton("*");
        buttonMul.setActionCommand("CMD_MULTIPLICATION");
        buttonMul.addActionListener(this);
        
        buttonDiv = new JButton("/");
        buttonDiv.setActionCommand("CMD_DIVISION");
        buttonDiv.addActionListener(this);
        
        buttonFac = new JButton("!");
        buttonFac.setActionCommand("CMD_FACTORIAL");
        buttonFac.addActionListener(this);
        
        buttonBackspace = new JButton("<<");
        buttonClear = new JButton("C");
        
        buttonOpenBracket = new JButton("(");
        buttonOpenBracket.setActionCommand("CMD_OPENBRACKET");
        buttonOpenBracket.addActionListener(this);
        
        buttonCloseBracket = new JButton(")");
        buttonCloseBracket.setActionCommand("CMD_CLOSEBRACKET");
        buttonCloseBracket.addActionListener(this);
        
        buttonOff = new JButton("OFF");
        
        // add buttons to the panel
        panelBottom.add(buttonOne);    
        panelBottom.add(buttonTwo);
        panelBottom.add(buttonThree);
        panelBottom.add(buttonFour);
        panelBottom.add(buttonFive);
        panelBottom.add(buttonSix);
        panelBottom.add(buttonSeven);
        panelBottom.add(buttonEight);
        panelBottom.add(buttonNine);
        panelBottom.add(buttonZero);
        panelBottom.add(buttonDot);
        panelBottom.add(buttonSign);
        panelBottom.add(buttonEqual);
        
        panelBottom.add(buttonAdd);
        panelBottom.add(buttonSub);
        panelBottom.add(buttonMul);
        panelBottom.add(buttonDiv);
        panelBottom.add(buttonFac);
        
        panelBottom.add(buttonBackspace);
        panelBottom.add(buttonClear);
        panelBottom.add(buttonOpenBracket);
        panelBottom.add(buttonCloseBracket);
        panelBottom.add(buttonOff);
      
        setPreferredSize(new Dimension(400, 400));
        
        pack();
        
        setFocusable(true);
        addKeyListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        //Execute and update the button action according to the user input
        String cmd = e.getActionCommand();
        if (cmd.equals("CMD_1")) {
           expression = expression + "1";
        } else
        if (cmd.equals("CMD_2")) {
           expression = expression + "2";
        } else
        if (cmd.equals("CMD_3")) {
           expression = expression + "3";
        }else
        if (cmd.equals("CMD_4")) {
           expression = expression + "4";
        }else
        if (cmd.equals("CMD_5")) {
           expression = expression + "5";
        }else
        if (cmd.equals("CMD_6")) {
           expression = expression + "6";
        }else
        if (cmd.equals("CMD_7")) {
           expression = expression + "7";
        }else
        if (cmd.equals("CMD_8")) {
           expression = expression + "8";
        }else
        if (cmd.equals("CMD_9")) {
           expression = expression + "9";
        }else
        if (cmd.equals("CMD_ZERO")) {
           expression = expression + "0";
        }else
        if (cmd.equals("CMD_DOT")) {
           expression = expression + ".";
        }else
        if (cmd.equals("CMD_PLUSMINUS")) {
           expression = expression + "+/-";
        }else
        if (cmd.equals("CMD_EQUAL")) {
           expression = expression + "=";
        }else
        if (cmd.equals("CMD_PLUS")) {
           expression = expression + "+";
        }else
        if (cmd.equals("CMD_MINUS")) {
           expression = expression + "-";
        }else
        if (cmd.equals("CMD_MULTIPLICATION")) {
           expression = expression + "*";
        }else
        if (cmd.equals("CMD_DIVISION")) {
           expression = expression + "/";
        }else
        if (cmd.equals("CMD_FACTORIAL")) {
           expression = expression + "!";
        }else
        if (cmd.equals("CMD_OPENBRACKET")) {
           expression = expression + "(";
        }else
        if (cmd.equals("CMD_CLOSEBRACKET")) {
           expression = expression + ")";
        }
        calcDisplay.setText(expression);      
            
    }
    
    public void keyPressed(KeyEvent e) {
      
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
    // main mehtod    
    public static void main(String[] args) {
        // create the frame object
        CalcGUI frame = new CalcGUI();
        // show the frame
        frame.setVisible(true);
    }

}
