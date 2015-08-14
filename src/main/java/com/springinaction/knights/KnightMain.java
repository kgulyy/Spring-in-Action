package com.springinaction.knights;

import com.springinaction.knights.quests.QuestException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kogu0315 on 13.08.2015.
 */
public class KnightMain {
    public static void main(String[] args) throws QuestException {
        // Загрузка контекста Spring
        ApplicationContext context =
                new ClassPathXmlApplicationContext("knights.xml");
        // Получение компонента knight
        Knight knight = (Knight) context.getBean("knight");
        // Использование компонента knight
        knight.embarkOnQuest();
    }
}
