package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.PlaybackIntent;
import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\n2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J4\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J5\u0010#\u001a\b\u0012\u0004\u0012\u0002H$0\n\"\u0004\b\u0000\u0010$2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H$0\n0&H\u0001¢\u0006\u0002\b'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/LazyMediaApi;", "Lcom/bamtech/sdk4/media/MediaApi;", "sessionProvider", "Lcom/bamtechmedia/dominguez/sdk/SdkSessionProvider;", "(Lcom/bamtechmedia/dominguez/sdk/SdkSessionProvider;)V", "createPlaybackSession", "Lcom/bamtech/sdk4/media/PlaybackSession;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "fetch", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/MediaItem;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getBifThumbnail", "", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "initializePlaybackContext", "playbackIntent", "Lcom/bamtech/sdk4/media/PlaybackIntent;", "isPreBuffering", "", "offline", "data", "", "", "transferPlaybackContext", "", "withMediaApi", "T", "block", "Lkotlin/Function1;", "withMediaApi$sdk_release", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.p */
/* compiled from: LazyMediaApi.kt */
public final class C7217p implements MediaApi {

    /* renamed from: a */
    private final C7195c0 f15940a;

    /* renamed from: g.e.b.b0.p$a */
    /* compiled from: LazyMediaApi.kt */
    static final class C7218a extends C12881k implements Function1<MediaApi, Single<? extends MediaItem>> {

        /* renamed from: U */
        final /* synthetic */ PlaybackContext f15941U;

        /* renamed from: c */
        final /* synthetic */ MediaDescriptor f15942c;

        C7218a(MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
            this.f15942c = mediaDescriptor;
            this.f15941U = playbackContext;
            super(1);
        }

        /* renamed from: a */
        public final Single<? extends MediaItem> invoke(MediaApi mediaApi) {
            return mediaApi.fetch(this.f15942c, this.f15941U);
        }
    }

    /* renamed from: g.e.b.b0.p$b */
    /* compiled from: LazyMediaApi.kt */
    static final class C7219b extends C12881k implements Function1<MediaApi, Single<String>> {

        /* renamed from: c */
        final /* synthetic */ Presentation f15943c;

        C7219b(Presentation presentation) {
            this.f15943c = presentation;
            super(1);
        }

        /* renamed from: a */
        public final Single<String> invoke(MediaApi mediaApi) {
            return mediaApi.getBifThumbnail(this.f15943c);
        }
    }

    /* renamed from: g.e.b.b0.p$c */
    /* compiled from: LazyMediaApi.kt */
    static final class C7220c extends C12881k implements Function1<MediaApi, Single<List<? extends BifThumbnailSet>>> {

        /* renamed from: c */
        final /* synthetic */ MediaItem f15944c;

        C7220c(MediaItem mediaItem) {
            this.f15944c = mediaItem;
            super(1);
        }

        /* renamed from: a */
        public final Single<List<BifThumbnailSet>> invoke(MediaApi mediaApi) {
            return mediaApi.getBifThumbnailSets(this.f15944c);
        }
    }

    /* renamed from: g.e.b.b0.p$d */
    /* compiled from: LazyMediaApi.kt */
    static final class C7221d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ Function1 f15945c;

        C7221d(Function1 function1) {
            this.f15945c = function1;
        }

        /* renamed from: a */
        public final Single<? extends T> apply(Session session) {
            return (Single) this.f15945c.invoke(session.getMediaApi());
        }
    }

    public C7217p(C7195c0 c0Var) {
        this.f15940a = c0Var;
    }

    /* renamed from: a */
    public final <T> Single<T> mo20048a(Function1<? super MediaApi, ? extends Single<? extends T>> function1) {
        Single<T> a = this.f15940a.mo20041e().mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C7221d<Object,Object>(function1));
        C12880j.m40222a((Object) a, "sessionProvider.sessionO…ock.invoke(it.mediaApi) }");
        return a;
    }

    public PlaybackSession createPlaybackSession(PlayerAdapter playerAdapter) {
        return this.f15940a.mo20040d().getMediaApi().createPlaybackSession(playerAdapter);
    }

    public Single<? extends MediaItem> fetch(MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        return mo20048a(new C7218a(mediaDescriptor, playbackContext));
    }

    public Single<String> getBifThumbnail(Presentation presentation) {
        return mo20048a(new C7219b(presentation));
    }

    public Single<List<BifThumbnailSet>> getBifThumbnailSets(MediaItem mediaItem) {
        return mo20048a(new C7220c(mediaItem));
    }

    public PlaybackContext initializePlaybackContext(PlaybackIntent playbackIntent, boolean z, boolean z2, Map<String, ? extends Object> map) {
        return this.f15940a.mo20040d().getMediaApi().initializePlaybackContext(playbackIntent, z, z2, map);
    }

    public void transferPlaybackContext(PlaybackContext playbackContext) {
        this.f15940a.mo20040d().getMediaApi().transferPlaybackContext(playbackContext);
    }
}
