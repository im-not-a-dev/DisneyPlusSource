package p163g.p201e.p203b.p319v.p321b0;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.purchase.C7051i;
import com.bamtechmedia.dominguez.purchase.C7059o;
import com.bamtechmedia.dominguez.purchase.C7083u;
import com.bamtechmedia.dominguez.purchase.C7084v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13180m;
import org.joda.time.Days;
import org.joda.time.Period;
import p096e.p121h.p132q.C4090b;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7905u;
import p163g.p201e.p203b.p319v.C7907w;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p163g.p201e.p203b.p319v.p321b0.C7838e.C7840b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 D2\u00020\u0001:\u0001DBK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J2\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0(H\u0007J \u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010+\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!H\u0002J.\u00105\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150 H\u0002J \u00107\u001a\u00020/2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!2\u0006\u00108\u001a\u00020\u001dH\u0002J \u00109\u001a\u00020/2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!2\u0006\u0010:\u001a\u00020\u001dH\u0002J \u0010;\u001a\u00020/2\u0006\u0010\"\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010!2\u0006\u00100\u001a\u000201J2\u0010=\u001a\u00020/2\u0006\u00102\u001a\u0002032\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J<\u0010@\u001a\u0004\u0018\u00010\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0(H\u0002J\u0010\u0010B\u001a\u00020\u001d2\u0006\u00108\u001a\u00020CH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/ui/PaywallPresenter;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "paywallDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "appDictionary", "paywallViewModel", "Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;", "isTelevision", "", "currencyFormatter", "Lcom/bamtechmedia/dominguez/purchase/PaywallCurrencyFormatter;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "paywallAnalytics", "Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;ZLcom/bamtechmedia/dominguez/purchase/PaywallCurrencyFormatter;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;)V", "buttonText", "Landroid/text/Spannable;", "product", "Lcom/bamtechmedia/dominguez/paywall/model/PaywallProduct;", "parent", "Landroid/view/ViewGroup;", "index", "", "html", "Landroid/text/Spanned;", "text", "", "isYearly", "mapProductsToButtons", "", "Landroid/view/View;", "state", "Lcom/bamtechmedia/dominguez/purchase/PaywallState;", "paywallText", "key", "hash", "replacementMap", "", "priceText", "stringKey", "setButtonFromProduct", "Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "loadingButton", "setupByDevice", "", "type", "Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment$Type;", "paywall", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "view", "setupByType", "productList", "setupForFreeTrial", "freeTrialPeriod", "setupForRestart", "period", "setupTextForPaywall", "v", "setupYearlyDisclaimerText", "paywallYearlyDisclaimerText", "Landroid/widget/TextView;", "stringKeyWithOverride", "dictionary", "trialPeriodText", "Lorg/joda/time/Period;", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.b0.j */
/* compiled from: PaywallPresenter.kt */
public final class C7856j {
    @Deprecated

    /* renamed from: i */
    public static final C7857a f16971i = new C7857a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0532d f16972a;

    /* renamed from: b */
    private final C3572r0 f16973b;

    /* renamed from: c */
    private final C3572r0 f16974c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7084v f16975d;

    /* renamed from: e */
    private final boolean f16976e;

    /* renamed from: f */
    private final C7059o f16977f;

    /* renamed from: g */
    private final C7873f f16978g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7051i f16979h;

    /* renamed from: g.e.b.v.b0.j$a */
    /* compiled from: PaywallPresenter.kt */
    private static final class C7857a {
        private C7857a() {
        }

        public /* synthetic */ C7857a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.v.b0.j$b */
    /* compiled from: PaywallPresenter.kt */
    static final class C7858b extends C12881k implements C12853n<C7820a, List<? extends C7823d>, TextView, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C7856j f16980U;

        /* renamed from: c */
        final /* synthetic */ C7823d f16981c;

