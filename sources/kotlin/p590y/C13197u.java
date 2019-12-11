package kotlin.p590y;

import java.util.List;
import kotlin.p586h0.C12757d;

/* renamed from: kotlin.y.u */
/* compiled from: ReversedViews.kt */
class C13197u extends C13196t {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m40551c(List<?> list, int i) {
        int a = C13185o.m40507a(list);
        if (i >= 0 && a >= i) {
            return C13185o.m40507a(list) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C12757d(0, C13185o.m40507a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m40552d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C12757d(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: d */
    public static <T> List<T> m40553d(List<T> list) {
        return new C13179l0(list);
    }
}
