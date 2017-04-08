import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToe extends JApplet implements ActionListener {

 
 
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;
    private int level = 1;
    private int moves =0;
    private int[] twoWaysMove = new int[3];
    private int[] winningMove = new int[3];
    private int p1wins = 0;
    private int p2wins = 0;
    private int pvpDraws = 0;
 
    private String[] soptions = {"Easy", "Medium", "Hard", "PvP"};
    private JComboBox gameoptions; // this allows for choice of level of difficulty
    private JButton[][][] board = new JButton[4][4][4]; // this is the game board
    private JButton rbutton; // this is the reset button
    private JPanel[] gamepanel = new JPanel[4];
    private JPanel menu = new JPanel();
    private JLabel winlbl = new JLabel("Wins: " + wins);
    private JLabel losslbl = new JLabel("Losses: " + losses);
    private JLabel drawslbl = new JLabel("Draws: " + draws);

    
    
    private JLabel difflbl = new JLabel("Difficulty level selected: ");
    private String m ="X";
 
 
    public void init() 

    {
        //setTitle("3d Tic Tac Toe");
        Container content = getContentPane();
     
     
        //setting up game panels

        setSize(400,800);
        for(int w=0; w<4; w++)
        {
            gamepanel[w] = new JPanel(); // instantiate each game panel which is a JPanel
            gamepanel[w].setMaximumSize(new Dimension(200,200));
            gamepanel[w].setLayout(new GridLayout(4,4));
            content.add(gamepanel[w]);
            content.add(Box.createRigidArea(new Dimension(0, 10)));
         
        }
     
          //setting up menu panel
          menu = new JPanel();
          menu.setMaximumSize(new Dimension(500,80));
       //   menu.setLayout(new FlowLayout()); // this is the default
          menu.setBackground(Color.white);
          rbutton = new JButton("Reset");
          rbutton.setActionCommand("Reset");
          rbutton.addActionListener(this);
          gameoptions = new JComboBox(soptions);
          gameoptions.setSelectedIndex(1);
          gameoptions.setActionCommand("Level");
          gameoptions.addActionListener(this);
         
         
          menu.add(winlbl); 
          menu.add(losslbl);
          menu.add(drawslbl);
          
          menu.add(rbutton);
          menu.add(difflbl);
          menu.add(gameoptions);
          content.add(menu);
       
        //setting up buttons on
            for(int i=0; i<4; i++)
                for(int j=0; j<4; j++)
                    for(int k=0; k<4; k++)
         
                    {
                        board[i][j][k] = new JButton(); 
                        gamepanel[i].add(board[i][j][k]);
                        String info = i+""+j+""+k;
                        board[i][j][k].setActionCommand(info);
                        board[i][j][k].addActionListener(this);
                        board[i][j][k].setBackground(Color.white);
                    }
                  
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(Color.gray);
       
    }
    private Boolean winThreeWays(String s)
    {
        String opponent = (s.equals("O"))? "X" : "O";
        for (int z = 0; z < 4; z++)
            for (int h = 0; h < 4; h++)
                    for (int k = 0; k < 4; k++)
                    {
                        if(isValid(z,h,k))
                        {
                                mark(z,h,k,s);
                                              if (moveFromWin(opponent)) // player now has to block?
                                              {
                                                      if(wintwoways(s)) // after block, does comp have ability to win two ways
                                                      {
                                                          undoMove(twoWaysMove);  // move from winTwoWays()

                                                          undoMove(winningMove);
                                                          // move from block()
                                                              unMark(z,h,k);
                                                              mark(z,h,k,"O");
                                                              return true;
                                                      }
                                                      else
                                                      {
                                                              unMark(z,h,k);

                                                              undoMove(winningMove);  // move from block()
                                                      }
                                              }
                                              else // no block, unmark, and keep going.
                                              {
                                                   unMark(z,h,k);
                                              }
                        }
                    }
        return false;
    }
 
    private void undoMove(int[] m)
    {
        unMark(m[0], m[1], m[2]);
    }
 
    private void mark(int i, int j, int k, String mark)
    {
     
        if(emptySquares())
        {
            if(mark=="X")
            {
        board[i][j][k].setBackground(new Color(0,255,0));
        board[i][j][k].setText(mark);
     
        board[i][j][k].setEnabled(false);
     
        moves++;
            }
            else
            {
                board[i][j][k].setBackground((new Color(255,0,0)));
                board[i][j][k].setText(mark);
                board[i][j][k].setEnabled(false);
             
                moves++;
             
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tie");
            drawslbl.setText("Draws: " + (++draws));
            resetGame();
            return;
        }
         
    }
 
    private void unMark(int i, int j, int k)
    { 
        board[i][j][k].setText("");
        board[i][j][k].setEnabled(true);
        board[i][j][k].setBackground(Color.white);
        moves--;
    }

 
    private void compMove()
    {
        int i;
        int j;
        int k;
      if(level ==3)
          return;
     
     if(moveFromWin("O"))//go for win
        {
         
            JOptionPane.showMessageDialog(null, "You lost");
            losslbl.setText("Losses: " + (++losses));
            resetGame();
            return;
        }
     else if (moveFromWin("X")) //block
     {
       
         return;
     }
     else if (level>1 &&wintwoways("O")) //go two ways
     {
       
         return;
     }
     else if (level>1 &&wintwoways("X")) //don't let player go 2 ways
     {
       
         return;
     }
     else if (level>1 &&winThreeWays("O")) //try to win 3 ways
     {
       
         return;
     }
     else if (level>1 &&winThreeWays("X")) //don't let player go 3 ways
     {
       
         return;
     }
     else if (level>0 &&moves>=3 && twoMovesFromWin("X")) // don't let player take more than 2 points on a winning path
        {
         
            return;
        }
     else if (level>0 &&moves>3 && twoMovesFromWin("O")) // one move left to win
        {
         
            return;
        }
 
 
     
             
       // make a random free move
        do{
            i = (int) (Math.random() * 4);
            j = (int) (Math.random() * 4);
            k = (int) (Math.random() * 4);
            }while(!isValid(i,j,k));
         
            mark(i,j,k,"O");
            if(checkForWinner("O"))
            {
                JOptionPane.showMessageDialog(null, "You lost");
                losslbl.setText("Losses: " + (++losses));
                resetGame();
                return;
             
            }
        }
     
 

 
    private boolean emptySquares()
    {
     
        for(int i=0;i<4; i++)
            for(int j=0; j<4; j++)
                for(int k=0; k<4; k++)
                {
                    if(isValid(i,j,k))
                    {
                     
                        return true;
                    }
                }
        return false;
     
    }
    private boolean wintwoways(String s){
        int count =0;
        for (int z = 0; z < 4; z++)
            for (int h = 0; h < 4; h++)
                    for (int k = 0; k < 4; k++)
                    {
                            // If the square is not occupied, analyze it...
                            if (isValid(z, h, k)){
                                mark(z,h,k,s);
                                twoWaysMove[0] = z;
                                twoWaysMove[1] = h;
                                twoWaysMove[2] = k;
                                count=0;
                                for (int z1 = 0; z1 < 4; z1++)
                                    for (int h1 = 0; h1 < 4; h1++)
                                            for (int k1 = 0; k1 < 4; k1++)
                                                if (isValid(z1, h1, k1)){
                                                    mark(z1,h1,k1,s);
                                                    if (checkForWinner(s))
                                                        count++;
                                                    unMark(z1,h1,k1);
                                                }
                                if (count>1){ // make the move
                                    unMark(z,h,k);
                                                     mark(z,h,k,"O");
                                    return true;
                                }
                                else
                                    unMark(z,h,k);
                            }
                    }
                  return false;               
    }
 
    private boolean isValid(int i, int j, int k)
    {
        if(board[i][j][k].getText().equals(""))
        {    return true;
        }
        return false;
     
    }
    private boolean checkForWinner(String s){
  //CHECK UP AND DOWN, 1D
    for(int i = 0; i<4; i++){
        for(int j = 0; j<4; j++){    
 
            if (
 
                board[i][j][0].getText().
equals(s) &&
                board[i][j][1].getText().equals(s) &&
                board[i][j][2].getText().equals(s) &&
                board[i][j][3].getText().equals(s)
             
                )
                    {return true;}
        }}
 
             
    //CHECK RIGHT AND LEFT, 1D
    for(int i = 0; i<4; i++){
        for(int j = 0; j<4; j++){    
 
            if (
 
                board[i][0][j].getText().equals(s) &&
                board[i][1][j].getText().equals(s) &&
                board[i][2][j].getText().equals(s) &&
                board[i][3][j].getText().equals(s)
             
                ) {return true;}
        }}
 
    //check across, 1d (nw to se)
    for(int i = 0; i<4; i++){
         
            if (
 
                board[i][0][0].getText().equals(s) &&
                board[i][1][1].getText().equals(s) &&
                board[i][2][2].getText().equals(s) &&
                board[i][3][3].getText().equals(s)
             
                ) {return true;}
        }
 
    //check across, 1d (ne to sw)
    for(int i = 0; i<4; i++){
                       if (
 
                board[i][0][3].getText().equals(s) &&
                board[i][1][2].getText().equals(s) &&
                board[i][2][1].getText().equals(s) &&
                board[i][3][0].getText().equals(s)
             
                ) {return true;}
        }

    //check basic 4d win (1 each)
    for(int i = 0; i<4; i++){
        for(int j = 0; j<4; j++){    
 
            if (
 
                board[0][i][j].getText().equals(s) &&
                board[1][i][j].getText().equals(s) &&
                board[2][i][j].getText().equals(s) &&
                board[3][i][j].getText().equals(s)
             
                ) {return true;}
        }}
 
    //check up to down 4d win
    for(int i = 0; i<4; i++){
    
            if (
 
                board[0][i][0].getText().equals(s) &&
                board[1][i][1].getText().equals(s) &&
                board[2][i][2].getText().equals(s) &&
                board[3][i][3].getText().equals(s)
             
                ) {return true;}
        }

    //check down to up 4d win
    for(int i = 0; i<4; i++){
        
        if (

            board[0][i][3].getText().equals(s) &&
            board[1][i][2].getText().equals(s) &&
            board[2][i][1].getText().equals(s) &&
            board[3][i][0].getText().equals(s)
         
            ) {return true;}
    }

    //check left to right 4d win
    for(int j = 0; j<4; j++){
        
        if (

            board[0][0][j].getText().equals(s) &&
            board[1][1][j].getText().equals(s) &&
            board[2][2][j].getText().equals(s) &&
            board[3][3][j].getText().equals(s)
         
            ) {return true;}
    }
 
    //check right to left 4d win
    for(int j = 0; j<4; j++){
        
        if (

            board[0][3][j].getText().equals(s) &&
            board[1][2][j].getText().equals(s) &&
            board[2][1][j].getText().equals(s) &&
            board[3][0][j].getText().equals(s)
         
            ) {return true;}
    }

    //check diagnal nw to se, back to front, 4d slice win
       
        if (

            board[0][0][0].getText().equals(s) &&
            board[1][1][1].getText().equals(s) &&
            board[2][2][2].getText().equals(s) &&
            board[3][3][3].getText().equals(s)
         
            ) {return true;}
 



//check diagnal ne to sw, back to front, 4d slice win

        if (
 
            board[0][0][3].getText().equals(s) &&
            board[1][1][2].getText().equals(s) &&
            board[2][2][1].getText().equals(s) &&
            board[3][3][0].getText().equals(s)
         
            ) {return true;}
 

//check diagnal nw to se, front to back, 4d slice win

if (

board[3][0][0].getText().equals(s) &&
board[2][1][1].getText().equals(s) &&
board[1][2][2].getText().equals(s) &&
board[0][3][3].getText().equals(s)

) {return true;}




//check diagnal ne to sw, from to back, 4d slice win

if (

board[3][0][3].getText().equals(s) &&
board[2][1][2].getText().equals(s) &&
board[1][2][1].getText().equals(s) &&
board[0][3][0].getText().equals(s)

) {return true;}



else {return false;}

}
    public void actionPerformed(ActionEvent e)
    {
    	if(level==3)
        {
    		winlbl.setText("Player 1 W's: " + (p1wins));
    		losslbl.setText("Player 2 W's: " + (p2wins));
    		drawslbl.setText("Draws: " + (draws));


        }
     
     
        if(e.getActionCommand().equals("Level"))
        {
            JComboBox glvl = (JComboBox)e.getSource();

            level = glvl.getSelectedIndex();
         
        }
     
        else if(e.getActionCommand().equals("Reset"))
        {
        resetGame();
        }
        if(e.getActionCommand().equals("player"))
        {
            player();
        }
        else
        {
         
        String info = e.getActionCommand();
     
     
        int i = Integer.parseInt(info.charAt(0)+"");
        int j = Integer.parseInt(info.charAt(1)+"");
        int k = Integer.parseInt(info.charAt(2)+"");
     
        mark(i,j,k,m);
        if(level == 3)
            sToggle(m);
        if(checkForWinner("X")){if (level==3){
		             JOptionPane.showMessageDialog(null, "Player 1 Wins!!!");
		             winlbl.setText("Player 1 W's: " + (++p1wins));
		             resetGame();
		             return;}
                else{
                	JOptionPane.showMessageDialog(null, "You Win!!!");
		             winlbl.setText("Wins: " + (++wins));
		             resetGame();
		             return;}
                	
                }
                }
        
        
      //  winlblP1 = new JLabel("Player 1 W's:" +p1wins);
    //	private JLabel losslblP2 = new JLabel("Player 2 W's:" +p2wins);
     //   private JLabel drawslblPvP
        if(checkForWinner("O")){
        if (level==3){
         JOptionPane.showMessageDialog(null, "Player 2 Wins!!!");
         losslbl.setText("Player 2 W's: " + (++p2wins));
         resetGame();
         return;
        }
        else{
        	JOptionPane.showMessageDialog(null, "Computer Wins!!!");
            losslbl.setText("Losses: " + (++losses));
            resetGame();
            return;	
        	
        }
        }

        else
        {
            compMove();
        }
     
    }
     
    
    private void sToggle(String k){
        if(k == "X")
            m= "O";
        else
            m="X";
    }
 
    private void player() {
        // TODO Auto-generated method stub
       
    }
    private boolean oneMoveFromWin(String mark)
    {
     
        for(int i=0;i<4; i++)
            for(int j=0; j<4; j++)
                for(int k=0; k<4; k++)
                {
                    if(isValid(i,j,k))
                    {                                    
                        mark(i,j,k, mark);
                        if(checkForWinner(mark))
                        {
                            unMark(i,j,k);
                            return true;
                         
                        }
                        else
                        {
                        unMark(i,j,k);
                        }
                    }
                 
                }
        return false;     
     
    }
    private boolean moveFromWin(String mark)
    {
     
        for(int i=0;i<4; i++)
            for(int j=0; j<4; j++)
                for(int k=0; k<4; k++)
                {
                    if(isValid(i,j,k))
                    {
                        mark(i,j,k, mark);
                        if(checkForWinner(mark))
                        {
                            unMark(i,j,k);
                            mark(i,j,k,"O");
                            winningMove[0] = i;

                            winningMove[1] = j;

                            winningMove[2] = k;
                            return true;
                         
                        }
                        unMark(i,j,k);
                     
                    }
                 
                }
        return false;
     
     
     
    }

    private boolean twoMovesFromWin(String mark)
    {
        for(int i=0;i<4; i++)
            for(int j=0; j<4; j++)
                for(int k=0; k<4; k++)
                {
                    if(isValid(i,j,k))
                    {
                        mark(i,j,k,mark);
                     
                        if(oneMoveFromWin(mark))
                        {
                            unMark(i,j,k);
                            mark(i,j,k, "O");
                            return true;
                        }
                        unMark(i,j,k);
                     
                    }
                }
        return false;
    }
 
 
    private void resetGame()
    {
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                for(int k=0; k<4; k++)
                 
            {
                    board[i][j][k].setText("");
                    board[i][j][k].setEnabled(true);
                    board[i][j][k].setBackground(Color.white);
                    moves=0;
                 
                 
            }
            }
        }
         
     
    }
}