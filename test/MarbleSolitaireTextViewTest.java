import org.junit.Test;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Tests for the MarbleSolitaireTextView class
 */
public class MarbleSolitaireTextViewTest {

  // Example of Constructor 1
  private MarbleSolitaireTextView DefaultEnglishModel = new MarbleSolitaireTextView(
          new EnglishSolitaireModel());
  // Constructor 2
  private MarbleSolitaireTextView AskewEnglishModel = new MarbleSolitaireTextView(
          new EnglishSolitaireModel(2, 3), System.out);
  // Constructor 3
  private MarbleSolitaireTextView LargeEnglishModel = new MarbleSolitaireTextView(
          new EnglishSolitaireModel(5), System.out);
  // Constructor 4
  private MarbleSolitaireTextView LargeAskewEnglishModel = new MarbleSolitaireTextView(
          new EnglishSolitaireModel(5, 1, 6));

  private String defaultString = ""
          + "    O O O\n"
          + "    O O O\n"
          + "O O O O O O O\n"
          + "O O O _ O O O\n"
          + "O O O O O O O\n"
          + "    O O O\n"
          + "    O O O";
  private String askewString = ""
          + "    O O O\n"
          + "    O O O\n"
          + "O O O _ O O O\n"
          + "O O O O O O O\n"
          + "O O O O O O O\n"
          + "    O O O\n"
          + "    O O O";
  private String largeString = ""
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O _ O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O";
  private String largeAskewString = ""
          + "        O O O O O\n"
          + "        O O _ O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "O O O O O O O O O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O\n"
          + "        O O O O O";

  @Test
  public void testDefaultString() {
    assertEquals(defaultString, DefaultEnglishModel.toString());
  }

  @Test
  public void testAskewString() {
    assertEquals(askewString, AskewEnglishModel.toString());
  }

  @Test
  public void testLargeString() {
    assertEquals(largeString, LargeEnglishModel.toString());
  }

  @Test
  public void testLargeAskewString() {
    assertEquals(largeAskewString, LargeAskewEnglishModel.toString());
  }

  @Test
  public void testConstructorError() {
    assertThrows(IllegalArgumentException.class, () -> {
      new MarbleSolitaireTextView(new EnglishSolitaireModel(0));
    });
  }

  @Test
  public void testRenderBoard() {
    StringBuilder output = new StringBuilder();
    MarbleSolitaireView DefaultEnglishModelTwo = new MarbleSolitaireTextView(
            new EnglishSolitaireModel(), output);
    try {
      DefaultEnglishModelTwo.renderBoard();
    } catch (IOException e) {
      System.out.println("Could not render board");
    }
    assertEquals(output.toString(), defaultString);
  }

  @Test
  public void testRenderMessage() {
    StringBuilder output = new StringBuilder();
    MarbleSolitaireView DefaultEnglishModelTwo = new MarbleSolitaireTextView(
            new EnglishSolitaireModel(), output);
    try {
      DefaultEnglishModelTwo.renderMessage("Test Message");
    } catch (IOException e) {
      System.out.println("Could not render board");
    }
    assertEquals(output.toString(), "Test Message\n");
  }

  @Test
  public void testGetTarget() {
    Appendable testAppendable = DefaultEnglishModel.getTarget();
    assertEquals(testAppendable, System.out);
  }

  @Test
  public void testSetTarget() {
    // Confirms initial state of target
    Appendable testAppendable1 = DefaultEnglishModel.getTarget();
    assertEquals(testAppendable1, System.out);

    // Sets target
    Appendable newTarget = new StringBuilder();
    DefaultEnglishModel.setTarget(newTarget);

    // Confirms new state of target
    Appendable testAppendable2 = DefaultEnglishModel.getTarget();
    assertEquals(testAppendable2, newTarget);
  }

}
