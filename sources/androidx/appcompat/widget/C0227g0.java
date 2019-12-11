package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.C0153q;
import androidx.core.widget.C0512h;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.Method;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.g0 */
/* compiled from: ListPopupWindow */
public class C0227g0 implements C0153q {

    /* renamed from: A0 */
    private static Method f1054A0;

    /* renamed from: y0 */
    private static Method f1055y0;

    /* renamed from: z0 */
    private static Method f1056z0;

    /* renamed from: U */
    private ListAdapter f1057U;

    /* renamed from: V */
    C0213c0 f1058V;

    /* renamed from: W */
    private int f1059W;

    /* renamed from: X */
    private int f1060X;

    /* renamed from: Y */
    private int f1061Y;

    /* renamed from: Z */
    private int f1062Z;

    /* renamed from: a0 */
    private int f1063a0;

    /* renamed from: b0 */
    private boolean f1064b0;

    /* renamed from: c */
    private Context f1065c;

    /* renamed from: c0 */
    private boolean f1066c0;

    /* renamed from: d0 */
    private boolean f1067d0;

    /* renamed from: e0 */
    private int f1068e0;

    /* renamed from: f0 */
    private boolean f1069f0;

    /* renamed from: g0 */
    private boolean f1070g0;

    /* renamed from: h0 */
    int f1071h0;

    /* renamed from: i0 */
    private View f1072i0;

    /* renamed from: j0 */
    private int f1073j0;

    /* renamed from: k0 */
    private DataSetObserver f1074k0;

    /* renamed from: l0 */
    private View f1075l0;

    /* renamed from: m0 */
    private Drawable f1076m0;

    /* renamed from: n0 */
    private OnItemClickListener f1077n0;

    /* renamed from: o0 */
    private OnItemSelectedListener f1078o0;

    /* renamed from: p0 */
    final C0234g f1079p0;

    /* renamed from: q0 */
    private final C0233f f1080q0;

    /* renamed from: r0 */
    private final C0232e f1081r0;

    /* renamed from: s0 */
    private final C0230c f1082s0;

    /* renamed from: t0 */
    final Handler f1083t0;

    /* renamed from: u0 */
    private final Rect f1084u0;

    /* renamed from: v0 */
    private Rect f1085v0;

    /* renamed from: w0 */
    private boolean f1086w0;

    /* renamed from: x0 */
    PopupWindow f1087x0;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* compiled from: ListPopupWindow */
    class C0228a implements Runnable {
        C0228a() {
        }

