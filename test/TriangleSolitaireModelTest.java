import org.junit.Test;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class TriangleSolitaireModelTest {

  // Example of Constructor 1
  private MarbleSolitaireModel DefaultTriModel;
  // Constructor 2
  private MarbleSolitaireModel AskewTriModel;
  // Constructor 3
  private MarbleSolitaireModel SmallTriModel;
  // Constructor 4
  private MarbleSolitaireModel SmallAskewTriModel;

  ArrayList<ArrayList<SlotState>> DefaultTriModelBoard;
  ArrayList<SlotState> row1Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor1 = new ArrayList<>();

  private ArrayList<ArrayList<SlotState>> AskewTriModelBoard;
  ArrayList<SlotState> row1Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor2 = new ArrayList<>();

  private ArrayList<ArrayList<SlotState>> SmallTriModelBoard;
  ArrayList<SlotState> row1Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor3 = new ArrayList<>();

  private ArrayList<ArrayList<SlotState>> SmallTriModelBoardAfterMove;
  ArrayList<SlotState> row1Constructor3AfterMove = new ArrayList<>();
  ArrayList<SlotState> row2Constructor3AfterMove = new ArrayList<>();
  ArrayList<SlotState> row3Constructor3AfterMove = new ArrayList<>();

  private ArrayList<ArrayList<SlotState>> SmallAskewTriModelBoard;
  ArrayList<SlotState> row1Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor4 = new ArrayList<>();

  public void init() {

    DefaultTriModel = new TriangleSolitaireModel();
    AskewTriModel = new TriangleSolitaireModel(1, 0);
    SmallTriModel = new TriangleSolitaireModel(3);
    SmallAskewTriModel = new TriangleSolitaireModel(3, 1, 0);

    // Setup for manual default constructor
    DefaultTriModelBoard = new ArrayList<ArrayList<SlotState>>();
    row1Constructor1.add(SlotState.Empty);
    row1Constructor1.add(SlotState.Invalid);
    row1Constructor1.add(SlotState.Invalid);
    row1Constructor1.add(SlotState.Invalid);
    row1Constructor1.add(SlotState.Invalid);

    row2Constructor1.add(SlotState.Marble);
    row2Constructor1.add(SlotState.Marble);
    row2Constructor1.add(SlotState.Invalid);
    row2Constructor1.add(SlotState.Invalid);
    row2Constructor1.add(SlotState.Invalid);

    row3Constructor1.add(SlotState.Marble);
    row3Constructor1.add(SlotState.Marble);
    row3Constructor1.add(SlotState.Marble);
    row3Constructor1.add(SlotState.Invalid);
    row3Constructor1.add(SlotState.Invalid);

    row4Constructor1.add(SlotState.Marble);
    row4Constructor1.add(SlotState.Marble);
    row4Constructor1.add(SlotState.Marble);
    row4Constructor1.add(SlotState.Marble);
    row4Constructor1.add(SlotState.Invalid);

    row5Constructor1.add(SlotState.Marble);
    row5Constructor1.add(SlotState.Marble);
    row5Constructor1.add(SlotState.Marble);
    row5Constructor1.add(SlotState.Marble);
    row5Constructor1.add(SlotState.Marble);

    DefaultTriModelBoard.add(row1Constructor1);
    DefaultTriModelBoard.add(row2Constructor1);
    DefaultTriModelBoard.add(row3Constructor1);
    DefaultTriModelBoard.add(row4Constructor1);
    DefaultTriModelBoard.add(row5Constructor1);

    // Setup for manual 2nd constructor
    AskewTriModelBoard = new ArrayList<ArrayList<SlotState>>();
    row1Constructor2.add(SlotState.Marble);
    row1Constructor2.add(SlotState.Invalid);
    row1Constructor2.add(SlotState.Invalid);
    row1Constructor2.add(SlotState.Invalid);
    row1Constructor2.add(SlotState.Invalid);

    row2Constructor2.add(SlotState.Empty);
    row2Constructor2.add(SlotState.Marble);
    row2Constructor2.add(SlotState.Invalid);
    row2Constructor2.add(SlotState.Invalid);
    row2Constructor2.add(SlotState.Invalid);

    row3Constructor2.add(SlotState.Marble);
    row3Constructor2.add(SlotState.Marble);
    row3Constructor2.add(SlotState.Marble);
    row3Constructor2.add(SlotState.Invalid);
    row3Constructor2.add(SlotState.Invalid);

    row4Constructor2.add(SlotState.Marble);
    row4Constructor2.add(SlotState.Marble);
    row4Constructor2.add(SlotState.Marble);
    row4Constructor2.add(SlotState.Marble);
    row4Constructor2.add(SlotState.Invalid);

    row5Constructor2.add(SlotState.Marble);
    row5Constructor2.add(SlotState.Marble);
    row5Constructor2.add(SlotState.Marble);
    row5Constructor2.add(SlotState.Marble);
    row5Constructor2.add(SlotState.Marble);

    AskewTriModelBoard.add(row1Constructor2);
    AskewTriModelBoard.add(row2Constructor2);
    AskewTriModelBoard.add(row3Constructor2);
    AskewTriModelBoard.add(row4Constructor2);
    AskewTriModelBoard.add(row5Constructor2);

    // Setup for manual constructor 3 board
    SmallTriModelBoard = new ArrayList<ArrayList<SlotState>>();
    row1Constructor3.add(SlotState.Empty);
    row1Constructor3.add(SlotState.Invalid);
    row1Constructor3.add(SlotState.Invalid);

    row2Constructor3.add(SlotState.Marble);
    row2Constructor3.add(SlotState.Marble);
    row2Constructor3.add(SlotState.Invalid);

    row3Constructor3.add(SlotState.Marble);
    row3Constructor3.add(SlotState.Marble);
    row3Constructor3.add(SlotState.Marble);

    SmallTriModelBoard.add(row1Constructor3);
    SmallTriModelBoard.add(row2Constructor3);
    SmallTriModelBoard.add(row3Constructor3);

    // Setup for manual constructor 3 board aftermove
    SmallTriModelBoardAfterMove = new ArrayList<ArrayList<SlotState>>();
    row1Constructor3AfterMove.add(SlotState.Marble);
    row1Constructor3AfterMove.add(SlotState.Invalid);
    row1Constructor3AfterMove.add(SlotState.Invalid);

    row2Constructor3AfterMove.add(SlotState.Empty);
    row2Constructor3AfterMove.add(SlotState.Marble);
    row2Constructor3AfterMove.add(SlotState.Invalid);

    row3Constructor3AfterMove.add(SlotState.Empty);
    row3Constructor3AfterMove.add(SlotState.Marble);
    row3Constructor3AfterMove.add(SlotState.Marble);

    SmallTriModelBoardAfterMove.add(row1Constructor3AfterMove);
    SmallTriModelBoardAfterMove.add(row2Constructor3AfterMove);
    SmallTriModelBoardAfterMove.add(row3Constructor3AfterMove);

    // Setup for manual constructor 4 board
    SmallAskewTriModelBoard = new ArrayList<ArrayList<SlotState>>();
    row1Constructor4.add(SlotState.Marble);
    row1Constructor4.add(SlotState.Invalid);
    row1Constructor4.add(SlotState.Invalid);

    row2Constructor4.add(SlotState.Empty);
    row2Constructor4.add(SlotState.Marble);
    row2Constructor4.add(SlotState.Invalid);

    row3Constructor4.add(SlotState.Marble);
    row3Constructor4.add(SlotState.Marble);
    row3Constructor4.add(SlotState.Marble);

    SmallAskewTriModelBoard.add(row1Constructor4);
    SmallAskewTriModelBoard.add(row2Constructor4);
    SmallAskewTriModelBoard.add(row3Constructor4);

  }


  @Test
  public void testConstructor1() {
    init();
    for (int r = 0; r < DefaultTriModelBoard.size(); r += 1) {
      for (int c = 0; c < DefaultTriModelBoard.get(0).size(); c += 1) {
        assertEquals(DefaultTriModelBoard.get(r).get(c), DefaultTriModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2() {
    init();
    for (int r = 0; r < AskewTriModelBoard.size(); r += 1) {
      for (int c = 0; c < AskewTriModelBoard.get(0).size(); c += 1) {
        assertEquals(AskewTriModelBoard.get(r).get(c), AskewTriModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor3() {
    init();
    for (int r = 0; r < SmallTriModelBoard.size(); r += 1) {
      for (int c = 0; c < SmallTriModelBoard.get(0).size(); c += 1) {
        assertEquals(SmallTriModelBoard.get(r).get(c), SmallTriModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor4() {
    init();
    for (int r = 0; r < SmallAskewTriModelBoard.size(); r += 1) {
      for (int c = 0; c < SmallAskewTriModelBoard.get(0).size(); c += 1) {
        assertEquals(SmallAskewTriModelBoard.get(r).get(c), SmallAskewTriModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2Error() {
    assertThrows(IllegalArgumentException.class, () -> {
      new TriangleSolitaireModel(8, 8);
    });
  }

  @Test
  public void testConstructor3Error() {
    assertThrows(IllegalArgumentException.class, () -> {
      new TriangleSolitaireModel(-1);
    });
  }

  @Test
  public void testConstructor4Errors() {
    // Tests the nonpositive arm thickness error
    assertThrows(IllegalArgumentException.class, () -> {
      new TriangleSolitaireModel(-1, 1, 1);
    });
    // Tests the Out of Bounds error
    assertThrows(IllegalArgumentException.class, () -> {
      new TriangleSolitaireModel(3, 8, 8);
    });
  }

  @Test
  public void testMove() {
    init();
    // checks to make sure the board is in default position
    for (int r = 0; r < SmallTriModelBoard.size(); r += 1) {
      for (int c = 0; c < SmallTriModelBoard.get(0).size(); c += 1) {
        assertEquals(SmallTriModelBoard.get(r).get(c), SmallTriModel.getSlotAt(r, c));
      }
    }
    // moves Marble from (3,0) to (0,0)
    SmallTriModel.move(2, 0, 0, 0);
    // checks to make sure the board is in new position
    for (int r = 0; r < SmallTriModelBoardAfterMove.size(); r += 1) {
      for (int c = 0; c < SmallTriModelBoardAfterMove.get(0).size(); c += 1) {
        assertEquals(SmallTriModelBoardAfterMove.get(r).get(c),
                SmallTriModel.getSlotAt(r, c));
      }
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMoveErrors() {
    init();
    // Tests the Out of Bounds error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultTriModel.move(0, 0, 3, 4);
    });

    // Tests the lack of marble between to and from error
    DefaultTriModel.move(3, 1, 3, 3);
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultTriModel.move(3, 0, 3, 2);
    });

    // Tests the Invalid move error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultTriModel.move(0, 4, 4, 4);
    });
  }

  @Test
  public void testIsGameOver() {
    assertTrue(new TriangleSolitaireModel(1).isGameOver());
  }

  @Test
  public void testGetBoardSize() {
    init();
    assertEquals(5, DefaultTriModel.getBoardSize());
    assertEquals(5, AskewTriModel.getBoardSize());
    assertEquals(3, SmallTriModel.getBoardSize());
    assertEquals(3, SmallAskewTriModel.getBoardSize());
  }

  @Test
  public void testGetSlotAt() {
    init();
    assertEquals(SlotState.Empty, DefaultTriModel.getSlotAt(0, 0));
    assertEquals(SlotState.Invalid, AskewTriModel.getSlotAt(0, 1));
    assertEquals(SlotState.Marble, SmallTriModel.getSlotAt(1, 0));
  }

  @Test
  public void testGetSlotAtError() {
    init();
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultTriModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      AskewTriModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      SmallTriModel.getSlotAt(14, 14);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      SmallAskewTriModel.getSlotAt(14, 14);
    });
  }

  @Test
  public void testGetScore() {
    init();
    assertEquals(14, DefaultTriModel.getScore());
    assertEquals(14, AskewTriModel.getScore());
    assertEquals(5, SmallTriModel.getScore());
    assertEquals(5, SmallAskewTriModel.getScore());
  }

}
