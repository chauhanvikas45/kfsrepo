package com.test.utils;

import java.util.HashMap;
import java.util.Map;

public class GST {



    {
        getGstDetails();
    }
    public static final Map getGstDetails(){
        HashMap<String, Integer> gstRate = new HashMap<>();
        gstRate.put("cgst",9);
        gstRate.put("sgst",9);
        gstRate.put("igst",18);
    return gstRate;
    }
}
