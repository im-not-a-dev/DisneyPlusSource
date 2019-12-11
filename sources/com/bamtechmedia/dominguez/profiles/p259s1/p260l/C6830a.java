package com.bamtechmedia.dominguez.profiles.p259s1.p260l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.p259s1.C6791g;
import com.bamtechmedia.dominguez.profiles.p259s1.C6829k;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7949h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016JC\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/add/mobile/MobileSetupProfileOptionViews;", "Lcom/bamtechmedia/dominguez/profiles/add/SetupProfileOptionViews;", "()V", "setupAutoPlayOption", "", "fragment", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileFragment;", "isChecked", "", "isVisible", "onCheckedChangeListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setupBackgroundVideoOption", "setupKidsOption", "setupLanguagesOption", "onClickListener", "Lkotlin/Function0;", "updateLanguageSubtitle", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "selectedLanguage", "", "addOption", "Landroid/view/ViewGroup;", "titleText", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a */
/* compiled from: MobileSetupProfileOptionViews.kt */
public final class C6830a implements C6829k {

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a$a */
    /* compiled from: MobileSetupProfileOptionViews.kt */
    static final class C6831a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f15271c;

        C6831a(String str, Function0 function0) {
            this.f15271c = function0;
        }

        public final void onClick(View view) {
            this.f15271c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a$b */
    /* compiled from: MobileSetupProfileOptionViews.kt */
    static final class C6832b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f15272a;

        C6832b(boolean z, Function1 function1) {
            this.f15272a = function1;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f15272a.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a$c */
    /* compiled from: MobileSetupProfileOptionViews.kt */
    static final class C6833c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15273c;

        C6833c(C6791g gVar) {
            this.f15273c = gVar;
        }

        public final void onClick(View view) {
            SwitchCompat switchCompat = (SwitchCompat) this.f15273c._$_findCachedViewById(C7946e.autoPlayToggleSwitch);
            if (switchCompat != null) {
                switchCompat.toggle();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a$d */
    /* compiled from: MobileSetupProfileOptionViews.kt */
    static final class C6834d implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f15274a;

        C6834d(boolean z, Function1 function1) {
            this.f15274a = function1;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f15274a.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.l.a$e */
    /* compiled from: MobileSetupProfileOptionViews.kt */
    static final class C6835e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15275c;

        C6835e(C6791g gVar) {
            this.f15275c = gVar;
        }

        public final void onClick(View view) {
            SwitchCompat switchCompat = (SwitchCompat) this.f15275c._$_findCachedViewById(C7946e.kidsProfileToggleSwitch);
            if (switchCompat != null) {
                switchCompat.toggle();
            }
        }
    }

    /* renamed from: a */
    public void mo19600a(C6791g gVar, boolean z, Function1<? super Boolean, C13145v> function1) {
        View _$_findCachedViewById = gVar._$_findCachedViewById(C7946e.kidsProfileSeparator);
        if (_$_findCachedViewById != null) {
            C4127b0.m14131b(_$_findCachedViewById, true);
        }
        View _$_findCachedViewById2 = gVar._$_findCachedViewById(C7946e.kidsProfileOption);
        if (_$_findCachedViewById2 != null) {
            C4127b0.m14131b(_$_findCachedViewById2, true);
        }
        TextView textView = (TextView) gVar._$_findCachedViewById(C7946e.kidsProfileSubTitle);
        if (textView != null) {
            textView.setText(C5880u.m18936a(C7949h.kidsprofile_subcopy));
        }
        View _$_findCachedViewById3 = gVar._$_findCachedViewById(C7946e.kidsProfileOption);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setOnClickListener(new C6835e(gVar));
        }
        SwitchCompat switchCompat = (SwitchCompat) gVar._$_findCachedViewById(C7946e.kidsProfileToggleSwitch);
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
        SwitchCompat switchCompat2 = (SwitchCompat) gVar._$_findCachedViewById(C7946e.kidsProfileToggleSwitch);
        if (switchCompat2 != null) {
            switchCompat2.setOnCheckedChangeListener(new C6834d(z, function1));
        }
    }

    /* renamed from: a */
    public void mo19601a(C6791g gVar, boolean z, boolean z2, Function1<? super Boolean, C13145v> function1) {
    }

    /* renamed from: b */
    public void mo19602b(C6791g gVar, boolean z, boolean z2, Function1<? super Boolean, C13145v> function1) {
        if (z2) {
            View _$_findCachedViewById = gVar._$_findCachedViewById(C7946e.autoplaySeparator);
            if (_$_findCachedViewById != null) {
                C4127b0.m14131b(_$_findCachedViewById, true);
            }
            View _$_findCachedViewById2 = gVar._$_findCachedViewById(C7946e.autoPlayOption);
            if (_$_findCachedViewById2 != null) {
                C4127b0.m14131b(_$_findCachedViewById2, true);
            }
            TextView textView = (TextView) gVar._$_findCachedViewById(C7946e.autoplaySubTitle);
            if (textView != null) {
                textView.setText(C5880u.m18936a(C7949h.autoplay_subcopy));
            }
            View _$_findCachedViewById3 = gVar._$_findCachedViewById(C7946e.autoPlayOption);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setOnClickListener(new C6833c(gVar));
            }
            SwitchCompat switchCompat = (SwitchCompat) gVar._$_findCachedViewById(C7946e.autoPlayToggleSwitch);
            if (switchCompat != null) {
                switchCompat.setChecked(z);
            }
            SwitchCompat switchCompat2 = (SwitchCompat) gVar._$_findCachedViewById(C7946e.autoPlayToggleSwitch);
            if (switchCompat2 != null) {
                switchCompat2.setOnCheckedChangeListener(new C6832b(z, function1));
            }
        }
    }

    /* renamed from: a */
    public void mo19599a(C6791g gVar, boolean z, Function0<C13145v> function0) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) gVar._$_findCachedViewById(C7946e.optionsLayout);
            if (linearLayout != null) {
                m20982a((ViewGroup) linearLayout, C5880u.m18936a(C7949h.ui_language_setting), function0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19598a(com.bamtechmedia.dominguez.profiles.p259s1.C6791g r6, com.bamtechmedia.dominguez.profiles.p268x1.C6913e r7, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List r7 = r7.mo19679d()
            int r0 = p163g.p201e.p203b.p330z.C7946e.optionsLayout
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            if (r0 == 0) goto L_0x0048
            kotlin.i0.h r0 = p096e.p121h.p135s.C4121a0.m14117a(r0)
            if (r0 == 0) goto L_0x0048
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            int r4 = p163g.p201e.p203b.p330z.C7946e.title
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0035
            java.lang.CharSequence r3 = r3.getText()
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            int r4 = p163g.p201e.p203b.p330z.C7949h.ui_language_setting
            java.lang.String r4 = com.bamtechmedia.dominguez.core.utils.C5880u.m18936a(r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L_0x0019
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0052:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r7.next()
            r4 = r3
            kotlin.Pair r4 = (kotlin.Pair) r4
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r4.mo31016d()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0069
        L_0x0068:
            r4 = r1
        L_0x0069:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r8)
            if (r4 == 0) goto L_0x0052
            r2.add(r3)
            goto L_0x0052
        L_0x0073:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.p590y.C13187p.m40525a(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L_0x0082:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x009c
            java.lang.Object r2 = r8.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r2.mo31015c()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            r7.add(r2)
            goto L_0x0082
        L_0x009c:
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x00d6
            if (r0 == 0) goto L_0x00c1
            int r8 = p163g.p201e.p203b.p330z.C7946e.root
            android.view.View r8 = r0.findViewById(r8)
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            if (r8 == 0) goto L_0x00c1
            com.bamtechmedia.dominguez.profiles.d0 r6 = r6.mo19531p()
            java.lang.Object r1 = kotlin.p590y.C13199w.m40589f(r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = r6.mo19293a(r1)
            r8.setContentDescription(r6)
        L_0x00c1:
            if (r0 == 0) goto L_0x00d6
            int r6 = p163g.p201e.p203b.p330z.C7946e.subtitle
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x00d6
            java.lang.Object r7 = kotlin.p590y.C13199w.m40589f(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.setText(r7)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p259s1.p260l.C6830a.mo19598a(com.bamtechmedia.dominguez.profiles.s1.g, com.bamtechmedia.dominguez.profiles.x1.e, java.lang.String):void");
    }

    /* renamed from: a */
    private final void m20982a(ViewGroup viewGroup, String str, Function0<C13145v> function0) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C7948g.item_edit_profile, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7946e.title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "title");
        textView.setText(str);
        ((ConstraintLayout) inflate.findViewById(C7946e.root)).setOnClickListener(new C6831a(str, function0));
        viewGroup.addView(inflate);
    }
}
