/**
 * TicTacToe
 */
public class TicTacToe {

    static Character checkRows(String[] rows) {
      for (int i = 0; i < rows.length; i++) {
        String row = rows[i];
  
        if (row.equals("XXX")) {
          return 'X';
        }
        if (row.equals("OOO")) {
          return 'O';
        }
      }
      return null;
    }
  
    static Character checkCols(String[] rows) {
      // String[] cols = {
      //   "" + rows[0].toCharArray()[0] + rows[1].toCharArray()[0] + rows[2].toCharArray()[0],
      //   "" + rows[0].toCharArray()[1] + rows[1].toCharArray()[1] + rows[2].toCharArray()[1],
      //   "" + rows[0].toCharArray()[2] + rows[1].toCharArray()[2] + rows[2].toCharArray()[2]
      // };
      String[] cols = {"", "", ""};
  
      for (int rowNum = 0; rowNum < 3; rowNum++) {
        char[] rowArr = rows[rowNum].toCharArray();
  
        for (int colNum = 0; colNum < 3; colNum++) {
          // row = "XOX"
          // rowArr = {"X", "O", "X"}
          // colNum = 0
          // cols[0] = ""
          // rowArr[0] = "X"
          cols[colNum] = cols[colNum] + rowArr[colNum];
          // cols[0] = "" + "X"
        }
      }
  
      for (int i = 0; i < cols.length; i++) {
        String col = cols[i];
  
        if (col.equals("XXX")) {
          return 'X';
        }
        if (col.equals("OOO")) {
          return 'O';
        }
      }
      return null;
    }

    static Character checkDiag(String[] rows) {
      String[] cols = {
        "" + rows[0].toCharArray()[0] + rows[1].toCharArray()[1] + rows[2].toCharArray()[2], //rows[0].toCharArray()[0] rows[0] means which rows, .toCharArray()[0] get that character on index 0 
        "" + rows[0].toCharArray()[2] + rows[1].toCharArray()[1] + rows[2].toCharArray()[0],
       
      };
      // String[] cols = {"", "", ""};
  
      // for (int rowNum = 0; rowNum < 3; rowNum++) {
      //   char[] rowArr = rows[rowNum].toCharArray();
  
      //   for (int colNum = 0; colNum < 3; colNum++) {
      //     // row = "XOX"
      //     // rowArr = {"X", "O", "X"}
      //     // colNum = 0
      //     // cols[0] = ""
      //     // rowArr[0] = "X"
      //     cols[colNum] = cols[colNum] + rowArr[colNum];
      //     // cols[0] = "" + "X"
      //   }
      // }
  
      for (int i = 0; i < cols.length; i++) {
        String col = cols[i];
  
        if (col.equals("XXX")) {
          return 'X';
        }
        if (col.equals("OOO")) {
          return 'O';
        }
      }
      return null;
    }
  
    static String[] generateRows(String board) {
      String[] rows = {"", "", ""};
      char[] boardChars = board.toCharArray();
  
      for (int i = 0; i < boardChars.length; i++) {
        if (i >= 0 && i < 3) {
          rows[0] = rows[0] + boardChars[i];
        }
        if (i >= 3 && i < 6) {
          rows[1] = rows[1] + boardChars[i];
        }
        if (i >= 6 && i < 9) {
          rows[2] = rows[2] + boardChars[i];
        }
      }
  
      return rows;
    }
  
    static void print(String[] rows) {
      for (int i = 0; i < rows.length; i++) {
        System.out.println(rows[i]);
      }
    }
  
    static boolean checkWinner(String[] rows) {
      // check the rows
      Character winner = null;
      //winner = checkRows(rows);
     // winner = checkCols(rows);
     winner = checkDiag(rows);
      System.out.println(winner);
      // check the columns
      // check the diagonals
      // if any of them have 3 pieces from the same player, that player won
  
      return true;
    }
  
    public static void main(String[] args) {
      String board = "XXO-OXO-X"; //"X--OXO--X";
      String[] rows = generateRows(board);
       print(rows);
      checkWinner(rows);
    }
  }