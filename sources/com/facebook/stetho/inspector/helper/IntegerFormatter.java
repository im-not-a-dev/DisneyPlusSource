package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.ViewDebug.ExportedProperty;

public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    private static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
            super();
        }

        @TargetApi(21)
        public String format(Integer num, ExportedProperty exportedProperty) {
            if (exportedProperty == null || !exportedProperty.formatToHexString()) {
                return IntegerFormatter.super.format(num, exportedProperty);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("0x");
            sb.append(Integer.toHexString(num.intValue()));
            return sb.toString();
        }
    }

    public static IntegerFormatter getInstance() {
        if (cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (cachedFormatter == null) {
                    if (VERSION.SDK_INT >= 21) {
                        cachedFormatter = new IntegerFormatterWithHex();
                    } else {
                        cachedFormatter = new IntegerFormatter();
                    }
                }
            }
        }
        return cachedFormatter;
    }

    public String format(Integer num, ExportedProperty exportedProperty) {
        return String.valueOf(num);
    }

    private IntegerFormatter() {
    }
}
