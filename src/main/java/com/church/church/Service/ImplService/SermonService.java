package com.church.church.Service.ImplService;

import com.church.church.Domain.Sermon;
import com.church.church.Service.IService;

import java.util.List;
import java.util.Set;

public interface SermonService extends IService<Sermon, String> {

    Sermon displayBy(String sermonTopic);

    List<Sermon> getAll();

}
