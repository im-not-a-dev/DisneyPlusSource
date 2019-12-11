package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.widget.C0239i0;
import p096e.p097a.C3861d;
import p096e.p097a.C3864g;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.view.menu.r */
/* compiled from: StandardMenuPopup */
final class C0154r extends C0145l implements OnDismissListener, OnItemClickListener, C0148n, OnKeyListener {

    /* renamed from: o0 */
    private static final int f658o0 = C3864g.abc_popup_menu_item_layout;

    /* renamed from: U */
    private final Context f659U;

    /* renamed from: V */
    private final C0132g f660V;

    /* renamed from: W */
    private final C0131f f661W;

    /* renamed from: X */
    private final boolean f662X;

    /* renamed from: Y */
    private final int f663Y;

    /* renamed from: Z */
    private final int f664Z;

    /* renamed from: a0 */
    private final int f665a0;

    /* renamed from: b0 */
    final C0239i0 f666b0;

    /* renamed from: c0 */
    final OnGlobalLayoutListener f667c0 = new C0155a();

    /* renamed from: d0 */
    private final OnAttachStateChangeListener f668d0 = new C0156b();

    /* renamed from: e0 */
    private OnDismissListener f669e0;

    /* renamed from: f0 */
    private View f670f0;

    /* renamed from: g0 */
    View f671g0;

    /* renamed from: h0 */
    private C0149a f672h0;

    /* renamed from: i0 */
    ViewTreeObserver f673i0;

    /* renamed from: j0 */
    private boolean f674j0;

    /* renamed from: k0 */
    private boolean f675k0;

    /* renamed from: l0 */
    private int f676l0;

    /* renamed from: m0 */
    private int f677m0 = 0;

    /* renamed from: n0 */
    private boolean f678n0;

    /* renamed from: androidx.appcompat.view.menu.r$a */
    /* compiled from: StandardMenuPopup */
    class C0155a implements OnGlobalLayoutListener {
        C0155a() {
        }