        public void run() {
            View i = C0227g0.this.mo1651i();
            if (i != null && i.getWindowToken() != null) {
                C0227g0.this.mo737d();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$b */
    /* compiled from: ListPopupWindow */
    class C0229b implements OnItemSelectedListener {
        C0229b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                C0213c0 c0Var = C0227g0.this.f1058V;
                if (c0Var != null) {
                    c0Var.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$c */
    /* compiled from: ListPopupWindow */
    private class C0230c implements Runnable {
        C0230c() {
        }

        public void run() {
            C0227g0.this.mo1649h();
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$d */
    /* compiled from: ListPopupWindow */
    private class C0231d extends DataSetObserver {
        C0231d() {
        }

        public void onChanged() {
            if (C0227g0.this.mo733b()) {
                C0227g0.this.mo737d();
            }
        }

        public void onInvalidated() {
            C0227g0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$e */
    /* compiled from: ListPopupWindow */
    private class C0232e implements OnScrollListener {
        C0232e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0227g0.this.mo1655k() && C0227g0.this.f1087x0.getContentView() != null) {
                C0227g0 g0Var = C0227g0.this;
                g0Var.f1083t0.removeCallbacks(g0Var.f1079p0);
                C0227g0.this.f1079p0.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$f */
    /* compiled from: ListPopupWindow */
    private class C0233f implements OnTouchListener {
        C0233f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = C0227g0.this.f1087x0;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < C0227g0.this.f1087x0.getWidth() && y >= 0 && y < C0227g0.this.f1087x0.getHeight()) {
                    C0227g0 g0Var = C0227g0.this;
                    g0Var.f1083t0.postDelayed(g0Var.f1079p0, 250);
                    return false;
                }
            }
            if (action == 1) {
                C0227g0 g0Var2 = C0227g0.this;
                g0Var2.f1083t0.removeCallbacks(g0Var2.f1079p0);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$g */
    /* compiled from: ListPopupWindow */
    private class C0234g implements Runnable {
        C0234g() {
        }

        public void run() {
            C0213c0 c0Var = C0227g0.this.f1058V;
            if (c0Var != null && C4187x.m14339D(c0Var) && C0227g0.this.f1058V.getCount() > C0227g0.this.f1058V.getChildCount()) {
                int childCount = C0227g0.this.f1058V.getChildCount();
                C0227g0 g0Var = C0227g0.this;
                if (childCount <= g0Var.f1071h0) {
                    g0Var.f1087x0.setInputMethodMode(2);
                    C0227g0.this.mo737d();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        if (VERSION.SDK_INT <= 28) {
            try {
                f1055y0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1054A0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                f1056z0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0227g0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: c */
    private void mo1688c(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1055y0;
            if (method != null) {
                try {
                    method.invoke(this.f1087x0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1087x0.setIsClippedToScreen(z);
        }
    }

    /* renamed from: m */
    private int mo1896m() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        boolean z = true;
        if (this.f1058V == null) {
            Context context = this.f1065c;
            new C0228a();
            this.f1058V = mo1632a(context, !this.f1086w0);
            Drawable drawable = this.f1076m0;
            if (drawable != null) {
                this.f1058V.setSelector(drawable);
            }
            this.f1058V.setAdapter(this.f1057U);
            this.f1058V.setOnItemClickListener(this.f1077n0);
            this.f1058V.setFocusable(true);
            this.f1058V.setFocusableInTouchMode(true);
            this.f1058V.setOnItemSelectedListener(new C0229b());
            this.f1058V.setOnScrollListener(this.f1081r0);
            OnItemSelectedListener onItemSelectedListener = this.f1078o0;
            if (onItemSelectedListener != null) {
                this.f1058V.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.f1058V;
            View view3 = this.f1072i0;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                int i4 = this.f1073j0;
                if (i4 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i4 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f1073j0);
                    Log.e("ListPopupWindow", sb.toString());
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i5 = this.f1060X;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f1087x0.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1087x0.getContentView();
            View view4 = this.f1072i0;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1087x0.getBackground();
        if (background != null) {
            background.getPadding(this.f1084u0);
            Rect rect = this.f1084u0;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1064b0) {
                this.f1062Z = -i6;
            }
        } else {
            this.f1084u0.setEmpty();
            i2 = 0;
        }
        if (this.f1087x0.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m1277a(mo1651i(), this.f1062Z, z);
        if (this.f1069f0 || this.f1059W == -1) {
            return a + i2;
        }
        int i7 = this.f1060X;
        if (i7 == -2) {
            int i8 = this.f1065c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1084u0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f1065c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1084u0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int a2 = this.f1058V.mo1535a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f1058V.getPaddingTop() + this.f1058V.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: n */
    private void mo1897n() {
        View view = this.f1072i0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1072i0);
            }
        }
    }

    /* renamed from: a */
    public void mo1638a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1074k0;
        if (dataSetObserver == null) {
            this.f1074k0 = new C0231d();
        } else {
            ListAdapter listAdapter2 = this.f1057U;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1057U = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1074k0);
        }
        C0213c0 c0Var = this.f1058V;
        if (c0Var != null) {
            c0Var.setAdapter(this.f1057U);
        }
    }

    /* renamed from: b */
    public void mo1641b(int i) {
        this.f1062Z = i;
        this.f1064b0 = true;
    }

    /* renamed from: d */
    public void mo1643d(int i) {
        this.f1087x0.setAnimationStyle(i);
    }

    public void dismiss() {
        this.f1087x0.dismiss();
        mo1897n();
        this.f1087x0.setContentView(null);
        this.f1058V = null;
        this.f1083t0.removeCallbacks(this.f1079p0);
    }

    /* renamed from: e */
    public Drawable mo1644e() {
        return this.f1087x0.getBackground();
    }

    /* renamed from: f */
    public void mo1646f(int i) {
        this.f1068e0 = i;
    }

    /* renamed from: g */
    public int mo1647g() {
        if (!this.f1064b0) {
            return 0;
        }
        return this.f1062Z;
    }

    /* renamed from: h */
    public void mo1650h(int i) {
        this.f1073j0 = i;
    }

    /* renamed from: i */
    public View mo1651i() {
        return this.f1075l0;
    }

    /* renamed from: j */
    public int mo1653j() {
        return this.f1060X;
    }

    /* renamed from: k */
    public boolean mo1655k() {
        return this.f1087x0.getInputMethodMode() == 2;
    }

    /* renamed from: l */
    public boolean mo1656l() {
        return this.f1086w0;
    }

    public C0227g0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1059W = -2;
        this.f1060X = -2;
        this.f1063a0 = CloseCodes.PROTOCOL_ERROR;
        this.f1068e0 = 0;
        this.f1069f0 = false;
        this.f1070g0 = false;
        this.f1071h0 = Integer.MAX_VALUE;
        this.f1073j0 = 0;
        this.f1079p0 = new C0234g();
        this.f1080q0 = new C0233f();
        this.f1081r0 = new C0232e();
        this.f1082s0 = new C0230c();
        this.f1084u0 = new Rect();
        this.f1065c = context;
        this.f1083t0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ListPopupWindow, i, i2);
        this.f1061Y = obtainStyledAttributes.getDimensionPixelOffset(C3867j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1062Z = obtainStyledAttributes.getDimensionPixelOffset(C3867j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1062Z != 0) {
            this.f1064b0 = true;
        }
        obtainStyledAttributes.recycle();
        this.f1087x0 = new C0259n(context, attributeSet, i, i2);
        this.f1087x0.setInputMethodMode(1);
    }

    /* renamed from: d */
    public void mo737d() {
        int m = mo1896m();
        boolean k = mo1655k();
        C0512h.m2759a(this.f1087x0, this.f1063a0);
        boolean z = true;
        if (!this.f1087x0.isShowing()) {
            int i = this.f1060X;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1651i().getWidth();
            }
            int i2 = this.f1059W;
            if (i2 == -1) {
                m = -1;
            } else if (i2 != -2) {
                m = i2;
            }
            this.f1087x0.setWidth(i);
            this.f1087x0.setHeight(m);
            mo1688c(true);
            this.f1087x0.setOutsideTouchable(!this.f1070g0 && !this.f1069f0);
            this.f1087x0.setTouchInterceptor(this.f1080q0);
            if (this.f1067d0) {
                C0512h.m2761a(this.f1087x0, this.f1066c0);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method = f1054A0;
                if (method != null) {
                    try {
                        method.invoke(this.f1087x0, new Object[]{this.f1085v0});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1087x0.setEpicenterBounds(this.f1085v0);
            }
            C0512h.m2760a(this.f1087x0, mo1651i(), this.f1061Y, this.f1062Z, this.f1068e0);
            this.f1058V.setSelection(-1);
            if (!this.f1086w0 || this.f1058V.isInTouchMode()) {
                mo1649h();
            }
            if (!this.f1086w0) {
                this.f1083t0.post(this.f1082s0);
            }
        } else if (C4187x.m14339D(mo1651i())) {
            int i3 = this.f1060X;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1651i().getWidth();
            }
            int i4 = this.f1059W;
            if (i4 == -1) {
                if (!k) {
                    m = -1;
                }
                if (k) {
                    this.f1087x0.setWidth(this.f1060X == -1 ? -1 : 0);
                    this.f1087x0.setHeight(0);
                } else {
                    this.f1087x0.setWidth(this.f1060X == -1 ? -1 : 0);
                    this.f1087x0.setHeight(-1);
                }
            } else if (i4 != -2) {
                m = i4;
            }
            PopupWindow popupWindow = this.f1087x0;
            if (this.f1070g0 || this.f1069f0) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1087x0.update(mo1651i(), this.f1061Y, this.f1062Z, i3 < 0 ? -1 : i3, m < 0 ? -1 : m);
        }
    }

    /* renamed from: e */
    public void mo1645e(int i) {
        Drawable background = this.f1087x0.getBackground();
        if (background != null) {
            background.getPadding(this.f1084u0);
            Rect rect = this.f1084u0;
            this.f1060X = rect.left + rect.right + i;
            return;
        }
        mo1654j(i);
    }

    /* renamed from: f */
    public ListView mo739f() {
        return this.f1058V;
    }

    /* renamed from: h */
    public void mo1649h() {
        C0213c0 c0Var = this.f1058V;
        if (c0Var != null) {
            c0Var.setListSelectionHidden(true);
            c0Var.requestLayout();
        }
    }

    /* renamed from: i */
    public void mo1652i(int i) {
        C0213c0 c0Var = this.f1058V;
        if (mo733b() && c0Var != null) {
            c0Var.setListSelectionHidden(false);
            c0Var.setSelection(i);
            if (c0Var.getChoiceMode() != 0) {
                c0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public void mo1654j(int i) {
        this.f1060X = i;
    }

    /* renamed from: b */
    public boolean mo733b() {
        return this.f1087x0.isShowing();
    }

    /* renamed from: g */
    public void mo1648g(int i) {
        this.f1087x0.setInputMethodMode(i);
    }

    /* renamed from: b */
    public void mo1642b(boolean z) {
        this.f1067d0 = true;
        this.f1066c0 = z;
    }

    /* renamed from: a */
    public void mo1640a(boolean z) {
        this.f1086w0 = z;
        this.f1087x0.setFocusable(z);
    }

    /* renamed from: a */
    public void mo1635a(Drawable drawable) {
        this.f1087x0.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1636a(View view) {
        this.f1075l0 = view;
    }

    /* renamed from: a */
    public int mo1631a() {
        return this.f1061Y;
    }

    /* renamed from: a */
    public void mo1633a(int i) {
        this.f1061Y = i;
    }

    /* renamed from: a */
    public void mo1634a(Rect rect) {
        this.f1085v0 = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo1637a(OnItemClickListener onItemClickListener) {
        this.f1077n0 = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1639a(OnDismissListener onDismissListener) {
        this.f1087x0.setOnDismissListener(onDismissListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0213c0 mo1632a(Context context, boolean z) {
        return new C0213c0(context, z);
    }

    /* renamed from: a */
    private int m1277a(View view, int i, boolean z) {
        if (VERSION.SDK_INT > 23) {
            return this.f1087x0.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1056z0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1087x0, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1087x0.getMaxAvailableHeight(view, i);
    }
}
