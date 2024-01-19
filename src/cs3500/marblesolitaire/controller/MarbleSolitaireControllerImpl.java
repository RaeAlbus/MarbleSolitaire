package cs3500.marblesolitaire.controller;

import java.io.IOException;
import java.util.Scanner;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

/**
 * This class represents a MarbleSolitaireController
 */
public class MarbleSolitaireControllerImpl implements MarbleSolitaireController {

  private MarbleSolitaireModel model;
  private MarbleSolitaireView view;
  private Readable read;

  /**
   * Constructs an instance of a {@code MarbleSolitaireControllerImpl}, the controller for marble
   * solitaire.
   *
   * @param model is the model of the game logic
   * @param view  is the viewport for the game
   * @param read  the {@code Readable} object that takes in user inputs.
   */
  public MarbleSolitaireControllerImpl(MarbleSolitaireModel model, MarbleSolitaireView view,
                                       Readable read) {
    this.model = model;
    this.view = view;
    this.read = read;
  }

  /**
   * Starts a new game of Marble Solitaire
   *
   * @throws IllegalStateException if controller cannot read input or transmit output
   */
  public void playGame() throws IllegalStateException {
    Scanner input = new Scanner(this.read);
    while (!model.isGameOver()) {
      try {
        view.renderBoard();
      } catch (IOException e) {
        throw new IllegalStateException("Error when rendering the board.");
      }
      try {
        view.renderMessage("\nScore: " + model.getScore());
      } catch (IOException e) {
        throw new IllegalStateException("Error with outputting score.");
      }

      int[] inputs = new int[4];
      for (int i = 0; i < 4; i += 1) {
        int num = handleMoveInputs(input);
        if (num == -1) {
          this.gameOver();
          return;
        } else {
          inputs[i] = num;
        }
      }

      try {
        model.move(inputs[0], inputs[1], inputs[2], inputs[3]);
      } catch (IllegalArgumentException e) {
        try {
          view.renderMessage("Invalid move. Play again. " + e.getMessage());
        } catch (IOException ioe) {
          throw new IllegalStateException("Error with message transmission.");
        }
      }
    }
    this.gameOver();
  }

  /**
   * Returns a -1 if the user inputs 'q' or 'Q', returns the input if the user inputs a positive
   * number and prompts the user for a new number if the user inputs a negative number
   *
   * @param input the user's next move input
   * @return an int dependent on the input (-1 or positive number)
   */
  private int handleMoveInputs(Scanner input) {
    String num = input.next();
    if (num.equalsIgnoreCase("q")) {
      return -1;
    } else if (!(Integer.parseInt(num) > 0)) {
      try {
        view.renderMessage("Input must not be negative. Re-enter position.");
      } catch (IOException e) {
        throw new IllegalStateException("Error with message transmission.");
      }
      return this.handleMoveInputs(input);
    } else {
      return Integer.parseInt(num);
    }
  }

  /**
   * Prompts the game over screen with the end board and score of the player
   */
  private void gameOver() {
    try {
      view.renderMessage("Game Over!");
      view.renderBoard();
      view.renderMessage("\nScore: " + model.getScore());
    } catch (IOException e) {
      throw new IllegalStateException("Error with outputting end screen.");
    }
  }

}
