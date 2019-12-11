package com.bamtechmedia.dominguez.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.config.C3552i0;
import com.bamtechmedia.dominguez.core.content.search.C3732d;
import com.bamtechmedia.dominguez.core.content.search.Suggestion;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p122j.p124d.C4039f;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.p511l.C11867b;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p527w.p529c.C11992a;
import p570k.p571a.p572a.C12678a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0004QRSTBI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010+\u001a\u00020,H\u0002J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0$2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000$H\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020,H\u0002J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020 H\u0002J9\u00105\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u00104\u001a\u00020 2!\u00106\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020 07H\u0003J\b\u0010;\u001a\u00020<H\u0002J\u0016\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020 H\u0016J\u0016\u0010C\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0$H\u0002J\u0018\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020%H\u0002J\b\u0010I\u001a\u00020,H\u0002J\u0010\u0010J\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020%H\u0003J\u0016\u0010K\u001a\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010L\u001a\u00020,H\u0002J\u0016\u0010M\u001a\u00020,2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\u0010\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020 H\u0002R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter;", "Lkotlinx/android/extensions/LayoutContainer;", "Lcom/bamtechmedia/dominguez/search/KeyboardSearchSuggestionClickListener;", "container", "Landroid/widget/LinearLayout;", "searchView", "Landroid/widget/EditText;", "searchSuggestionApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;", "keysSource", "Lcom/bamtechmedia/dominguez/config/KeysSource;", "suggestionAvailabilityListener", "Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter$KeyboardSuggestionAvailabilityListener;", "searchAccessibility", "Lcom/bamtechmedia/dominguez/search/SearchAccessibility;", "context", "Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/widget/LinearLayout;Landroid/widget/EditText;Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;Lcom/bamtechmedia/dominguez/config/KeysSource;Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter$KeyboardSuggestionAvailabilityListener;Lcom/bamtechmedia/dominguez/search/SearchAccessibility;Landroid/content/Context;Landroid/view/LayoutInflater;)V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "containerView", "getContainerView", "()Landroid/widget/LinearLayout;", "currentlyDisplayedState", "Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter$KeyboardLetterStates;", "itemMargin", "", "keyboardLetterWidth", "lastSearch", "", "lowerLetters", "lowerLettersDisplay", "lowercaseViews", "", "Landroid/widget/TextView;", "numberViews", "numbers", "numbersDisplay", "searchRequestDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "cancelInFlightSearches", "", "createPrioritizedSearchSuggestions", "Lcom/xwray/groupie/Group;", "suggestions", "Lcom/bamtechmedia/dominguez/core/content/search/Suggestion;", "displayLowerKeyboard", "displayNumberKeyboard", "initializeLettersSize", "buttonInputs", "initializeViews", "accessLetters", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "char", "isNumericKeyboardShowing", "", "onSearchTextChanged", "newText", "fragment", "Landroidx/fragment/app/Fragment;", "onSuggestionClicked", "suggestion", "processSuggestions", "setTextViewState", "textView", "state", "Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter$TextState;", "setupDeleteButton", "setupKeyboardSelectionButton", "setupSpaceButton", "suggestionCount", "updateButtonStates", "updateKeyboardStateWithTextViews", "textViews", "updateSearchView", "newChar", "Companion", "KeyboardLetterStates", "KeyboardSuggestionAvailabilityListener", "TextState", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.c */
/* compiled from: CustomKeyboardPresenter.kt */
public final class C8002c implements C12678a, C8032h {

    /* renamed from: a */
    private final String f17175a;

    /* renamed from: b */
    private final String f17176b;

    /* renamed from: c */
    private final String f17177c;

    /* renamed from: d */
    private final String f17178d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11848c<C11867b> f17179e;

    /* renamed from: f */
    private final int f17180f;

    /* renamed from: g */
    private List<? extends TextView> f17181g;

    /* renamed from: h */
    private List<? extends TextView> f17182h;

    /* renamed from: i */
    private int f17183i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f17184j;

    /* renamed from: k */
    private final CompositeDisposable f17185k;

