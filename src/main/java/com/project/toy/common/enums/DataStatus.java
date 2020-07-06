package com.project.toy.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/05
 */
public enum DataStatus {
    ACTIVE(1),                  // 활성
    INACTIVE(2)                 // 비활성
    ;

    private int intValue;

    private DataStatus (final int newValue){ this.intValue = newValue;}

    public int toInt()
    {
        return intValue;
    }

    private static final Map<Integer, DataStatus> lookup = new HashMap<Integer, DataStatus>();

    static
    {
        for (DataStatus rt : DataStatus.values())
            lookup.put(new Integer(rt.intValue), rt);
    }

    public static DataStatus get(int typeInt)
    {
        return lookup.get(typeInt);
    }
}
