import org.junit.Test;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState.SlotState;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

/**
 * This class represents the tests for EuropeanSolitaireModel Tests that for methods that are the
 * same in EnglishSolitaireModel are omitted because they are already tested in
 * EuropeanSolitaireModel
 */
public class EuropeanSolitaireModelTest {

  // Example of Constructor 1
  private MarbleSolitaireModel DefaultEuropeanModel;
  // Constructor 2
  private MarbleSolitaireModel AskewEuropeanModel;
  // Constructor 3
  private MarbleSolitaireModel BigEuropeanModel;
  // Constructor 4
  private MarbleSolitaireModel BigAskewEuropeanModel;

  // Example 2D ArrayList of DefaultEnglishModel
  ArrayList<ArrayList<SlotState>> DefaultEuropeanModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor1 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor1 = new ArrayList<>();

  // Example 2D ArrayList of AskewEnglishModel
  ArrayList<ArrayList<SlotState>> AskewEuropeanModelBoard = new ArrayList<>();
  ArrayList<SlotState> row1Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row2Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row3Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row4Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row5Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row6Constructor2 = new ArrayList<>();
  ArrayList<SlotState> row7Constructor2 = new ArrayList<>();

  // Example 2D ArrayList of BigEnglishModel
  ArrayList<ArrayList<SlotState>> BigEuropeanModelBoard = new ArrayList<>();
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
  ArrayList<ArrayList<SlotState>> BigAskewEuropeanModelBoard = new ArrayList<>();
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

  // Example 2D ArrayList of DefaultEuropeanModelAfterMove
  ArrayList<ArrayList<SlotState>> DefaultEuropeanModelBoardAfterMove = new ArrayList<>();
  ArrayList<SlotState> row1Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row2Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row3Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row4Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row5Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row6Constructor1AfterMove = new ArrayList<>();
  ArrayList<SlotState> row7Constructor1AfterMove = new ArrayList<>();

  public void init() {

    // initializes the boards
    DefaultEuropeanModel = new EuropeanSolitaireModel();
    AskewEuropeanModel = new EuropeanSolitaireModel(2, 3);
    BigEuropeanModel = new EuropeanSolitaireModel(5);
    BigAskewEuropeanModel = new EuropeanSolitaireModel(5, 6, 7);

    // initilzies the rows for constrcutor 1
    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Empty);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor1.add(MarbleSolitaireModelState.SlotState.Invalid);

    // initalizes board for constructor1
    DefaultEuropeanModelBoard.add(row1Constructor1);
    DefaultEuropeanModelBoard.add(row2Constructor1);
    DefaultEuropeanModelBoard.add(row3Constructor1);
    DefaultEuropeanModelBoard.add(row4Constructor1);
    DefaultEuropeanModelBoard.add(row5Constructor1);
    DefaultEuropeanModelBoard.add(row6Constructor1);
    DefaultEuropeanModelBoard.add(row7Constructor1);

