public class Board {

  private String[][] squares;

  public Board() {
      squares = new String[10][10];
      for(int i = 0; i < squares.length; i++) {
          for(int k = 0; k < squares[0].length; k++) {
              squares[i][k] = "-";
          }
      }
  }

  public String toString() {
      String output = "";
      for(int i = 0; i < squares.length; i++) {
          for(int k = 0; k < squares[0].length; k++) {
              output += squares[i][k] + " ";
          }
          output += "\n";
      }
      return output;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal) {
      // If start of ship is off grid return false
      if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) return false;
      
      // Horizontal check to see if the whole ship fits on the grid
      if(horizontal) {
          if(col + len > squares.length) return false;
          //check to see if another ship is in the way
          for(int c = col; c < col+len; c++) {
              if(!squares[row][c].equals("-")) return false;
          }
          for(int c = col; c < col+len; c++) {
              squares[row][c] = "b";
          }
      }
      //Vertical check to see if the whole ship fits on the grid
      else {
          if(row + len > squares.length) return false;
          //check to see if another ship is in the way
          for(int r = row; r < row+len; r++) {
              if(!squares[r][col].equals("-")) return false;
          }
          for(int r = row; r < row+len; r++) {
              squares[r][col] = "b";
          }
      }
      return true;
  }

  public boolean foundShip(int len) {
      for(int i = 0; i < squares.length; i++) {
          int counter = 0;
          while(counter < squares[0].length) {
              int foundLen = 0;
              while(counter < squares[0].length && squares[i][counter].equals("b")) {
                  foundLen++;
                  counter++;
              }
              if(foundLen == len) return true;
              foundLen = 0;
              counter++;
          }
      }
      for(int k = 0; k < squares[0].length; k++) {
          int counter = 0;
          while(counter < squares.length) {
              int foundLen = 0;
              while(counter < squares.length && squares[counter][k].equals("b")) {
                  foundLen++;
                  counter++;
              }
              if(foundLen == len) return true;
              foundLen = 0;
              counter++;
          }
      }
      return false;
  }

  public int shoot(int row, int col) {
      if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length)
          return -1;
      
      if(squares[row][col].equals("-")){
          squares[row][col] = "m";
          return 0;
      }
      
      if(squares[row][col].equals("b")) {
          squares[row][col] = "x";
          return 1;
      }
      
      return 2;
  }

  public boolean gameOver() {
      for(int i = 0; i < squares.length; i++) {
          for(int k = 0; k < squares[0].length; k++) {
              if(squares[i][k].equals("b")) return false;
          }
      }
      return true;
  }
}
