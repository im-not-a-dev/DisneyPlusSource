package p096e.p155q.p156a.p157a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: e.q.a.a.h */
/* compiled from: TvContractCompat */
public final class C4352h {

    /* renamed from: a */
    private static final HashSet<String> f10805a = new HashSet<>();

    /* renamed from: b */
    private static final String[] f10806b = new String[0];

    static {
        f10805a.add("FAMILY_KIDS");
        f10805a.add("SPORTS");
        f10805a.add("SHOPPING");
        f10805a.add("MOVIES");
        f10805a.add("COMEDY");
        f10805a.add("TRAVEL");
        f10805a.add("DRAMA");
        f10805a.add("EDUCATION");
        f10805a.add("ANIMAL_WILDLIFE");
        f10805a.add("NEWS");
        f10805a.add("GAMING");
        f10805a.add("ARTS");
        f10805a.add("ENTERTAINMENT");
        f10805a.add("LIFE_STYLE");
        f10805a.add("MUSIC");
        f10805a.add("PREMIER");
        f10805a.add("TECH_SCIENCE");
    }

    /* renamed from: a */
    public static String m15013a(String... strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        String str = "";
        while (i < length) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(m15015b(str2));
            i++;
            str = ",";
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m15015b(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append('\"');
            } else if (charAt == ',') {
                sb.append('\"');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m15014a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f10806b;
        }
        if (str.indexOf(44) == -1 && str.indexOf(34) == -1) {
            return new String[]{str.trim()};
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = sb;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\"') {
                if (charAt == ',' && !z) {
                    String trim = sb2.toString().trim();
                    if (trim.length() > 0) {
                        arrayList.add(trim);
                    }
                    sb2 = new StringBuilder();
                }
            } else if (!z) {
                z = true;
            }
            sb2.append(charAt);
            z = false;
        }
        String trim2 = sb2.toString().trim();
        if (trim2.length() > 0) {
            arrayList.add(trim2);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
