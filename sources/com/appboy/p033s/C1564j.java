package com.appboy.p033s;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import p161f.p162a.C4424d3;

/* renamed from: com.appboy.s.j */
public final class C1564j {

    /* renamed from: a */
    private static final String f5715a = C1557c.m7461a(C1564j.class);

    /* renamed from: a */
    public static String m7492a(String str) {
        String trim = str.trim();
        if (trim.length() <= 255) {
            return trim;
        }
        String str2 = f5715a;
        StringBuilder sb = new StringBuilder();
        sb.append("Provided string field is too long [");
        sb.append(trim.length());
        sb.append("]. The max length is ");
        sb.append(255);
        sb.append(", truncating provided field.");
        C1557c.m7473e(str2, sb.toString());
        return trim.substring(0, 255);
    }

    /* renamed from: a */
    public static boolean m7493a(double d, double d2) {
        return d < 90.0d && d > -90.0d && d2 < 180.0d && d2 > -180.0d;
    }

    /* renamed from: b */
    public static boolean m7497b(String str) {
        return str != null && str.toLowerCase(Locale.US).matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    }

    /* renamed from: c */
    public static boolean m7498c(String str) {
        return str != null && str.matches("^[0-9 .\\(\\)\\+\\-]+$");
    }

    /* renamed from: a */
    public static boolean m7496a(String str, String str2, BigDecimal bigDecimal, int i, C4424d3 d3Var, Set<String> set) {
        if (C1563i.m7490d(str)) {
            C1557c.m7473e(f5715a, "The productId is empty, not logging in-app purchase to Appboy.");
            return false;
        } else if (d3Var.mo15506j().contains(str)) {
            String str3 = f5715a;
            StringBuilder sb = new StringBuilder();
            sb.append("The productId is a blacklisted productId: ");
            sb.append(str);
            C1557c.m7473e(str3, sb.toString());
            return false;
        } else if (str2 == null) {
            String str4 = f5715a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The currencyCode is null. Expected one of ");
            sb2.append(set);
            C1557c.m7473e(str4, sb2.toString());
            return false;
        } else if (!set.contains(str2)) {
            String str5 = f5715a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The currencyCode ");
            sb3.append(str2);
            sb3.append(" is invalid. Expected one of ");
            sb3.append(set);
            C1557c.m7473e(str5, sb3.toString());
            return false;
        } else if (bigDecimal == null) {
            C1557c.m7473e(f5715a, "The price is null.");
            return false;
        } else {
            String str6 = "The requested purchase quantity of ";
            if (i <= 0) {
                String str7 = f5715a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str6);
                sb4.append(i);
                sb4.append(" is less than zero.");
                C1557c.m7473e(str7, sb4.toString());
                return false;
            } else if (i <= 100) {
                return true;
            } else {
                String str8 = f5715a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str6);
                sb5.append(i);
                sb5.append(" is greater than the maximum of ");
                sb5.append(100);
                C1557c.m7473e(str8, sb5.toString());
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m7494a(String str, C4424d3 d3Var) {
        if (C1563i.m7490d(str)) {
            C1557c.m7473e(f5715a, "The custom event name cannot be null or contain only whitespaces. Invalid custom event.");
            return false;
        } else if (!d3Var.mo15504h().contains(str)) {
            return true;
        } else {
            String str2 = f5715a;
            StringBuilder sb = new StringBuilder();
            sb.append("The custom event is a blacklisted custom event: ");
            sb.append(str);
            sb.append(". Invalid custom event.");
            C1557c.m7473e(str2, sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m7495a(String str, String str2) {
        if (C1563i.m7490d(str)) {
            C1557c.m7473e(f5715a, "Campaign ID cannot be null or blank");
            return false;
        } else if (!C1563i.m7490d(str2)) {
            return true;
        } else {
            C1557c.m7473e(f5715a, "Push story page ID cannot be null or blank");
            return false;
        }
    }
}
