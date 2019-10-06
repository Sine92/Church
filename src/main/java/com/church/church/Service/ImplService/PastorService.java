package com.church.church.Service.ImplService;

import com.church.church.Domain.Pastor;
import com.church.church.Domain.Sermon;
import com.church.church.Service.IService;

import java.util.List;
import java.util.Set;

public interface PastorService extends IService<Pastor, String> {

    Pastor displayBy(String pastorTitle);

    List<Pastor> getAll();
}
