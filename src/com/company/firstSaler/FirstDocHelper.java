package com.company.firstSaler;

import com.company.inteface.DocHelper;

public class FirstDocHelper implements DocHelper{


    @Override
    public String getReport(String id) {
        return "Отчет "+id;
    }
}
