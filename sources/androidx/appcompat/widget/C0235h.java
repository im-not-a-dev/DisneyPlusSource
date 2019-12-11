package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p096e.p097a.C3858a;
import p096e.p097a.C3860c;
import p096e.p097a.C3862e;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p125k.C4045a;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatDrawableManager */
public final class C0235h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Mode f1095b = Mode.SRC_IN;

    /* renamed from: c */
    private static C0235h f1096c;

    /* renamed from: a */
    private C0242j0 f1097a;

    /* renamed from: androidx.appcompat.widget.h$a */
    /* compiled from: AppCompatDrawableManager */
    static class C0236a implements C0247e {

        /* renamed from: a */
        private final int[] f1098a = {C3862e.abc_textfield_search_default_mtrl_alpha, C3862e.abc_textfield_default_mtrl_alpha, C3862e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1099b = {C3862e.abc_ic_commit_search_api_mtrl_alpha, C3862e.abc_seekbar_tick_mark_material, C3862e.abc_ic_menu_share_mtrl_alpha, C3862e.abc_ic_menu_copy_mtrl_am_alpha, C3862e.abc_ic_menu_cut_mtrl_alpha, C3862e.abc_ic_menu_selectall_mtrl_alpha, C3862e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1100c = {C3862e.abc_textfield_activated_mtrl_alpha, C3862e.abc_textfield_search_activated_mtrl_alpha, C3862e.abc_cab_background_top_mtrl_alpha, C3862e.abc_text_cursor_material, C3862e.abc_text_select_handle_left_mtrl_dark, C3862e.abc_text_select_handle_middle_mtrl_dark, C3862e.abc_text_select_handle_right_mtrl_dark, C3862e.abc_text_select_handle_left_mtrl_light, C3862e.abc_text_select_handle_middle_mtrl_light, C3862e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1101d = {C3862e.abc_popup_background_mtrl_mult, C3862e.abc_cab_background_internal_bg, C3862e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1102e = {C3862e.abc_tab_indicator_material, C3862e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1103f = {C3862e.abc_btn_check_material, C3862e.abc_btn_radio_material, C3862e.abc_btn_check_material_anim, C3862e.abc_btn_radio_material_anim};

        C0236a() {
        }

        /* renamed from: a */
        private ColorStateList m1319a(Context context) {
            return m1323b(context, 0);
        }

        /* renamed from: b */
        private ColorStateList m1322b(Context context) {
            return m1323b(context, C0263o0.m1436b(context, C3858a.colorAccent));
        }

        /* renamed from: c */
        private ColorStateList m1324c(Context context) {
            return m1323b(context, C0263o0.m1436b(context, C3858a.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m1325d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0263o0.m1437c(context, C3858a.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0263o0.f1185b;
                iArr2[0] = C0263o0.m1433a(context, C3858a.colorSwitchThumbNormal);
                iArr[1] = C0263o0.f1188e;
                iArr2[1] = C0263o0.m1436b(context, C3858a.colorControlActivated);
                iArr[2] = C0263o0.f1189f;
                iArr2[2] = C0263o0.m1436b(context, C3858a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0263o0.f1185b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0263o0.f1188e;
                iArr2[1] = C0263o0.m1436b(context, C3858a.colorControlActivated);
                iArr[2] = C0263o0.f1189f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public Drawable mo1673a(C0242j0 j0Var, Context context, int i) {
            if (i != C3862e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{j0Var.mo1692a(context, C3862e.abc_cab_background_internal_bg), j0Var.mo1692a(context, C3862e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: b */
        private ColorStateList m1323b(Context context, int i) {
            int b = C0263o0.m1436b(context, C3858a.colorControlHighlight);
            return new ColorStateList(new int[][]{C0263o0.f1185b, C0263o0.f1187d, C0263o0.f1186c, C0263o0.f1189f}, new int[]{C0263o0.m1433a(context, C3858a.colorButtonNormal), C4045a.m13881b(b, i), C4045a.m13881b(b, i), i});
        }

        /* renamed from: a */
        private void m1320a(Drawable drawable, int i, Mode mode) {
            if (C0204b0.m1172a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0235h.f1095b;
            }
            drawable.setColorFilter(C0235h.m1311a(i, mode));
        }

        /* renamed from: a */
        private boolean m1321a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public ColorStateList mo1671a(Context context, int i) {
            if (i == C3862e.abc_edit_text_material) {
                return C3868a.m12945b(context, C3860c.abc_tint_edittext);
            }
            if (i == C3862e.abc_switch_track_mtrl_alpha) {
                return C3868a.m12945b(context, C3860c.abc_tint_switch_track);
            }
            if (i == C3862e.abc_switch_thumb_material) {
                return m1325d(context);
            }
            if (i == C3862e.abc_btn_default_mtrl_shape) {
                return m1324c(context);
            }
            if (i == C3862e.abc_btn_borderless_material) {
                return m1319a(context);
            }
            if (i == C3862e.abc_btn_colored_material) {
                return m1322b(context);
            }
            if (i == C3862e.abc_spinner_mtrl_am_alpha || i == C3862e.abc_spinner_textfield_background_material) {
                return C3868a.m12945b(context, C3860c.abc_tint_spinner);
            }
            if (m1321a(this.f1099b, i)) {
                return C0263o0.m1437c(context, C3858a.colorControlNormal);
            }
            if (m1321a(this.f1102e, i)) {
                return C3868a.m12945b(context, C3860c.abc_tint_default);
            }
            if (m1321a(this.f1103f, i)) {
                return C3868a.m12945b(context, C3860c.abc_tint_btn_checkable);
            }
            if (i == C3862e.abc_seekbar_thumb_material) {
                return C3868a.m12945b(context, C3860c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo1675b(Context context, int i, Drawable drawable) {
            if (i == C3862e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m1320a(layerDrawable.findDrawableByLayerId(16908288), C0263o0.m1436b(context, C3858a.colorControlNormal), C0235h.f1095b);
                m1320a(layerDrawable.findDrawableByLayerId(16908303), C0263o0.m1436b(context, C3858a.colorControlNormal), C0235h.f1095b);
                m1320a(layerDrawable.findDrawableByLayerId(16908301), C0263o0.m1436b(context, C3858a.colorControlActivated), C0235h.f1095b);
                return true;
            } else if (i != C3862e.abc_ratingbar_material && i != C3862e.abc_ratingbar_indicator_material && i != C3862e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1320a(layerDrawable2.findDrawableByLayerId(16908288), C0263o0.m1433a(context, C3858a.colorControlNormal), C0235h.f1095b);
                m1320a(layerDrawable2.findDrawableByLayerId(16908303), C0263o0.m1436b(context, C3858a.colorControlActivated), C0235h.f1095b);
                m1320a(layerDrawable2.findDrawableByLayerId(16908301), C0263o0.m1436b(context, C3858a.colorControlActivated), C0235h.f1095b);
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1674a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0235h.f1095b
                int[] r1 = r6.f1098a
                boolean r1 = r6.m1321a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0018
                int r2 = p096e.p097a.C3858a.colorControlNormal
            L_0x0014:
                r1 = r0
                r8 = 1
                r0 = -1
                goto L_0x0049
            L_0x0018:
                int[] r1 = r6.f1100c
                boolean r1 = r6.m1321a(r1, r8)
                if (r1 == 0) goto L_0x0023
                int r2 = p096e.p097a.C3858a.colorControlActivated
                goto L_0x0014
            L_0x0023:
                int[] r1 = r6.f1101d
                boolean r1 = r6.m1321a(r1, r8)
                if (r1 == 0) goto L_0x002e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002e:
                int r1 = p096e.p097a.C3862e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x0040
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = r0
                r0 = r8
                r8 = 1
                goto L_0x0049
            L_0x0040:
                int r1 = p096e.p097a.C3862e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0045
                goto L_0x0014
            L_0x0045:
                r1 = r0
                r8 = 0
                r0 = -1
                r2 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x0066
                boolean r8 = androidx.appcompat.widget.C0204b0.m1172a(r9)
                if (r8 == 0) goto L_0x0055
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0055:
                int r7 = androidx.appcompat.widget.C0263o0.m1436b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0235h.m1311a(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r3) goto L_0x0065
                r9.setAlpha(r0)
            L_0x0065:
                return r5
            L_0x0066:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0235h.C0236a.mo1674a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: a */
        public Mode mo1672a(int i) {
            if (i == C3862e.abc_switch_thumb_material) {
                return Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0235h m1313b() {
        C0235h hVar;
        synchronized (C0235h.class) {
            if (f1096c == null) {
                m1314c();
            }
            hVar = f1096c;
        }
        return hVar;
    }

    /* renamed from: c */
    public static synchronized void m1314c() {
        synchronized (C0235h.class) {
            if (f1096c == null) {
                f1096c = new C0235h();
                f1096c.f1097a = C0242j0.m1346a();
                f1096c.f1097a.mo1696a((C0247e) new C0236a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo1667a(Context context, int i) {
        return this.f1097a.mo1692a(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1668a(Context context, int i, boolean z) {
        return this.f1097a.mo1693a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo1669a(Context context) {
        this.f1097a.mo1695a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo1670b(Context context, int i) {
        return this.f1097a.mo1698b(context, i);
    }

    /* renamed from: a */
    static void m1312a(Drawable drawable, C0269r0 r0Var, int[] iArr) {
        C0242j0.m1348a(drawable, r0Var, iArr);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1311a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0235h.class) {
            a = C0242j0.m1342a(i, mode);
        }
        return a;
    }
}
