package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JButton;
public class tictactoe1 extends javax.swing.JFrame {

    Main main= new Main();
    public static final String JButton1 = null;
	public tictactoe1() {
		getContentPane().setFont(new Font("MV Boli", Font.BOLD, 20));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\welcome\\Downloads\\tictactoe.png"));
		getContentPane().setBackground(Color.RED);
		setBackground(Color.DARK_GRAY);
		setTitle("Tic tac toe");
    	setBounds(new Rectangle(475, 225, 280, 252));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("MV Boli", Font.BOLD, 32));
        jButton1.setBackground(Color.PINK);
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton1.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton1.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton1.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton2.setBackground(Color.PINK);
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton2.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton2.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton2.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton3.setBackground(Color.PINK);
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton3.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton3.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton3.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton4 = new javax.swing.JButton();
        jButton4.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton4.setBackground(Color.PINK);
        jButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton4.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton4.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton4.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton5 = new javax.swing.JButton();
        jButton5.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton5.setBackground(Color.PINK);
        jButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton5.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton5.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton5.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton6 = new javax.swing.JButton();
        jButton6.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton6.setBackground(Color.PINK);
        jButton6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton6.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton6.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton6.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton7 = new javax.swing.JButton();
        jButton7.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton7.setBackground(Color.PINK);
        jButton7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton7.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton7.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton7.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton8 = new javax.swing.JButton();
        jButton8.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton8.setBackground(Color.PINK);
        jButton8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton8.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton8.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton8.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });
        jButton9 = new javax.swing.JButton();
        jButton9.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 32));
        jButton9.setBackground(Color.PINK);
        jButton9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(jButton9.getText().equals("")){
        			if(main.playerTurn == true){
        				jButton9.setText("X");
        				Main.checkforwin();
        				Main.playerTurn = false;
        			}else{
        				jButton9.setText("O");
        				Main.checkforwin();
        				Main.playerTurn= true;
        			}
        		}
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        btnNewButton = new JButton("Play Again!");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnNewButton.setBackground(new Color(0, 0, 255));
        btnNewButton.setForeground(new Color(0, 204, 0));
        btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(49)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addComponent(btnNewButton)
        			.addGap(30))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private JButton btnNewButton;
    // End of variables declaration                   
}