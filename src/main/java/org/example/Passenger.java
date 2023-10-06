package org.example;

import java.util.HashMap;
import java.util.Map;

public class Passenger {
    public HashMap info;

    public Passenger(HashMap info) {
        this.info = info;
    }

    public HashMap getInfo() {
        return info;
    }

    public void setInfo(HashMap info) {
        this.info = info;
    }
}
