package p096e.p121h.p130o;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: e.h.o.c */
/* compiled from: LocaleListCompatWrapper */
final class C4066c implements C4067d {

    /* renamed from: c */
    private static final Locale[] f10270c = new Locale[0];

    /* renamed from: a */
    private final Locale[] f10271a;

    /* renamed from: b */
    private final String f10272b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C4065b.m13972a("en-Latn");
    }

    C4066c(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f10271a = f10270c;
            this.f10272b = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            String str = "list[";
            if (locale == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                m13975a(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i);
                sb3.append("] is a repetition");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        this.f10271a = localeArr2;
        this.f10272b = sb.toString();
    }

    /* renamed from: a */
    public String mo14586a() {
        return this.f10272b;
    }

    /* renamed from: b */
    public Object mo14587b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4066c)) {
            return false;
        }
        Locale[] localeArr = ((C4066c) obj).f10271a;
        if (this.f10271a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f10271a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f10271a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f10271a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f10271a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    static void m13975a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
}
