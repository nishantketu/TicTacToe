package pack;

import javax.swing.JOptionPane;

public class Main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerwon = false;
	public static tictactoe1 board = new tictactoe1();
	public static void main(String[] args) {
		if(board.isVisible() == false){
			board.setVisible(true);
		}

	}
	public static void checkforwin(){
		if(board.jButton1.getText().equals("X")){
			if(board.jButton4.getText().equals("X")){
				if(board.jButton7.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton1.getText().equals("X")){
			if(board.jButton2.getText().equals("X")){
				if(board.jButton3.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton1.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton3.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton7.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton3.getText().equals("X")){
			if(board.jButton6.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton7.getText().equals("X")){
			if(board.jButton8.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		
		if(board.jButton4.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton6.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton2.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton8.getText().equals("X")){
					playerWon = true;
					computerwon = false;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player1 Won!" );
				}
			}
		}
		if(board.jButton1.getText().equals("O")){
			if(board.jButton4.getText().equals("O")){
				if(board.jButton7.getText().equals("O")){
					playerWon = false;
					computerwon = true;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
				}
				
				if(board.jButton1.getText().equals("O")){
					if(board.jButton2.getText().equals("O")){
						if(board.jButton3.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
				if(board.jButton3.getText().equals("O")){
					if(board.jButton5.getText().equals("O")){
						if(board.jButton7.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
				if(board.jButton3.getText().equals("O")){
					if(board.jButton6.getText().equals("O")){
						if(board.jButton9.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
				if(board.jButton7.getText().equals("O")){
					if(board.jButton8.getText().equals("O")){
						if(board.jButton9.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
				
				if(board.jButton4.getText().equals("O")){
					if(board.jButton5.getText().equals("O")){
						if(board.jButton6.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
				if(board.jButton2.getText().equals("O")){
					if(board.jButton5.getText().equals("O")){
						if(board.jButton8.getText().equals("O")){
							playerWon = false;
							computerwon = true;
							JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
						}
					}
				}
		
		if(board.jButton1.getText().equals("O")){
			if(board.jButton5.getText().equals("O")){
				if(board.jButton9.getText().equals("O")){
					playerWon = false;
					computerwon = true;
					JOptionPane.showMessageDialog(board.jButton5, " game over, Player2 Won!" );
				}
			}
		}
		if(playerWon == false && computerwon == false){
			//board.setVisible(false);
			JOptionPane.showMessageDialog(board.jButton5, " game over, Draw! " );
		}
		
	}

}
	
}
}
