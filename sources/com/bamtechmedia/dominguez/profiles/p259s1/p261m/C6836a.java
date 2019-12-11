package com.bamtechmedia.dominguez.profiles.p259s1.p261m;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView;
import com.bamtechmedia.dominguez.core.p088i.C3841k;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.p259s1.C6791g;
import com.bamtechmedia.dominguez.profiles.p259s1.C6829k;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p330z.C7946e;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016JC\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/add/tv/TvSetupProfileOptionViews;", "Lcom/bamtechmedia/dominguez/profiles/add/SetupProfileOptionViews;", "()V", "setupAutoPlayOption", "", "fragment", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileFragment;", "isChecked", "", "isVisible", "onCheckedChangeListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setupBackgroundVideoOption", "setupKidsOption", "setupLanguagesOption", "onClickListener", "Lkotlin/Function0;", "updateLanguageSubtitle", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "selectedLanguage", "", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a */
/* compiled from: TvSetupProfileOptionViews.kt */
public final class C6836a implements C6829k {

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$a */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6837a implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ Function1 f15276U;

        /* renamed from: c */
        final /* synthetic */ C6791g f15277c;

        C6837a(C6791g gVar, boolean z, boolean z2, Function1 function1) {
            this.f15277c = gVar;
            this.f15276U = function1;
        }

        public final void onClick(View view) {
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) this.f15277c._$_findCachedViewById(C7946e.autoPlayOnOffText);
            if (onOffToggleTextView != null) {
                onOffToggleTextView.toggle();
                this.f15276U.invoke(Boolean.valueOf(onOffToggleTextView.isChecked()));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$b */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6838b implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15278c;

        C6838b(C6791g gVar) {
            this.f15278c = gVar;
        }

        public final void onFocusChange(View view, boolean z) {
            int i = z ? C3841k.autoplay_subcopy : C3841k.primaryprofileexplainer;
            TextView textView = (TextView) this.f15278c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView != null) {
                textView.setText(C5880u.m18936a(i));
            }
            TextView textView2 = (TextView) this.f15278c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView2 != null) {
                C4127b0.m14130a(textView2, !z && !this.f15278c.mo19532q().isDefault());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$c */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6839c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ Function1 f15279U;

        /* renamed from: c */
        final /* synthetic */ C6791g f15280c;

        C6839c(C6791g gVar, boolean z, Function1 function1) {
            this.f15280c = gVar;
            this.f15279U = function1;
        }

        public final void onClick(View view) {
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) this.f15280c._$_findCachedViewById(C7946e.backgroundVideoOnOffText);
            if (onOffToggleTextView != null) {
                onOffToggleTextView.toggle();
                this.f15279U.invoke(Boolean.valueOf(onOffToggleTextView.isChecked()));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$d */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6840d implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15281c;

        C6840d(C6791g gVar) {
            this.f15281c = gVar;
        }

        public final void onFocusChange(View view, boolean z) {
            int i = z ? C3841k.settings_background_video_subcopy : C3841k.primaryprofileexplainer;
            TextView textView = (TextView) this.f15281c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView != null) {
                textView.setText(C5880u.m18936a(i));
            }
            TextView textView2 = (TextView) this.f15281c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView2 != null) {
                C4127b0.m14130a(textView2, !z && !this.f15281c.mo19532q().isDefault());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$e */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6841e implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ Function1 f15282U;

        /* renamed from: c */
        final /* synthetic */ C6791g f15283c;

        C6841e(C6791g gVar, boolean z, Function1 function1) {
            this.f15283c = gVar;
            this.f15282U = function1;
        }

        public final void onClick(View view) {
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) this.f15283c._$_findCachedViewById(C7946e.kidsProfileOnOffText);
            if (onOffToggleTextView != null) {
                onOffToggleTextView.toggle();
                this.f15282U.invoke(Boolean.valueOf(onOffToggleTextView.isChecked()));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$f */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6842f implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15284c;

        C6842f(C6791g gVar) {
            this.f15284c = gVar;
        }

        public final void onFocusChange(View view, boolean z) {
            TextView textView = (TextView) this.f15284c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView != null) {
                textView.setText(C5880u.m18936a(C3841k.kidsprofile_subcopy));
            }
            TextView textView2 = (TextView) this.f15284c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView2 != null) {
                C4127b0.m14130a(textView2, !z);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$g */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6843g implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f15285c;

        C6843g(Function0 function0) {
            this.f15285c = function0;
        }

        public final void onClick(View view) {
            this.f15285c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.m.a$h */
    /* compiled from: TvSetupProfileOptionViews.kt */
    static final class C6844h implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15286c;

        C6844h(C6791g gVar) {
            this.f15286c = gVar;
        }

        public final void onFocusChange(View view, boolean z) {
            TextView textView = (TextView) this.f15286c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = (TextView) this.f15286c._$_findCachedViewById(C7946e.defaultTextView);
            if (textView2 != null) {
                C4127b0.m14130a(textView2, !z);
            }
        }
    }

    /* renamed from: a */
    public void mo19600a(C6791g gVar, boolean z, Function1<? super Boolean, C13145v> function1) {
        View _$_findCachedViewById = gVar._$_findCachedViewById(C7946e.kidsProfileOption);
        if (_$_findCachedViewById != null) {
            C4127b0.m14131b(_$_findCachedViewById, true);
        }
        OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) gVar._$_findCachedViewById(C7946e.kidsProfileOnOffText);
        if (onOffToggleTextView != null) {
            onOffToggleTextView.setChecked(z);
        }
        View _$_findCachedViewById2 = gVar._$_findCachedViewById(C7946e.kidsProfileOption);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setOnClickListener(new C6841e(gVar, z, function1));
        }
        View _$_findCachedViewById3 = gVar._$_findCachedViewById(C7946e.kidsProfileOption);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setOnFocusChangeListener(new C6842f(gVar));
        }
    }

