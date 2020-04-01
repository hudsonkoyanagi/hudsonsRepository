import java.lang.Math; 

public class TrapGame{

   private static boolean[][] gameBoard;
   
   //testing purposes only
   public TrapGame(boolean[][] gameBoard){
      this.gameBoard = gameBoard;
   }
   
   //Question 1: Generate a game board with random traps
   public TrapGame(int rows, int cols){
      boolean[][] gameBoard = new boolean[rows][cols];
      for(int r = 0; r<gameBoard.length; r++){
         for(int c = 0; c < gameBoard[r].length; c++){
            if(0+Math.random()*2 > 1){
               gameBoard[r][c] = true;
            }
            else{
               gameBoard[r][c] = false;
            }
         }   
      } 
      this.gameBoard = gameBoard;
   } 
   
   //Question 2: Check if a coordinate is accessible - Precondition: cooridinate input will have other coordinates on all sides
   
   public static boolean checkPosition(int row, int col){
      if(!gameBoard[row-1][col] || !gameBoard[row+1][col]){
         return true;
      }
      else if(!gameBoard[row][col-1] || !gameBoard[row][col+1]){
         return true;
      }
      else{
         return false;
      }
   } 
   
   //testing purposes only
   public boolean[][] getGameBoard(){
      return gameBoard;
   }
   
   //testing purposes only
   public int getNumTraps(){
      int total = 0;
      for(int r = 0; r<gameBoard.length; r++){
         for(int c = 0; c < gameBoard[r].length; c++){
            if(gameBoard[r][c]){
               total++;
            }
         }   
      }
      return total;
   }
   
   //testing purpses only
   public boolean checkPos(int row, int col){
      return gameBoard[row][col];
   }

   
   
}