        C7858b(C7823d dVar, C7856j jVar, ViewGroup viewGroup, LayoutInflater layoutInflater, C7083u uVar) {
            this.f16981c = dVar;
            this.f16980U = jVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo20779a(C7820a aVar, List<? extends C7823d> list, TextView textView) {
            this.f16980U.m23018a(aVar, list, textView, this.f16981c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo20779a((C7820a) obj, (List) obj2, (TextView) obj3);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.b0.j$c */
    /* compiled from: PaywallPresenter.kt */
    static final class C7859c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C7856j f16982U;

        /* renamed from: V */
        final /* synthetic */ C7823d f16983V;

        /* renamed from: c */
        final /* synthetic */ Spannable f16984c;

        C7859c(Spannable spannable, C7856j jVar, C7823d dVar, ViewGroup viewGroup, int i) {
            this.f16984c = spannable;
            this.f16982U = jVar;
            this.f16983V = dVar;
        }

        public final void onClick(View view) {
            this.f16982U.f16975d.mo19877a((Activity) this.f16982U.f16972a, this.f16983V);
            this.f16982U.f16979h.mo19830a(this.f16984c.toString());
        }
    }

    /* renamed from: g.e.b.v.b0.j$d */
    /* compiled from: PaywallPresenter.kt */
    static final class C7860d extends C12881k implements C12853n<C7820a, List<? extends C7823d>, View, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C7840b f16985U;

        /* renamed from: c */
        final /* synthetic */ C7856j f16986c;

        C7860d(C7856j jVar, C7840b bVar) {
            this.f16986c = jVar;
            this.f16985U = bVar;
            super(3);
        }

        /* renamed from: a */
        public final C13145v invoke(C7820a aVar, List<? extends C7823d> list, View view) {
            this.f16986c.m23020a(this.f16985U, aVar, view, list);
            this.f16986c.m23019a(this.f16985U, aVar, view);
            TextView textView = (TextView) view.findViewById(C7904t.paywallYearlyTVDisclaimerText);
            if (textView != null) {
                C7856j.m23022a(this.f16986c, aVar, list, textView, null, 8, null);
            }
            DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) view.findViewById(C7904t.paywallDisneyToolbar);
            if (disneyTitleToolbar == null) {
                return null;
            }
            C7856j jVar = this.f16986c;
            C7856j.f16971i;
            disneyTitleToolbar.setActionTitle(C7856j.m23013a(jVar, "btn_cancel_3", aVar.mo20723a(), null, 4, null));
            return C13145v.f29587a;
        }
    }

    public C7856j(C0532d dVar, C3572r0 r0Var, C3572r0 r0Var2, C7084v vVar, boolean z, C7059o oVar, C7873f fVar, C7051i iVar) {
        this.f16972a = dVar;
        this.f16973b = r0Var;
        this.f16974c = r0Var2;
        this.f16975d = vVar;
        this.f16976e = z;
        this.f16977f = oVar;
        this.f16978g = fVar;
        this.f16979h = iVar;
    }

    /* renamed from: b */
    private final void m23026b(C7820a aVar, View view, String str) {
        TextView textView = (TextView) view.findViewById(C7904t.paywallDescriptionMain);
        C12880j.m40222a((Object) textView, "view.paywallDescriptionMain");
        textView.setText(m23013a(this, "restart_title", aVar.mo20723a(), null, 4, null));
        TextView textView2 = (TextView) view.findViewById(C7904t.paywallDescriptionSub1);
        C12880j.m40222a((Object) textView2, "view.paywallDescriptionSub1");
        textView2.setText(mo20775a("restart_copy", aVar.mo20723a(), C13170i0.m40332a(C12907r.m40244a("days", str))));
    }

