package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;
import p096e.p121h.p122j.p124d.C4044h;

public class Preference implements Comparable<Preference> {

    /* renamed from: U */
    private C0772b f3070U;

    /* renamed from: V */
    private C0771a f3071V;

    /* renamed from: W */
    private C0764c f3072W;

    /* renamed from: X */
    private C0765d f3073X;

    /* renamed from: Y */
    private int f3074Y;

    /* renamed from: Z */
    private CharSequence f3075Z;

    /* renamed from: a0 */
    private CharSequence f3076a0;

    /* renamed from: b0 */
    private String f3077b0;

    /* renamed from: c */
    private Context f3078c;

    /* renamed from: c0 */
    private Intent f3079c0;

    /* renamed from: d0 */
    private String f3080d0;

    /* renamed from: e0 */
    private boolean f3081e0;

    /* renamed from: f0 */
    private boolean f3082f0;

    /* renamed from: g0 */
    private boolean f3083g0;

    /* renamed from: h0 */
    private boolean f3084h0;

    /* renamed from: i0 */
    private boolean f3085i0;

    /* renamed from: j0 */
    private boolean f3086j0;

    /* renamed from: k0 */
    private C0763b f3087k0;

    /* renamed from: l0 */
    private List<Preference> f3088l0;

    /* renamed from: androidx.preference.Preference$a */
    class C0762a implements OnClickListener {
        C0762a() {
        }

        public void onClick(View view) {
            Preference.this.mo4209a(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    interface C0763b {
        /* renamed from: a */
        void mo4251a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C0764c {
        /* renamed from: a */
        boolean mo4252a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C0765d {
        /* renamed from: a */
        boolean mo4253a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3074Y = Integer.MAX_VALUE;
        this.f3081e0 = true;
        this.f3082f0 = true;
        this.f3083g0 = true;
        this.f3084h0 = true;
        this.f3085i0 = true;
        new C0762a();
        this.f3078c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.Preference, i, i2);
        C4044h.m13872b(obtainStyledAttributes, C0778f.Preference_icon, C0778f.Preference_android_icon, 0);
        this.f3077b0 = C4044h.m13875b(obtainStyledAttributes, C0778f.Preference_key, C0778f.Preference_android_key);
        this.f3075Z = C4044h.m13877c(obtainStyledAttributes, C0778f.Preference_title, C0778f.Preference_android_title);
        this.f3076a0 = C4044h.m13877c(obtainStyledAttributes, C0778f.Preference_summary, C0778f.Preference_android_summary);
        this.f3074Y = C4044h.m13861a(obtainStyledAttributes, C0778f.Preference_order, C0778f.Preference_android_order, Integer.MAX_VALUE);
        this.f3080d0 = C4044h.m13875b(obtainStyledAttributes, C0778f.Preference_fragment, C0778f.Preference_android_fragment);
        C4044h.m13872b(obtainStyledAttributes, C0778f.Preference_layout, C0778f.Preference_android_layout, C0777e.preference);
        C4044h.m13872b(obtainStyledAttributes, C0778f.Preference_widgetLayout, C0778f.Preference_android_widgetLayout, 0);
        this.f3081e0 = C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_enabled, C0778f.Preference_android_enabled, true);
        this.f3082f0 = C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_selectable, C0778f.Preference_android_selectable, true);
        this.f3083g0 = C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_persistent, C0778f.Preference_android_persistent, true);
        C4044h.m13875b(obtainStyledAttributes, C0778f.Preference_dependency, C0778f.Preference_android_dependency);
        int i3 = C0778f.Preference_allowDividerAbove;
        C4044h.m13869a(obtainStyledAttributes, i3, i3, this.f3082f0);
        int i4 = C0778f.Preference_allowDividerBelow;
        C4044h.m13869a(obtainStyledAttributes, i4, i4, this.f3082f0);
        if (obtainStyledAttributes.hasValue(C0778f.Preference_defaultValue)) {
            mo4216a(obtainStyledAttributes, C0778f.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(C0778f.Preference_android_defaultValue)) {
            mo4216a(obtainStyledAttributes, C0778f.Preference_android_defaultValue);
        }
        C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_shouldDisableView, C0778f.Preference_android_shouldDisableView, true);
        this.f3086j0 = obtainStyledAttributes.hasValue(C0778f.Preference_singleLineTitle);
        if (this.f3086j0) {
            C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_singleLineTitle, C0778f.Preference_android_singleLineTitle, true);
        }
        C4044h.m13869a(obtainStyledAttributes, C0778f.Preference_iconSpaceReserved, C0778f.Preference_android_iconSpaceReserved, false);
        int i5 = C0778f.Preference_isPreferenceVisible;
        C4044h.m13869a(obtainStyledAttributes, i5, i5, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo4230a(Object obj) {
        C0764c cVar = this.f3072W;
        return cVar == null || cVar.mo4252a(this, obj);
    }

    /* renamed from: b */
    public void mo4234b(boolean z) {
        List<Preference> list = this.f3088l0;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo4229a(this, z);
            }
        }
    }

