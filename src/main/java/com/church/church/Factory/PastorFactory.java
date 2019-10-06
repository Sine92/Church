package com.church.church.Factory;

import com.church.church.Domain.Pastor;
import com.church.church.Util.Helper;

public class PastorFactory {


   public static Pastor buildPastor(String pastor)
   {
       return new Pastor.Builder().pastorId(Helper.generateId()).pastorTitle(pastor).build();
   }

}
