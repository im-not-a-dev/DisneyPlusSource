package p602m.p603a.p604a.p605a;

import java.util.ArrayList;

/* renamed from: m.a.a.a.d */
/* compiled from: GnuParser */
public class C13434d extends C13445m {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo34649b(C13443k kVar, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            String str2 = "--";
            if (str2.equals(str)) {
                arrayList.add(str2);
                z2 = true;
            } else {
                String str3 = "-";
                if (str3.equals(str)) {
                    arrayList.add(str3);
                } else if (str.startsWith(str3)) {
                    String b = C13447o.m41363b(str);
                    if (kVar.mo34691b(b)) {
                        arrayList.add(str);
                    } else if (b.indexOf(61) != -1 && kVar.mo34691b(b.substring(0, b.indexOf(61)))) {
                        arrayList.add(str.substring(0, str.indexOf(61)));
                        arrayList.add(str.substring(str.indexOf(61) + 1));
                    } else if (kVar.mo34691b(str.substring(0, 2))) {
                        arrayList.add(str.substring(0, 2));
                        arrayList.add(str.substring(2));
                    } else {
                        arrayList.add(str);
                        z2 = z;
                    }
                } else {
                    arrayList.add(str);
                }
            }
            if (z2) {
                while (true) {
                    i++;
                    if (i >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i]);
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
