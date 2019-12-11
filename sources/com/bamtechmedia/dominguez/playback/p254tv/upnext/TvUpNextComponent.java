package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3651b.C3652a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3649t;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6329h;
import com.bamtechmedia.dominguez.playback.C6330i;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6340d;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6410j;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6497e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6502a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6503b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6509d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p527w.p529c.C11992a;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u00100\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0003J\u0018\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u0019H\u0002J \u00104\u001a\u00020\u00122\u0006\u0010.\u001a\u0002052\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u0019H\u0002J \u00106\u001a\u00020\u00122\u0006\u00107\u001a\u0002052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00108\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0002J(\u00109\u001a\u00020\u00122\u0006\u00102\u001a\u00020&2\u0006\u0010.\u001a\u0002052\u0006\u0010:\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010;\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00022\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\u0012H\u0002J\u0018\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020A2\u0006\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/upnext/TvUpNextComponent;", "Lcom/bamtechmedia/dominguez/playback/common/UIComponent;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "container", "Landroid/view/ViewGroup;", "upNextListeners", "Lcom/bamtechmedia/dominguez/playback/common/listeners/UpNextListeners;", "upNextAnalytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "ratingFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "titleTreatment", "Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "hideVideoControls", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lcom/bamtechmedia/dominguez/playback/common/listeners/UpNextListeners;Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;Lkotlin/jvm/functions/Function0;)V", "autoPlayDisposable", "Lio/reactivex/disposables/Disposable;", "backgroundImage", "Landroid/widget/ImageView;", "comingSoonText", "Landroid/widget/TextView;", "descriptionText", "metadataText", "playButton", "Landroid/widget/Button;", "root", "Landroid/view/View;", "kotlin.jvm.PlatformType", "secondaryButton", "titleCardImage", "titleText", "autoPlayNextContent", "nextPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "autoPlayEnabled", "", "hideUpNext", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "render", "state", "setupAndLoadImages", "setupAutoPlay", "setupDescriptionText", "playable", "textView", "setupMetadataText", "Lcom/bamtechmedia/dominguez/playback/common/UpNextState;", "setupPlayButton", "upNextState", "setupSecondaryButton", "setupTitleText", "titleTextView", "showUpNext", "action", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$DisplayUpNextDialogElements;", "stopAutoPlayTimer", "updatePlayButtonTextWithTimeLeft", "timeLeft", "", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent */
/* compiled from: TvUpNextComponent.kt */
public final class TvUpNextComponent implements C6340d<C6336a>, C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final ImageView f14833U;

    /* renamed from: V */
    private final ImageView f14834V;

    /* renamed from: W */
    private final TextView f14835W;

    /* renamed from: X */
    private final TextView f14836X;

    /* renamed from: Y */
    private final TextView f14837Y;

    /* renamed from: Z */
    private final TextView f14838Z;

    /* renamed from: a0 */
    private final Button f14839a0;

    /* renamed from: b0 */
    private final Button f14840b0;

    /* renamed from: c */
    private final View f14841c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public Disposable f14842c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C6497e f14843d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C6410j f14844e0;

    /* renamed from: f0 */
    private final C3572r0 f14845f0;

    /* renamed from: g0 */
    private final C3716q f14846g0;

    /* renamed from: h0 */
    private final C3850c f14847h0;

    /* renamed from: i0 */
    private final Function0<C13145v> f14848i0;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$a */
    /* compiled from: View.kt */
    public static final class C6569a implements OnPreDrawListener {

        /* renamed from: U */
        final /* synthetic */ ViewTreeObserver f14849U;

        /* renamed from: V */
        final /* synthetic */ TvUpNextComponent f14850V;

        /* renamed from: W */
        final /* synthetic */ C3693o f14851W;

        /* renamed from: c */
        final /* synthetic */ View f14852c;

        public C6569a(View view, ViewTreeObserver viewTreeObserver, TvUpNextComponent tvUpNextComponent, C3693o oVar) {
            this.f14852c = view;
            this.f14849U = viewTreeObserver;
            this.f14850V = tvUpNextComponent;
            this.f14851W = oVar;
        }

        public boolean onPreDraw() {
            View view = this.f14852c;
            Image a = this.f14851W.mo12845a(C3688j.BACKGROUND_UP_NEXT, C3623a.f9125b0.mo13248a());
            if (a != null) {
                C5763b.m18702a(this.f14850V.f14833U, a, 0, null, Integer.valueOf(view.getWidth()), false, false, false, 102, null);
            }
            ViewTreeObserver viewTreeObserver = this.f14849U;
            C12880j.m40222a((Object) viewTreeObserver, "vto");
            if (viewTreeObserver.isAlive()) {
                this.f14849U.removeOnPreDrawListener(this);
            } else {
                this.f14852c.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$b */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6570b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6570b f14853c = new C6570b();

        C6570b() {
        }

        /* renamed from: a */
        public final long mo19222a(Long l) {
            return 20 - l.longValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(mo19222a((Long) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$c */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6571c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ TvUpNextComponent f14854a;

        /* renamed from: b */
        final /* synthetic */ C3693o f14855b;

        /* renamed from: c */
        final /* synthetic */ boolean f14856c;

        C6571c(TvUpNextComponent tvUpNextComponent, C3693o oVar, boolean z) {
            this.f14854a = tvUpNextComponent;
            this.f14855b = oVar;
            this.f14856c = z;
        }

        public final void run() {
            this.f14854a.m20439a(this.f14855b, this.f14856c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$d */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6572d<T> implements Consumer<Long> {

        /* renamed from: U */
        final /* synthetic */ C3693o f14857U;

        /* renamed from: c */
        final /* synthetic */ TvUpNextComponent f14858c;

        C6572d(TvUpNextComponent tvUpNextComponent, C3693o oVar) {
            this.f14858c = tvUpNextComponent;
            this.f14857U = oVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            TvUpNextComponent tvUpNextComponent = this.f14858c;
            C12880j.m40222a((Object) l, "it");
            tvUpNextComponent.m20435a(l.longValue(), this.f14857U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$e */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6573e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6573e f14859c = new C6573e();

        C6573e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$f */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6574f implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ C6341e f14860U;

        /* renamed from: V */
        final /* synthetic */ C3693o f14861V;

        /* renamed from: c */
        final /* synthetic */ TvUpNextComponent f14862c;

        C6574f(TvUpNextComponent tvUpNextComponent, C6341e eVar, C3693o oVar) {
            this.f14862c = tvUpNextComponent;
            this.f14860U = eVar;
            this.f14861V = oVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z && this.f14862c.f14842c0 != null) {
                this.f14862c.m20452d();
                this.f14862c.m20442a(this.f14860U, this.f14861V, false);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$g */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6575g implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C3693o f14863U;

        /* renamed from: V */
        final /* synthetic */ boolean f14864V;

        /* renamed from: c */
        final /* synthetic */ TvUpNextComponent f14865c;

        C6575g(TvUpNextComponent tvUpNextComponent, C3693o oVar, boolean z) {
            this.f14865c = tvUpNextComponent;
            this.f14863U = oVar;
            this.f14864V = z;
        }

        public final void onClick(View view) {
            this.f14865c.m20452d();
            this.f14865c.f14844e0.mo19057a(this.f14863U, this.f14864V);
            this.f14865c.f14843d0.mo19156a(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.TvUpNextComponent$h */
    /* compiled from: TvUpNextComponent.kt */
    static final class C6576h implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C3693o f14866U;

        /* renamed from: c */
        final /* synthetic */ TvUpNextComponent f14867c;

        C6576h(TvUpNextComponent tvUpNextComponent, C3693o oVar) {
            this.f14867c = tvUpNextComponent;
            this.f14866U = oVar;
        }

        public final void onClick(View view) {
            this.f14867c.f14843d0.mo19155a(this.f14866U);
        }
    }

    public TvUpNextComponent(ViewGroup viewGroup, C6497e eVar, C6410j jVar, C3572r0 r0Var, C3716q qVar, C3850c cVar, Function0<C13145v> function0) {
        this.f14843d0 = eVar;
        this.f14844e0 = jVar;
        this.f14845f0 = r0Var;
        this.f14846g0 = qVar;
        this.f14847h0 = cVar;
        this.f14848i0 = function0;
        this.f14841c = LayoutInflater.from(viewGroup.getContext()).inflate(C6329h.component_tv_up_next_view, viewGroup, false);
        View findViewById = this.f14841c.findViewById(C6327f.upNextBackgroundImage);
        C12880j.m40222a((Object) findViewById, "root.findViewById(R.id.upNextBackgroundImage)");
        this.f14833U = (ImageView) findViewById;
        View findViewById2 = this.f14841c.findViewById(C6327f.upNextTitleImage);
        C12880j.m40222a((Object) findViewById2, "root.findViewById(R.id.upNextTitleImage)");
        this.f14834V = (ImageView) findViewById2;
        View findViewById3 = this.f14841c.findViewById(C6327f.upNextTitleText);
        C12880j.m40222a((Object) findViewById3, "root.findViewById(R.id.upNextTitleText)");
        this.f14835W = (TextView) findViewById3;
        View findViewById4 = this.f14841c.findViewById(C6327f.upNextComingSoonText);
        C12880j.m40222a((Object) findViewById4, "root.findViewById(R.id.upNextComingSoonText)");
        this.f14836X = (TextView) findViewById4;
        View findViewById5 = this.f14841c.findViewById(C6327f.upNextMetadataText);
        C12880j.m40222a((Object) findViewById5, "root.findViewById(R.id.upNextMetadataText)");
        this.f14837Y = (TextView) findViewById5;
        View findViewById6 = this.f14841c.findViewById(C6327f.upNextDescriptionText);
        C12880j.m40222a((Object) findViewById6, "root.findViewById(R.id.upNextDescriptionText)");
        this.f14838Z = (TextView) findViewById6;
        View findViewById7 = this.f14841c.findViewById(C6327f.upNextPlayButton);
        C12880j.m40222a((Object) findViewById7, "root.findViewById(R.id.upNextPlayButton)");
        this.f14839a0 = (Button) findViewById7;
        View findViewById8 = this.f14841c.findViewById(C6327f.upNextSecondaryButton);
        C12880j.m40222a((Object) findViewById8, "root.findViewById(R.id.upNextSecondaryButton)");
        this.f14840b0 = (Button) findViewById8;
        viewGroup.addView(this.f14841c, 0);
        View view = this.f14841c;
        C12880j.m40222a((Object) view, "root");
        view.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: b */
    private final void m20449b(C3693o oVar) {
        this.f14840b0.setText(C3573a.m12035a(this.f14845f0, C6330i.btn_see_details, (Map) null, 2, (Object) null));
        this.f14840b0.setOnClickListener(new C6576h(this, oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m20452d() {
        Disposable disposable = this.f14842c0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f14842c0 = null;
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        m20452d();
    }

    /* renamed from: b */
    private final void m20448b() {
        View view = this.f14841c;
        C12880j.m40222a((Object) view, "root");
        if (!(view.getVisibility() == 0)) {
            C14100a.m44532e("hideUpNext called but already hidden", new Object[0]);
            return;
        }
        m20452d();
        this.f14843d0.mo19158c();
    }

    /* renamed from: a */
    public void mo19220a(C6336a aVar) {
        C6501b j = aVar.mo18963j();
        if (j instanceof C6502a) {
            m20440a(aVar, (C6502a) aVar.mo18963j());
        } else if (j instanceof C6503b) {
            m20448b();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled UpNextAction = ");
            sb.append(aVar.mo18963j());
            C14100a.m44532e(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m20440a(C6336a aVar, C6502a aVar2) {
        View view = this.f14841c;
        C12880j.m40222a((Object) view, "root");
        boolean z = true;
        if (view.getVisibility() == 0) {
            C14100a.m44532e("showUpNext called but already visible", new Object[0]);
            return;
        }
        C3693o f = aVar.mo18958f();
        if (aVar2.mo19160a() != C6509d.AUTOPLAY) {
            z = false;
        }
        if (f != null) {
            this.f14848i0.invoke();
            m20438a(f, aVar.mo18964k(), this.f14835W, this.f14836X);
            m20441a(aVar.mo18964k(), f, this.f14837Y);
            m20437a(f, this.f14838Z);
            m20442a(aVar.mo18964k(), f, z);
            m20449b(f);
            m20436a(f);
            m20446a(z, f);
            this.f14843d0.mo19154a();
            this.f14839a0.requestFocus();
        }
    }

    @SuppressLint({"RxDefaultScheduler"})
    /* renamed from: a */
    private final void m20446a(boolean z, C3693o oVar) {
        if (z) {
            this.f14842c0 = Observable.m38296a(0, 21, 0, 1, TimeUnit.SECONDS).mo30193g(C6570b.f14853c).mo30151a(C11992a.m38600a()).mo30169b((C11945a) new C6571c(this, oVar, z)).mo30157a((Consumer<? super T>) new C6572d<Object>(this, oVar), (Consumer<? super Throwable>) C6573e.f14859c);
        }
    }

    /* renamed from: a */
    private final void m20436a(C3693o oVar) {
        this.f14847h0.mo13768a(oVar, this.f14834V);
        View view = this.f14841c;
        C12880j.m40222a((Object) view, "root");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new C6569a(view, viewTreeObserver, this, oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20442a(C6341e eVar, C3693o oVar, boolean z) {
        String str;
        if (z) {
            m20435a(20, oVar);
            this.f14839a0.setOnFocusChangeListener(new C6574f(this, eVar, oVar));
        } else {
            if (eVar.mo18980c()) {
                str = C3573a.m12035a(this.f14845f0, C6330i.btn_postplay_sneakpeek, (Map) null, 2, (Object) null);
            } else if (eVar.mo18979b()) {
                str = C3573a.m12035a(this.f14845f0, C6330i.btn_play_next_ep, (Map) null, 2, (Object) null);
            } else if ((oVar instanceof C3685g) && eVar.mo18981d()) {
                C3572r0 r0Var = this.f14845f0;
                int i = C6330i.btn_play_specific_episode;
                StringBuilder sb = new StringBuilder();
                sb.append('S');
                C3685g gVar = (C3685g) oVar;
                sb.append(gVar.mo12876F());
                StringBuilder sb2 = new StringBuilder();
                sb2.append('E');
                sb2.append(gVar.mo12878I());
                str = r0Var.mo12772a(i, C13173j0.m40356a(C12907r.m40244a("season_value", sb.toString()), C12907r.m40244a("episode_value", sb2.toString())));
            } else if (oVar instanceof C3686h) {
                str = C3573a.m12035a(this.f14845f0, C6330i.btn_play_extra, (Map) null, 2, (Object) null);
            } else {
                str = C3573a.m12035a(this.f14845f0, C6330i.btn_postplay_play, (Map) null, 2, (Object) null);
            }
            this.f14839a0.setText(str);
        }
        this.f14839a0.setOnClickListener(new C6575g(this, oVar, z));
    }

    /* renamed from: a */
    private final void m20438a(C3693o oVar, C6341e eVar, TextView textView, TextView textView2) {
        String str;
        int i = 8;
        if (!eVar.mo18980c()) {
            boolean z = true;
            if (!(oVar instanceof C3685g) || eVar.mo18981d()) {
                str = oVar instanceof C3692n ? oVar.getTitle() : oVar instanceof C3686h ? oVar.getTitle() : "";
            } else {
                C3685g gVar = (C3685g) oVar;
                str = this.f14845f0.mo12772a(C6330i.postplay_episodetitle, C13173j0.m40356a(C12907r.m40244a("SEASON_NUMBER", String.valueOf(gVar.mo12876F())), C12907r.m40244a("EPISODE_NUMBER", String.valueOf(gVar.mo12878I())), C12907r.m40244a("EPISODE_TITLE", oVar.getTitle())));
            }
            textView2.setVisibility(4);
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
            textView.setText(str);
        } else if (eVar.mo18978a() != null) {
            textView.setVisibility(4);
            textView2.setVisibility(0);
            textView2.setText(this.f14845f0.mo12772a(C6330i.postplay_sunriseday, C13170i0.m40332a(C12907r.m40244a("sunriseDayOfWeek", eVar.mo18978a()))));
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m20441a(C6341e eVar, C3693o oVar, TextView textView) {
        int i = 8;
        if (eVar.mo18980c()) {
            textView.setVisibility(8);
            return;
        }
        CharSequence charSequence = oVar instanceof C3692n ? this.f14846g0.mo13546a((C3692n) oVar) : oVar instanceof C3686h ? this.f14846g0.mo13545a((C3686h) oVar) : "";
        if (charSequence.length() > 0) {
            i = 0;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    /* renamed from: a */
    private final void m20437a(C3693o oVar, TextView textView) {
        String a = C3652a.m12419a(oVar, C3649t.MEDIUM, null, 2, null);
        int i = 0;
        if (!(a.length() > 0)) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20435a(long j, C3693o oVar) {
        if (oVar instanceof C3685g) {
            this.f14839a0.setText(this.f14845f0.mo12772a(C6330i.postplay_countdown, C13170i0.m40332a(C12907r.m40244a("remaining_seconds", Long.valueOf(j)))));
            return;
        }
        this.f14839a0.setText(C3573a.m12035a(this.f14845f0, C6330i.btn_postplay_play, (Map) null, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20439a(C3693o oVar, boolean z) {
        this.f14844e0.mo19058b(oVar, z);
        this.f14843d0.mo19156a(false);
    }
}
