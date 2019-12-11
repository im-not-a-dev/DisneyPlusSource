package com.google.android.exoplayer2.p391ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9566t;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* compiled from: DefaultTrackNameProvider */
public class C9404f implements C9420q {

    /* renamed from: a */
    private final Resources f21776a;

    public C9404f(Resources resources) {
        C9537e.m29296a(resources);
        this.f21776a = resources;
    }

    /* renamed from: b */
    private String m28822b(Format format) {
        int i = format.f18363o0;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f21776a.getString(C9415m.exo_track_mono);
        }
        if (i == 2) {
            return this.f21776a.getString(C9415m.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.f21776a.getString(C9415m.exo_track_surround_5_point_1);
        }
        if (i != 8) {
            return this.f21776a.getString(C9415m.exo_track_surround);
        }
        return this.f21776a.getString(C9415m.exo_track_surround_7_point_1);
    }

    /* renamed from: c */
    private String m28823c(Format format) {
        int i = format.f18345X;
        if (i == -1) {
            return "";
        }
        return this.f21776a.getString(C9415m.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    /* renamed from: d */
    private String m28824d(Format format) {
        return TextUtils.isEmpty(format.f18342U) ? "" : format.f18342U;
    }

    /* renamed from: e */
    private String m28825e(Format format) {
        String a = m28821a(m28826f(format), m28828h(format));
        return TextUtils.isEmpty(a) ? m28824d(format) : a;
    }

    /* renamed from: f */
    private String m28826f(Format format) {
        String str = format.f18368t0;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    /* renamed from: g */
    private String m28827g(Format format) {
        int i = format.f18355g0;
        int i2 = format.f18356h0;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.f21776a.getString(C9415m.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: h */
    private String m28828h(Format format) {
        String string = (format.f18344W & 2) != 0 ? this.f21776a.getString(C9415m.exo_track_role_alternate) : "";
        if ((format.f18344W & 4) != 0) {
            string = m28821a(string, this.f21776a.getString(C9415m.exo_track_role_supplementary));
        }
        if ((format.f18344W & 8) != 0) {
            string = m28821a(string, this.f21776a.getString(C9415m.exo_track_role_commentary));
        }
        if ((format.f18344W & 1088) == 0) {
            return string;
        }
        return m28821a(string, this.f21776a.getString(C9415m.exo_track_role_closed_captions));
    }

    /* renamed from: i */
    private static int m28829i(Format format) {
        int f = C9566t.m29513f(format.f18349b0);
        if (f != -1) {
            return f;
        }
        if (C9566t.m29516i(format.f18346Y) != null) {
            return 2;
        }
        if (C9566t.m29508a(format.f18346Y) != null) {
            return 1;
        }
        if (format.f18355g0 != -1 || format.f18356h0 != -1) {
            return 2;
        }
        if (format.f18363o0 == -1 && format.f18364p0 == -1) {
            return -1;
        }
        return 1;
    }

    /* renamed from: a */
    public String mo24376a(Format format) {
        String str;
        int i = m28829i(format);
        if (i == 2) {
            str = m28821a(m28828h(format), m28827g(format), m28823c(format));
        } else if (i == 1) {
            str = m28821a(m28825e(format), m28822b(format), m28823c(format));
        } else {
            str = m28825e(format);
        }
        return str.length() == 0 ? this.f21776a.getString(C9415m.exo_track_unknown) : str;
    }

    /* renamed from: a */
    private String m28821a(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f21776a.getString(C9415m.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
