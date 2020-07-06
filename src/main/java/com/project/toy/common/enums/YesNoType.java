package com.project.toy.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/06
 */
public enum YesNoType {

    Yes("Y"),
    No("N");

    private String stringValue;

    private YesNoType(final String newValue) { stringValue = newValue;}

    public String toStr() { return stringValue;}

    private static final Map<String, YesNoType> lookup = new HashMap<>();

    static
    {
        for (YesNoType rt : YesNoType.values()){
            lookup.put(rt.stringValue, rt);
        }
    }

    public static YesNoType get(String typeStr) { return lookup.get(typeStr); }
}
