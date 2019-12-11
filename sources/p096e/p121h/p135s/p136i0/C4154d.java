package p096e.p121h.p135s.p136i0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.C4020e;
import p096e.p121h.p135s.p136i0.C4162g.C4163a;
import p096e.p121h.p135s.p136i0.C4162g.C4164b;
import p096e.p121h.p135s.p136i0.C4162g.C4165c;
import p096e.p121h.p135s.p136i0.C4162g.C4166d;
import p096e.p121h.p135s.p136i0.C4162g.C4167e;
import p096e.p121h.p135s.p136i0.C4162g.C4168f;
import p096e.p121h.p135s.p136i0.C4162g.C4169g;
import p096e.p121h.p135s.p136i0.C4162g.C4170h;

/* renamed from: e.h.s.i0.d */
/* compiled from: AccessibilityNodeInfoCompat */
public class C4154d {

    /* renamed from: d */
    private static int f10452d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f10453a;

    /* renamed from: b */
    public int f10454b = -1;

    /* renamed from: c */
    private int f10455c = -1;

    /* renamed from: e.h.s.i0.d$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C4155a {

        /* renamed from: d */
        public static final C4155a f10456d = new C4155a(16, null);

        /* renamed from: e */
        public static final C4155a f10457e;

        /* renamed from: f */
        public static final C4155a f10458f;

        /* renamed from: g */
        public static final C4155a f10459g;

        /* renamed from: h */
        public static final C4155a f10460h;

        /* renamed from: a */
        final Object f10461a;

        /* renamed from: b */
        private final Class<? extends C4163a> f10462b;

        /* renamed from: c */
        protected final C4162g f10463c;

