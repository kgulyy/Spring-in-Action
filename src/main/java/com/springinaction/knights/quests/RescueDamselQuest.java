package com.springinaction.knights.quests;

/**
 * Подвиг - Спасти даму
 */
public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("Он спас даму!");
    }
}
