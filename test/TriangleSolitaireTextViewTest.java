import org.junit.Test;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.TriangleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the TriangleSolitaireTextView class
 */
public class TriangleSolitaireTextViewTest {

  // Example of Constructor 1
  private TriangleSolitaireTextView DefaultTriModel = new TriangleSolitaireTextView(
          new TriangleSolitaireModel());
  // Constructor 2
  private TriangleSolitaireTextView AskewTriModel = new TriangleSolitaireTextView(
          new TriangleSolitaireModel(1, 0), System.out);
  // Constructor 3
  private TriangleSolitaireTextView SmallTriModel = new TriangleSolitaireTextView(
          new TriangleSolitaireModel(3), System.out);
  // Constructor 4
  private TriangleSolitaireTextView SmallAskewTriModel = new TriangleSolitaireTextView(
          new TriangleSolitaireModel(3, 1, 0));

  private String defaultString = ""
          + "    _\n"
          + "   O O\n"
          + "  O O O\n"
          + " O O O O\n"
          + "O O O O O";
  private String askewString = ""
          + "    O\n"
          + "   _ O\n"
          + "  O O O\n"
          + " O O O O\n"
          + "O O O O O";
  private String smallString = ""
          + "  _\n"
          + " O O\n"
          + "O O O";
  private String smallAskewString = ""
          + "  O\n"
          + " _ O\n"
          + "O O O";

  @Test
  public void testDefaultString() {
    assertEquals(defaultString, DefaultTriModel.toString());
  }

  @Test
  public void testAskewString() {
    assertEquals(askewString, AskewTriModel.toString());
  }

  @Test
  public void testSmallString() {
    assertEquals(smallString, SmallTriModel.toString());
  }

  @Test
  public void testSmallAskewString() {
    assertEquals(smallAskewString, SmallAskewTriModel.toString());
  }

  @Test
  public void testRenderMessage() {
    StringBuilder output = new StringBuilder();
    TriangleSolitaireTextView DefaultTriModelTwo = new TriangleSolitaireTextView(
            new TriangleSolitaireModel(), output);
    try {
      DefaultTriModelTwo.renderMessage("Test Message");
    } catch (IOException e) {
      System.out.println("Could not render board");
    }
    assertEquals(output.toString(), "Test Message\n");
  }

  @Test
  public void testGetTarget() {
    Appendable testAppendable = DefaultTriModel.getTarget();
    assertEquals(testAppendable, System.out);
  }

  @Test
  public void testSetTarget() {
    // Confirms initial state of target
    Appendable testAppendable1 = DefaultTriModel.getTarget();
    assertEquals(testAppendable1, System.out);

    // Sets target
    Appendable newTarget = new StringBuilder();
    DefaultTriModel.setTarget(newTarget);

    // Confirms new state of target
    Appendable testAppendable2 = DefaultTriModel.getTarget();
    assertEquals(testAppendable2, newTarget);
  }

}