    /* renamed from: l */
    private C8006d f17186l;

    /* renamed from: m */
    private final LinearLayout f17187m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final EditText f17188n;

    /* renamed from: o */
    private final C3732d f17189o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C8007e f17190p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C8059s f17191q;

    /* renamed from: r */
    private final Context f17192r;

    /* renamed from: s */
    private final LayoutInflater f17193s;

    /* renamed from: t */
    private HashMap f17194t;

    /* renamed from: com.bamtechmedia.dominguez.search.c$a */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8003a extends C12881k implements Function1<String, String> {

        /* renamed from: c */
        final /* synthetic */ C8002c f17195c;

        C8003a(C8002c cVar) {
            this.f17195c = cVar;
            super(1);
        }

        public final String invoke(String str) {
            return this.f17195c.f17191q.mo21039b(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$b */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8004b extends C12881k implements Function1<String, String> {

        /* renamed from: c */
        final /* synthetic */ C8002c f17196c;

        C8004b(C8002c cVar) {
            this.f17196c = cVar;
            super(1);
        }

        public final String invoke(String str) {
            return this.f17196c.f17191q.mo21040c(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$c */
    /* compiled from: CustomKeyboardPresenter.kt */
    private static final class C8005c {
        private C8005c() {
        }

        public /* synthetic */ C8005c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$d */
    /* compiled from: CustomKeyboardPresenter.kt */
    private enum C8006d {
        LOWER_ALPHA,
        NUMERIC
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$e */
    /* compiled from: CustomKeyboardPresenter.kt */
    public interface C8007e {
        /* renamed from: a */
        void mo21000a(Function0<C13145v> function0);

        /* renamed from: b */
        void mo21001b(Function0<C13145v> function0);
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$f */
    /* compiled from: CustomKeyboardPresenter.kt */
    private static final class C8008f {

        /* renamed from: a */
        private final int f17200a;

        /* renamed from: b */
        private final int f17201b;

        public C8008f(boolean z, boolean z2) {
            int i;
            int i2;
            if (z && !z2) {
                i = C8045k.grey8;
            } else if (!z && z2) {
                i = C8045k.vader_white;
            } else if (z || z2) {
                i = C8045k.vader_black;
            } else {
                i = C8045k.vader_grey8;
            }
            this.f17200a = i;
            if ((!z || z2) && (z || z2)) {
                i2 = C8047m.avenir85_heavy;
            } else {
                i2 = C8047m.avenir55_roman;
            }
            this.f17201b = i2;
        }

        /* renamed from: a */
        public final int mo21002a() {
            return this.f17200a;
        }

        /* renamed from: b */
        public final int mo21003b() {
            return this.f17201b;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$g */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8009g implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C8002c f17202U;

        /* renamed from: c */
        final /* synthetic */ String f17203c;

        C8009g(String str, C8002c cVar, String str2, Function1 function1, String str3) {
            this.f17203c = str;
            this.f17202U = cVar;
        }

        public final void onClick(View view) {
            this.f17202U.f17188n.setText(this.f17202U.f17188n.getText().append(this.f17203c));
            this.f17202U.f17188n.setSelection(this.f17202U.f17188n.length() - 1);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$h */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final /* synthetic */ class C8010h extends C12879i implements Function1<List<? extends Suggestion>, List<? extends C11847b>> {
        C8010h(C8002c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final List<C11847b> invoke(List<Suggestion> list) {
            return ((C8002c) this.receiver).m23295a(list);
        }

        public final String getName() {
            return "createPrioritizedSearchSuggestions";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C8002c.class);
        }

        public final String getSignature() {
            return "createPrioritizedSearchSuggestions(Ljava/util/List;)Ljava/util/List;";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$i */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8011i<T> implements Consumer<List<? extends C11847b>> {

        /* renamed from: c */
        final /* synthetic */ C8002c f17204c;

        C8011i(C8002c cVar) {
            this.f17204c = cVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends C11847b> list) {
            C8002c cVar = this.f17204c;
            Intrinsics.checkReturnedValueIsNotNull((Object) list, "suggestions");
            cVar.m23306b(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$j */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8012j<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C8012j f17205c = new C8012j();

        C8012j() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error requesting auto search suggestion: ");
            sb.append(th);
            Timber.m44526b(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$k */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8013k extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ List f17206U;

        /* renamed from: c */
        final /* synthetic */ C8002c f17207c;

        C8013k(C8002c cVar, List list) {
            this.f17207c = cVar;
            this.f17206U = list;
            super(0);
        }

        public final void invoke() {
            this.f17207c.f17179e.mo29963a((Collection<? extends C11847b>) this.f17206U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$l */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8014l extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ List f17208U;

        /* renamed from: c */
        final /* synthetic */ C8002c f17209c;

        C8014l(C8002c cVar, List list) {
            this.f17209c = cVar;
            this.f17208U = list;
            super(0);
        }

        public final void invoke() {
            this.f17209c.f17179e.mo29963a((Collection<? extends C11847b>) this.f17208U);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.c$m */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8015m implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ TextView f17210U;

        /* renamed from: c */
        final /* synthetic */ C8002c f17211c;

        /* renamed from: com.bamtechmedia.dominguez.search.c$m$a */
        /* compiled from: CustomKeyboardPresenter.kt */
        static final class C8016a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C8015m f17212c;

            C8016a(C8015m mVar) {
                this.f17212c = mVar;
                super(0);
            }

            public final void invoke() {
                this.f17212c.f17211c.f17179e.mo29963a((Collection<? extends C11847b>) C13185o.m40513a());
            }
        }

        C8015m(C8002c cVar, TextView textView) {
            this.f17211c = cVar;
            this.f17210U = textView;
        }

        public final void onClick(View view) {
            CharSequence text = this.f17210U.getText();
            Intrinsics.checkReturnedValueIsNotNull((Object) text, "text");
            boolean z = true;
            if (text.length() > 0) {
                String obj = text.subSequence(0, text.length() - 1).toString();
                this.f17211c.f17184j = obj;
                this.f17211c.m23309c(obj);
            }
            CharSequence text2 = this.f17210U.getText();
            Intrinsics.checkReturnedValueIsNotNull((Object) text2, "searchView.text");
            if (text2.length() != 0) {
                z = false;
            }
            if (z) {
                C8002c cVar = this.f17211c;
                if (cVar.m23292a(cVar.f17179e) > 0) {
                    this.f17211c.m23300b();
                    RecyclerView recyclerView = (RecyclerView) this.f17211c.mo20995a(C8048n.keyboardResultsRecyclerView);
                    Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "keyboardResultsRecyclerView");
                    recyclerView.setFocusable(false);
                    this.f17211c.f17190p.mo21000a(new C8016a(this));
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$n */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8017n implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ String f17213U;

        /* renamed from: V */
        final /* synthetic */ String f17214V;

        /* renamed from: c */
        final /* synthetic */ C8002c f17215c;

        C8017n(C8002c cVar, String str, String str2) {
            this.f17215c = cVar;
            this.f17213U = str;
            this.f17214V = str2;
        }

        public final void onClick(View view) {
            if (this.f17215c.m23314e()) {
                this.f17215c.m23307c();
                view.announceForAccessibility(this.f17213U);
            } else {
                this.f17215c.m23312d();
                view.announceForAccessibility(this.f17214V);
            }
            this.f17215c.m23318g();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$o */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8018o implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C8002c f17216c;

        C8018o(C8002c cVar) {
            this.f17216c = cVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f17216c.m23318g();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.c$p */
    /* compiled from: CustomKeyboardPresenter.kt */
    static final class C8019p implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ TextView f17217U;

        /* renamed from: c */
        final /* synthetic */ C8002c f17218c;

        C8019p(C8002c cVar, TextView textView) {
            this.f17218c = cVar;
            this.f17217U = textView;
        }

        public final void onClick(View view) {
            C8002c cVar = this.f17218c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17217U.getText().toString());
            sb.append(" ");
            cVar.m23309c(sb.toString());
        }
    }

    static {
        new C8005c(null);
    }

    public C8002c(LinearLayout linearLayout, EditText editText, C3732d dVar, C3552i0 i0Var, C8007e eVar, C8059s sVar, Context context, LayoutInflater layoutInflater) {
        this.f17187m = linearLayout;
        this.f17188n = editText;
        this.f17189o = dVar;
        this.f17190p = eVar;
        this.f17191q = sVar;
        this.f17192r = context;
        this.f17193s = layoutInflater;
        this.f17175a = i0Var.mo12734a(C8051q.characters_lower_case);
        this.f17176b = C12839z.m40187f(C12832w.m40117a(this.f17175a, " ", "", false, 4, (Object) null), 3);
        this.f17177c = i0Var.mo12734a(C8051q.characters_numeral);
        this.f17178d = C12839z.m40187f(C12832w.m40117a(this.f17177c, " ", "", false, 4, (Object) null), 3);
        this.f17179e = new C11848c<>();
        this.f17180f = (int) this.f17192r.getResources().getDimension(C8046l.keyboard_item_margin);
        this.f17181g = C13185o.m40513a();
        this.f17182h = C13185o.m40513a();
        this.f17184j = "";
        this.f17185k = new CompositeDisposable();
        this.f17186l = C8006d.LOWER_ALPHA;
        this.f17193s.inflate(C8050p.keyboard_layout, this.f17187m, true);
        m23305b(this.f17175a);
        this.f17181g = m23294a(this.f17175a, (Function1<? super String, String>) new C8003a<Object,String>(this));
        this.f17182h = m23294a(this.f17177c, (Function1<? super String, String>) new C8004b<Object,String>(this));
        m23296a((TextView) this.f17188n);
        m23301b((TextView) this.f17188n);
        m23316f();
        m23307c();
        RecyclerView recyclerView = (RecyclerView) mo20995a(C8048n.keyboardResultsRecyclerView);
        String str = "keyboardResultsRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
        recyclerView.setAdapter(this.f17179e);
        RecyclerView recyclerView2 = (RecyclerView) mo20995a(C8048n.keyboardResultsRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
        recyclerView2.setFocusable(false);
        TextView textView = (TextView) this.f17187m.findViewById(C8048n.search_keyboard_first_letter);
        if (textView != null) {
            textView.requestFocus();
        }
    }

    /* renamed from: a */
    public View mo20995a(int i) {
        if (this.f17194t == null) {
            this.f17194t = new HashMap();
        }
        View view = (View) this.f17194t.get(Integer.valueOf(i));
        if (view == null) {
            View a = mo20994a();
            if (a == null) {
                return null;
            }
            view = a.findViewById(i);
            this.f17194t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23307c() {
        m23310c(this.f17181g);
        this.f17186l = C8006d.LOWER_ALPHA;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23312d() {
        m23310c(this.f17182h);
        this.f17186l = C8006d.NUMERIC;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m23314e() {
        return this.f17186l == C8006d.NUMERIC;
    }

    /* renamed from: f */
    private final void m23316f() {
        TextView textView = (TextView) mo20995a(C8048n.keyboardLowerLetterTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "keyboardLowerLetterTextView");
        textView.setText(this.f17176b);
        TextView textView2 = (TextView) mo20995a(C8048n.keyboardNumericTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "keyboardNumericTextView");
        textView2.setText(this.f17178d);
        String a = this.f17191q.mo21037a("letters input mode");
        String a2 = this.f17191q.mo21037a("numbers input mode");
        LinearLayout linearLayout = (LinearLayout) mo20995a(C8048n.keyboardSelectionButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "keyboardSelectionButton");
        linearLayout.setContentDescription(a);
        ((LinearLayout) mo20995a(C8048n.keyboardSelectionButton)).setOnClickListener(new C8017n(this, a, a2));
        ((LinearLayout) mo20995a(C8048n.keyboardSelectionButton)).setOnFocusChangeListener(new C8018o(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m23318g() {
        LinearLayout linearLayout = (LinearLayout) mo20995a(C8048n.keyboardSelectionButton);
        String str = "keyboardSelectionButton";
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, str);
        C8008f fVar = new C8008f(linearLayout.isFocused(), m23314e());
        LinearLayout linearLayout2 = (LinearLayout) mo20995a(C8048n.keyboardSelectionButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout2, str);
        C8008f fVar2 = new C8008f(linearLayout2.isFocused(), !m23314e());
        TextView textView = (TextView) mo20995a(C8048n.keyboardNumericTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "keyboardNumericTextView");
        m23297a(textView, fVar);
        TextView textView2 = (TextView) mo20995a(C8048n.keyboardLowerLetterTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "keyboardLowerLetterTextView");
        m23297a(textView2, fVar2);
    }

    /* renamed from: b */
    private final void m23305b(String str) {
        List a = C12833x.m40142a((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        float dimension = this.f17192r.getResources().getDimension(C8046l.vader_grid_start_margin);
        Resources resources = this.f17192r.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "context.resources");
        this.f17183i = (int) (((((float) resources.getDisplayMetrics().widthPixels) - (dimension * ((float) 2))) - ((float) (this.f17180f * (a.size() - 1)))) / ((float) a.size()));
    }

    /* renamed from: c */
    private final void m23310c(List<? extends TextView> list) {
        ((LinearLayout) mo20995a(C8048n.keyboardButtonInputContainer)).removeAllViews();
        for (TextView addView : list) {
            ((LinearLayout) mo20995a(C8048n.keyboardButtonInputContainer)).addView(addView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23309c(String str) {
        this.f17188n.setText(str);
        EditText editText = this.f17188n;
        editText.setSelection(C12762h.m39913a(editText.length() - 1, 0));
    }

    /* renamed from: a */
    public LinearLayout m23323a() {
        return this.f17187m;
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: a */
    private final List<TextView> m23294a(String str, Function1<? super String, String> function1) {
        List<String> a = C12833x.m40142a((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        String str2 = (String) C13199w.m40595i((List) a);
        String str3 = (String) C13199w.m40591g((List) a);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (String str4 : a) {
            View inflate = this.f17193s.inflate(C8050p.keyboard_letter_item, (LinearLayout) mo20995a(C8048n.keyboardButtonInputContainer), false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = this.f17183i;
                    if (!Intrinsics.areEqual((Object) str4, (Object) str2)) {
                        int i = this.f17180f;
                        int marginStart = marginLayoutParams.getMarginStart();
                        int i2 = marginLayoutParams.topMargin;
                        int i3 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(marginStart);
                        marginLayoutParams.topMargin = i2;
                        marginLayoutParams.setMarginEnd(i);
                        marginLayoutParams.bottomMargin = i3;
                    }
                    textView.setLayoutParams(marginLayoutParams);
                    textView.setText(str4);
                    textView.setContentDescription((CharSequence) function1.invoke(str4));
                    textView.setTag(C8048n.focusHelperHorizontalFocusSearchWithinParent, Boolean.valueOf(true));
                    if (Intrinsics.areEqual((Object) str4, (Object) str3)) {
                        textView.setId(C8048n.search_keyboard_first_letter);
                        textView.setTag(C8048n.focusHelperExpandNavOnFocusSearchLeft, Boolean.valueOf(true));
                    }
                    C8009g gVar = new C8009g(str4, this, str2, function1, str3);
                    textView.setOnClickListener(gVar);
                    arrayList.add(textView);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23300b() {
        this.f17185k.mo30247a();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: b */
    private final void m23301b(TextView textView) {
        ((ImageView) mo20995a(C8048n.keyboardSpaceButton)).setOnClickListener(new C8019p(this, textView));
        ((ImageView) mo20995a(C8048n.keyboardSpaceButton)).setTag(C8048n.focusHelperHorizontalFocusSearchWithinParent, Boolean.valueOf(true));
        ImageView imageView = (ImageView) mo20995a(C8048n.keyboardSpaceButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "keyboardSpaceButton");
        imageView.setContentDescription(this.f17191q.mo21038b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23306b(List<? extends C11847b> list) {
        int a = m23292a(this.f17179e);
        if ((!list.isEmpty()) && a == 0) {
            this.f17190p.mo21001b(new C8013k(this, list));
        } else if (list.isEmpty() && a > 0) {
            this.f17190p.mo21000a(new C8014l(this, list));
        }
        RecyclerView recyclerView = (RecyclerView) mo20995a(C8048n.keyboardResultsRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "keyboardResultsRecyclerView");
        recyclerView.setFocusable(!list.isEmpty());
    }

    public /* synthetic */ C8002c(LinearLayout linearLayout, EditText editText, C3732d dVar, C3552i0 i0Var, C8007e eVar, C8059s sVar, Context context, LayoutInflater layoutInflater, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Context context2;
        LayoutInflater layoutInflater2;
        int i2 = i;
        if ((i2 & 64) != 0) {
            Context context3 = linearLayout.getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context3, "container.context");
            context2 = context3;
        } else {
            context2 = context;
        }
        if ((i2 & 128) != 0) {
            LayoutInflater from = LayoutInflater.from(context2);
            Intrinsics.checkReturnedValueIsNotNull((Object) from, "LayoutInflater.from(context)");
            layoutInflater2 = from;
        } else {
            layoutInflater2 = layoutInflater;
        }
        this(linearLayout, editText, dVar, i0Var, eVar, sVar, context2, layoutInflater2);
    }

    /* renamed from: a */
    private final void m23296a(TextView textView) {
        ((ImageView) mo20995a(C8048n.keyboardDeleteButton)).setOnClickListener(new C8015m(this, textView));
        ImageView imageView = (ImageView) mo20995a(C8048n.keyboardDeleteButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "keyboardDeleteButton");
        imageView.setContentDescription(this.f17191q.mo21036a());
        ImageView imageView2 = (ImageView) mo20995a(C8048n.keyboardDeleteButton);
        int i = C8048n.focusHelperExpandNavOnFocusSearchLeft;
        Boolean valueOf = Boolean.valueOf(true);
        imageView2.setTag(i, valueOf);
        ((ImageView) mo20995a(C8048n.keyboardDeleteButton)).setTag(C8048n.focusHelperHorizontalFocusSearchWithinParent, valueOf);
    }

    /* renamed from: a */
    private final void m23297a(TextView textView, C8008f fVar) {
        textView.setTextColor(C4025a.m13788a(this.f17192r, fVar.mo21002a()));
        textView.setTypeface(Typeface.create(C4039f.m13847a(this.f17192r, fVar.mo21003b()), 0));
    }

    /* renamed from: a */
    public final void mo20997a(String str, Fragment fragment) {
        if (!Intrinsics.areEqual((Object) this.f17184j, (Object) str)) {
            CompositeDisposable compositeDisposable = this.f17185k;
            Single a = this.f17189o.mo13582a(str).mo30233g(new C8021d(new C8010h(this))).mo30220b(C11934b.m38500b()).mo30211a(C11992a.m38600a());
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "searchSuggestionApi\n    …dSchedulers.mainThread())");
            C10541b a2 = C10541b.m33255a((C0722m) fragment, C0716a.ON_STOP);
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
            Object a3 = a.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
            Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
            compositeDisposable.mo30250b(((C11792d0) a3).mo29920a(new C8011i(this), C8012j.f17205c));
            this.f17184j = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m23292a(C11848c<C11867b> cVar) {
        if (cVar.mo29956a() == 0) {
            return 0;
        }
        return cVar.mo29967b(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C11847b> m23295a(List<Suggestion> list) {
        List<Suggestion> d = C13199w.m40580d((Iterable) list, 6);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
        for (Suggestion a : d) {
            arrayList.add(new C8027g(a.mo13568a(), this));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo20996a(String str) {
        ((RecyclerView) mo20995a(C8048n.keyboardResultsRecyclerView)).announceForAccessibility(C5880u.m18936a(C8051q.a11y_cdsearch_autocomplete_downnav));
        m23309c(str);
    }
}
