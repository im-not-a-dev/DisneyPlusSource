package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import p096e.p121h.p122j.p124d.C4044h;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: j */
    public boolean mo4245j() {
        return false;
    }

    /* renamed from: o */
    public boolean mo4217o() {
        return !super.mo4245j();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.preferenceCategoryStyle, 16842892));
    }
}
