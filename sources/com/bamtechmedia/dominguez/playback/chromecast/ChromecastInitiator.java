package com.bamtechmedia.dominguez.playback.chromecast;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamnet.chromecast.ChromecastBridge;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0014\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/chromecast/ChromecastInitiator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "viewModel", "Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "chromecastBridge", "Lcom/bamnet/chromecast/ChromecastBridge;", "chromecastLauncher", "Lcom/bamtechmedia/dominguez/playback/chromecast/ChromecastLauncher;", "mediaApi", "Lcom/bamtech/sdk4/media/MediaApi;", "activity", "Lcom/bamtechmedia/dominguez/playback/mobile/MobilePlaybackActivity;", "(Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;Lcom/bamnet/chromecast/ChromecastBridge;Lcom/bamtechmedia/dominguez/playback/chromecast/ChromecastLauncher;Lcom/bamtech/sdk4/media/MediaApi;Lcom/bamtechmedia/dominguez/playback/mobile/MobilePlaybackActivity;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "onPause", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onResume", "switchToCast", "switchToCast$playback_release", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ChromecastInitiator.kt */
public final class ChromecastInitiator implements C0710d {

    /* renamed from: U */
    private final C6342f f14320U;

    /* renamed from: V */
    private final ChromecastBridge f14321V;

    /* renamed from: W */
    private final C6274a f14322W;

    /* renamed from: X */
    private final MediaApi f14323X;

    /* renamed from: c */
    private final CompositeDisposable f14324c;

    /* renamed from: com.bamtechmedia.dominguez.playback.chromecast.ChromecastInitiator$a */
    /* compiled from: ChromecastInitiator.kt */
    static final class C6271a<T> implements C11952h<Boolean> {

        /* renamed from: c */
        public static final C6271a f14325c = new C6271a();

        C6271a() {
        }

        /* renamed from: a */
        public final Boolean mo18869a(Boolean bool) {
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo18869a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.chromecast.ChromecastInitiator$b */
    /* compiled from: ChromecastInitiator.kt */
    static final class C6272b<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ChromecastInitiator f14326c;

        C6272b(ChromecastInitiator chromecastInitiator) {
            this.f14326c = chromecastInitiator;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14326c.mo18868b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.chromecast.ChromecastInitiator$c */
    /* compiled from: ChromecastInitiator.kt */
    static final class C6273c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6273c f14327c = new C6273c();

        C6273c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    /* renamed from: a */
    public void mo4126a(C0722m mVar) {
        this.f14324c.mo30250b(this.f14321V.observe().onCastConnecting().mo30150a((C11952h<? super T>) C6271a.f14325c).mo30157a((Consumer<? super T>) new C6272b<Object>(this), (Consumer<? super Throwable>) C6273c.f14327c));
    }

    /* renamed from: b */
    public final void mo18868b() {
        C6336a aVar = (C6336a) this.f14320U.getCurrentState();
        if (aVar != null) {
            PlaybackContext g = aVar.mo18959g();
            if (g != null) {
                this.f14323X.transferPlaybackContext(g);
            }
            C6274a aVar2 = this.f14322W;
            C3693o c = aVar.mo18954c();
            if (c == null) {
                C12880j.m40220a();
                throw null;
            }
            C5326w d = aVar.mo18955d().mo7539d();
            C12880j.m40222a((Object) d, "it.engine.videoPlayer");
            aVar2.mo18872a(c, (int) d.getCurrentPosition());
            throw null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public void mo4128c(C0722m mVar) {
        this.f14324c.mo30247a();
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }
}
