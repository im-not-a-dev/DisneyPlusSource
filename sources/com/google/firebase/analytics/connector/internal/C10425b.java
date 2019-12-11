package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.C9938b;
import com.google.android.gms.measurement.internal.C10178r5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C10425b {

    /* renamed from: a */
    private static final List<String> f24743a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});

    /* renamed from: b */
    private static final List<String> f24744b = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: c */
    private static final List<String> f24745c = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: d */
    private static final List<String> f24746d = Arrays.asList((String[]) C9938b.m30965a(C10178r5.f23887a, C10178r5.f23888b));

    /* renamed from: e */
    private static final List<String> f24747e = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    }

    /* renamed from: a */
    public static boolean m32946a(String str) {
        return !f24744b.contains(str);
    }

    /* renamed from: a */
    public static boolean m32947a(String str, Bundle bundle) {
        if (f24743a.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : f24745c) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m32948a(String str, String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(str3) || str.equals("fiam");
        }
        if (f24746d.contains(str2)) {
            return false;
        }
        for (String matches : f24747e) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m32949a(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m32946a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f24745c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        String str3 = "_cis";
        if (c == 0) {
            bundle.putString(str3, "fcm_integration");
            return true;
        } else if (c == 1) {
            bundle.putString(str3, "fdl_integration");
            return true;
        } else if (c != 2) {
            return false;
        } else {
            bundle.putString(str3, "fiam_integration");
            return true;
        }
    }
}
