package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* compiled from: PagerAdapter */
public abstract class C1008a {

    /* renamed from: a */
    private final DataSetObservable f3989a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo5565a();

    /* renamed from: a */
    public int mo5566a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public CharSequence mo5567a(int i) {
        return null;
    }

    /* renamed from: a */
    public abstract Object mo3294a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo5568a(DataSetObserver dataSetObserver) {
        this.f3989a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public abstract void mo3295a(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: a */
    public abstract void mo3296a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo3297a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo3298a(View view, Object obj);

    /* renamed from: b */
    public float mo5569b(int i) {
        return 1.0f;
    }

    /* renamed from: b */
    public abstract Parcelable mo3299b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5570b(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    /* renamed from: b */
    public abstract void mo3300b(ViewGroup viewGroup);

    /* renamed from: b */
    public abstract void mo3301b(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: c */
    public void mo5571c(DataSetObserver dataSetObserver) {
        this.f3989a.unregisterObserver(dataSetObserver);
    }
}
