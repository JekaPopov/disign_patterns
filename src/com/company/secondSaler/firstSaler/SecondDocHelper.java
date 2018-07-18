package com.company.secondSaler.firstSaler;

import com.company.inteface.DocHelper;

public class SecondDocHelper implements DocHelper{


    @Override
    public String getReport(String id) {
        return "Отчет2";
    }
}
