package p096e.p121h.p130o;

import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: e.h.o.b */
/* compiled from: LocaleListCompat */
public final class C4065b {

    /* renamed from: a */
    private C4067d f10269a;

    static {
        m13971a(new Locale[0]);
    }

    private C4065b(C4067d dVar) {
        this.f10269a = dVar;
    }

    /* renamed from: a */
    public static C4065b m13970a(LocaleList localeList) {
        return new C4065b(new C4068e(localeList));
    }

    /* renamed from: b */
    public static C4065b m13973b() {
        if (VERSION.SDK_INT >= 24) {
            return m13970a(LocaleList.getDefault());
        }
        return m13971a(Locale.getDefault());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4065b) && this.f10269a.equals(((C4065b) obj).f10269a);
    }

    public int hashCode() {
        return this.f10269a.hashCode();
    }

    public String toString() {
        return this.f10269a.toString();
    }

    /* renamed from: a */
    public static C4065b m13971a(Locale... localeArr) {
        if (VERSION.SDK_INT >= 24) {
            return m13970a(new LocaleList(localeArr));
        }
        return new C4065b(new C4066c(localeArr));
    }

    /* renamed from: a */
    public String mo14582a() {
        return this.f10269a.mo14586a();
    }

    /* renamed from: a */
    static Locale m13972a(String str) {
        String str2 = "-";
        if (str.contains(str2)) {
            String[] split = str.split(str2, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            String str3 = "_";
            if (!str.contains(str3)) {
                return new Locale(str);
            }
            String[] split2 = str.split(str3, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
}
