package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.C0148n.C0149a;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.view.menu.m */
/* compiled from: MenuPopupHelper */
public class C0146m implements C0136i {

    /* renamed from: a */
    private final Context f644a;

    /* renamed from: b */
    private final C0132g f645b;

    /* renamed from: c */
    private final boolean f646c;

    /* renamed from: d */
    private final int f647d;

    /* renamed from: e */
    private final int f648e;

    /* renamed from: f */
    private View f649f;

    /* renamed from: g */
    private int f650g;

    /* renamed from: h */
    private boolean f651h;

    /* renamed from: i */
    private C0149a f652i;

    /* renamed from: j */
    private C0145l f653j;

    /* renamed from: k */
    private OnDismissListener f654k;

    /* renamed from: l */
    private final OnDismissListener f655l;

    /* renamed from: androidx.appcompat.view.menu.m$a */
    /* compiled from: MenuPopupHelper */
    class C0147a implements OnDismissListener {
        C0147a() {
        }

        public void onDismiss() {
            C0146m.this.mo983d();
        }
    }

    public C0146m(Context context, C0132g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.r]
      assigns: [androidx.appcompat.view.menu.r, androidx.appcompat.view.menu.d]
      uses: [androidx.appcompat.view.menu.r, androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.d]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0145l m902g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f644a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f644a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p096e.p097a.C3861d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f644a
            android.view.View r3 = r14.f649f
            int r4 = r14.f647d
            int r5 = r14.f648e
            boolean r6 = r14.f646c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.r r0 = new androidx.appcompat.view.menu.r
            android.content.Context r8 = r14.f644a
            androidx.appcompat.view.menu.g r9 = r14.f645b
            android.view.View r10 = r14.f649f
            int r11 = r14.f647d
            int r12 = r14.f648e
            boolean r13 = r14.f646c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f645b
            r0.mo729a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f655l
            r0.mo728a(r1)
            android.view.View r1 = r14.f649f
            r0.mo727a(r1)
            androidx.appcompat.view.menu.n$a r1 = r14.f652i
            r0.mo712a(r1)
            boolean r1 = r14.f651h
            r0.mo732b(r1)
            int r1 = r14.f650g
            r0.mo726a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0146m.m902g():androidx.appcompat.view.menu.l");
    }

    /* renamed from: a */
    public void mo977a(OnDismissListener onDismissListener) {
        this.f654k = onDismissListener;
    }

    /* renamed from: b */
    public C0145l mo981b() {
        if (this.f653j == null) {
            this.f653j = m902g();
        }
        return this.f653j;
    }

    /* renamed from: c */
    public boolean mo982c() {
        C0145l lVar = this.f653j;
        return lVar != null && lVar.mo733b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo983d() {
        this.f653j = null;
        OnDismissListener onDismissListener = this.f654k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo984e() {
        if (!mo985f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo985f() {
        if (mo982c()) {
            return true;
        }
        if (this.f649f == null) {
            return false;
        }
        m901a(0, 0, false, false);
        return true;
    }

    public C0146m(Context context, C0132g gVar, View view, boolean z, int i, int i2) {
        this.f650g = 8388611;
        this.f655l = new C0147a();
        this.f644a = context;
        this.f645b = gVar;
        this.f649f = view;
        this.f646c = z;
        this.f647d = i;
        this.f648e = i2;
    }

    /* renamed from: a */
    public void mo976a(View view) {
        this.f649f = view;
    }

    /* renamed from: a */
    public void mo979a(boolean z) {
        this.f651h = z;
        C0145l lVar = this.f653j;
        if (lVar != null) {
            lVar.mo732b(z);
        }
    }

    /* renamed from: a */
    public void mo975a(int i) {
        this.f650g = i;
    }

    /* renamed from: a */
    public boolean mo980a(int i, int i2) {
        if (mo982c()) {
            return true;
        }
        if (this.f649f == null) {
            return false;
        }
        m901a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m901a(int i, int i2, boolean z, boolean z2) {
        C0145l b = mo981b();
        b.mo735c(z2);
        if (z) {
            if ((C4139e.m14173a(this.f650g, C4187x.m14399n(this.f649f)) & 7) == 5) {
                i -= this.f649f.getWidth();
            }
            b.mo731b(i);
            b.mo734c(i2);
            int i3 = (int) ((this.f644a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo971a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo737d();
    }

    /* renamed from: a */
    public void mo974a() {
        if (mo982c()) {
            this.f653j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo978a(C0149a aVar) {
        this.f652i = aVar;
        C0145l lVar = this.f653j;
        if (lVar != null) {
            lVar.mo712a(aVar);
        }
    }
}
