package com.bamtechmedia.dominguez.profiles;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.SwitchCompat;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.FieldInputLayout;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.p259s1.C6791g;
import java.util.Map;
import kotlin.C12907r;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7949h;

/* renamed from: com.bamtechmedia.dominguez.profiles.d0 */
/* compiled from: ProfileAccessibility.kt */
public final class C6629d0 {
    /* renamed from: a */
    public final String mo19295a(boolean z, String str) {
        Map a = C13170i0.m40332a(C12907r.m40244a("user_profile", str));
        if (!z) {
            return C5880u.m18937a(C7949h.a11y_whoswatching_selectprofile, a);
        }
        return C5880u.m18937a(C7949h.a11y_editprofiles_edit, a);
    }

    /* renamed from: b */
    public final String mo19298b() {
        return C5880u.m18936a(C7949h.a11y_whoswatching_editprofiles);
    }

    /* renamed from: c */
    public final CharSequence mo19299c() {
        return C5880u.m18936a(C7949h.a11y_profilesetup_skip);
    }

    /* renamed from: a */
    public final String mo19294a(boolean z) {
        if (z) {
            return C5880u.m18936a(C7949h.a11y_editprofiles_addprofile);
        }
        return C5880u.m18936a(C7949h.a11y_whoswatching_addprofile);
    }

    /* renamed from: a */
    public final void mo19296a(C6791g gVar) {
        String a = m20563a(this, C7949h.a11y_profileeditor_name, Integer.valueOf(C7949h.a11y_createprofiles_profilename), null, gVar.mo19533r(), 4, null);
        String a2 = m20563a(this, C7949h.a11y_profileeditor_autoplay, Integer.valueOf(C7949h.a11y_profilesetup_autoplay), null, gVar.mo19533r(), 4, null);
        String a3 = m20563a(this, C7949h.a11y_profileeditor_save, Integer.valueOf(C7949h.a11y_createprofiles_save), null, gVar.mo19533r(), 4, null);
        String a4 = m20563a(this, C7949h.a11y_profileeditor_cancel, null, null, gVar.mo19533r(), 4, null);
        String a5 = m20563a(this, C7949h.a11y_profileeditor_delete, null, null, gVar.mo19533r(), 4, null);
        ((FieldInputLayout) gVar._$_findCachedViewById(C7946e.profileNameInput)).getInputEditText().setContentDescription(a);
        SwitchCompat switchCompat = (SwitchCompat) gVar._$_findCachedViewById(C7946e.autoPlayToggleSwitch);
        if (switchCompat != null) {
            switchCompat.setContentDescription(a2);
        }
        OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) gVar._$_findCachedViewById(C7946e.autoPlayOnOffText);
        if (onOffToggleTextView != null) {
            onOffToggleTextView.setContentDescription(a2);
        }
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) gVar._$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar != null) {
            disneyTitleToolbar.mo17376a((CharSequence) a4, (CharSequence) a3);
        }
        Button button = (Button) gVar._$_findCachedViewById(C7946e.doneButton);
        if (button != null) {
            button.setContentDescription(a3);
        }
        View _$_findCachedViewById = gVar._$_findCachedViewById(C7946e.deleteButton);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setContentDescription(a5);
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m20563a(C6629d0 d0Var, int i, Integer num, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = C13173j0.m40350a();
        }
        return d0Var.m20562a(i, num, map, z);
    }

    /* renamed from: a */
    private final String m20562a(int i, Integer num, Map<String, String> map, boolean z) {
        if (z) {
            num = Integer.valueOf(i);
        }
        if (num != null) {
            String a = C5880u.m18937a(num.intValue(), map);
            if (a != null) {
                return a;
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r5 != null) goto L_0x003a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19297a(com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a r5, com.bamtechmedia.dominguez.profiles.p259s1.C6791g r6) {
        /*
            r4 = this;
            int r0 = p163g.p201e.p203b.p330z.C7949h.a11y_profileeditor_kidsmode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r2 = r5.mo19567h()
            if (r2 == 0) goto L_0x000f
            java.lang.String r2 = "ON"
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = "OFF"
        L_0x0011:
            java.lang.String r3 = "kids_mode_setting"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r3, r2)
            java.util.Map r2 = kotlin.p590y.C13170i0.m40332a(r2)
            boolean r3 = r6.mo19533r()
            java.lang.String r0 = r4.m20562a(r0, r1, r2, r3)
            int r1 = p163g.p201e.p203b.p330z.C7949h.a11y_profileeditor_editavatar
            int r2 = p163g.p201e.p203b.p330z.C7949h.a11y_profilesetup_editavatar
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bamtechmedia.dominguez.profiles.e r5 = r5.mo19560b()
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = r5.mo19332V()
            if (r5 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            java.lang.String r5 = ""
        L_0x003a:
            java.lang.String r3 = "avatar_name"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r3, r5)
            java.util.Map r5 = kotlin.p590y.C13170i0.m40332a(r5)
            boolean r3 = r6.mo19533r()
            java.lang.String r5 = r4.m20562a(r1, r2, r5, r3)
            int r1 = p163g.p201e.p203b.p330z.C7946e.editButton
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0059
            r1.setContentDescription(r5)
        L_0x0059:
            int r1 = p163g.p201e.p203b.p330z.C7946e.profileIconOption
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x0066
            r1.setContentDescription(r5)
        L_0x0066:
            int r5 = p163g.p201e.p203b.p330z.C7946e.kidsProfileToggleSwitch
            android.view.View r5 = r6._$_findCachedViewById(r5)
            androidx.appcompat.widget.SwitchCompat r5 = (androidx.appcompat.widget.SwitchCompat) r5
            if (r5 == 0) goto L_0x0073
            r5.setContentDescription(r0)
        L_0x0073:
            int r5 = p163g.p201e.p203b.p330z.C7946e.kidsProfileOnOffText
            android.view.View r5 = r6._$_findCachedViewById(r5)
            com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView r5 = (com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView) r5
            if (r5 == 0) goto L_0x0080
            r5.setContentDescription(r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6629d0.mo19297a(com.bamtechmedia.dominguez.profiles.s1.i$a, com.bamtechmedia.dominguez.profiles.s1.g):void");
    }

    /* renamed from: a */
    public final String mo19292a() {
        return C5880u.m18936a(C7949h.a11y_editprofiles_done);
    }

    /* renamed from: a */
    public final String mo19293a(String str) {
        return C5880u.m18937a(C7949h.a11y_profileeditor_applanguage, C13170i0.m40332a(C12907r.m40244a("ui_language", str)));
    }
}
