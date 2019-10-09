package com.church.church.Factory;

import com.church.church.Domain.Leaders.Pastor;
import com.church.church.Util.Helper;

public class PastorFactory {


   public static Pastor buildPastor(String pastor)
   {
       return new Pastor.Builder().pastorTitle(pastor).build();
   }

}
