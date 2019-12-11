package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import p096e.p121h.p122j.p124d.C4044h;

public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C4044h.m13860a(context, C0775c.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4211m() {
        if (mo4240d() == null && mo4237c() == null && mo4256q() != 0) {
            mo4242f().mo4286b();
            throw null;
        }
    }
}
