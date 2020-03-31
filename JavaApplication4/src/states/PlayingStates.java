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

public class PlayingStates extends States {

    PlayingStates(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedStates(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyStates(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
