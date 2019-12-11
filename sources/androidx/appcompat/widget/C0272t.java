package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0081c;
import androidx.appcompat.app.C0081c.C0082a;
import androidx.appcompat.view.menu.C0153q;
import p096e.p097a.C3858a;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p135s.C4186w;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.t */
/* compiled from: AppCompatSpinner */
public class C0272t extends Spinner implements C4186w {

    /* renamed from: e0 */
    private static final int[] f1211e0 = {16843505};

    /* renamed from: U */
    private final Context f1212U;

    /* renamed from: V */
    private C0220e0 f1213V;

    /* renamed from: W */
    private SpinnerAdapter f1214W;

    /* renamed from: a0 */
    private final boolean f1215a0;

    /* renamed from: b0 */
    private C0283g f1216b0;

    /* renamed from: c */
    private final C0219e f1217c;

    /* renamed from: c0 */
    int f1218c0;

    /* renamed from: d0 */
    final Rect f1219d0;

    /* renamed from: androidx.appcompat.widget.t$a */
    /* compiled from: AppCompatSpinner */
    class C0273a extends C0220e0 {

        /* renamed from: c0 */
        final /* synthetic */ C0277e f1220c0;

        C0273a(View view, C0277e eVar) {
            this.f1220c0 = eVar;
            super(view);
        }

