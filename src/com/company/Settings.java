package com.company;

import com.company.inteface.ProductFactory;

public class Settings {

    private static volatile Settings instanse;
    private static Factory mFactory;

    private Settings() {
    }

    public static Settings newInstanse() {
        Settings localInstanse = instanse;
        if (localInstanse == null) {
            synchronized (Settings.class) {
                localInstanse = instanse;
                if (localInstanse == null) {
                    instanse = localInstanse = new Settings();
                }
            }
        }
        return localInstanse;
    }

    public static ProductFactory getFactory(String name){
        try {
            return mFactory == null ? new Factory().createFactory(name) : mFactory.createFactory(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
