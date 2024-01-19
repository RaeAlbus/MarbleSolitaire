import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;

import cs3500.marblesolitaire.controller.MarbleSolitaireController;
import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the MarbleSolitaireControllerImpl class
 */
public class MarbleSolitaireControllerImplTest {

  // Example of MarbleSolitaireModel
  private MarbleSolitaireModel DefaultEnglishModel;
  private MarbleSolitaireTextView DefaultEnglishModelView;
  private MarbleSolitaireController DefaultEnglishModelController;

  // Example 2D ArrayList of DefaultEnglishModelAfterMove
  ArrayList<ArrayList<SlotState>> DefaultEnglishModelBoardAfterMove = new ArrayList<>();
  ArrayList<SlotState> row1Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row2Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row3Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row4Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row5Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row6Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row7Constructor1AfterMove = new ArrayList<>();

  public void init() {
    DefaultEnglishModel = new EnglishSolitaireModel();
    DefaultEnglishModelView = new MarbleSolitaireTextView(
            new EnglishSolitaireModel());

    // initializes row for constructor 1 after the move() function is used
    for (int i = 0; i < 7; i += 1) {
      if (i == 0 || i >= 5) {
        row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 1) {
        row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Empty);
        row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
        row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 2) {
        row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Empty);
        row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
      } else {
        row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
      }
    }

    // initializes board for constructor 1 after the move() function is used
    DefaultEnglishModelBoardAfterMove.add(row1Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row2Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row3Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row4Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row5Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row6Constructor1AfterMove);
    DefaultEnglishModelBoardAfterMove.add(row7Constructor1AfterMove);
  }

  @Test
  public void playGame() {
    init();
    StringBuilder output = new StringBuilder();
    MarbleSolitaireModel TestEnglishModel = new EnglishSolitaireModel();
    MarbleSolitaireController controller = new MarbleSolitaireControllerImpl(TestEnglishModel,
            new MarbleSolitaireTextView(TestEnglishModel, output), new StringReader("3 1 3 3 q"));
    controller.playGame();
    String[] result = output.toString().split("\r")[0].split("\n");
    // Tests that the marble has not yet moved by checking positions and score
    assertEquals("O O O _ O O O", result[3]);
    assertEquals("Score: 32", result[7]);
    // Tests that the marble HAS yet moved by checking new positions and score
    assertEquals("O _ _ O O O O", result[11]);
    assertEquals("Score: 31", result[15]);
    assertEquals("Game Over!", result[16]);
    assertEquals("Score: 31", result[result.length - 1]);
  }

  @Test
  public void gameOver() {
    init();
    StringBuilder output = new StringBuilder();
    MarbleSolitaireController controller = new MarbleSolitaireControllerImpl(DefaultEnglishModel,
            new MarbleSolitaireTextView(DefaultEnglishModel, output), new StringReader("q"));
    controller.playGame();
    String[] outputLines = output.toString().split("\r")[0].split("\n");
    assertEquals(outputLines[8], "Game Over!");
    assertEquals(outputLines[16], "Score: 32");
  }
}