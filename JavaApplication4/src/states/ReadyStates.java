/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

/**
 *
 * @author Booster
 */
import UI.Player;
import UI.Player;

/**
 * Они также могут переводить контекст в другие состояния.
 */
public class ReadyStates extends States {

    public ReadyStates(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedStates(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingStates(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
