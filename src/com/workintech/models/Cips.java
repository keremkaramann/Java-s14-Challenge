package com.workintech.models;

import com.workintech.enums.CipsTypes;

public class Cips {
    CipsTypes cipsTypes;

    public Cips(CipsTypes cipsTypes) {
        this.cipsTypes = cipsTypes;
    }

    public CipsTypes getCipsTypes() {
        return cipsTypes;
    }
}
