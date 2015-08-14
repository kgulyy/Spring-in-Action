package com.springinaction.knights.quests;

/**
 * Подвиг - убил дракона
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Он убил дракона");
    }
}
