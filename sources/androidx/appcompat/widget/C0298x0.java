package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import p096e.p097a.C3861d;
import p096e.p097a.C3863f;
import p096e.p097a.C3864g;
import p096e.p097a.C3866i;

/* renamed from: androidx.appcompat.widget.x0 */
/* compiled from: TooltipPopup */
class C0298x0 {

    /* renamed from: a */
    private final Context f1314a;

    /* renamed from: b */
    private final View f1315b;

    /* renamed from: c */
    private final TextView f1316c;

    /* renamed from: d */
    private final LayoutParams f1317d = new LayoutParams();

    /* renamed from: e */
    private final Rect f1318e = new Rect();

    /* renamed from: f */
    private final int[] f1319f = new int[2];

    /* renamed from: g */
    private final int[] f1320g = new int[2];

    C0298x0(Context context) {
        this.f1314a = context;
        this.f1315b = LayoutInflater.from(this.f1314a).inflate(C3864g.abc_tooltip, null);
        this.f1316c = (TextView) this.f1315b.findViewById(C3863f.message);
        this.f1317d.setTitle(C0298x0.class.getSimpleName());
        this.f1317d.packageName = this.f1314a.getPackageName();
        LayoutParams layoutParams = this.f1317d;
        layoutParams.type = CloseCodes.PROTOCOL_ERROR;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C3866i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2022a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2023b()) {
            mo2021a();
        }
        this.f1316c.setText(charSequence);
        m1618a(view, i, i2, z, this.f1317d);
        ((WindowManager) this.f1314a.getSystemService("window")).addView(this.f1315b, this.f1317d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2023b() {
        return this.f1315b.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2021a() {
        if (mo2023b()) {
            ((WindowManager) this.f1314a.getSystemService("window")).removeView(this.f1315b);
        }
    }

    /* renamed from: a */
    private void m1618a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1314a.getResources().getDimensionPixelOffset(C3861d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1314a.getResources().getDimensionPixelOffset(C3861d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1314a.getResources().getDimensionPixelOffset(z ? C3861d.tooltip_y_offset_touch : C3861d.tooltip_y_offset_non_touch);
        View a = m1617a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1318e);
        Rect rect = this.f1318e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1314a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1318e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1320g);
        view.getLocationOnScreen(this.f1319f);
        int[] iArr = this.f1319f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1320g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f1315b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1315b.getMeasuredHeight();
        int[] iArr3 = this.f1319f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1318e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: a */
    private static View m1617a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
