package com.shakkib.crypto.utils;

import com.shakkib.crypto.CryptoConstant.CryptoConstant;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Utility {

    public static String convertUnixTimeToDate(Long unixTime) {
        final DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        final String formattedDtm = Instant.ofEpochSecond(unixTime)
                .atZone(ZoneId.of(CryptoConstant.timeZone))
                .format(formatter);
        return formattedDtm;
    }

    public static double round(double value, int places) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
