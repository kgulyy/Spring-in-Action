package com.springinaction.knights.quests;

/**
 * Подвиг - Стать рыцерем Круглого Стола!
 */
public class MakeRoundTableRounderQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Он стал рыцерем круглого стола!");
    }
}
