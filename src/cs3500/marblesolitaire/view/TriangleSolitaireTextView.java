package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;

public class TriangleSolitaireTextView implements MarbleSolitaireView {

  private MarbleSolitaireModelState marbleState;
  private Appendable target;

  /**
   * Instantiates a viewable version of the Triangle Marble Solitaire game to provide methods that
   * display the game in a text format.
   *
   * @param marbleState represents the entire Triangle-style Marble Solitaire Board
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState marbleState) {
    if (marbleState == null) {
      throw new IllegalArgumentException("The marble board is null.");
    } else {
      this.marbleState = marbleState;
      this.target = System.out;
    }
  }

  /**
   * Instantiates a viewable version of the Triangle Marble Solitaire game to provide methods that
   * display the game in a text.
   *
   * @param marbleState represents the entire English-style Marble Solitaire Board.
   * @param target      represents the target Appendable for transmitting the game display.
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState marbleState, Appendable target) {
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
   * Constructs and returns a String that represents the Triangle-style Marble Solitaire Board where
   * Os are spaces with marbles in them and _s are empty spaces
   *
   * @return a String that displays the marble board
   */
  public String toString() {
    String result = "";
    for (int r = 0; r < marbleState.getBoardSize(); r += 1) {
      String row = "";
      for (int s = 0; s < marbleState.getBoardSize() - (r + 1); s += 1) {
        row += " ";
      }
      for (int c = 0; c <= r; c += 1) {
        if (marbleState.getSlotAt(r, c).equals(SlotState.Empty)) {
          row += "_";
        } else if (marbleState.getSlotAt(r, c).equals(SlotState.Marble)) {
          row += "O";
        }
        row += " ";
      }
      row = row.stripTrailing();
      row += "\n";
      result += row;
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
