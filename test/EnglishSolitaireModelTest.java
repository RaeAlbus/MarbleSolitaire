import org.junit.Test;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the EnglishSolitaireModel class
 */
public class EnglishSolitaireModelTest {

  // Example of Constructor 1
  private MarbleSolitaireModel DefaultEnglishModel;
  // Constructor 2
  private MarbleSolitaireModel AskewEnglishModel;
  // Constructor 3
  private MarbleSolitaireModel BigEnglishModel;
  // Constructor 4
  private MarbleSolitaireModel BigAskewEnglishModel;

  // Example 2D ArrayList of DefaultEnglishModel
  ArrayList<ArrayList<SlotState>> DefaultEnglishModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor1 = new ArrayList<>();

  // Example 2D ArrayList of AskewEnglishModel
  ArrayList<ArrayList<SlotState>> AskewEnglishModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor2 = new ArrayList<>();

  // Example 2D ArrayList of BigEnglishModel
  ArrayList<ArrayList<SlotState>> BigEnglishModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row8Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row9Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row10Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row11Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row12Constructor3 = new ArrayList<>();
  ArrayList<SlotState> row13Constructor3 = new ArrayList<>();

  // Example 2D ArrayList of BigAskewEnglishModel
  ArrayList<ArrayList<SlotState>> BigAskewEnglishModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row8Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row9Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row10Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row11Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row12Constructor4 = new ArrayList<>();
  ArrayList<SlotState> row13Constructor4 = new ArrayList<>();

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

    // initializes the boards
    DefaultEnglishModel = new EnglishSolitaireModel();
    AskewEnglishModel = new EnglishSolitaireModel(2, 3);
    BigEnglishModel = new EnglishSolitaireModel(5);
    BigAskewEnglishModel = new EnglishSolitaireModel(5, 6, 7);

    // initilzies the rows for constrcutor 1
    for (int i = 0; i < 7; i += 1) {
      if (i <= 1 || i >= 5) {
        row1Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
        row7Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 3) {
        row1Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1.add(MarbleSolitaireModelState.SlotState.Empty);
        row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
      } else {
        row1Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
      }
    }

    // initalizes board for constructor1
    DefaultEnglishModelBoard.add(row1Constructor1);
    DefaultEnglishModelBoard.add(row2Constructor1);
    DefaultEnglishModelBoard.add(row3Constructor1);
    DefaultEnglishModelBoard.add(row4Constructor1);
    DefaultEnglishModelBoard.add(row5Constructor1);
    DefaultEnglishModelBoard.add(row6Constructor1);
    DefaultEnglishModelBoard.add(row7Constructor1);

    // initilzies the rows for constrcutor 2
    for (int i = 0; i < 7; i += 1) {
      if (i <= 1 || i >= 5) {
        row1Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
        row7Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 3) {
        row1Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor2.add(MarbleSolitaireModelState.SlotState.Empty);
        row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
      } else {
        row1Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
      }
    }

    // initializes board for constructor2
    AskewEnglishModelBoard.add(row1Constructor2);
    AskewEnglishModelBoard.add(row2Constructor2);
    AskewEnglishModelBoard.add(row3Constructor2);
    AskewEnglishModelBoard.add(row4Constructor2);
    AskewEnglishModelBoard.add(row5Constructor2);
    AskewEnglishModelBoard.add(row6Constructor2);
    AskewEnglishModelBoard.add(row7Constructor2);

    // initializes the rows for constructor 3
    for (int i = 0; i < 7; i += 1) {
      if (i <= 3 || i >= 9) {
        row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row4Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row11Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row12Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
        row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 6) {
        row1Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor3.add(MarbleSolitaireModelState.SlotState.Empty);
        row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row11Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row12Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row13Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
      } else {
        row1Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row11Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row12Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
        row13Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
      }
    }

    // initializes board for constructor3
    BigEnglishModelBoard.add(row1Constructor3);
    BigEnglishModelBoard.add(row2Constructor3);
    BigEnglishModelBoard.add(row3Constructor3);
    BigEnglishModelBoard.add(row4Constructor3);
    BigEnglishModelBoard.add(row5Constructor3);
    BigEnglishModelBoard.add(row6Constructor3);
    BigEnglishModelBoard.add(row7Constructor3);
    BigEnglishModelBoard.add(row8Constructor3);
    BigEnglishModelBoard.add(row9Constructor3);
    BigEnglishModelBoard.add(row10Constructor3);
    BigEnglishModelBoard.add(row11Constructor3);
    BigEnglishModelBoard.add(row12Constructor3);
    BigEnglishModelBoard.add(row13Constructor3);

    // initialzies the rows for constructor 4
    for (int i = 0; i < 7; i += 1) {
      if (i <= 3 || i >= 9) {
        row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row2Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row3Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row4Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row11Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row12Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
        row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
      } else if (i == 7) {
        row1Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor4.add(MarbleSolitaireModelState.SlotState.Empty);
        row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row11Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row12Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row13Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
      } else {
        row1Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row2Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row3Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row11Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row12Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
        row13Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
      }
    }

