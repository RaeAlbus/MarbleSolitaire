package cs3500.marblesolitaire.model.hw04;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;

public class EuropeanSolitaireModel implements MarbleSolitaireModel {

  // Represents arm thickness
  private final int armThickness;
  private final ArrayList<ArrayList<SlotState>> board;

  /**
   * Instantiates a European-style Marble Solitaire Model with a default arm thickness of 3 and an
   * empty center at (3, 3).
   */
  public EuropeanSolitaireModel() {
    this.armThickness = 3;
    board = makeBoard(3, 3, 3);
  }

  /**
   * Instantiates a European-style Marble Solitaire Model with a default arm thickness of 3 and an
   * empty center at (sRow, sCol)
   *
   * @param sRow represents the row the center is in
   * @param sCol represents the column the center is in
   * @throws IllegalArgumentException if given sRow and sCol are not within the board bounds
   */
  public EuropeanSolitaireModel(int sRow, int sCol) {
    if (!isValidPosn(3, sRow, sCol)) {
      throw new IllegalArgumentException(
              "Invalid empty cell position (" + sRow + ", " + sCol + ")");
    } else {
      this.armThickness = 3;
      board = makeBoard(3, sRow, sCol);
    }
  }

  /**
   * Instantiates a European-style Marble Solitaire Model with an arm thickness of the passed in
   * armThickness and an empty center in the middle at (armThickness, armThickness)
   *
   * @param armThickness the thickness of one side of the plus-shaped board
   * @throws IllegalArgumentException if the arm thickness is even or less than 0.
   */
  public EuropeanSolitaireModel(int armThickness) {
    if (armThickness % 2 == 0 || armThickness < 0) {
      throw new IllegalArgumentException("Arm thickness must be an positive, odd integer");
    } else {
      this.armThickness = armThickness;
      board = makeBoard(armThickness, (armThickness + (armThickness - 1) * 2) / 2,
              (armThickness + (armThickness - 1) * 2) / 2);
    }
  }

  /**
   * Instantiates a European-style Marble Solitaire Model with the given arm thickness and a given
   * empty center at (sRow, sCol).
   *
   * @param armThickness the thickness of one side of the plus-shaped board
   * @param sRow         represents the row the center is in
   * @param sCol         represents the column the center is in
   * @throws IllegalArgumentException if the arm thickness is even or less than 0 or if given sRow
   *                                  and sCol are not within the board bounds
   */
  public EuropeanSolitaireModel(int armThickness, int sRow, int sCol) {
    if (armThickness % 2 == 0 || armThickness < 0) {
      throw new IllegalArgumentException("Arm thickness must be an positive, odd integer");
    } else if (!isValidPosn(3, sRow, sCol)) {
      throw new IllegalArgumentException(
              "Invalid empty cell position (" + sRow + ", " + sCol + ")");
    } else {
      this.armThickness = armThickness;
      board = makeBoard(armThickness, sRow, sCol);
    }
  }

