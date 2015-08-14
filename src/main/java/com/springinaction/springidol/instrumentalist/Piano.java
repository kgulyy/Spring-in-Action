package com.springinaction.springidol.instrumentalist;

/**
 * Created by kogu0315 on 14.08.2015.
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
