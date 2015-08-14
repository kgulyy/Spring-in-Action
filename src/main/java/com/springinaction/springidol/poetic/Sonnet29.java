package com.springinaction.springidol.poetic;

import com.springinaction.springidol.poetic.Poem;

/**
 * Created by kogu0315 on 14.08.2015.
 */
public class Sonnet29 implements Poem {

    private static String[] LINES = {
            "Когда в раздоре с миром и судьбой,",
            "Припомнив годы, полные невзгод,",
            "Тревожу я бесплодною мольбой",
            "Глухой и равнодушный небосвод",
            "И, жалуясь на горестный удел,",
            "Готов меняться жребием своим",
            "С тем, кто в искусстве больше преуспел,",
            "Богат надеждой и людьми любим, -",
            "Тогда, внезапно вспомнив о тебе,",
            "Я малодушье жалкое кляну,",
            "И жаворонком, вопреки судьбе,",
            "Моя душа несется в вышину.",
            "С твоей любовью, с памятью о ней",
            "Всех королей на свете я сильней."};

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for (int i = 1; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