    /* renamed from: a */
    public final List<View> mo20776a(ViewGroup viewGroup, C7083u uVar) {
        Object obj;
        C7856j jVar = this;
        ViewGroup viewGroup2 = viewGroup;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        List e = uVar.mo19869e();
        if (e == null) {
            e = C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) e, 10));
        boolean z = false;
        int i = 0;
        for (Object next : e) {
            int i2 = i + 1;
            if (i >= 0) {
                C7823d dVar = (C7823d) next;
                Context context = viewGroup.getContext();
                C12880j.m40222a((Object) context, "parent.context");
                if (C5837i.m18843e(context)) {
                    View inflate = from.inflate(C7905u.paywall_button, viewGroup2, z);
                    if (inflate != null) {
                        LoadingButton loadingButton = (LoadingButton) inflate;
                        jVar.m23011a(viewGroup2, loadingButton, dVar, i);
                        obj = loadingButton;
                    } else {
                        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.design.widgets.LoadingButton");
                    }
                } else {
                    View inflate2 = from.inflate(C7905u.paywall_button, viewGroup2, z);
                    if (inflate2 != 0) {
                        LoadingButton loadingButton2 = (LoadingButton) inflate2.findViewById(C7904t.paywallBtn);
                        C12880j.m40222a((Object) loadingButton2, "buttonView.paywallBtn");
                        jVar.m23011a(viewGroup2, loadingButton2, dVar, i);
                        C7820a c = uVar.mo19867c();
                        List e2 = uVar.mo19869e();
                        C7858b bVar = r0;
                        TextView textView = (TextView) inflate2.findViewById(C7904t.paywallYearlyDisclaimerText);
                        C7858b bVar2 = new C7858b(dVar, this, viewGroup, from, uVar);
                        C5884x.m18948a(c, e2, textView, (C12853n<? super T1, ? super T2, ? super T3, ? extends R>) bVar);
                        obj = inflate2;
                    } else {
                        throw new C13142s("null cannot be cast to non-null type android.view.View");
                    }
                }
                arrayList.add(obj);
                z = false;
                jVar = this;
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo20777a(C7083u uVar, View view, C7840b bVar) {
        C5884x.m18948a(uVar.mo19867c(), uVar.mo19869e(), view, (C12853n<? super T1, ? super T2, ? super T3, ? extends R>) new C7860d<Object,Object,Object,Object>(this, bVar));
    }

    /* renamed from: a */
    public final boolean mo20778a(C7823d dVar) {
        return C12880j.m40224a((Object) this.f16978g.mo20797b(dVar.mo20732d()), (Object) "year");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23019a(C7840b bVar, C7820a aVar, View view) {
        String str;
        int i = C7861k.$EnumSwitchMapping$1[bVar.ordinal()];
        if (i == 1) {
            str = "legal_copy";
        } else if (i == 2) {
            str = "restart_legal_copy";
        } else {
            throw new C12898l();
        }
        String str2 = str;
        TextView textView = (TextView) view.findViewById(C7904t.paywallLegalText);
        C12880j.m40222a((Object) textView, "view.paywallLegalText");
        textView.setText(m23009a(m23013a(this, str2, aVar.mo20723a(), null, 4, null)));
        if (this.f16976e) {
            Button button = (Button) view.findViewById(C7904t.paywallBtnRestore);
            if (button != null) {
                button.setText(m23013a(this, "btn_restore_purchase", aVar.mo20723a(), null, 4, null));
                return;
            }
            return;
        }
        TextView textView2 = (TextView) view.findViewById(C7904t.paywallBtnRestoreMobile);
        if (textView2 != null) {
            textView2.setText(m23013a(this, "restore_purchase", aVar.mo20723a(), null, 4, null));
        }
    }

    /* renamed from: a */
    private final void m23017a(C7820a aVar, View view, String str) {
        TextView textView = (TextView) view.findViewById(C7904t.paywallDescriptionMain);
        C12880j.m40222a((Object) textView, "view.paywallDescriptionMain");
        textView.setText(mo20775a("billinginfo_title", aVar.mo20723a(), C13170i0.m40332a(C12907r.m40244a("DURATION", str))));
        TextView textView2 = (TextView) view.findViewById(C7904t.paywallDescriptionSub1);
        C12880j.m40222a((Object) textView2, "view.paywallDescriptionSub1");
        textView2.setText(m23013a(this, "paywall_copy_2", null, null, 6, null));
    }

    /* renamed from: a */
    private final String m23016a(Period period) {
        StringBuilder sb = new StringBuilder();
        Days standardDays = period.toStandardDays();
        C12880j.m40222a((Object) standardDays, "freeTrialPeriod.toStandardDays()");
        sb.append(standardDays.getDays());
        sb.append(' ');
        sb.append(C3573a.m12037b(this.f16973b, "day", null, 2, null));
        return sb.toString();
    }

    /* renamed from: a */
    private final Spanned m23009a(String str) {
        Spanned a = C4090b.m14039a(str, 63);
        C12880j.m40222a((Object) a, "HtmlCompat.fromHtml(text…t.FROM_HTML_MODE_COMPACT)");
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m23022a(C7856j jVar, C7820a aVar, List list, TextView textView, C7823d dVar, int i, Object obj) {
        if ((i & 8) != 0) {
            dVar = null;
        }
        jVar.m23018a(aVar, list, textView, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23018a(C7820a aVar, List<? extends C7823d> list, TextView textView, C7823d dVar) {
        String a = this.f16977f.mo19835a(list, dVar);
        if (a != null) {
            String a2 = mo20775a("annual_value_prop", aVar.mo20723a(), C13170i0.m40332a(C12907r.m40244a("PRICE_PROP_1", a)));
            textView.setText(a2);
            int i = 0;
            if (!(a2.length() > 0)) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: a */
    private final LoadingButton m23011a(ViewGroup viewGroup, LoadingButton loadingButton, C7823d dVar, int i) {
        Spannable a = m23008a(dVar, viewGroup, i);
        loadingButton.setText(a);
        C7859c cVar = new C7859c(a, this, dVar, viewGroup, i);
        loadingButton.setOnClickListener(cVar);
        loadingButton.setId(View.generateViewId());
        loadingButton.setTag(dVar);
        return loadingButton;
    }

    /* renamed from: a */
    private final Spannable m23008a(C7823d dVar, ViewGroup viewGroup, int i) {
        String a = this.f16978g.mo20794a(dVar.mo20732d());
        if (a == null) {
            a = "";
        }
        String a2 = m23015a(a, dVar, i);
        int a3 = C12833x.m40132a((CharSequence) a2, dVar.mo20730b(), 0, false, 6, (Object) null);
        SpannableString valueOf = SpannableString.valueOf(a2);
        C12880j.m40222a((Object) valueOf, "SpannableString.valueOf(this)");
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(viewGroup.getContext(), C7907w.Disney_TextAppearance_ButtonUnfocused_White8);
        valueOf.setSpan(textAppearanceSpan, 0, a3, 0);
        valueOf.setSpan(textAppearanceSpan, a3 + dVar.mo20730b().length(), a2.length(), 0);
        return valueOf;
    }

    /* renamed from: a */
    private final String m23015a(String str, C7823d dVar, int i) {
        String b = this.f16978g.mo20797b(dVar.mo20732d());
        if (b == null) {
            return "";
        }
        String a = m23013a(this, b, null, null, 6, null);
        StringBuilder sb = new StringBuilder();
        sb.append("PRICE_");
        sb.append(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TIME_UNIT_");
        sb2.append(i);
        return m23013a(this, str, null, C13173j0.m40356a(C12907r.m40244a(sb.toString(), dVar.mo20730b()), C12907r.m40244a(sb2.toString(), a)), 2, null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m23013a(C7856j jVar, String str, String str2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = C13173j0.m40350a();
        }
        return jVar.mo20775a(str, str2, map);
    }

    /* renamed from: a */
    public final String mo20775a(String str, String str2, Map<String, String> map) {
        String a = m23014a(str, this.f16973b, str2, map);
        if (!(a == null || a.length() == 0) && !C12880j.m40224a((Object) a, (Object) str)) {
            return a;
        }
        String a2 = m23014a(str, this.f16974c, str2, map);
        return a2 != null ? a2 : str;
    }

    /* renamed from: a */
    private final String m23014a(String str, C3572r0 r0Var, String str2, Map<String, String> map) {
        String str3;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('_');
            sb.append(str2);
            str3 = sb.toString();
        } else {
            str3 = str;
        }
        String a = r0Var.mo12773a(str3, map);
        boolean z = a == null || a.length() == 0;
        if (str2 != null || !z) {
            return z ? m23014a(str, r0Var, (String) null, map) : a;
        }
        return str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23020a(C7840b bVar, C7820a aVar, View view, List<? extends C7823d> list) {
        ArrayList arrayList = new ArrayList();
        for (C7823d e : list) {
            Period e2 = e.mo20733e();
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        Period period = (Period) C13199w.m40591g((List) arrayList);
        if (period == null) {
            period = Period.weeks(1);
        }
        C12880j.m40222a((Object) period, "trialPeriod");
        String a = m23016a(period);
        int i = C7861k.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            m23017a(aVar, view, a);
        } else if (i == 2) {
            m23026b(aVar, view, a);
        }
    }
}
