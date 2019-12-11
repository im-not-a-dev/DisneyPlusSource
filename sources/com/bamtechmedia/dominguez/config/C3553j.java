package com.bamtechmedia.dominguez.config;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView;
import com.bamtechmedia.dominguez.core.framework.C5735b.C5736a;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.google.android.material.textfield.C10349c;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/ConfigStringsLayoutInflater;", "Lcom/bamtechmedia/dominguez/core/framework/BaseActivity$LayoutInflaterWrapper;", "()V", "contentDescriptionAttribute", "", "defaultAttributeValue", "hintAttribute", "imageViewAttributes", "", "queryHintAttribute", "searchViewAttributes", "textAttribute", "textInputLayoutAttributes", "textInputLayoutHintAttribute", "textViewAttributes", "wrap", "Landroid/view/LayoutInflater;", "inflater", "ConfigStringsFactory2", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.j */
/* compiled from: ConfigStringsLayoutInflater.kt */
public final class C3553j implements C5736a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f8876a = {16843087, 16843088, 16843379};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f8877b = {16843379};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int f8878c = C3570q0.TextInputLayout_android_hint;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f8879d = {f8878c};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int f8880e = C3570q0.SearchView_queryHint;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f8881f = {f8880e};

    /* renamed from: g */
    public static final C3553j f8882g = new C3553j();

    /* renamed from: com.bamtechmedia.dominguez.config.j$a */
    /* compiled from: ConfigStringsLayoutInflater.kt */
    private static final class C3554a implements Factory2 {

        /* renamed from: c */
        private final Factory2 f8883c;

        public C3554a(Factory2 factory2) {
            this.f8883c = factory2;
        }

        /* renamed from: a */
        private final void m11988a(Context context, AttributeSet attributeSet, View view) {
            if (view instanceof VaderTextView) {
                m11990a(context, attributeSet, (TextView) view);
            } else if (view instanceof AppCompatImageView) {
                m11989a(context, attributeSet, (ImageView) view);
            } else if (view instanceof C10349c) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3553j.f8879d, 0, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C3553j.f8878c, -1);
                if (resourceId != -1) {
                    ((C10349c) view).setHint(C5880u.m18938a(context, resourceId));
                }
                obtainStyledAttributes.recycle();
            } else if (view instanceof SearchView) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3553j.f8881f, 0, 0);
                int resourceId2 = obtainStyledAttributes2.getResourceId(C3553j.f8880e, -1);
                if (resourceId2 != -1) {
                    ((SearchView) view).setQueryHint(C5880u.m18938a(context, resourceId2));
                }
                obtainStyledAttributes2.recycle();
            }
        }

        /* JADX WARNING: type inference failed for: r8v5, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r8v17, types: [androidx.appcompat.widget.AppCompatImageView] */
        /* JADX WARNING: type inference failed for: r8v19, types: [androidx.appcompat.widget.SearchView] */
        /* JADX WARNING: type inference failed for: r8v20, types: [com.google.android.material.textfield.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 3 */
        @android.annotation.SuppressLint({"ResourceType"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r7 = this;
                android.view.LayoutInflater$Factory2 r0 = r7.f8883c
                android.view.View r8 = r0.onCreateView(r8, r9, r10, r11)
                boolean r0 = r8 instanceof android.widget.TextView
                if (r0 == 0) goto L_0x0011
                r0 = r8
                android.widget.TextView r0 = (android.widget.TextView) r0
                r7.m11990a(r10, r11, r0)
                goto L_0x0023
            L_0x0011:
                boolean r0 = r8 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x001c
                r0 = r8
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r7.m11989a(r10, r11, r0)
                goto L_0x0023
            L_0x001c:
                boolean r0 = r8 instanceof com.google.android.material.textfield.C10349c
                if (r0 == 0) goto L_0x0023
                r7.m11988a(r10, r11, r8)
            L_0x0023:
                if (r8 != 0) goto L_0x007c
                java.lang.Class<com.google.android.material.textfield.c> r8 = com.google.android.material.textfield.C10349c.class
                java.lang.String r8 = r8.getCanonicalName()
                boolean r8 = kotlin.jvm.internal.C12880j.m40224a(r9, r8)
                r0 = 0
                if (r8 == 0) goto L_0x0038
                com.google.android.material.textfield.c r8 = new com.google.android.material.textfield.c
                r8.<init>(r10, r11)
                goto L_0x0075
            L_0x0038:
                java.lang.Class<androidx.appcompat.widget.SearchView> r8 = androidx.appcompat.widget.SearchView.class
                java.lang.String r8 = r8.getCanonicalName()
                boolean r8 = kotlin.jvm.internal.C12880j.m40224a(r9, r8)
                if (r8 == 0) goto L_0x004a
                androidx.appcompat.widget.SearchView r8 = new androidx.appcompat.widget.SearchView
                r8.<init>(r10, r11)
                goto L_0x0075
            L_0x004a:
                java.lang.Class<com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView> r8 = com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView.class
                java.lang.String r8 = r8.getCanonicalName()
                boolean r8 = kotlin.jvm.internal.C12880j.m40224a(r9, r8)
                if (r8 == 0) goto L_0x0062
                com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView r8 = new com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r8
                r2 = r10
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                goto L_0x0075
            L_0x0062:
                java.lang.Class<androidx.appcompat.widget.AppCompatImageView> r8 = androidx.appcompat.widget.AppCompatImageView.class
                java.lang.String r8 = r8.getCanonicalName()
                boolean r8 = kotlin.jvm.internal.C12880j.m40224a(r9, r8)
                if (r8 == 0) goto L_0x0074
                androidx.appcompat.widget.AppCompatImageView r8 = new androidx.appcompat.widget.AppCompatImageView
                r8.<init>(r10, r11)
                goto L_0x0075
            L_0x0074:
                r8 = r0
            L_0x0075:
                if (r8 == 0) goto L_0x007b
                r7.m11988a(r10, r11, r8)
                goto L_0x007c
            L_0x007b:
                r8 = r0
            L_0x007c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.config.C3553j.C3554a.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return onCreateView(null, str, context, attributeSet);
        }

        /* renamed from: a */
        private final void m11990a(Context context, AttributeSet attributeSet, TextView textView) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3553j.f8876a, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId != -1) {
                textView.setText(C5880u.m18938a(context, resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            if (resourceId2 != -1) {
                textView.setHint(C5880u.m18938a(context, resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, -1);
            if (resourceId3 != -1) {
                textView.setContentDescription(C5880u.m18938a(context, resourceId3));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private final void m11989a(Context context, AttributeSet attributeSet, ImageView imageView) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3553j.f8877b, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId != -1) {
                imageView.setContentDescription(C5880u.m18938a(context, resourceId));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private C3553j() {
    }

    /* renamed from: a */
    public LayoutInflater mo12759a(LayoutInflater layoutInflater) {
        if (layoutInflater.getFactory2() instanceof C3554a) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(layoutInflater.getContext());
        C12880j.m40222a((Object) cloneInContext, "it");
        Factory2 factory2 = cloneInContext.getFactory2();
        C12880j.m40222a((Object) factory2, "currentFactory");
        cloneInContext.setFactory2(new C3554a(factory2));
        C12880j.m40222a((Object) cloneInContext, "inflater.cloneInContext(…entFactory)\n            }");
        return cloneInContext;
    }
}
