package com.springinaction.knights;

import com.springinaction.knights.quests.QuestException;

/**
 * Created by kogu0315 on 13.08.2015.
 */
public interface Knight {
    public void embarkOnQuest() throws QuestException;
}
