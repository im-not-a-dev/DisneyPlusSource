package p602m.p603a.p604a.p605a;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: m.a.a.a.e */
/* compiled from: HelpFormatter */
public class C13435e {

    /* renamed from: a */
    public int f29927a = 74;

    /* renamed from: b */
    public int f29928b = 1;

    /* renamed from: c */
    public int f29929c = 3;

    /* renamed from: d */
    public String f29930d = System.getProperty("line.separator");

    /* renamed from: e */
    public String f29931e = "-";

    /* renamed from: f */
    public String f29932f = "--";

    /* renamed from: g */
    protected Comparator f29933g = new C13437b();

    /* renamed from: m.a.a.a.e$b */
    /* compiled from: HelpFormatter */
    private static class C13437b implements Comparator {
        private C13437b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C13440h) obj).mo34666d().compareToIgnoreCase(((C13440h) obj2).mo34666d());
        }
    }

    /* renamed from: a */
    public int mo34650a() {
        return this.f29929c;
    }

    /* renamed from: b */
    public int mo34657b() {
        return this.f29928b;
    }

    /* renamed from: c */
    public Comparator mo34658c() {
        return this.f29933g;
    }

    /* renamed from: d */
    public int mo34659d() {
        return this.f29927a;
    }

    /* renamed from: a */
    public void mo34656a(PrintWriter printWriter, int i, C13443k kVar, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        mo34655a(stringBuffer, i, kVar, i2, i3);
        printWriter.println(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public StringBuffer mo34655a(StringBuffer stringBuffer, int i, C13443k kVar, int i2, int i3) {
        String a = mo34652a(i2);
        String a2 = mo34652a(i3);
        ArrayList arrayList = new ArrayList();
        List<C13440h> b = kVar.mo34689b();
        Collections.sort(b, mo34658c());
        int i4 = 0;
        int i5 = 0;
        for (C13440h hVar : b) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (hVar.mo34669f() == null) {
                stringBuffer2.append(a);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("   ");
                stringBuffer3.append(this.f29932f);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(hVar.mo34667e());
            } else {
                stringBuffer2.append(a);
                stringBuffer2.append(this.f29931e);
                stringBuffer2.append(hVar.mo34669f());
                if (hVar.mo34676l()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.f29932f);
                    stringBuffer2.append(hVar.mo34667e());
                }
            }
            if (hVar.mo34673i()) {
                if (hVar.mo34674j()) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(hVar.mo34663b());
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i5) {
                i5 = stringBuffer2.length();
            }
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            C13440h hVar2 = (C13440h) it.next();
            int i6 = i4 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i4).toString());
            if (stringBuffer4.length() < i5) {
                stringBuffer4.append(mo34652a(i5 - stringBuffer4.length()));
            }
            stringBuffer4.append(a2);
            int i7 = i5 + i3;
            if (hVar2.mo34664c() != null) {
                stringBuffer4.append(hVar2.mo34664c());
            }
            mo34654a(stringBuffer, i, i7, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.f29930d);
            }
            i4 = i6;
        }
        return stringBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public StringBuffer mo34654a(StringBuffer stringBuffer, int i, int i2, String str) {
        int a = mo34651a(str, i, 0);
        if (a == -1) {
            stringBuffer.append(mo34653a(str));
            return stringBuffer;
        }
        stringBuffer.append(mo34653a(str.substring(0, a)));
        stringBuffer.append(this.f29930d);
        if (i2 >= i) {
            i2 = 1;
        }
        String a2 = mo34652a(i2);
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(a2);
            stringBuffer2.append(str.substring(a).trim());
            str = stringBuffer2.toString();
            a = mo34651a(str, i, 0);
            if (a == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            if (str.length() > i && a == i2 - 1) {
                a = i;
            }
            stringBuffer.append(mo34653a(str.substring(0, a)));
            stringBuffer.append(this.f29930d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo34651a(String str, int i, int i2) {
        int indexOf = str.indexOf(10, i2);
        if (indexOf == -1 || indexOf > i) {
            indexOf = str.indexOf(9, i2);
            if (indexOf == -1 || indexOf > i) {
                int i3 = i + i2;
                if (i3 >= str.length()) {
                    return -1;
                }
                int i4 = i3;
                while (i4 >= i2) {
                    char charAt = str.charAt(i4);
                    if (charAt == ' ' || charAt == 10 || charAt == 13) {
                        break;
                    }
                    i4--;
                }
                if (i4 > i2) {
                    return i4;
                }
                while (i3 <= str.length()) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 == ' ' || charAt2 == 10 || charAt2 == 13) {
                        break;
                    }
                    i3++;
                }
                if (i3 == str.length()) {
                    i3 = -1;
                }
                return i3;
            }
        }
        return indexOf + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo34652a(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo34653a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
