package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.C0148n.C0149a;
import p096e.p121h.p135s.C4135d0;

/* renamed from: androidx.appcompat.widget.a0 */
/* compiled from: DecorToolbar */
public interface C0201a0 {
    /* renamed from: a */
    C4135d0 mo1484a(int i, long j);

    /* renamed from: a */
    void mo1485a(int i);

    /* renamed from: a */
    void mo1486a(Menu menu, C0149a aVar);

    /* renamed from: a */
    void mo1487a(C0254m0 m0Var);

    /* renamed from: a */
    void mo1488a(boolean z);

    /* renamed from: a */
    boolean mo1489a();

    /* renamed from: b */
    Context mo1490b();

    /* renamed from: b */
    void mo1491b(int i);

    /* renamed from: b */
    void mo1492b(boolean z);

    /* renamed from: c */
    void mo1493c();

    /* renamed from: c */
    void mo1494c(int i);

    void collapseActionView();

    /* renamed from: d */
    boolean mo1496d();

    /* renamed from: e */
    boolean mo1497e();

    /* renamed from: f */
    boolean mo1498f();

    /* renamed from: g */
    boolean mo1499g();

    CharSequence getTitle();

    /* renamed from: h */
    void mo1501h();

    /* renamed from: i */
    boolean mo1502i();

    /* renamed from: j */
    int mo1503j();

    /* renamed from: k */
    ViewGroup mo1504k();

    /* renamed from: l */
    int mo1505l();

    /* renamed from: m */
    void mo1506m();

    /* renamed from: n */
    void mo1507n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
