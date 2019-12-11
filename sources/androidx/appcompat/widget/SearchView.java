package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3858a;
import p096e.p097a.C3861d;
import p096e.p097a.C3863f;
import p096e.p097a.C3864g;
import p096e.p097a.C3865h;
import p096e.p097a.C3867j;
import p096e.p097a.p104o.C3891c;
import p096e.p121h.p135s.C4187x;
import p096e.p138i.p139a.C4198a;
import p096e.p140j.p141a.C4204a;

public class SearchView extends C0224f0 implements C3891c {

    /* renamed from: j1 */
    static final C0182k f777j1 = new C0182k();

    /* renamed from: A0 */
    private final Drawable f778A0;

    /* renamed from: B0 */
    private final int f779B0;

    /* renamed from: C0 */
    private final int f780C0;

    /* renamed from: D0 */
    private final Intent f781D0;

    /* renamed from: E0 */
    private final Intent f782E0;

    /* renamed from: F0 */
    private final CharSequence f783F0;

    /* renamed from: G0 */
    private C0184m f784G0;

    /* renamed from: H0 */
    private C0183l f785H0;

    /* renamed from: I0 */
    OnFocusChangeListener f786I0;

    /* renamed from: J0 */
    private C0185n f787J0;

    /* renamed from: K0 */
    private OnClickListener f788K0;

    /* renamed from: L0 */
    private boolean f789L0;

    /* renamed from: M0 */
    private boolean f790M0;

    /* renamed from: N0 */
    C4198a f791N0;

    /* renamed from: O0 */
    private boolean f792O0;

    /* renamed from: P0 */
    private CharSequence f793P0;

    /* renamed from: Q0 */
    private boolean f794Q0;

    /* renamed from: R0 */
    private boolean f795R0;

    /* renamed from: S0 */
    private int f796S0;

    /* renamed from: T0 */
    private boolean f797T0;

    /* renamed from: U0 */
    private CharSequence f798U0;

    /* renamed from: V0 */
    private CharSequence f799V0;

    /* renamed from: W0 */
    private boolean f800W0;

    /* renamed from: X0 */
    private int f801X0;

    /* renamed from: Y0 */
    SearchableInfo f802Y0;

    /* renamed from: Z0 */
    private Bundle f803Z0;

    /* renamed from: a1 */
    private final Runnable f804a1;

    /* renamed from: b1 */
    private Runnable f805b1;

    /* renamed from: c1 */
    private final WeakHashMap<String, ConstantState> f806c1;

    /* renamed from: d1 */
    private final OnClickListener f807d1;

    /* renamed from: e1 */
    OnKeyListener f808e1;

    /* renamed from: f1 */
    private final OnEditorActionListener f809f1;

    /* renamed from: g1 */
    private final OnItemClickListener f810g1;

    /* renamed from: h1 */
    private final OnItemSelectedListener f811h1;

    /* renamed from: i1 */
    private TextWatcher f812i1;

    /* renamed from: l0 */
    final SearchAutoComplete f813l0;

    /* renamed from: m0 */
    private final View f814m0;

    /* renamed from: n0 */
    private final View f815n0;

    /* renamed from: o0 */
    private final View f816o0;

    /* renamed from: p0 */
    final ImageView f817p0;

    /* renamed from: q0 */
    final ImageView f818q0;

    /* renamed from: r0 */
    final ImageView f819r0;

    /* renamed from: s0 */
    final ImageView f820s0;

    /* renamed from: t0 */
    private final View f821t0;

    /* renamed from: u0 */
    private C0188p f822u0;

    /* renamed from: v0 */
    private Rect f823v0;

    /* renamed from: w0 */
    private Rect f824w0;

    /* renamed from: x0 */
    private int[] f825x0;

    /* renamed from: y0 */
    private int[] f826y0;

    /* renamed from: z0 */
    private final ImageView f827z0;

    public static class SearchAutoComplete extends C0216d {

        /* renamed from: W */
        private int f828W;

        /* renamed from: a0 */
        private SearchView f829a0;

