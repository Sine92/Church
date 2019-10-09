package com.church.church.Service.ImplService;

import com.church.church.Domain.Leaders.Pastor;
import com.church.church.Service.IService;

import java.util.List;

public interface PastorService extends IService<Pastor, String> {

    Pastor displayBy(String pastorTitle);

    List<Pastor> getAll();
}
