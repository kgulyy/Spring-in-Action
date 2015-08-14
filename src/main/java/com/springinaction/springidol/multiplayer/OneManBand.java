package com.springinaction.springidol.multiplayer;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

import java.util.Properties;

/**
 * Created by kogu0315 on 14.08.2015.
 */
public class OneManBand implements Performer {

//    private Collection<Instrument> instruments;
//    private Map<String, Instrument> instruments;
    private Properties instruments;


    /*public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }*/

    /*public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }*/

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    /*@Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }*/

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.stringPropertyNames()) {
            System.out.println(key + " : " + instruments.getProperty(key));
        }
    }
}
