public class TrapGameTester{
   public static void main(String[]args){
     
      boolean[][]temp={{true,true,true,true},{true,false,true,false},{true,true,true,true},{false,false,false,false},{true,true,true,true},{false,false,false,false},{true,true,true,true},{false,false,false,false}};
      
      TrapGame testBoard = new TrapGame(temp);
      
      printBoard(testBoard);
      
      //Testing checkPosition method(Question 2)
      System.out.println(testBoard.checkPosition(2 ,2)); 
      System.out.println(testBoard.checkPosition(3 ,3));
      
      System.out.println("");
      System.out.println("");
      System.out.println("");
      
      
      //Testing constuctor(Question 1)
      TrapGame randomboard = new TrapGame(5,5);
      
      printBoard(testBoard);
   }
   
   
   //prints out nice looking 2D Array
   public static void printBoard(TrapGame board){
      boolean[][] gameBoard = board.getGameBoard();

      for(int r = 0; r<gameBoard.length; r++){
         System.out.print("[");
         for(int c = 0; c < gameBoard[r].length; c++){
            System.out.print(gameBoard[r][c]+",");
         }
         System.out.print("]");
         System.out.println("");   
      } 

   }
}