    /* renamed from: b */
    public void mo19602b(C6791g gVar, boolean z, boolean z2, Function1<? super Boolean, C13145v> function1) {
        if (z2) {
            View _$_findCachedViewById = gVar._$_findCachedViewById(C7946e.autoPlayOption);
            if (_$_findCachedViewById != null) {
                C4127b0.m14131b(_$_findCachedViewById, z2);
            }
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) gVar._$_findCachedViewById(C7946e.autoPlayOnOffText);
            if (onOffToggleTextView != null) {
                onOffToggleTextView.setChecked(z);
            }
            View _$_findCachedViewById2 = gVar._$_findCachedViewById(C7946e.autoPlayOption);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setOnClickListener(new C6837a(gVar, z2, z, function1));
            }
            View _$_findCachedViewById3 = gVar._$_findCachedViewById(C7946e.autoPlayOption);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setOnFocusChangeListener(new C6838b(gVar));
            }
        }
    }

    /* renamed from: a */
    public void mo19599a(C6791g gVar, boolean z, Function0<C13145v> function0) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) gVar._$_findCachedViewById(C7946e.profileLanguageOption);
            if (linearLayout != null) {
                C4127b0.m14131b(linearLayout, true);
            }
            LinearLayout linearLayout2 = (LinearLayout) gVar._$_findCachedViewById(C7946e.profileLanguageOption);
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C6843g(function0));
            }
            LinearLayout linearLayout3 = (LinearLayout) gVar._$_findCachedViewById(C7946e.profileLanguageOption);
            if (linearLayout3 != null) {
                linearLayout3.setOnFocusChangeListener(new C6844h(gVar));
            }
        }
    }

    /* renamed from: a */
    public void mo19598a(C6791g gVar, C6913e eVar, String str) {
        List d = eVar.mo19679d();
        ArrayList<Pair> arrayList = new ArrayList<>();
        Iterator it = d.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Pair pair = (Pair) next;
            if (pair != null) {
                str2 = (String) pair.mo31016d();
            }
            if (C12880j.m40224a((Object) str2, (Object) str)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (Pair pair2 : arrayList) {
            arrayList2.add(pair2 != null ? (String) pair2.mo31015c() : null);
        }
        if (!arrayList2.isEmpty()) {
            TextView textView = (TextView) gVar._$_findCachedViewById(C7946e.profileTextLanguage);
            if (textView != null) {
                textView.setText((CharSequence) C13199w.m40589f((List) arrayList2));
            }
            LinearLayout linearLayout = (LinearLayout) gVar._$_findCachedViewById(C7946e.profileLanguageOption);
            if (linearLayout != null) {
                linearLayout.setContentDescription(gVar.mo19531p().mo19293a((String) C13199w.m40589f((List) arrayList2)));
            }
        }
    }

    /* renamed from: a */
    public void mo19601a(C6791g gVar, boolean z, boolean z2, Function1<? super Boolean, C13145v> function1) {
        if (z2) {
            LinearLayout linearLayout = (LinearLayout) gVar._$_findCachedViewById(C7946e.backgroundVideoOption);
            if (linearLayout != null) {
                C4127b0.m14131b(linearLayout, true);
            }
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) gVar._$_findCachedViewById(C7946e.backgroundVideoOnOffText);
            if (onOffToggleTextView != null) {
                onOffToggleTextView.setChecked(z);
            }
            LinearLayout linearLayout2 = (LinearLayout) gVar._$_findCachedViewById(C7946e.backgroundVideoOption);
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C6839c(gVar, z, function1));
            }
            LinearLayout linearLayout3 = (LinearLayout) gVar._$_findCachedViewById(C7946e.backgroundVideoOption);
            if (linearLayout3 != null) {
                linearLayout3.setOnFocusChangeListener(new C6840d(gVar));
            }
        }
    }
}
