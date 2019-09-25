package com.telran;

// unused Class

import java.lang.reflect.Method;

public enum MethodEnum {
    CIRCLE_LENGTH(1, "This methods helps you to calculate the circle length"),
    CIRCLE_AREA(2, "This methods helps you to calculate the circle area"),
    SQUARE_EQUIVALENT(3, "This methods helps you to calculate the square equivalent");


    private final int methodCode;
    private final String methodDescription;
    //private final Method method;

    public static MethodEnum getMethodByMethodCode(int methodCode) {
        for (MethodEnum method: MethodEnum.values()) {
            if (method.getMethodCode() == methodCode)
                return method;
        }
        return null;
    }

    MethodEnum(int methodCode, String methodDescription/*, Method method*/) {
        this.methodCode = methodCode;
        this.methodDescription = methodDescription;
        //this.method = method;
    }

    public int getMethodCode() {
        return methodCode;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    /*public Method getMethod() {
        return method;
    }*/
}
