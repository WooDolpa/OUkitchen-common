package com.project.toy.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/12
 */
public enum UserStatus {
    ACTIVE(1),                  // 활성
    INACTIVE(2)                 // 비활성
    ;

    private int intValue;

    private UserStatus (final int newValue){ this.intValue = newValue;}

    public int toInt()
    {
        return intValue;
    }

    private static final Map<Integer, UserStatus> lookup = new HashMap<Integer, UserStatus>();

    static
    {
        for (UserStatus rt : UserStatus.values())
            lookup.put(new Integer(rt.intValue), rt);
    }

    public static UserStatus get(int typeInt)
    {
        return lookup.get(typeInt);
    }
}
