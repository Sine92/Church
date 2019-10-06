package com.church.church.Factory;

import com.church.church.Domain.Sermon;
import com.church.church.Util.Helper;

public class SermonFactory {

    public static Sermon buildSermon(String sermon)
    {
        return new Sermon.Builder().sermonId(Helper.generateId()).sermonTopic(sermon).build();
    }
}
