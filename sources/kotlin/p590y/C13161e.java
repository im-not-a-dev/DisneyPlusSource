package kotlin.p590y;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.p589f0.C12876e;

/* renamed from: kotlin.y.e */
/* compiled from: AbstractMutableList.kt */
public abstract class C13161e<E> extends AbstractList<E> implements List<E>, C12876e {
    protected C13161e() {
    }

    /* renamed from: b */
    public abstract int mo34237b();

    /* renamed from: f */
    public abstract E mo34238f(int i);

    public final /* bridge */ E remove(int i) {
        return mo34238f(i);
    }

    public final /* bridge */ int size() {
        return mo34237b();
    }
}
