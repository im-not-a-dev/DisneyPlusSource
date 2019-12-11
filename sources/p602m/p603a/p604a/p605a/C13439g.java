package p602m.p603a.p604a.p605a;

import java.util.Iterator;
import java.util.List;

/* renamed from: m.a.a.a.g */
/* compiled from: MissingOptionException */
public class C13439g extends C13444l {
    public C13439g(String str) {
        super(str);
    }

    /* renamed from: a */
    private static String m41319a(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public C13439g(List list) {
        this(m41319a(list));
    }
}
