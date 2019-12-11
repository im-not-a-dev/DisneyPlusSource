package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s0 */
/* compiled from: TintResources */
class C0271s0 extends C0250k0 {

    /* renamed from: b */
    private final WeakReference<Context> f1210b;

    public C0271s0(Context context, Resources resources) {
        super(resources);
        this.f1210b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1210b.get();
        if (!(drawable == null || context == null)) {
            C0242j0.m1346a().mo1697a(context, i, drawable);
        }
        return drawable;
    }
}
