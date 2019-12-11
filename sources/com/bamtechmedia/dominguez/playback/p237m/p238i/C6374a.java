package com.bamtechmedia.dominguez.playback.p237m.p238i;

import android.content.Context;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.playback.C6330i;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\b\rJ\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/accessibility/PlayPauseAccessibility;", "", "context", "Landroid/content/Context;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "prepareContentDescription", "", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "playPauseButton", "Landroid/widget/ImageView;", "prepareContentDescription$playback_release", "setInitialState", "setPlayPauseText", "isPlaying", "", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.i.a */
/* compiled from: PlayPauseAccessibility.kt */
public final class C6374a {

    /* renamed from: a */
    private final Context f14484a;

    /* renamed from: b */
    private final C3572r0 f14485b;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.i.a$a */
    /* compiled from: PlayPauseAccessibility.kt */
    static final class C6375a<T> implements Consumer<Boolean> {

        /* renamed from: U */
        final /* synthetic */ ImageView f14486U;

        /* renamed from: c */
        final /* synthetic */ C6374a f14487c;

        C6375a(C6374a aVar, ImageView imageView) {
            this.f14487c = aVar;
            this.f14486U = imageView;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            ImageView imageView = this.f14486U;
            if (imageView != null) {
                C6374a aVar = this.f14487c;
                Intrinsics.checkReturnedValueIsNotNull((Object) bool, "playing");
                aVar.m19990a(bool.booleanValue(), imageView);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.i.a$b */
    /* compiled from: PlayPauseAccessibility.kt */
    static final /* synthetic */ class C6376b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6376b f14488c = new C6376b();

        C6376b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19019a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19019a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.i.a$c */
    /* compiled from: PlayPauseAccessibility.kt */
    static final class C6377c<T> implements C11952h<Boolean> {

        /* renamed from: c */
        public static final C6377c f14489c = new C6377c();

        C6377c() {
        }

        /* renamed from: a */
        public final Boolean mo19020a(Boolean bool) {
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo19020a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.i.a$d */
    /* compiled from: PlayPauseAccessibility.kt */
    static final class C6378d<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ImageView f14490c;

        C6378d(ImageView imageView) {
            this.f14490c = imageView;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            ImageView imageView = this.f14490c;
            if (imageView != null) {
                imageView.sendAccessibilityEvent(8);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.i.a$e */
    /* compiled from: PlayPauseAccessibility.kt */
    static final /* synthetic */ class C6379e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6379e f14491c = new C6379e();

        C6379e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19022a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19022a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C6374a(Context context, C3572r0 r0Var) {
        this.f14484a = context;
        this.f14485b = r0Var;
    }

    /* renamed from: a */
    private final void m19988a(ImageView imageView) {
        if (imageView != null) {
            m19990a(imageView.isActivated(), imageView);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.i.a$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.bamtechmedia.dominguez.playback.m.i.a$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bamtechmedia.dominguez.playback.m.i.b] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.m.i.b] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    @android.annotation.SuppressLint({"CheckResult", "RxDefaultScheduler"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19017a(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5, android.widget.ImageView r6) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f14484a
            boolean r0 = com.bamtechmedia.dominguez.core.utils.C5837i.m18836a(r0)
            if (r0 == 0) goto L_0x0051
            r4.m19988a(r6)
            g.d.b.m r0 = r5.mo7537b()
            io.reactivex.Observable r0 = r0.mo17014b0()
            com.bamtechmedia.dominguez.playback.m.i.a$a r1 = new com.bamtechmedia.dominguez.playback.m.i.a$a
            r1.<init>(r4, r6)
            com.bamtechmedia.dominguez.playback.m.i.a$b r2 = com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a.C6376b.f14488c
            if (r2 == 0) goto L_0x0022
            com.bamtechmedia.dominguez.playback.m.i.b r3 = new com.bamtechmedia.dominguez.playback.m.i.b
            r3.<init>(r2)
            r2 = r3
        L_0x0022:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo30157a(r1, r2)
            g.d.b.m r5 = r5.mo7537b()
            io.reactivex.Observable r5 = r5.mo17076x()
            com.bamtechmedia.dominguez.playback.m.i.a$c r0 = com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a.C6377c.f14489c
            io.reactivex.Observable r5 = r5.mo30150a(r0)
            r0 = 150(0x96, double:7.4E-322)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r5 = r5.mo30137a(r0, r2)
            com.bamtechmedia.dominguez.playback.m.i.a$d r0 = new com.bamtechmedia.dominguez.playback.m.i.a$d
            r0.<init>(r6)
            com.bamtechmedia.dominguez.playback.m.i.a$e r6 = com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a.C6379e.f14491c
            if (r6 == 0) goto L_0x004c
            com.bamtechmedia.dominguez.playback.m.i.b r1 = new com.bamtechmedia.dominguez.playback.m.i.b
            r1.<init>(r6)
            r6 = r1
        L_0x004c:
            io.reactivex.functions.Consumer r6 = (p520io.reactivex.functions.Consumer) r6
            r5.mo30157a(r0, r6)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a.mo19017a(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine, android.widget.ImageView):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19990a(boolean z, ImageView imageView) {
        String str;
        if (z) {
            str = C3573a.m12035a(this.f14485b, C6330i.a11y_videoplayer_pause, (Map) null, 2, (Object) null);
        } else {
            str = C3573a.m12035a(this.f14485b, C6330i.a11y_videoplayer_play, (Map) null, 2, (Object) null);
        }
        if (imageView != null) {
            imageView.setContentDescription(str);
        }
    }
}