    // initilzies the rows for constrcutor 2

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Empty);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor2.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor2.add(MarbleSolitaireModelState.SlotState.Invalid);

    // initializes board for constructor2
    AskewEuropeanModelBoard.add(row1Constructor2);
    AskewEuropeanModelBoard.add(row2Constructor2);
    AskewEuropeanModelBoard.add(row3Constructor2);
    AskewEuropeanModelBoard.add(row4Constructor2);
    AskewEuropeanModelBoard.add(row5Constructor2);
    AskewEuropeanModelBoard.add(row6Constructor2);
    AskewEuropeanModelBoard.add(row7Constructor2);

    // initilzies the rows for constructor 3
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

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row12Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row12Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
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
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

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

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
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
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row12Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row4Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor3.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row12Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor3.add(MarbleSolitaireModelState.SlotState.Invalid);

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

    // initializes board for constructor3
    BigEuropeanModelBoard.add(row1Constructor3);
    BigEuropeanModelBoard.add(row2Constructor3);
    BigEuropeanModelBoard.add(row3Constructor3);
    BigEuropeanModelBoard.add(row4Constructor3);
    BigEuropeanModelBoard.add(row5Constructor3);
    BigEuropeanModelBoard.add(row6Constructor3);
    BigEuropeanModelBoard.add(row7Constructor3);
    BigEuropeanModelBoard.add(row8Constructor3);
    BigEuropeanModelBoard.add(row9Constructor3);
    BigEuropeanModelBoard.add(row10Constructor3);
    BigEuropeanModelBoard.add(row11Constructor3);
    BigEuropeanModelBoard.add(row12Constructor3);
    BigEuropeanModelBoard.add(row13Constructor3);

    // initialzies the rows for constructor 4
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

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row12Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row12Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
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
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

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

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor4.add(MarbleSolitaireModelState.SlotState.Empty);
    row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row12Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);

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

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
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
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row12Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row4Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row8Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row9Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row10Constructor4.add(MarbleSolitaireModelState.SlotState.Marble);
    row11Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row12Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);
    row13Constructor4.add(MarbleSolitaireModelState.SlotState.Invalid);

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

    // initializes board for constructor4
    BigAskewEuropeanModelBoard.add(row1Constructor4);
    BigAskewEuropeanModelBoard.add(row2Constructor4);
    BigAskewEuropeanModelBoard.add(row3Constructor4);
    BigAskewEuropeanModelBoard.add(row4Constructor4);
    BigAskewEuropeanModelBoard.add(row5Constructor4);
    BigAskewEuropeanModelBoard.add(row6Constructor4);
    BigAskewEuropeanModelBoard.add(row7Constructor4);
    BigAskewEuropeanModelBoard.add(row8Constructor4);
    BigAskewEuropeanModelBoard.add(row9Constructor4);
    BigAskewEuropeanModelBoard.add(row10Constructor4);
    BigAskewEuropeanModelBoard.add(row11Constructor4);
    BigAskewEuropeanModelBoard.add(row12Constructor4);
    BigAskewEuropeanModelBoard.add(row13Constructor4);

    // initializes row for constructor 1 after the move() function is used
    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Empty);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Empty);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);

    row1Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row2Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row3Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row4Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row5Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Marble);
    row6Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);
    row7Constructor1AfterMove.add(MarbleSolitaireModelState.SlotState.Invalid);

    // initializes board for constructor 1 after the move() function is used
    DefaultEuropeanModelBoardAfterMove.add(row1Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row2Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row3Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row4Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row5Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row6Constructor1AfterMove);
    DefaultEuropeanModelBoardAfterMove.add(row7Constructor1AfterMove);
  }

  // Tests
  @Test
  public void testConstructor1() {
    init();
    for (int r = 0; r < DefaultEuropeanModelBoard.size(); r += 1) {
      for (int c = 0; c < DefaultEuropeanModelBoard.get(0).size(); c += 1) {
        assertEquals(DefaultEuropeanModelBoard.get(r).get(c), DefaultEuropeanModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2() {
    init();
    for (int r = 0; r < AskewEuropeanModelBoard.size(); r += 1) {
      for (int c = 0; c < AskewEuropeanModelBoard.get(0).size(); c += 1) {
        assertEquals(AskewEuropeanModelBoard.get(r).get(c), AskewEuropeanModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor3() {
    init();
    for (int r = 0; r < BigEuropeanModelBoard.size(); r += 1) {
      for (int c = 0; c < BigEuropeanModelBoard.get(0).size(); c += 1) {
        assertEquals(BigEuropeanModelBoard.get(r).get(c), BigEuropeanModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor4() {
    init();
    for (int r = 0; r < BigAskewEuropeanModelBoard.size(); r += 1) {
      for (int c = 0; c < BigAskewEuropeanModelBoard.get(0).size(); c += 1) {
        assertEquals(BigAskewEuropeanModelBoard.get(r).get(c),
                BigAskewEuropeanModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testConstructor2Error() {
    assertThrows(IllegalArgumentException.class, () -> {
      new EuropeanSolitaireModel(8, 8);
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
    for (int r = 0; r < DefaultEuropeanModelBoard.size(); r += 1) {
      for (int c = 0; c < DefaultEuropeanModelBoard.get(0).size(); c += 1) {
        assertEquals(DefaultEuropeanModelBoard.get(r).get(c), DefaultEuropeanModel.getSlotAt(r, c));
      }
    }
    // moves Marble from (3,1) to (3,3)
    DefaultEuropeanModel.move(1, 3, 3, 3);
    // checks to make sure the board is in new position
    for (int r = 0; r < DefaultEuropeanModelBoardAfterMove.size(); r += 1) {
      for (int c = 0; c < DefaultEuropeanModelBoardAfterMove.get(0).size(); c += 1) {
        assertEquals(DefaultEuropeanModelBoardAfterMove.get(r).get(c),
                DefaultEuropeanModel.getSlotAt(r, c));
      }
    }
  }

  @Test
  public void testMoveErrors() {
    init();
    // Tests the Out of Bounds error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEuropeanModel.move(0, 0, 3, 4);
    });

    // Tests the lack of marble between to and from error
    DefaultEuropeanModel.move(3, 1, 3, 3);
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEuropeanModel.move(3, 0, 3, 2);
    });

    // Tests the Invalid move error
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEuropeanModel.move(0, 4, 4, 4);
    });
  }

  @Test
  public void testIsGameOver() {
    assertTrue(new EnglishSolitaireModel(1).isGameOver());
  }

  @Test
  public void testGetBoardSize() {
    init();
    assertEquals(7, DefaultEuropeanModel.getBoardSize());
    assertEquals(7, AskewEuropeanModel.getBoardSize());
    assertEquals(13, BigEuropeanModel.getBoardSize());
    assertEquals(13, BigAskewEuropeanModel.getBoardSize());
  }

  @Test
  public void testGetSlotAt() {
    init();
    assertEquals(SlotState.Invalid, DefaultEuropeanModel.getSlotAt(0, 0));
    assertEquals(SlotState.Empty, AskewEuropeanModel.getSlotAt(2, 3));
    assertEquals(SlotState.Marble, BigEuropeanModel.getSlotAt(4, 0));
    assertEquals(SlotState.Empty, BigAskewEuropeanModel.getSlotAt(6, 7));
  }

  @Test
  public void testGetSlotAtError() {
    init();
    assertThrows(IllegalArgumentException.class, () -> {
      DefaultEuropeanModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      AskewEuropeanModel.getSlotAt(8, 8);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BigEuropeanModel.getSlotAt(14, 14);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BigAskewEuropeanModel.getSlotAt(14, 14);
    });
  }

  @Test
  public void testGetScore() {
    init();
    assertEquals(36, DefaultEuropeanModel.getScore());
    assertEquals(36, AskewEuropeanModel.getScore());
    assertEquals(128, BigEuropeanModel.getScore());
    assertEquals(128, BigAskewEuropeanModel.getScore());
  }

}
