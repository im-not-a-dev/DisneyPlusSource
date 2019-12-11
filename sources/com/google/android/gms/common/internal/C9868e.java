package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C9831h;
import com.google.android.gms.common.C9924k;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9945i;
import p096e.p113e.C3941i;
import p163g.p449j.p450a.p451a.p455b.C10953b;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C9868e {

    /* renamed from: a */
    private static final C3941i<String, String> f23116a = new C3941i<>();

    /* renamed from: a */
    public static String m30758a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C10953b.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C10953b.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C10953b.common_google_play_services_enable_button);
    }

    /* renamed from: b */
    public static String m30762b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m30757a(context);
        if (i == 1) {
            return resources.getString(C10953b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C10953b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m30760a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m30760a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C10953b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m30760a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m30760a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m30760a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C10953b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C9924k.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C9945i.m30984c(context)) {
            return resources.getString(C10953b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C10953b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: c */
    public static String m30763c(Context context, int i) {
        if (i != 6) {
            return m30762b(context, i);
        }
        return m30760a(context, "common_google_play_services_resolution_required_text", m30757a(context));
    }

    /* renamed from: d */
    public static String m30764d(Context context, int i) {
        String str;
        if (i == 6) {
            str = m30759a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m30765e(context, i);
        }
        return str == null ? context.getResources().getString(C10953b.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: e */
    public static String m30765e(Context context, int i) {
        Resources resources = context.getResources();
        String str = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(C10953b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C10953b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C10953b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str, "An invalid account was specified when connecting. Please provide a valid account.");
                return m30759a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str, "Network error occurred. Please retry request later.");
                return m30759a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e(str, "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e(str, "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e(str, "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e(str, "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e(str, "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e(str, "The specified account could not be signed in.");
                return m30759a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str, "The current user profile is restricted and could not use authenticated features.");
                return m30759a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e(str, sb.toString());
                return null;
        }
    }

    /* renamed from: a */
    public static String m30757a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C9931c.m30956a(context).mo25465b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m30760a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m30759a(context, str);
        if (a == null) {
            a = resources.getString(C9924k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: a */
    private static String m30759a(Context context, String str) {
        synchronized (f23116a) {
            String str2 = (String) f23116a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = C9831h.m30622d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f23116a.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m30761b(Context context) {
        return context.getResources().getString(C10953b.common_google_play_services_notification_channel_name);
    }
}