        public void onGlobalLayout() {
            if (C0154r.this.mo733b() && !C0154r.this.f666b0.mo1656l()) {
                View view = C0154r.this.f671g0;
                if (view == null || !view.isShown()) {
                    C0154r.this.dismiss();
                } else {
                    C0154r.this.f666b0.mo737d();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.r$b */
    /* compiled from: StandardMenuPopup */
    class C0156b implements OnAttachStateChangeListener {
        C0156b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0154r.this.f673i0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0154r.this.f673i0 = view.getViewTreeObserver();
                }
                C0154r rVar = C0154r.this;
                rVar.f673i0.removeGlobalOnLayoutListener(rVar.f667c0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0154r(Context context, C0132g gVar, View view, int i, int i2, boolean z) {
        this.f659U = context;
        this.f660V = gVar;
        this.f662X = z;
        this.f661W = new C0131f(gVar, LayoutInflater.from(context), this.f662X, f658o0);
        this.f664Z = i;
        this.f665a0 = i2;
        Resources resources = context.getResources();
        this.f663Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3861d.abc_config_prefDialogWidth));
        this.f670f0 = view;
        this.f666b0 = new C0239i0(this.f659U, null, this.f664Z, this.f665a0);
        gVar.mo778a((C0148n) this, context);
    }

    /* renamed from: g */
    private boolean m931g() {
        if (mo733b()) {
            return true;
        }
        if (!this.f674j0) {
            View view = this.f670f0;
            if (view != null) {
                this.f671g0 = view;
                this.f666b0.mo1639a((OnDismissListener) this);
                this.f666b0.mo1637a((OnItemClickListener) this);
                this.f666b0.mo1640a(true);
                View view2 = this.f671g0;
                boolean z = this.f673i0 == null;
                this.f673i0 = view2.getViewTreeObserver();
                if (z) {
                    this.f673i0.addOnGlobalLayoutListener(this.f667c0);
                }
                view2.addOnAttachStateChangeListener(this.f668d0);
                this.f666b0.mo1636a(view2);
                this.f666b0.mo1646f(this.f677m0);
                if (!this.f675k0) {
                    this.f676l0 = C0145l.m884a(this.f661W, null, this.f659U, this.f663Y);
                    this.f675k0 = true;
                }
                this.f666b0.mo1645e(this.f676l0);
                this.f666b0.mo1648g(2);
                this.f666b0.mo1634a(mo972e());
                this.f666b0.mo737d();
                ListView f = this.f666b0.mo739f();
                f.setOnKeyListener(this);
                if (this.f678n0 && this.f660V.mo816h() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f659U).inflate(C3864g.abc_popup_menu_header_item_layout, f, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f660V.mo816h());
                    }
                    frameLayout.setEnabled(false);
                    f.addHeaderView(frameLayout, null, false);
                }
                this.f666b0.mo1638a((ListAdapter) this.f661W);
                this.f666b0.mo737d();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo726a(int i) {
        this.f677m0 = i;
    }

    /* renamed from: a */
    public void mo729a(C0132g gVar) {
    }

    /* renamed from: a */
    public boolean mo730a() {
        return false;
    }

    /* renamed from: b */
    public void mo732b(boolean z) {
        this.f661W.mo759a(z);
    }

    /* renamed from: c */
    public void mo734c(int i) {
        this.f666b0.mo1641b(i);
    }

    /* renamed from: d */
    public void mo737d() {
        if (!m931g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void dismiss() {
        if (mo733b()) {
            this.f666b0.dismiss();
        }
    }

    /* renamed from: f */
    public ListView mo739f() {
        return this.f666b0.mo739f();
    }

    public void onDismiss() {
        this.f674j0 = true;
        this.f660V.close();
        ViewTreeObserver viewTreeObserver = this.f673i0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f673i0 = this.f671g0.getViewTreeObserver();
            }
            this.f673i0.removeGlobalOnLayoutListener(this.f667c0);
            this.f673i0 = null;
        }
        this.f671g0.removeOnAttachStateChangeListener(this.f668d0);
        OnDismissListener onDismissListener = this.f669e0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: a */
    public void mo713a(boolean z) {
        this.f675k0 = false;
        C0131f fVar = this.f661W;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo733b() {
        return !this.f674j0 && this.f666b0.mo733b();
    }

    /* renamed from: c */
    public void mo735c(boolean z) {
        this.f678n0 = z;
    }

    /* renamed from: b */
    public void mo731b(int i) {
        this.f666b0.mo1633a(i);
    }

    /* renamed from: a */
    public void mo712a(C0149a aVar) {
        this.f672h0 = aVar;
    }

    /* renamed from: a */
    public boolean mo717a(C0157s sVar) {
        if (sVar.hasVisibleItems()) {
            C0146m mVar = new C0146m(this.f659U, sVar, this.f671g0, this.f662X, this.f664Z, this.f665a0);
            mVar.mo978a(this.f672h0);
            mVar.mo979a(C0145l.m886b((C0132g) sVar));
            mVar.mo977a(this.f669e0);
            this.f669e0 = null;
            this.f660V.mo780a(false);
            int a = this.f666b0.mo1631a();
            int g = this.f666b0.mo1647g();
            if ((Gravity.getAbsoluteGravity(this.f677m0, C4187x.m14399n(this.f670f0)) & 7) == 5) {
                a += this.f670f0.getWidth();
            }
            if (mVar.mo980a(a, g)) {
                C0149a aVar = this.f672h0;
                if (aVar != null) {
                    aVar.mo534a(sVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo710a(C0132g gVar, boolean z) {
        if (gVar == this.f660V) {
            dismiss();
            C0149a aVar = this.f672h0;
            if (aVar != null) {
                aVar.mo533a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo727a(View view) {
        this.f670f0 = view;
    }

    /* renamed from: a */
    public void mo728a(OnDismissListener onDismissListener) {
        this.f669e0 = onDismissListener;
    }
}
