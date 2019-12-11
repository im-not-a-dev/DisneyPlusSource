package kotlin.p590y;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: kotlin.y.s */
/* compiled from: MutableCollectionsJVM.kt */
class C13194s extends C13191r {
    /* renamed from: a */
    public static <T> void m40541a(List<T> list, Comparator<? super T> comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static <T extends Comparable<? super T>> void m40542c(List<T> list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
