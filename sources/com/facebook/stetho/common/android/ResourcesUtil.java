package com.facebook.stetho.common.android;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.facebook.stetho.common.LogUtil;

public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String getIdString(Resources resources, int i) throws NotFoundException {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String str2 = "";
        if (getResourcePackageId(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = ":";
        } else {
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown identifier encountered on ");
            sb.append(obj);
            sb.append(": ");
            sb.append(fallbackIdString);
            LogUtil.m24855w(sb.toString());
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
