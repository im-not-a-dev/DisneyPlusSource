package p096e.p121h.p130o;

import android.os.LocaleList;

/* renamed from: e.h.o.e */
/* compiled from: LocaleListPlatformWrapper */
final class C4068e implements C4067d {

    /* renamed from: a */
    private final LocaleList f10273a;

    C4068e(LocaleList localeList) {
        this.f10273a = localeList;
    }

    /* renamed from: a */
    public String mo14586a() {
        return this.f10273a.toLanguageTags();
    }

    /* renamed from: b */
    public Object mo14587b() {
        return this.f10273a;
    }

    public boolean equals(Object obj) {
        return this.f10273a.equals(((C4067d) obj).mo14587b());
    }

    public int hashCode() {
        return this.f10273a.hashCode();
    }

    public String toString() {
        return this.f10273a.toString();
    }
}
