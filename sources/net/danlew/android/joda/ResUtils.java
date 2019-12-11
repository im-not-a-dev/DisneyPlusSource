package net.danlew.android.joda;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResUtils {
    private static final String TZDATA_PREFIX = "joda_";
    private static Map<Class<?>, Map<String, Integer>> sIdentifierCache = new ConcurrentHashMap();

    private static String convertPathToResource(String str) {
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        return stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
    }

    public static int getIdentifier(Class<?> cls, String str) {
        Map map;
        if (!sIdentifierCache.containsKey(cls)) {
            map = new ConcurrentHashMap();
            sIdentifierCache.put(cls, map);
        } else {
            map = (Map) sIdentifierCache.get(cls);
        }
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        try {
            int i = cls.getField(str).getInt(null);
            if (i != 0) {
                map.put(str, Integer.valueOf(i));
            }
            return i;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve identifier: type=");
            sb.append(cls);
            sb.append(" name=");
            sb.append(str);
            Log.e("JodaTimeAndroid", sb.toString(), e);
            return 0;
        }
    }

    public static String getTzResource(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(TZDATA_PREFIX);
        sb.append(convertPathToResource(str));
        return sb.toString();
    }

    public static String getZoneInfoMapResource() {
        StringBuilder sb = new StringBuilder();
        sb.append(TZDATA_PREFIX);
        sb.append(convertPathToResource("ZoneInfoMap"));
        return sb.toString();
    }
}