        static {
            Class<C4165c> cls = C4165c.class;
            Class<C4164b> cls2 = C4164b.class;
            AccessibilityAction accessibilityAction = null;
            new C4155a(1, null);
            new C4155a(2, null);
            new C4155a(4, null);
            new C4155a(8, null);
            new C4155a(32, null);
            new C4155a(64, null);
            new C4155a(128, null);
            new C4155a(256, null, cls2);
            new C4155a(DateUtils.FORMAT_NO_NOON, null, cls2);
            new C4155a(1024, null, cls);
            new C4155a(DateUtils.FORMAT_NO_MIDNIGHT, null, cls);
            new C4155a(4096, null);
            new C4155a(ContentServiceClientExtras.URL_SIZE_LIMIT, null);
            new C4155a(DateUtils.FORMAT_ABBREV_TIME, null);
            new C4155a(DateUtils.FORMAT_ABBREV_WEEKDAY, null);
            new C4155a(DateUtils.FORMAT_ABBREV_MONTH, null);
            new C4155a(DateUtils.FORMAT_NUMERIC_DATE, null, C4169g.class);
            new C4155a(DateUtils.FORMAT_ABBREV_RELATIVE, null);
            new C4155a(DateUtils.FORMAT_ABBREV_ALL, null);
            new C4155a(1048576, null);
            new C4155a(2097152, null, C4170h.class);
            new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, C4167e.class);
            C4155a aVar = new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f10457e = aVar;
            C4155a aVar2 = new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f10458f = aVar2;
            C4155a aVar3 = new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f10459g = aVar3;
            C4155a aVar4 = new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f10460h = aVar4;
            new C4155a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C4155a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C4168f.class);
            new C4155a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C4166d.class);
            new C4155a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C4155a(accessibilityAction, 16908357, null, null, null);
        }

        public C4155a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public int mo14792a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f10461a).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence mo14794b() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f10461a).getLabel();
            }
            return null;
        }

        C4155a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C4155a(int i, CharSequence charSequence, Class<? extends C4163a> cls) {
            this(null, i, charSequence, null, cls);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14793a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                e.h.s.i0.g r0 = r4.f10463c
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends e.h.s.i0.g$a> r2 = r4.f10462b
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                e.h.s.i0.g$a r1 = (p096e.p121h.p135s.p136i0.C4162g.C4163a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo14805a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends e.h.s.i0.g$a> r1 = r4.f10462b
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                e.h.s.i0.g r6 = r4.f10463c
                boolean r5 = r6.mo14804a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p135s.p136i0.C4154d.C4155a.mo14793a(android.view.View, android.os.Bundle):boolean");
        }

        C4155a(Object obj, int i, CharSequence charSequence, C4162g gVar, Class<? extends C4163a> cls) {
            this.f10463c = gVar;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.f10461a = obj;
            } else {
                this.f10461a = new AccessibilityAction(i, charSequence);
            }
            this.f10462b = cls;
        }
    }

    /* renamed from: e.h.s.i0.d$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C4156b {

        /* renamed from: a */
        final Object f10464a;

        C4156b(Object obj) {
            this.f10464a = obj;
        }

        /* renamed from: a */
        public static C4156b m14286a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C4156b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C4156b(CollectionInfo.obtain(i, i2, z));
            }
            return new C4156b(null);
        }
    }

    /* renamed from: e.h.s.i0.d$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C4157c {

        /* renamed from: a */
        final Object f10465a;

        C4157c(Object obj) {
            this.f10465a = obj;
        }

        /* renamed from: a */
        public static C4157c m14287a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C4157c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C4157c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C4157c(null);
        }
    }

    private C4154d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10453a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C4154d m14213a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C4154d(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m14219b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case DateUtils.FORMAT_NO_NOON /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case DateUtils.FORMAT_NO_MIDNIGHT /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case ContentServiceClientExtras.URL_SIZE_LIMIT /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case DateUtils.FORMAT_ABBREV_TIME /*16384*/:
                return "ACTION_COPY";
            case DateUtils.FORMAT_ABBREV_WEEKDAY /*32768*/:
                return "ACTION_PASTE";
            case DateUtils.FORMAT_ABBREV_MONTH /*65536*/:
                return "ACTION_CUT";
            case DateUtils.FORMAT_NUMERIC_DATE /*131072*/:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: d */
    public static C4154d m14221d(View view) {
        return m14213a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: x */
    private void m14224x() {
        if (VERSION.SDK_INT >= 19) {
            this.f10453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f10453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f10453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f10453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: y */
    private boolean m14225y() {
        return !m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    public static C4154d m14226z() {
        return m14213a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: b */
    public int mo14744b() {
        return this.f10453a.getActions();
    }

    /* renamed from: c */
    public void mo14752c(View view, int i) {
        this.f10455c = i;
        if (VERSION.SDK_INT >= 16) {
            this.f10453a.setSource(view, i);
        }
    }

    /* renamed from: e */
    public void mo14761e(boolean z) {
        this.f10453a.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4154d.class != obj.getClass()) {
            return false;
        }
        C4154d dVar = (C4154d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10453a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f10453a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f10453a)) {
            return false;
        }
        return this.f10455c == dVar.f10455c && this.f10454b == dVar.f10454b;
    }

    /* renamed from: f */
    public void mo14765f(boolean z) {
        this.f10453a.setFocusable(z);
    }

    /* renamed from: g */
    public void mo14768g(boolean z) {
        this.f10453a.setFocused(z);
    }

    /* renamed from: h */
    public CharSequence mo14769h() {
        if (!m14225y()) {
            return this.f10453a.getText();
        }
        List a = m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a2 = m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f10453a.getText(), 0, this.f10453a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C4149a(((Integer) a4.get(i)).intValue(), this, mo14763f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
        }
        return spannableString;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10453a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public String mo14772i() {
        if (VERSION.SDK_INT >= 18) {
            return this.f10453a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo14775j() {
        if (VERSION.SDK_INT >= 16) {
            return this.f10453a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo14777k() {
        return this.f10453a.isCheckable();
    }

    /* renamed from: l */
    public boolean mo14779l() {
        return this.f10453a.isChecked();
    }

    /* renamed from: m */
    public boolean mo14780m() {
        return this.f10453a.isClickable();
    }

    /* renamed from: n */
    public boolean mo14781n() {
        return this.f10453a.isEnabled();
    }

    /* renamed from: o */
    public boolean mo14782o() {
        return this.f10453a.isFocusable();
    }

    /* renamed from: p */
    public boolean mo14783p() {
        return this.f10453a.isFocused();
    }

    /* renamed from: q */
    public boolean mo14784q() {
        return this.f10453a.isLongClickable();
    }

    /* renamed from: r */
    public boolean mo14785r() {
        return this.f10453a.isPassword();
    }

    /* renamed from: s */
    public boolean mo14786s() {
        return this.f10453a.isScrollable();
    }

    /* renamed from: t */
    public boolean mo14787t() {
        return this.f10453a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo14735a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo14745b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo14766g());
        sb.append("; className: ");
        sb.append(mo14755d());
        sb.append("; text: ");
        sb.append(mo14769h());
        sb.append("; contentDescription: ");
        sb.append(mo14759e());
        sb.append("; viewId: ");
        sb.append(mo14772i());
        sb.append("; checkable: ");
        sb.append(mo14777k());
        sb.append("; checked: ");
        sb.append(mo14779l());
        sb.append("; focusable: ");
        sb.append(mo14782o());
        sb.append("; focused: ");
        sb.append(mo14783p());
        sb.append("; selected: ");
        sb.append(mo14787t());
        sb.append("; clickable: ");
        sb.append(mo14780m());
        sb.append("; longClickable: ");
        sb.append(mo14784q());
        sb.append("; enabled: ");
        sb.append(mo14781n());
        sb.append("; password: ");
        sb.append(mo14785r());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo14786s());
        sb.append(sb4.toString());
        sb.append("; [");
        int b = mo14744b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= ~numberOfTrailingZeros;
            sb.append(m14219b(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo14789u() {
        if (VERSION.SDK_INT >= 16) {
            return this.f10453a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: v */
    public void mo14790v() {
        this.f10453a.recycle();
    }

    /* renamed from: w */
    public AccessibilityNodeInfo mo14791w() {
        return this.f10453a;
    }

    /* renamed from: a */
    public static C4154d m14214a(C4154d dVar) {
        return m14213a(AccessibilityNodeInfo.obtain(dVar.f10453a));
    }

    /* renamed from: b */
    public void mo14746b(View view, int i) {
        this.f10454b = i;
        if (VERSION.SDK_INT >= 16) {
            this.f10453a.setParent(view, i);
        }
    }

    /* renamed from: d */
    public void mo14756d(Rect rect) {
        this.f10453a.setBoundsInScreen(rect);
    }

    /* renamed from: e */
    public void mo14760e(CharSequence charSequence) {
        this.f10453a.setPackageName(charSequence);
    }

    /* renamed from: f */
    public Bundle mo14763f() {
        if (VERSION.SDK_INT >= 19) {
            return this.f10453a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: g */
    public CharSequence mo14766g() {
        return this.f10453a.getPackageName();
    }

    /* renamed from: k */
    public void mo14776k(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f10453a.setShowingHintText(z);
        } else {
            m14216a(4, z);
        }
    }

    /* renamed from: l */
    public void mo14778l(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f10453a.setVisibleToUser(z);
        }
    }

    /* renamed from: e */
    private void m14222e(View view) {
        SparseArray c = m14220c(view);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c.size(); i++) {
                if (((WeakReference) c.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: a */
    public void mo14737a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f10453a.addChild(view, i);
        }
    }

    /* renamed from: d */
    public CharSequence mo14755d() {
        return this.f10453a.getClassName();
    }

    /* renamed from: g */
    public void mo14767g(CharSequence charSequence) {
        this.f10453a.setText(charSequence);
    }

    /* renamed from: i */
    public void mo14773i(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f10453a.setScreenReaderFocusable(z);
        } else {
            m14216a(1, z);
        }
    }

    /* renamed from: j */
    public void mo14774j(boolean z) {
        this.f10453a.setScrollable(z);
    }

    /* renamed from: c */
    public int mo14750c() {
        return this.f10453a.getChildCount();
    }

    /* renamed from: d */
    public void mo14758d(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f10453a.setContentInvalid(z);
        }
    }

    /* renamed from: a */
    public void mo14734a(int i) {
        this.f10453a.addAction(i);
    }

    /* renamed from: b */
    public void mo14745b(Rect rect) {
        this.f10453a.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void mo14751c(Rect rect) {
        this.f10453a.setBoundsInParent(rect);
    }

    /* renamed from: f */
    public void mo14764f(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f10453a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f10453a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: a */
    private List<Integer> m14215a(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.f10453a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.f10453a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* renamed from: b */
    public void mo14749b(boolean z) {
        this.f10453a.setCheckable(z);
    }

    /* renamed from: c */
    public void mo14754c(boolean z) {
        this.f10453a.setChecked(z);
    }

    /* renamed from: d */
    public void mo14757d(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f10453a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f10453a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: b */
    private SparseArray<WeakReference<ClickableSpan>> m14218b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m14220c(view);
        if (c != null) {
            return c;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C4020e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: c */
    private SparseArray<WeakReference<ClickableSpan>> m14220c(View view) {
        return (SparseArray) view.getTag(C4020e.tag_accessibility_clickable_spans);
    }

    /* renamed from: c */
    public void mo14753c(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f10453a.setError(charSequence);
        }
    }

    /* renamed from: b */
    public void mo14747b(CharSequence charSequence) {
        this.f10453a.setContentDescription(charSequence);
    }

    /* renamed from: e */
    public CharSequence mo14759e() {
        return this.f10453a.getContentDescription();
    }

    /* renamed from: b */
    public void mo14748b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f10453a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C4157c) obj).f10465a);
        }
    }

    /* renamed from: a */
    public void mo14738a(C4155a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f10453a.addAction((AccessibilityAction) aVar.f10461a);
        }
    }

    /* renamed from: a */
    public boolean mo14743a(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.f10453a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: h */
    public static ClickableSpan[] m14223h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void mo14736a(View view) {
        this.f10454b = -1;
        this.f10453a.setParent(view);
    }

    /* renamed from: a */
    public void mo14735a(Rect rect) {
        this.f10453a.getBoundsInParent(rect);
    }

    /* renamed from: h */
    public void mo14770h(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f10453a.setHeading(z);
        } else {
            m14216a(2, z);
        }
    }

    /* renamed from: a */
    public void mo14742a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f10453a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public void mo14739a(CharSequence charSequence) {
        this.f10453a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo14740a(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m14224x();
            m14222e(view);
            ClickableSpan[] h = m14223h(charSequence);
            if (h != null && h.length > 0) {
                mo14763f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C4020e.accessibility_action_clickable_span);
                SparseArray b = m14218b(view);
                int i2 = 0;
                while (h != null && i2 < h.length) {
                    int a = m14212a(h[i2], b);
                    b.put(a, new WeakReference(h[i2]));
                    m14217a(h[i2], (Spanned) charSequence, a);
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    private int m14212a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f10452d;
        f10452d = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    private void m14217a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m14215a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo14741a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f10453a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C4156b) obj).f10464a);
        }
    }

    /* renamed from: a */
    public List<C4155a> mo14733a() {
        List actionList = VERSION.SDK_INT >= 21 ? this.f10453a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C4155a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m14216a(int i, boolean z) {
        Bundle f = mo14763f();
        if (f != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = f.getInt(str, 0) & (~i);
            if (!z) {
                i = 0;
            }
            f.putInt(str, i | i2);
        }
    }
}