    // initializes board for constructor4
    BigAskewEnglishModelBoard.add(row1Constructor4);
    BigAskewEnglishModelBoard.add(row2Constructor4);
    BigAskewEnglishModelBoard.add(row3Constructor4);
    BigAskewEnglishModelBoard.add(row4Constructor4);
    BigAskewEnglishModelBoard.add(row5Constructor4);
    BigAskewEnglishModelBoard.add(row6Constructor4);
    BigAskewEnglishModelBoard.add(row7Constructor4);
    BigAskewEnglishModelBoard.add(row8Constructor4);
    BigAskewEnglishModelBoard.add(row9Constructor4);
    BigAskewEnglishModelBoard.add(row10Constructor4);
    BigAskewEnglishModelBoard.add(row11Constructor4);
    BigAskewEnglishModelBoard.add(row12Constructor4);
    BigAskewEnglishModelBoard.add(row13Constructor4);

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

  // Tests
  @Test
  public void testConstructor1() {
    init();
    for (int r = 0; r < DefaultEnglishModelBoard.size(); r += 1) {
      for (int c = 0; c < DefaultEnglishModelBoard.get(0).size(); c += 1) {
        assertEquals(DefaultEnglishModelBoard.get(r).get(c), DefaultEnglishModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2() {
    init();
    for (int r = 0; r < AskewEnglishModelBoard.size(); r += 1) {
      for (int c = 0; c < AskewEnglishModelBoard.get(0).size(); c += 1) {
        assertEquals(AskewEnglishModelBoard.get(r).get(c), AskewEnglishModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor3() {
    init();
    for (int r = 0; r < BigEnglishModelBoard.size(); r += 1) {
      for (int c = 0; c < BigEnglishModelBoard.get(0).size(); c += 1) {
        assertEquals(BigEnglishModelBoard.get(r).get(c), BigEnglishModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor4() {
    init();
    for (int r = 0; r < BigAskewEnglishModelBoard.size(); r += 1) {
      for (int c = 0; c < BigAskewEnglishModelBoard.get(0).size(); c += 1) {
        assertEquals(BigAskewEnglishModelBoard.get(r).get(c), BigAskewEnglishModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2Error() {
    assertThrows(IllegalArgumentException.class, () -> {
      new EnglishSolitaireModel(8, 8);
    });
  }

  @Test
  public void testConstructor3Error() {
    assertThrows(IllegalArgumentException.class, () -> {
      new EnglishSolitaireModel(2);
    });
  }

  @Test
  public void testConstructor4Errors() {
    // Tests the nonpositive arm thickness error
    assertThrows(IllegalArgumentException.class, () -> {
      new EnglishSolitaireModel(2, 1, 1);
    });
    // Tests the Out of Bounds error
    assertThrows(IllegalArgumentException.class, () -> {
      new EnglishSolitaireModel(3, 8, 8);
    });
  }

  @Test
  public void testMove() {
    init();
    // checks to make sure the board is in default position
    for (int r = 0; r < DefaultEnglishModelBoard.size(); r += 1) {
      for (int c = 0; c < DefaultEnglishModelBoard.get(0).size(); c += 1) {
        assertEquals(DefaultEnglishModelBoard.get(r).get(c), DefaultEnglishModel.getSlotAt(r, c));
      }
    }
    // moves Marble from (3,1) to (3,3)
    DefaultEnglishModel.move(3, 1, 3, 3);
    // checks to make sure the board is in new position
    for (int r = 0; r < DefaultEnglishModelBoardAfterMove.size(); r += 1) {
      for (int c = 0; c < DefaultEnglishModelBoardAfterMove.get(0).size(); c += 1) {
        assertEquals(DefaultEnglishModelBoardAfterMove.get(r).get(c),
                DefaultEnglishModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testMoveErrors() {
    init();
    // Tests the Out of Bounds error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEnglishModel.move(0, 0, 3, 4);
    });

    // Tests the lack of marble between to and from error
    DefaultEnglishModel.move(3, 1, 3, 3);
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEnglishModel.move(3, 0, 3, 2);
    });

    // Tests the Invalid move error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEnglishModel.move(0, 4, 4, 4);
    });
  }

  @Test
  public void testIsGameOver() {
    assertTrue(new EnglishSolitaireModel(1).isGameOver());
  }

  @Test
  public void testGetBoardSize() {
    init();
    assertEquals(7, DefaultEnglishModel.getBoardSize());
    assertEquals(7, AskewEnglishModel.getBoardSize());
    assertEquals(13, BigEnglishModel.getBoardSize());
    assertEquals(13, BigAskewEnglishModel.getBoardSize());
  }

  @Test
  public void testGetSlotAt() {
    init();
    assertEquals(SlotState.Invalid, DefaultEnglishModel.getSlotAt(1, 1));
    assertEquals(SlotState.Empty, AskewEnglishModel.getSlotAt(2, 3));
    assertEquals(SlotState.Marble, BigEnglishModel.getSlotAt(4, 0));
    assertEquals(SlotState.Empty, BigAskewEnglishModel.getSlotAt(6, 7));
  }

  @Test
  public void testGetSlotAtError() {
    init();
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEnglishModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      AskewEnglishModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BigEnglishModel.getSlotAt(14, 14);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BigAskewEnglishModel.getSlotAt(14, 14);
    });
  }

  @Test
  public void testGetScore() {
    init();
    assertEquals(32, DefaultEnglishModel.getScore());
    assertEquals(32, AskewEnglishModel.getScore());
    assertEquals(104, BigEnglishModel.getScore());
    assertEquals(104, BigAskewEnglishModel.getScore());
  }

}
