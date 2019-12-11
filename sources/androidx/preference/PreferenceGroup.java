package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p096e.p113e.C3941i;
import p096e.p121h.p122j.p124d.C4044h;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: m0 */
    private List<Preference> f3090m0;

    /* renamed from: n0 */
    final C3941i<String, Long> f3091n0;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C0766a implements Runnable {
        C0766a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f3091n0.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3091n0 = new C3941i<>();
        new Handler();
        new C0766a();
        this.f3090m0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.PreferenceGroup, i, i2);
        int i3 = C0778f.PreferenceGroup_orderingFromXml;
        C4044h.m13869a(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(C0778f.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = C0778f.PreferenceGroup_initialExpandedChildrenCount;
            mo4255d(C4044h.m13861a(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void mo4234b(boolean z) {
        super.mo4234b(z);
        int q = mo4256q();
        for (int i = 0; i < q; i++) {
            mo4254c(i).mo4233b(this, z);
        }
    }

    /* renamed from: c */
    public Preference mo4254c(int i) {
        return (Preference) this.f3090m0.get(i);
    }

    /* renamed from: d */
    public void mo4255d(int i) {
        if (i != Integer.MAX_VALUE && !mo4244i()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
            Log.e("PreferenceGroup", sb.toString());
        }
    }

    /* renamed from: q */
    public int mo4256q() {
        return this.f3090m0.size();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
