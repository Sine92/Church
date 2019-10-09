package com.church.church.Service.ImplService;

import com.church.church.Domain.Preaching.Sermon;
import com.church.church.Service.IService;

import java.util.List;

public interface SermonService extends IService<Sermon, String> {

    Sermon displayBy(String sermonTopic);

    List<Sermon> getAll();

}
