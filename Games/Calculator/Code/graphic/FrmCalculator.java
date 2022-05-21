package graphic;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import logic.Calculator;
import logic.Calculator.Operation;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class FrmCalculator extends JFrame {
    private JTextField txtDisplay;
    private Calculator calculator;
    public FrmCalculator() {

        this.calculator = new Calculator();

        setLayout(new BorderLayout());

        // JPanel North
        JPanel pnlNorth = new JPanel(new BorderLayout());
        this.add(pnlNorth, BorderLayout.NORTH);
        this.txtDisplay = new JTextField();
        this.txtDisplay.setEditable(false);
        pnlNorth.add(this.txtDisplay, BorderLayout.CENTER);

        // JPanel Center
        JPanel pnlCenter = new JPanel(new GridLayout(5, 4, 5, 5));
        this.add(pnlCenter, BorderLayout.CENTER);

        // InputMap
        InputMap inputMap = pnlCenter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        JButton btn = new JButton("C");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
                calculator.setWaiting(false);
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('c'), 'c');
        pnlCenter.getActionMap().put('c', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("*");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                calculator.setValue1(Double.parseDouble(txtOld.replace(",", ".")));
                calculator.setOperation(Operation.MULTIPLICATION);
                calculator.setWaiting(true);
                txtDisplay.setText("");
            }
        });            
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('*'), '*');
        pnlCenter.getActionMap().put('*', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("<html>a<sup>b</sup></html>");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                calculator.setValue1(Double.parseDouble(txtOld.replace(",", ".")));
                calculator.setOperation(Operation.POTENCY);
                calculator.setWaiting(true);
                txtDisplay.setText("");
            }
        });            
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('p'), 'p');
        pnlCenter.getActionMap().put('p', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("<");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                if (txtOld.length() > 0) {
                    txtDisplay.setText(txtOld.substring(0, txtOld.length() - 1));
                }                
            }
        });         
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), '<');
        pnlCenter.getActionMap().put('<', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("7");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("7"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('7'), '7');
        pnlCenter.getActionMap().put('7', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("8");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("8"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('8'), '8');
        pnlCenter.getActionMap().put('8', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("9");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("9"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('9'), '9');
        pnlCenter.getActionMap().put('9', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("/");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                calculator.setValue1(Double.parseDouble(txtOld.replace(",", ".")));
                calculator.setOperation(Operation.DIVISION);
                calculator.setWaiting(true);
                txtDisplay.setText("");
            }
        });            
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('/'), '/');
        pnlCenter.getActionMap().put('/', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("4");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("4"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('4'), '4');
        pnlCenter.getActionMap().put('4', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("5");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("5"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('5'), '5');
        pnlCenter.getActionMap().put('5', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("6");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("6"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('6'), '6');
        pnlCenter.getActionMap().put('6', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("+");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                calculator.setValue1(Double.parseDouble(txtOld.replace(",", ".")));
                calculator.setOperation(Operation.SUM);
                calculator.setWaiting(true);
                txtDisplay.setText("");
            }
        });   
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('+'), '+');
        pnlCenter.getActionMap().put('+', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("1");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("1"));
            }
        });
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('1'), '1');
        pnlCenter.getActionMap().put('1', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("2");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("2"));
            }
        });
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('2'), '2');
        pnlCenter.getActionMap().put('2', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("3");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("3"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('3'), '3');
        pnlCenter.getActionMap().put('3', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("-");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                calculator.setValue1(Double.parseDouble(txtOld.replace(",", ".")));
                calculator.setOperation(Operation.SUBTRACTION);
                calculator.setWaiting(true);
                txtDisplay.setText("");
            }
        });            
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('-'), '-');
        pnlCenter.getActionMap().put('-', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("+/-");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtOld = txtDisplay.getText();
                double num = Double.parseDouble(txtOld.replace(",", "."));
                num *= -1; // num = -1 * num
                txtDisplay.setText(String.format("%f", num));
            }
        });
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('.'), '.');
        pnlCenter.getActionMap().put('.', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("0");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();
                txtDisplay.setText(txtOld.concat("0"));
            }
        });        
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('0'), '0');
        pnlCenter.getActionMap().put('0', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton(",");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtOld = txtDisplay.getText();                
                if (!txtOld.contains(",")) {
                    txtDisplay.setText(txtOld.concat(","));
                }
            }
        });          
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke(','), ',');
        pnlCenter.getActionMap().put(',', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("=");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                if (calculator.isWaiting()) {
                    String txtOld = txtDisplay.getText();
                    calculator.setValue2(Double.parseDouble(txtOld.replace(",", ".")));
                    txtDisplay.setText(String.format("%f", calculator.calculate()));
                    calculator.setWaiting(false);
                }
            }
        });         
        pnlCenter.add(btn);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), '=');
        pnlCenter.getActionMap().put('=', (AbstractAction) btn.getActionListeners()[0]);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlCenter.requestFocus();
    }
}