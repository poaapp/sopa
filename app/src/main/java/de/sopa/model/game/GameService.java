package de.sopa.model.game;

import de.sopa.observer.Observer;

/**
 * @author David Schilling - davejs92@gmail.com
 * @author Raphael Schilling
 */
public interface GameService {

    boolean solvedPuzzle();

    boolean lostLevel();

    void shiftLine(boolean horizontal, int row, int steps);

    Level getLevel();

    void attach(Observer observer);
}
