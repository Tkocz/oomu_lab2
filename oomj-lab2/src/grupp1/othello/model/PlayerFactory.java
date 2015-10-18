package grupp1.othello.model;

/*------------------------------------------------
 * IMPORTS
 *----------------------------------------------*/

import grupp1.othello.controller.ComputerPlayer;
import grupp1.othello.controller.HumanPlayer;
import grupp1.othello.controller.Player;
import grupp1.othello.model.PlayerType;

/*------------------------------------------------
 * CLASS
 *----------------------------------------------*/

public class PlayerFactory {

/*------------------------------------------------
 * PUBLIC METHODS
 *----------------------------------------------*/

/**
 * Creates a player with the specified name, of the specified type.
 *
 * @param name The player name.
 * @param type The player type.
 */
public Player getPlayer(String name, PlayerType type) {
    switch (type) {

    case COMPUTER: return (new ComputerPlayer(name));
    case HUMAN   : return (new HumanPlayer   (name));

    }

    return (null);
}

}
