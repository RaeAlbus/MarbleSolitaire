package cs3500.marblesolitaire.controller;

/**
 * This class represents a controller for this game
 */
public interface MarbleSolitaireController {

  /**
   * Starts a new game of Marble Solitaire
   *
   * @throws IllegalStateException if controller cannot read input or transmit output
   */
  void playGame() throws IllegalStateException;


}
