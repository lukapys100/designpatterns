package com.example.designpatterns.practise;

public class Code {
    private long code;

    public Code(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    public boolean getAccess(DigitalCode digitalCode){
        boolean isAccepted;
        isAccepted = (this.code == digitalCode.getCode());
        return isAccepted;
    }
}
