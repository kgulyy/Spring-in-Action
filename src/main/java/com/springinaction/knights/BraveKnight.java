package com.springinaction.knights;

import com.springinaction.knights.quests.Quest;
import com.springinaction.knights.quests.QuestException;

/**
 * Created by kogu0315 on 13.08.2015.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
