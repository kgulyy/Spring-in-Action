package com.springinaction.springidol.instrumentalist;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

/**
 * Created by kogu0315 on 14.08.2015.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
