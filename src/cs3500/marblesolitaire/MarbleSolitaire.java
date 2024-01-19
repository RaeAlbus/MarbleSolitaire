package cs3500.marblesolitaire;

import java.util.Arrays;
import java.util.List;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

public class MarbleSolitaire {

  /**
   * Main method to run the marble solitaire game.
   *
   * @param args arguments for instantiating the model and customizing its initial empty spot and
   *             size.
   */
  public static void main(String[] args) {
    MarbleSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireView view;

    int size = -1;
    int row = -1;
    int col = -1;

    List<String> params = Arrays.asList(args);

    if (params.contains("-size")) {
      size = Integer.parseInt(params.get(params.indexOf("-size") + 1));
      if (params.contains("-hole")) {
        row = Integer.parseInt(params.get(params.indexOf("-hole") + 1));
        col = Integer.parseInt(params.get(params.indexOf("-hole") + 2));
      }
    }

    if (params.contains("european")) {
      if (size != -1 && row != -1 && col != -1) {
        model = new EuropeanSolitaireModel(size, row, col);
      } else if (row != -1 && col != -1) {
        model = new EuropeanSolitaireModel(row, col);
      } else if (size != -1) {
        model = new EuropeanSolitaireModel(size);
      } else {
        model = new EuropeanSolitaireModel();
      }
    } else if (params.contains("triangular")) {
      if (size != -1 && row != -1 && col != -1) {
        model = new TriangleSolitaireModel(size, row, col);
      } else if (row != -1 && col != -1) {
        model = new TriangleSolitaireModel(row, col);
      } else if (size != -1) {
        model = new TriangleSolitaireModel(size);
      } else {
        model = new TriangleSolitaireModel();
      }
    } else if (params.contains("english")) {
      if (size != -1 && row != -1 && col != -1) {
        model = new EnglishSolitaireModel(size, row, col);
      } else if (row != -1 && col != -1) {
        model = new EnglishSolitaireModel(row, col);
      } else if (size != -1) {
        model = new EnglishSolitaireModel(size);
      } else {
        model = new EnglishSolitaireModel();
      }
    }

    view = new MarbleSolitaireTextView(model);
  }

}