  /**
   * Returns whether the given sRow and sCol are valid spaces in a European-style Marble Solitaire
   * Model of the given armThickness
   *
   * @param armThickness the thickness of one side of the plus-shaped board
   * @param sRow         represents the row the space being checked for validity is in
   * @param sCol         represents the column the space being checked for validity is in
   * @return true if the given sRow and sCol are spaces in a board, returns false if not
   */
  private boolean isValidPosn(int armThickness, int sRow, int sCol) {
    int numRowsAndCols = armThickness + (2 * (armThickness - 1));
    if (sRow < 0 || sRow > numRowsAndCols) {
      return false;
    } else if (sCol < 0 || sCol > numRowsAndCols) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Returns a 2D ArrayList of SlotStates that displays a plus shaped European-style Marble
   * Solitaire Model with the given armThickness and empty starting spot in position (sRow, sCol)
   *
   * @param armThickness the thickness of one side of the plus-shaped board
   * @param sRow         represents the row the center is in
   * @param sCol         represents the column the center is in
   * @return an ArrayList representing the board.
   */
  private ArrayList<ArrayList<SlotState>> makeBoard(int armThickness, int sRow, int sCol) {
    int width = armThickness + (armThickness - 1) * 2;
    ArrayList<ArrayList<SlotState>> tempBoard = new ArrayList<>();
    for (int r = 0; r < width; r += 1) {
      ArrayList<SlotState> tempRow = new ArrayList<>();
      for (int c = 0; c < width; c += 1) {
        // Top Corners
        if (r < armThickness - 1) {
          if (c < armThickness - 1 - r || c > width - 1 - (armThickness - 1 - r)) {
            tempRow.add(SlotState.Invalid);
          } else {
            tempRow.add(SlotState.Marble);
          }
        } else if (r > width - 1 - (armThickness - 1)) {
          if (c < armThickness - 1 - (width - 1 - r) || c > width - 1 - (armThickness - 1 - (width
                  - 1 - r))) {
            tempRow.add(SlotState.Invalid);
          } else {
            tempRow.add(SlotState.Marble);
          }
        } else {
          tempRow.add(SlotState.Marble);
        }

      }
      tempBoard.add(tempRow);
    }
    tempBoard.get(sRow).set(sCol, SlotState.Empty);
    return tempBoard;
  }

  /**
   * Moves the marble from a position to a given position if the move is valid as per the rules.
   *
   * @param fromRow the row number of the position to be moved from (starts at 0)
   * @param fromCol the column number of the position to be moved from (starts at 0)
   * @param toRow   the row number of the position to be moved to (starts at 0)
   * @param toCol   the column number of the position to be moved to (starts at 0)
   * @throws IllegalArgumentException if the move is not valid.
   */
  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {
    if ((!isValidPosn(this.armThickness, fromRow, fromCol)) || (!isValidPosn(this.armThickness,
            toRow, toCol))) {
      throw new IllegalArgumentException("Out of bounds of the board");
    }

    if (this.board.get(fromRow).get(fromCol) == SlotState.Marble && this.board.get(toRow).get(toCol)
            .equals(SlotState.Empty)) {
      if (fromRow == toRow && Math.abs(fromCol - toCol) == 2 && this.board.get(fromRow)
              .get((fromCol + toCol) / 2)
              .equals(SlotState.Marble)) {
        this.board.get(fromRow).set(fromCol, SlotState.Empty);
        this.board.get(fromRow).set((fromCol + toCol) / 2, SlotState.Empty);
        this.board.get(fromRow).set(toCol, SlotState.Marble);
      } else if (fromCol == toCol && Math.abs(fromRow - toRow) == 2 && this.board.get(
                      (fromRow + toRow) / 2).get(fromCol)
              .equals(SlotState.Marble)) {
        this.board.get(fromRow).set(fromCol, SlotState.Empty);
        this.board.get((fromRow + toRow) / 2).set(fromCol, SlotState.Empty);
        this.board.get(toRow).set(fromCol, SlotState.Marble);
      } else {
        throw new IllegalArgumentException(
                "There is no marble in between the marble and its destination");
      }
    } else {
      throw new IllegalArgumentException("Move is invalid");
    }
  }

  /**
   * Determines whether there are any marbles that can be moved, meaning they have marbles next to
   * them and an empty space next to those neighboring marbles
   *
   * @return true if there are marbles with valid places to move, returns false if not
   */
  private boolean movesLeft() {
    int boardSize = this.armThickness + (2 * (this.armThickness - 1));
    for (int row = 0; row < boardSize; row += 1) {
      for (int col = 0; col < boardSize; col += 1) {
        if (checkMoves(row, col, row, col + 2) || checkMoves(
                row, col, row, col - 2) || checkMoves(
                row, col, row + 2, col) || checkMoves(row, col, row - 2, col)) {
          return true;
        }
      }
    }
    return false;
  }


  /**
   * Checks the given space at (fromRow, fromCol) to see if it is a marble and the marble has the
   * ability to move to the space at (toRow, toCol)
   *
   * @param fromRow the row number of the position to be moved from (starts at 0)
   * @param fromCol the column number of the position to be moved from (starts at 0)
   * @param toRow   the row number of the position to be moved to (starts at 0)
   * @param toCol   the column number of the position to be moved to (starts at 0)
   * @return true if the marble at (fromRow, fromCol) has a marble in between the empty space at
   * (toRow, toCol), returns false if not
   */
  private boolean checkMoves(int fromRow, int fromCol, int toRow, int toCol) {

    if (toRow > this.board.size() - 1 || toCol > this.board.size() - 1) {
      return false;
    }

    if (!isValidPosn(armThickness, toRow, toCol)) {
      return false;
    }

    if (!this.getSlotAt(fromRow, fromCol).equals(SlotState.Marble)) {
      return false;
    }

    if (!this.getSlotAt((fromRow + toRow) / 2, (fromCol + toCol) / 2).equals(SlotState.Marble)) {
      return false;
    }

    if (this.getSlotAt(toRow, toCol).equals(SlotState.Marble)) {
      return false;
    }

    if (this.getSlotAt(toRow, toCol).equals(SlotState.Invalid)) {
      return false;
    }

    return true;
  }

  /**
   * Returns is the game is over - the score is 0, or - there are no possible moves left to make.
   *
   * @return true if there is no moves left or if the score is 1, returns false otherwise
   */
  public boolean isGameOver() {
    return this.getScore() == 1 || !movesLeft();
  }

  /**
   * Returns the maximum dimensions of the board.
   *
   * @return the longest row/col of the board
   */
  public int getBoardSize() {
    return armThickness + (2 * (armThickness - 1));
  }

  /**
   * Gets the state of the slot (if it is invalid, contains a marble, or is empty) at the given row
   * and column.
   *
   * @param row the row of the position sought, starting at 0
   * @param col the column of the position sought, starting at 0
   * @return the SlotState at the given (row, col) of the board
   * @throws IllegalArgumentException if the given position is out of bounds.
   */
  public SlotState getSlotAt(int row, int col) throws IllegalArgumentException {
    if (!isValidPosn(this.armThickness, row, col)) {
      throw new IllegalArgumentException("Out of bounds");
    }
    return this.board.get(row).get(col);
  }

  /**
   * Returns the score - which is the amount of marbles left on the board.
   *
   * @return how many marbles are left on the board
   */
  public int getScore() {
    int score = 0;
    for (int r = 0; r < this.getBoardSize(); r += 1) {
      for (int c = 0; c < this.getBoardSize(); c += 1) {
        if (this.getSlotAt(r, c).equals(SlotState.Marble)) {
          score += 1;
        }
      }
    }
    return score;
  }


}
