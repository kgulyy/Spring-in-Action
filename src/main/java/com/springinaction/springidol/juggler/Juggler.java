package com.springinaction.springidol.juggler;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

/**
 * Created by kogu0315 on 13.08.2015.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