        /* renamed from: b0 */
        private boolean f830b0;

        /* renamed from: c0 */
        final Runnable f831c0;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0171a implements Runnable {
            C0171a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1272b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1271a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1272b() {
            if (this.f830b0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f830b0 = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f828W <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f830b0) {
                removeCallbacks(this.f831c0);
                post(this.f831c0);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f829a0.mo1247j();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f829a0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f829a0.hasFocus() && getVisibility() == 0) {
                this.f830b0 = true;
                if (SearchView.m1033a(getContext())) {
                    SearchView.f777j1.mo1299a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f830b0 = false;
                removeCallbacks(this.f831c0);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f830b0 = false;
                removeCallbacks(this.f831c0);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f830b0 = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f829a0 = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f828W = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C3858a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f831c0 = new C0171a();
            this.f828W = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0172a implements TextWatcher {
        C0172a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1230b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0173b implements Runnable {
        C0173b() {
        }

        public void run() {
            SearchView.this.mo1249l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0174c implements Runnable {
        C0174c() {
        }

        public void run() {
            C4198a aVar = SearchView.this.f791N0;
            if (aVar instanceof C0260n0) {
                aVar.mo1806a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0175d implements OnFocusChangeListener {
        C0175d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            OnFocusChangeListener onFocusChangeListener = searchView.f786I0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0176e implements OnLayoutChangeListener {
        C0176e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1232d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0177f implements OnClickListener {
        C0177f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f817p0) {
                searchView.mo1245h();
            } else if (view == searchView.f819r0) {
                searchView.mo1236g();
            } else if (view == searchView.f818q0) {
                searchView.mo1246i();
            } else if (view == searchView.f820s0) {
                searchView.mo1248k();
            } else if (view == searchView.f813l0) {
                searchView.mo1234e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0178g implements OnKeyListener {
        C0178g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f802Y0 == null) {
                return false;
            }
            if (searchView.f813l0.isPopupShowing() && SearchView.this.f813l0.getListSelection() != -1) {
                return SearchView.this.mo1229a(view, i, keyEvent);
            }
            if (SearchView.this.f813l0.mo1271a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1225a(0, (String) null, searchView2.f813l0.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0179h implements OnEditorActionListener {
        C0179h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1246i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0180i implements OnItemClickListener {
        C0180i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1228a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0181j implements OnItemSelectedListener {
        C0181j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1233d(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    private static class C0182k {

        /* renamed from: a */
        private Method f843a;

        /* renamed from: b */
        private Method f844b;

        /* renamed from: c */
        private Method f845c;

        C0182k() {
            try {
                this.f843a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f843a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f844b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f844b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f845c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f845c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1298a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f844b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1300b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f843a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1299a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f845c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0183l {
        /* renamed from: a */
        boolean mo1301a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0184m {
        /* renamed from: a */
        boolean mo1302a(String str);

        /* renamed from: b */
        boolean mo1303b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0185n {
        /* renamed from: a */
        boolean mo1304a(int i);

        /* renamed from: b */
        boolean mo1305b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0186o extends C4204a {
        public static final Creator<C0186o> CREATOR = new C0187a();

        /* renamed from: V */
        boolean f846V;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        static class C0187a implements ClassLoaderCreator<C0186o> {
            C0187a() {
            }

            public C0186o[] newArray(int i) {
                return new C0186o[i];
            }

            public C0186o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0186o(parcel, classLoader);
            }

            public C0186o createFromParcel(Parcel parcel) {
                return new C0186o(parcel, null);
            }
        }

        C0186o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f846V);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f846V));
        }

        public C0186o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f846V = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0188p extends TouchDelegate {

        /* renamed from: a */
        private final View f847a;

        /* renamed from: b */
        private final Rect f848b = new Rect();

        /* renamed from: c */
        private final Rect f849c = new Rect();

        /* renamed from: d */
        private final Rect f850d = new Rect();

        /* renamed from: e */
        private final int f851e;

        /* renamed from: f */
        private boolean f852f;

        public C0188p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f851e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1311a(rect, rect2);
            this.f847a = view;
        }

        /* renamed from: a */
        public void mo1311a(Rect rect, Rect rect2) {
            this.f848b.set(rect);
            this.f850d.set(rect);
            Rect rect3 = this.f850d;
            int i = this.f851e;
            rect3.inset(-i, -i);
            this.f849c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f852f
                r7.f852f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f852f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f850d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f848b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f852f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x006e
                if (r4 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f849c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f847a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f847a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x0068
            L_0x005b:
                android.graphics.Rect r2 = r7.f849c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x0068:
                android.view.View r0 = r7.f847a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0188p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m1035b(boolean z) {
        this.f790M0 = z;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f813l0.getText());
        this.f817p0.setVisibility(z ? 0 : 8);
        m1032a(z2);
        this.f814m0.setVisibility(z ? 8 : 0);
        if (this.f827z0.getDrawable() == null || this.f789L0) {
            i = 8;
        }
        this.f827z0.setVisibility(i);
        m1044q();
        m1038c(!z2);
        m1047t();
    }

    /* renamed from: c */
    private CharSequence m1037c(CharSequence charSequence) {
        if (!this.f789L0 || this.f778A0 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f813l0.getTextSize()) * 1.25d);
        this.f778A0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f778A0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    private void m1039e(int i) {
        Editable text = this.f813l0.getText();
        Cursor a = this.f791N0.mo14841a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence b = this.f791N0.mo1809b(a);
                if (b != null) {
                    setQuery(b);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C3861d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C3861d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m1040m() {
        this.f813l0.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m1041n() {
        SearchableInfo searchableInfo = this.f802Y0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f802Y0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f781D0;
        } else if (this.f802Y0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f782E0;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, DateUtils.FORMAT_ABBREV_MONTH) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m1042o() {
        return (this.f792O0 || this.f797T0) && !mo1235f();
    }

    /* renamed from: p */
    private void m1043p() {
        post(this.f804a1);
    }

    /* renamed from: q */
    private void m1044q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f813l0.getText());
        int i = 0;
        if (!z2 && (!this.f789L0 || this.f800W0)) {
            z = false;
        }
        ImageView imageView = this.f819r0;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f819r0.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m1045r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f813l0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1037c(queryHint));
    }

    /* renamed from: s */
    private void m1046s() {
        this.f813l0.setThreshold(this.f802Y0.getSuggestThreshold());
        this.f813l0.setImeOptions(this.f802Y0.getImeOptions());
        int inputType = this.f802Y0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f802Y0.getSuggestAuthority() != null) {
                inputType = inputType | DateUtils.FORMAT_ABBREV_MONTH | DateUtils.FORMAT_ABBREV_ALL;
            }
        }
        this.f813l0.setInputType(inputType);
        C4198a aVar = this.f791N0;
        if (aVar != null) {
            aVar.mo1806a(null);
        }
        if (this.f802Y0.getSuggestAuthority() != null) {
            this.f791N0 = new C0260n0(getContext(), this, this.f802Y0, this.f806c1);
            this.f813l0.setAdapter(this.f791N0);
            C0260n0 n0Var = (C0260n0) this.f791N0;
            if (this.f794Q0) {
                i = 2;
            }
            n0Var.mo1805a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f813l0.setText(charSequence);
        this.f813l0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m1047t() {
        this.f816o0.setVisibility((!m1042o() || !(this.f818q0.getVisibility() == 0 || this.f820s0.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo1227a(CharSequence charSequence, boolean z) {
        this.f813l0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f813l0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f799V0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1246i();
        }
    }

    public void clearFocus() {
        this.f795R0 = true;
        super.clearFocus();
        this.f813l0.clearFocus();
        this.f813l0.setImeVisibility(false);
        this.f795R0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1232d() {
        int i;
        if (this.f821t0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f815n0.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0302z0.m1635a(this);
            int dimensionPixelSize = this.f789L0 ? resources.getDimensionPixelSize(C3861d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C3861d.abc_dropdownitem_text_padding_left) : 0;
            this.f813l0.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f813l0.setDropDownHorizontalOffset(i);
            this.f813l0.setDropDownWidth((((this.f821t0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: f */
    public boolean mo1235f() {
        return this.f790M0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1236g() {
        if (!TextUtils.isEmpty(this.f813l0.getText())) {
            this.f813l0.setText("");
            this.f813l0.requestFocus();
            this.f813l0.setImeVisibility(true);
        } else if (this.f789L0) {
            C0183l lVar = this.f785H0;
            if (lVar == null || !lVar.mo1301a()) {
                clearFocus();
                m1035b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f813l0.getImeOptions();
    }

    public int getInputType() {
        return this.f813l0.getInputType();
    }

    public int getMaxWidth() {
        return this.f796S0;
    }

    public CharSequence getQuery() {
        return this.f813l0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f793P0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f802Y0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f783F0;
        }
        return getContext().getText(this.f802Y0.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f780C0;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f779B0;
    }

    public C4198a getSuggestionsAdapter() {
        return this.f791N0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1245h() {
        m1035b(false);
        this.f813l0.requestFocus();
        this.f813l0.setImeVisibility(true);
        OnClickListener onClickListener = this.f788K0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1246i() {
        Editable text = this.f813l0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0184m mVar = this.f784G0;
            if (mVar == null || !mVar.mo1303b(text.toString())) {
                if (this.f802Y0 != null) {
                    mo1225a(0, (String) null, text.toString());
                }
                this.f813l0.setImeVisibility(false);
                m1040m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1247j() {
        m1035b(mo1235f());
        m1043p();
        if (this.f813l0.hasFocus()) {
            mo1234e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1248k() {
        SearchableInfo searchableInfo = this.f802Y0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m1034b(this.f781D0, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m1027a(this.f782E0, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1249l() {
        int[] iArr = this.f813l0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f815n0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f816o0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f804a1);
        post(this.f805b1);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1031a((View) this.f813l0, this.f823v0);
            Rect rect = this.f824w0;
            Rect rect2 = this.f823v0;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0188p pVar = this.f822u0;
            if (pVar == null) {
                this.f822u0 = new C0188p(this.f824w0, this.f823v0, this.f813l0);
                setTouchDelegate(this.f822u0);
                return;
            }
            pVar.mo1311a(this.f824w0, this.f823v0);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo1235f()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i3 = this.f796S0;
            size = i3 > 0 ? Math.min(i3, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f796S0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824) {
            int i4 = this.f796S0;
            if (i4 > 0) {
                size = Math.min(i4, size);
            }
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0186o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0186o oVar = (C0186o) parcelable;
        super.onRestoreInstanceState(oVar.mo14857X());
        m1035b(oVar.f846V);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0186o oVar = new C0186o(super.onSaveInstanceState());
        oVar.f846V = mo1235f();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1043p();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f795R0 || !isFocusable()) {
            return false;
        }
        if (mo1235f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f813l0.requestFocus(i, rect);
        if (requestFocus) {
            m1035b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f803Z0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1236g();
        } else {
            mo1245h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f789L0 != z) {
            this.f789L0 = z;
            m1035b(z);
            m1045r();
        }
    }

    public void setImeOptions(int i) {
        this.f813l0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f813l0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f796S0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0183l lVar) {
        this.f785H0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f786I0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0184m mVar) {
        this.f784G0 = mVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f788K0 = onClickListener;
    }

    public void setOnSuggestionListener(C0185n nVar) {
        this.f787J0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f793P0 = charSequence;
        m1045r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f794Q0 = z;
        C4198a aVar = this.f791N0;
        if (aVar instanceof C0260n0) {
            ((C0260n0) aVar).mo1805a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f802Y0 = searchableInfo;
        if (this.f802Y0 != null) {
            m1046s();
            m1045r();
        }
        this.f797T0 = m1041n();
        if (this.f797T0) {
            this.f813l0.setPrivateImeOptions("nm");
        }
        m1035b(mo1235f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f792O0 = z;
        m1035b(mo1235f());
    }

    public void setSuggestionsAdapter(C4198a aVar) {
        this.f791N0 = aVar;
        this.f813l0.setAdapter(this.f791N0);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f823v0 = new Rect();
        this.f824w0 = new Rect();
        this.f825x0 = new int[2];
        this.f826y0 = new int[2];
        this.f804a1 = new C0173b();
        this.f805b1 = new C0174c();
        this.f806c1 = new WeakHashMap<>();
        this.f807d1 = new C0177f();
        this.f808e1 = new C0178g();
        this.f809f1 = new C0179h();
        this.f810g1 = new C0180i();
        this.f811h1 = new C0181j();
        this.f812i1 = new C0172a();
        C0284t0 a = C0284t0.m1486a(context, attributeSet, C3867j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo1921g(C3867j.SearchView_layout, C3864g.abc_search_view), this, true);
        this.f813l0 = (SearchAutoComplete) findViewById(C3863f.search_src_text);
        this.f813l0.setSearchView(this);
        this.f814m0 = findViewById(C3863f.search_edit_frame);
        this.f815n0 = findViewById(C3863f.search_plate);
        this.f816o0 = findViewById(C3863f.submit_area);
        this.f817p0 = (ImageView) findViewById(C3863f.search_button);
        this.f818q0 = (ImageView) findViewById(C3863f.search_go_btn);
        this.f819r0 = (ImageView) findViewById(C3863f.search_close_btn);
        this.f820s0 = (ImageView) findViewById(C3863f.search_voice_btn);
        this.f827z0 = (ImageView) findViewById(C3863f.search_mag_icon);
        C4187x.m14358a(this.f815n0, a.mo1912b(C3867j.SearchView_queryBackground));
        C4187x.m14358a(this.f816o0, a.mo1912b(C3867j.SearchView_submitBackground));
        this.f817p0.setImageDrawable(a.mo1912b(C3867j.SearchView_searchIcon));
        this.f818q0.setImageDrawable(a.mo1912b(C3867j.SearchView_goIcon));
        this.f819r0.setImageDrawable(a.mo1912b(C3867j.SearchView_closeIcon));
        this.f820s0.setImageDrawable(a.mo1912b(C3867j.SearchView_voiceIcon));
        this.f827z0.setImageDrawable(a.mo1912b(C3867j.SearchView_searchIcon));
        this.f778A0 = a.mo1912b(C3867j.SearchView_searchHintIcon);
        C0292v0.m1576a(this.f817p0, getResources().getString(C3865h.abc_searchview_description_search));
        this.f779B0 = a.mo1921g(C3867j.SearchView_suggestionRowLayout, C3864g.abc_search_dropdown_item_icons_2line);
        this.f780C0 = a.mo1921g(C3867j.SearchView_commitIcon, 0);
        this.f817p0.setOnClickListener(this.f807d1);
        this.f819r0.setOnClickListener(this.f807d1);
        this.f818q0.setOnClickListener(this.f807d1);
        this.f820s0.setOnClickListener(this.f807d1);
        this.f813l0.setOnClickListener(this.f807d1);
        this.f813l0.addTextChangedListener(this.f812i1);
        this.f813l0.setOnEditorActionListener(this.f809f1);
        this.f813l0.setOnItemClickListener(this.f810g1);
        this.f813l0.setOnItemSelectedListener(this.f811h1);
        this.f813l0.setOnKeyListener(this.f808e1);
        this.f813l0.setOnFocusChangeListener(new C0175d());
        setIconifiedByDefault(a.mo1909a(C3867j.SearchView_iconifiedByDefault, true));
        int c = a.mo1913c(C3867j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f783F0 = a.mo1918e(C3867j.SearchView_defaultQueryHint);
        this.f793P0 = a.mo1918e(C3867j.SearchView_queryHint);
        int d = a.mo1915d(C3867j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo1915d(C3867j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo1909a(C3867j.SearchView_android_focusable, true));
        a.mo1908a();
        this.f781D0 = new Intent("android.speech.action.WEB_SEARCH");
        this.f781D0.addFlags(268435456);
        this.f781D0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f782E0 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f782E0.addFlags(268435456);
        this.f821t0 = findViewById(this.f813l0.getDropDownAnchor());
        View view = this.f821t0;
        if (view != null) {
            view.addOnLayoutChangeListener(new C0176e());
        }
        m1035b(this.f789L0);
        m1045r();
    }

    /* renamed from: a */
    private void m1031a(View view, Rect rect) {
        view.getLocationInWindow(this.f825x0);
        getLocationInWindow(this.f826y0);
        int[] iArr = this.f825x0;
        int i = iArr[1];
        int[] iArr2 = this.f826y0;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: c */
    private void m1038c(boolean z) {
        int i;
        if (!this.f797T0 || mo1235f() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f818q0.setVisibility(8);
        }
        this.f820s0.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1234e() {
        if (VERSION.SDK_INT >= 29) {
            this.f813l0.refreshAutoCompleteResults();
            return;
        }
        f777j1.mo1300b(this.f813l0);
        f777j1.mo1298a(this.f813l0);
    }

    /* renamed from: c */
    public void mo967c() {
        mo1227a((CharSequence) "", false);
        clearFocus();
        m1035b(true);
        this.f813l0.setImeOptions(this.f801X0);
        this.f800W0 = false;
    }

    /* renamed from: a */
    private void m1032a(boolean z) {
        this.f818q0.setVisibility((!this.f792O0 || !m1042o() || !hasFocus() || (!z && this.f797T0)) ? 8 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1230b(CharSequence charSequence) {
        Editable text = this.f813l0.getText();
        this.f799V0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1032a(z);
        m1038c(!z);
        m1044q();
        m1047t();
        if (this.f784G0 != null && !TextUtils.equals(charSequence, this.f798U0)) {
            this.f784G0.mo1302a(charSequence.toString());
        }
        this.f798U0 = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1226a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1229a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f802Y0 != null && this.f791N0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1228a(this.f813l0.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f813l0.length();
                }
                this.f813l0.setSelection(i2);
                this.f813l0.setListSelection(0);
                this.f813l0.clearListSelection();
                f777j1.mo1299a(this.f813l0, true);
                return true;
            } else if (i != 19 || this.f813l0.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1233d(int i) {
        C0185n nVar = this.f787J0;
        if (nVar != null && nVar.mo1304a(i)) {
            return false;
        }
        m1039e(i);
        return true;
    }

    /* renamed from: b */
    public void mo966b() {
        if (!this.f800W0) {
            this.f800W0 = true;
            this.f801X0 = this.f813l0.getImeOptions();
            this.f813l0.setImeOptions(this.f801X0 | 33554432);
            this.f813l0.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1228a(int i, int i2, String str) {
        C0185n nVar = this.f787J0;
        if (nVar != null && nVar.mo1305b(i)) {
            return false;
        }
        m1036b(i, 0, null);
        this.f813l0.setImeVisibility(false);
        m1040m();
        return true;
    }

    /* renamed from: b */
    private boolean m1036b(int i, int i2, String str) {
        Cursor a = this.f791N0.mo14841a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m1030a(m1028a(a, i2, str));
        return true;
    }

    /* renamed from: a */
    private void m1030a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private Intent m1034b(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1225a(int i, String str, String str2) {
        getContext().startActivity(m1029a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m1029a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f799V0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f803Z0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f802Y0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m1027a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f803Z0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m1028a(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        try {
            String a = C0260n0.m1408a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f802Y0.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String str2 = a;
            String a2 = C0260n0.m1408a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f802Y0.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C0260n0.m1408a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            if (a2 == null) {
                uri = null;
            } else {
                uri = Uri.parse(a2);
            }
            String a4 = C0260n0.m1408a(cursor, "suggest_intent_query");
            return m1029a(str2, uri, C0260n0.m1408a(cursor, "suggest_intent_extra_data"), a4, i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m1033a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