        /* renamed from: a */
        public C0153q mo631a() {
            return this.f1220c0;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo632b() {
            if (!C0272t.this.getInternalPopup().mo1875b()) {
                C0272t.this.mo1842a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    /* compiled from: AppCompatSpinner */
    class C0274b implements OnGlobalLayoutListener {
        C0274b() {
        }

        public void onGlobalLayout() {
            if (!C0272t.this.getInternalPopup().mo1875b()) {
                C0272t.this.mo1842a();
            }
            ViewTreeObserver viewTreeObserver = C0272t.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$c */
    /* compiled from: AppCompatSpinner */
    class C0275c implements C0283g, OnClickListener {

        /* renamed from: U */
        private ListAdapter f1223U;

        /* renamed from: V */
        private CharSequence f1224V;

        /* renamed from: c */
        C0081c f1226c;

        C0275c() {
        }

        /* renamed from: a */
        public int mo1868a() {
            return 0;
        }

        /* renamed from: a */
        public void mo1872a(ListAdapter listAdapter) {
            this.f1223U = listAdapter;
        }

        /* renamed from: b */
        public boolean mo1875b() {
            C0081c cVar = this.f1226c;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public CharSequence mo1876c() {
            return this.f1224V;
        }

        public void dismiss() {
            C0081c cVar = this.f1226c;
            if (cVar != null) {
                cVar.dismiss();
                this.f1226c = null;
            }
        }

        /* renamed from: e */
        public Drawable mo1879e() {
            return null;
        }

        /* renamed from: g */
        public int mo1880g() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0272t.this.setSelection(i);
            if (C0272t.this.getOnItemClickListener() != null) {
                C0272t.this.performItemClick(null, i, this.f1223U.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: a */
        public void mo1873a(CharSequence charSequence) {
            this.f1224V = charSequence;
        }

        /* renamed from: b */
        public void mo1874b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public void mo1877c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1870a(int i, int i2) {
            if (this.f1223U != null) {
                C0082a aVar = new C0082a(C0272t.this.getPopupContext());
                CharSequence charSequence = this.f1224V;
                if (charSequence != null) {
                    aVar.mo423a(charSequence);
                }
                aVar.mo421a(this.f1223U, C0272t.this.getSelectedItemPosition(), (OnClickListener) this);
                this.f1226c = aVar.mo426a();
                ListView b = this.f1226c.mo412b();
                if (VERSION.SDK_INT >= 17) {
                    b.setTextDirection(i);
                    b.setTextAlignment(i2);
                }
                this.f1226c.show();
            }
        }

        /* renamed from: a */
        public void mo1871a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1869a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.t$d */
    /* compiled from: AppCompatSpinner */
    private static class C0276d implements ListAdapter, SpinnerAdapter {

        /* renamed from: U */
        private ListAdapter f1227U;

        /* renamed from: c */
        private SpinnerAdapter f1228c;

        public C0276d(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1228c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1227U = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0265p0) {
                C0265p0 p0Var = (C0265p0) spinnerAdapter;
                if (p0Var.getDropDownViewTheme() == null) {
                    p0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1227U;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1227U;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1228c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$e */
    /* compiled from: AppCompatSpinner */
    class C0277e extends C0227g0 implements C0283g {

        /* renamed from: B0 */
        private CharSequence f1229B0;

        /* renamed from: C0 */
        ListAdapter f1230C0;

        /* renamed from: D0 */
        private final Rect f1231D0 = new Rect();

        /* renamed from: E0 */
        private int f1232E0;

        /* renamed from: androidx.appcompat.widget.t$e$a */
        /* compiled from: AppCompatSpinner */
        class C0278a implements OnItemClickListener {
            C0278a(C0272t tVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0272t.this.setSelection(i);
                if (C0272t.this.getOnItemClickListener() != null) {
                    C0277e eVar = C0277e.this;
                    C0272t.this.performItemClick(view, i, eVar.f1230C0.getItemId(i));
                }
                C0277e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.t$e$b */
        /* compiled from: AppCompatSpinner */
        class C0279b implements OnGlobalLayoutListener {
            C0279b() {
            }

            public void onGlobalLayout() {
                C0277e eVar = C0277e.this;
                if (!eVar.mo1895b(C0272t.this)) {
                    C0277e.this.dismiss();
                    return;
                }
                C0277e.this.mo1896m();
                C0277e.super.mo737d();
            }
        }

        /* renamed from: androidx.appcompat.widget.t$e$c */
        /* compiled from: AppCompatSpinner */
        class C0280c implements OnDismissListener {

            /* renamed from: c */
            final /* synthetic */ OnGlobalLayoutListener f1237c;

            C0280c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1237c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0272t.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1237c);
                }
            }
        }

        public C0277e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1636a((View) C0272t.this);
            mo1640a(true);
            mo1650h(0);
            mo1637a((OnItemClickListener) new C0278a(C0272t.this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1895b(View view) {
            return C4187x.m14339D(view) && view.getGlobalVisibleRect(this.f1231D0);
        }

        /* renamed from: c */
        public CharSequence mo1876c() {
            return this.f1229B0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo1896m() {
            int i;
            Drawable e = mo1644e();
            int i2 = 0;
            if (e != null) {
                e.getPadding(C0272t.this.f1219d0);
                i2 = C0302z0.m1635a(C0272t.this) ? C0272t.this.f1219d0.right : -C0272t.this.f1219d0.left;
            } else {
                Rect rect = C0272t.this.f1219d0;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0272t.this.getPaddingLeft();
            int paddingRight = C0272t.this.getPaddingRight();
            int width = C0272t.this.getWidth();
            C0272t tVar = C0272t.this;
            int i3 = tVar.f1218c0;
            if (i3 == -2) {
                int a = tVar.mo1841a((SpinnerAdapter) this.f1230C0, mo1644e());
                int i4 = C0272t.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0272t.this.f1219d0;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                mo1645e(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                mo1645e((width - paddingLeft) - paddingRight);
            } else {
                mo1645e(i3);
            }
            if (C0302z0.m1635a(C0272t.this)) {
                i = i2 + (((width - paddingRight) - mo1653j()) - mo1897n());
            } else {
                i = i2 + paddingLeft + mo1897n();
            }
            mo1633a(i);
        }

        /* renamed from: n */
        public int mo1897n() {
            return this.f1232E0;
        }

        /* renamed from: a */
        public void mo1638a(ListAdapter listAdapter) {
            super.mo1638a(listAdapter);
            this.f1230C0 = listAdapter;
        }

        /* renamed from: c */
        public void mo1877c(int i) {
            this.f1232E0 = i;
        }

        /* renamed from: a */
        public void mo1873a(CharSequence charSequence) {
            this.f1229B0 = charSequence;
        }

        /* renamed from: a */
        public void mo1870a(int i, int i2) {
            boolean b = mo733b();
            mo1896m();
            mo1648g(2);
            super.mo737d();
            ListView f = mo739f();
            f.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                f.setTextDirection(i);
                f.setTextAlignment(i2);
            }
            mo1652i(C0272t.this.getSelectedItemPosition());
            if (!b) {
                ViewTreeObserver viewTreeObserver = C0272t.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0279b bVar = new C0279b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    mo1639a((OnDismissListener) new C0280c(bVar));
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$f */
    /* compiled from: AppCompatSpinner */
    static class C0281f extends BaseSavedState {
        public static final Creator<C0281f> CREATOR = new C0282a();

        /* renamed from: c */
        boolean f1238c;

        /* renamed from: androidx.appcompat.widget.t$f$a */
        /* compiled from: AppCompatSpinner */
        static class C0282a implements Creator<C0281f> {
            C0282a() {
            }

            public C0281f createFromParcel(Parcel parcel) {
                return new C0281f(parcel);
            }

            public C0281f[] newArray(int i) {
                return new C0281f[i];
            }
        }

        C0281f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1238c ? (byte) 1 : 0);
        }

        C0281f(Parcel parcel) {
            super(parcel);
            this.f1238c = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$g */
    /* compiled from: AppCompatSpinner */
    interface C0283g {
        /* renamed from: a */
        int mo1868a();

        /* renamed from: a */
        void mo1869a(int i);

        /* renamed from: a */
        void mo1870a(int i, int i2);

        /* renamed from: a */
        void mo1871a(Drawable drawable);

        /* renamed from: a */
        void mo1872a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo1873a(CharSequence charSequence);

        /* renamed from: b */
        void mo1874b(int i);

        /* renamed from: b */
        boolean mo1875b();

        /* renamed from: c */
        CharSequence mo1876c();

        /* renamed from: c */
        void mo1877c(int i);

        void dismiss();

        /* renamed from: e */
        Drawable mo1879e();

        /* renamed from: g */
        int mo1880g();
    }

    public C0272t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.spinnerStyle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1841a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1219d0);
            Rect rect = this.f1219d0;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            eVar.mo1563a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            return gVar.mo1868a();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            return gVar.mo1880g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1216b0 != null) {
            return this.f1218c0;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final C0283g getInternalPopup() {
        return this.f1216b0;
    }

    public Drawable getPopupBackground() {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            return gVar.mo1879e();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1212U;
    }

    public CharSequence getPrompt() {
        C0283g gVar = this.f1216b0;
        return gVar != null ? gVar.mo1876c() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0283g gVar = this.f1216b0;
        if (gVar != null && gVar.mo1875b()) {
            this.f1216b0.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1216b0 != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1841a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0281f fVar = (C0281f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1238c) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0274b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0281f fVar = new C0281f(super.onSaveInstanceState());
        C0283g gVar = this.f1216b0;
        fVar.f1238c = gVar != null && gVar.mo1875b();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0220e0 e0Var = this.f1213V;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0283g gVar = this.f1216b0;
        if (gVar == null) {
            return super.performClick();
        }
        if (!gVar.mo1875b()) {
            mo1842a();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            gVar.mo1877c(i);
            this.f1216b0.mo1869a(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            gVar.mo1874b(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1216b0 != null) {
            this.f1218c0 = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            gVar.mo1871a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3868a.m12946c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0283g gVar = this.f1216b0;
        if (gVar != null) {
            gVar.mo1873a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f1217c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public C0272t(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1215a0) {
            this.f1214W = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1216b0 != null) {
            Context context = this.f1212U;
            if (context == null) {
                context = getContext();
            }
            this.f1216b0.mo1872a((ListAdapter) new C0276d(spinnerAdapter, context.getTheme()));
        }
    }

    public C0272t(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0272t(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1219d0 = r0
            int[] r0 = p096e.p097a.C3867j.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0284t0.m1486a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1217c = r2
            if (r11 == 0) goto L_0x0022
            e.a.o.d r2 = new e.a.o.d
            r2.<init>(r7, r11)
            r6.f1212U = r2
            goto L_0x0034
        L_0x0022:
            int r11 = p096e.p097a.C3867j.Spinner_popupTheme
            int r11 = r0.mo1921g(r11, r1)
            if (r11 == 0) goto L_0x0032
            e.a.o.d r2 = new e.a.o.d
            r2.<init>(r7, r11)
            r6.f1212U = r2
            goto L_0x0034
        L_0x0032:
            r6.f1212U = r7
        L_0x0034:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0066
            int[] r11 = f1211e0     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004e }
            if (r3 == 0) goto L_0x0048
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004e }
        L_0x0048:
            if (r11 == 0) goto L_0x0066
        L_0x004a:
            r11.recycle()
            goto L_0x0066
        L_0x004e:
            r3 = move-exception
            goto L_0x0055
        L_0x0050:
            r7 = move-exception
            r11 = r2
            goto L_0x0060
        L_0x0053:
            r3 = move-exception
            r11 = r2
        L_0x0055:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005f }
            if (r11 == 0) goto L_0x0066
            goto L_0x004a
        L_0x005f:
            r7 = move-exception
        L_0x0060:
            if (r11 == 0) goto L_0x0065
            r11.recycle()
        L_0x0065:
            throw r7
        L_0x0066:
            r11 = 1
            if (r10 == 0) goto L_0x00a3
            if (r10 == r11) goto L_0x006c
            goto L_0x00b5
        L_0x006c:
            androidx.appcompat.widget.t$e r10 = new androidx.appcompat.widget.t$e
            android.content.Context r3 = r6.f1212U
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1212U
            int[] r4 = p096e.p097a.C3867j.Spinner
            androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.C0284t0.m1486a(r3, r8, r4, r9, r1)
            int r3 = p096e.p097a.C3867j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo1919f(r3, r4)
            r6.f1218c0 = r3
            int r3 = p096e.p097a.C3867j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo1912b(r3)
            r10.mo1635a(r3)
            int r3 = p096e.p097a.C3867j.Spinner_android_prompt
            java.lang.String r3 = r0.mo1916d(r3)
            r10.mo1873a(r3)
            r1.mo1908a()
            r6.f1216b0 = r10
            androidx.appcompat.widget.t$a r1 = new androidx.appcompat.widget.t$a
            r1.<init>(r6, r10)
            r6.f1213V = r1
            goto L_0x00b5
        L_0x00a3:
            androidx.appcompat.widget.t$c r10 = new androidx.appcompat.widget.t$c
            r10.<init>()
            r6.f1216b0 = r10
            androidx.appcompat.widget.t$g r10 = r6.f1216b0
            int r1 = p096e.p097a.C3867j.Spinner_android_prompt
            java.lang.String r1 = r0.mo1916d(r1)
            r10.mo1873a(r1)
        L_0x00b5:
            int r10 = p096e.p097a.C3867j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo1920f(r10)
            if (r10 == 0) goto L_0x00cd
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p096e.p097a.C3864g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00cd:
            r0.mo1908a()
            r6.f1215a0 = r11
            android.widget.SpinnerAdapter r7 = r6.f1214W
            if (r7 == 0) goto L_0x00db
            r6.setAdapter(r7)
            r6.f1214W = r2
        L_0x00db:
            androidx.appcompat.widget.e r7 = r6.f1217c
            r7.mo1568a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0272t.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1842a() {
        if (VERSION.SDK_INT >= 17) {
            this.f1216b0.mo1870a(getTextDirection(), getTextAlignment());
        } else {
            this.f1216b0.mo1870a(-1, -1);
        }
    }
}
