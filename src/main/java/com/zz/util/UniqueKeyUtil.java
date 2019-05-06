package com.zz.util;

import java.util.Random;

public class UniqueKeyUtil {
    public static synchronized String CreateUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
