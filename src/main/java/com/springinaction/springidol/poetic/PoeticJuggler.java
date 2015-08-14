package com.springinaction.springidol.poetic;

import com.springinaction.springidol.juggler.Juggler;
import com.springinaction.springidol.PerformanceException;

/**
 * Created by kogu0315 on 14.08.2015.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
