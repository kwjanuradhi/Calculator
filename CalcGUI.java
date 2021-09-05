import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * WEEK 08_HOME WORK_CALCULATOR GUI.
 * 
 * @author : Anuradhi Jayasekara 23618130
 * @version : V_01 29th Aug 2021

 */
public class CalcGUI extends JFrame
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
        buttonTwo = new JButton("2");      
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonZero = new JButton("0");
        
        // Calculaor buttons for signs
        buttonDot = new JButton(".");
        buttonSign = new JButton("+/-");
        buttonEqual = new JButton("=");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonFac = new JButton("!");
        buttonBackspace = new JButton("<<");
        buttonClear = new JButton("C");
        buttonOpenBracket = new JButton("(");
        buttonCloseBracket = new JButton(")");
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
    }
    // main mehtod    
    public static void main(String[] args) {
        // create the frame object
        CalcGUI frame = new CalcGUI();
        // show the frame
        frame.setVisible(true);
    }

}
