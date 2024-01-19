package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;

/**
 * Represents a text view of a Marble Solitaire game
 */
public class MarbleSolitaireTextView implements MarbleSolitaireView {

  private MarbleSolitaireModelState marbleState;
  private Appendable target;

  /**
   * Instantiates a viewable version of the Marble Solitaire game to provide methods that display
   * the game in a text format.
   *
   * @param marbleState represents the entire English-style Marble Solitaire Board
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState marbleState) {
    if (marbleState == null) {
      throw new IllegalArgumentException("The marble board is null.");
    } else {
      this.marbleState = marbleState;
      this.target = System.out;
    }
  }

  /**
   * Instantiates a viewable version of the Marble Solitaire game to provide methods that display
   * the game in a text.
   *
   * @param marbleState represents the entire English-style Marble Solitaire Board.
   * @param target      represents the target Appendable for transmitting the game display.
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState marbleState, Appendable target) {
    if (marbleState == null) {
      throw new IllegalArgumentException("The marble board is null.");
    } else if (target == null) {
      throw new IllegalArgumentException("The provided Appendable is null.");
    } else {
      this.marbleState = marbleState;
      this.target = target;
    }
  }

  /**
   * Constructs and returns a String that represents the English-style Marble Solitaire Board where
   * Os are spaces with marbles in them and _s are empty spaces
   *
   * @return a String that displays the marble board
   */
  public String toString() {
    String result = "";
    int boardSize = marbleState.getBoardSize();
    for (int row = 0; row < boardSize; row += 1) {
      for (int col = 0; col < boardSize; col += 1) {
        if (marbleState.getSlotAt(row, col).equals(MarbleSolitaireModelState.SlotState.Empty)) {
          result += "_";
        } else if (marbleState.getSlotAt(row, col)
                .equals(MarbleSolitaireModelState.SlotState.Marble)) {
          result += "O";
        } else if (marbleState.getSlotAt(row, col)
                .equals(MarbleSolitaireModelState.SlotState.Invalid)) {
          if (row < boardSize - 1 && col > 0 && marbleState.getSlotAt(row, col - 1)
                  .equals(MarbleSolitaireModelState.SlotState.Marble)) {
            result = result.stripTrailing();
            result += "\n";
            break;
          } else if (col < boardSize / (2.0 / 3)) {
            result += " ";
          }
        }
        if (col < boardSize / (2.0 / 3)) {
          result += " ";
        }
      }
      if (row < boardSize - 1 && marbleState.getSlotAt(row, boardSize - 1)
              .equals(SlotState.Marble)) {
        result = result.stripTrailing();
        result += "\n";
      }
    }
    return result.stripTrailing();
  }

  /**
   * Render the board to the provided data destination. The board should be rendered exactly in the
   * format produced by the toString method above
   *
   * @throws IOException if transmission of the board to the provided data destination fails
   */
  public void renderBoard() throws IOException {
    // append() will automatically throw IOException if transmission fails
    this.target.append(this.toString());
  }

  /**
   * Render a specific message to the provided data destination.
   *
   * @param message the message to be transmitted
   * @throws IOException if transmission of the board to the provided data destination fails
   */
  public void renderMessage(String message) throws IOException {
    // append() will automatically throw IOException if transmission fails
    this.target.append(message);
    this.target.append("\n");
  }

  /**
   * Gets the {@code Appendable} object used by this view.
   *
   * @return the {@code Appendable} object.
   */
  public Appendable getTarget() {
    return this.target;
  }

  /**
   * Sets the Appendable object used by this view.
   *
   * @param newTarget the given {@code Appendable} object.
   */
  public void setTarget(Appendable newTarget) {
    this.target = newTarget;
  }

}