    /* renamed from: c */
    public String mo4237c() {
        return this.f3080d0;
    }

    /* renamed from: d */
    public Intent mo4240d() {
        return this.f3079c0;
    }

    /* renamed from: e */
    public C0771a mo4241e() {
        C0771a aVar = this.f3071V;
        if (aVar != null) {
            return aVar;
        }
        C0772b bVar = this.f3070U;
        if (bVar == null) {
            return null;
        }
        bVar.mo4288d();
        throw null;
    }

    /* renamed from: f */
    public C0772b mo4242f() {
        return this.f3070U;
    }

    /* renamed from: g */
    public CharSequence mo4220g() {
        return this.f3076a0;
    }

    /* renamed from: h */
    public CharSequence mo4243h() {
        return this.f3075Z;
    }

    /* renamed from: i */
    public boolean mo4244i() {
        return !TextUtils.isEmpty(this.f3077b0);
    }

    /* renamed from: j */
    public boolean mo4245j() {
        return this.f3081e0 && this.f3084h0 && this.f3085i0;
    }

    /* renamed from: k */
    public boolean mo4246k() {
        return this.f3083g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4212l() {
        C0763b bVar = this.f3087k0;
        if (bVar != null) {
            bVar.mo4251a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4211m() {
    }

    /* renamed from: n */
    public void mo4247n() {
        if (mo4245j()) {
            mo4211m();
            C0765d dVar = this.f3073X;
            if (dVar == null || !dVar.mo4253a(this)) {
                C0772b f = mo4242f();
                if (f == null) {
                    if (this.f3079c0 != null) {
                        mo4227a().startActivity(this.f3079c0);
                    }
                    return;
                }
                f.mo4287c();
                throw null;
            }
        }
    }

    /* renamed from: o */
    public boolean mo4217o() {
        return !mo4245j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo4248p() {
        return this.f3070U != null && mo4246k() && mo4244i();
    }

    public String toString() {
        return mo4232b().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4209a(View view) {
        mo4247n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4238c(boolean z) {
        if (!mo4248p()) {
            return false;
        }
        if (z == mo4231a(!z)) {
            return true;
        }
        C0771a e = mo4241e();
        if (e != null) {
            e.mo4283b(this.f3077b0, z);
            return true;
        }
        this.f3070U.mo4284a();
        throw null;
    }

    /* renamed from: a */
    public Context mo4227a() {
        return this.f3078c;
    }

    /* renamed from: a */
    public int compareTo(Preference preference) {
        int i = this.f3074Y;
        int i2 = preference.f3074Y;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f3075Z;
        CharSequence charSequence2 = preference.f3075Z;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3075Z.toString());
    }

    /* renamed from: b */
    public void mo4233b(Preference preference, boolean z) {
        if (this.f3085i0 == z) {
            this.f3085i0 = !z;
            mo4234b(mo4217o());
            mo4212l();
        }
    }

    /* renamed from: a */
    public void mo4229a(Preference preference, boolean z) {
        if (this.f3084h0 == z) {
            this.f3084h0 = !z;
            mo4234b(mo4217o());
            mo4212l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4236b(String str) {
        if (!mo4248p()) {
            return false;
        }
        if (TextUtils.equals(str, mo4228a((String) null))) {
            return true;
        }
        C0771a e = mo4241e();
        if (e != null) {
            e.mo4282b(this.f3077b0, str);
            return true;
        }
        this.f3070U.mo4284a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4228a(String str) {
        if (!mo4248p()) {
            return str;
        }
        C0771a e = mo4241e();
        if (e != null) {
            return e.mo4279a(this.f3077b0, str);
        }
        this.f3070U.mo4289e();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4235b(int i) {
        if (!mo4248p()) {
            return false;
        }
        if (i == mo4225a(~i)) {
            return true;
        }
        C0771a e = mo4241e();
        if (e != null) {
            e.mo4281b(this.f3077b0, i);
            return true;
        }
        this.f3070U.mo4284a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4225a(int i) {
        if (!mo4248p()) {
            return i;
        }
        C0771a e = mo4241e();
        if (e != null) {
            return e.mo4278a(this.f3077b0, i);
        }
        this.f3070U.mo4289e();
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public StringBuilder mo4232b() {
        StringBuilder sb = new StringBuilder();
        CharSequence h = mo4243h();
        if (!TextUtils.isEmpty(h)) {
            sb.append(h);
            sb.append(' ');
        }
        CharSequence g = mo4220g();
        if (!TextUtils.isEmpty(g)) {
            sb.append(g);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4231a(boolean z) {
        if (!mo4248p()) {
            return z;
        }
        C0771a e = mo4241e();
        if (e != null) {
            return e.mo4280a(this.f3077b0, z);
        }
        this.f3070U.mo4289e();
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.preferenceStyle, 16842894));
    }
}
