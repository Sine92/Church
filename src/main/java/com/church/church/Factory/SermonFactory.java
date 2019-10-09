package com.church.church.Factory;

import com.church.church.Domain.Preaching.Sermon;
import com.church.church.Util.Helper;

public class SermonFactory {

    public static Sermon buildSermon(String sermon)
    {
        return new Sermon.Builder().sermonTopic(sermon).build();
    }
}
