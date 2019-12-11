package p096e.p138i.p139a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.i.a.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C4203c extends C4198a {

    /* renamed from: b0 */
    private int f10511b0;

    /* renamed from: c0 */
    private int f10512c0;

    /* renamed from: d0 */
    private LayoutInflater f10513d0;

    @Deprecated
    public C4203c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f10512c0 = i;
        this.f10511b0 = i;
        this.f10513d0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo14842a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10513d0.inflate(this.f10512c0, viewGroup, false);
    }

    /* renamed from: b */
    public View mo1808b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10513d0.inflate(this.f10511b0, viewGroup, false);
    }
}
