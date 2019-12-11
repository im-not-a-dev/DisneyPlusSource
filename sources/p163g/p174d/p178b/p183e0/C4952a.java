package p163g.p174d.p178b.p183e0;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;
import p163g.p174d.p178b.C5294k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002ghB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\u0006¢\u0006\u0002\u0010&J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0019HÆ\u0003J\t\u0010O\u001a\u00020\u0019HÆ\u0003J\t\u0010P\u001a\u00020\u001cHÆ\u0003J\t\u0010Q\u001a\u00020\u001eHÆ\u0003J\t\u0010R\u001a\u00020\u001eHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010T\u001a\u00020\u001eHÆ\u0003J\t\u0010U\u001a\u00020\u001eHÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\u0006HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fHÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u0006HÆ\u0001J\u0013\u0010b\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\nHÖ\u0001J\t\u0010e\u001a\u00020fHÖ\u0001R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u001f\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010 \u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006i"}, mo31007d2 = {"Lcom/bamtech/player/config/PlaybackEngineConfig;", "", "builder", "Lcom/bamtech/player/config/PlaybackEngineConfig$Builder;", "(Lcom/bamtech/player/config/PlaybackEngineConfig$Builder;)V", "enableRotationAfterManualOrientationChanges", "", "playbackRates", "Lcom/bamtech/player/PlaybackRates;", "jumpAmountSeconds", "", "shouldShowLoadingViewWhenPlayerIsIdle", "controlsHideTimeoutSeconds", "shouldRemoveLeadingZeroFromTime", "percentageCompletionNotificationList", "", "enableLandscapeToPortraitBackBehavior", "enableGestures", "nativePlaybackRates", "", "shouldShowControlsWhenPaused", "shouldHideControlsWhenBuffering", "shouldRequestAudioFocus", "shouldToggleSystemBars", "portraitSystemBarState", "Lcom/bamtech/player/config/PlaybackEngineConfig$SystemBarState;", "landscapeSystemBarState", "touchGutterPercentage", "", "controlAnimationDuration", "", "controlAnimationHideDuration", "controlAnimationShowDuration", "seekBarTickRateMs", "shouldShowUnsupportedTracks", "playbuttonVisibilityWhileBuffering", "shouldPauseVideoWhileSeeking", "shouldKeepScreenOn", "(ZLcom/bamtech/player/PlaybackRates;IZIZLjava/util/List;ZZLjava/util/Set;ZZZZLcom/bamtech/player/config/PlaybackEngineConfig$SystemBarState;Lcom/bamtech/player/config/PlaybackEngineConfig$SystemBarState;FJJJJZIZZ)V", "getControlAnimationDuration", "()J", "getControlAnimationHideDuration", "getControlAnimationShowDuration", "getControlsHideTimeoutSeconds", "()I", "getEnableGestures", "()Z", "getEnableLandscapeToPortraitBackBehavior", "getEnableRotationAfterManualOrientationChanges", "getJumpAmountSeconds", "getLandscapeSystemBarState", "()Lcom/bamtech/player/config/PlaybackEngineConfig$SystemBarState;", "getNativePlaybackRates", "()Ljava/util/Set;", "getPercentageCompletionNotificationList", "()Ljava/util/List;", "getPlaybackRates", "()Lcom/bamtech/player/PlaybackRates;", "getPlaybuttonVisibilityWhileBuffering", "getPortraitSystemBarState", "getSeekBarTickRateMs", "getShouldHideControlsWhenBuffering", "getShouldKeepScreenOn", "getShouldPauseVideoWhileSeeking", "getShouldRemoveLeadingZeroFromTime", "getShouldRequestAudioFocus", "getShouldShowControlsWhenPaused", "getShouldShowLoadingViewWhenPlayerIsIdle", "getShouldShowUnsupportedTracks", "getShouldToggleSystemBars", "getTouchGutterPercentage", "()F", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "Builder", "SystemBarState", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.e0.a */
/* compiled from: PlaybackEngineConfig.kt */
public final class C4952a {

    /* renamed from: a */
    private final boolean f12113a;

    /* renamed from: b */
    private final C5294k f12114b;

    /* renamed from: c */
    private final int f12115c;

    /* renamed from: d */
    private final boolean f12116d;

    /* renamed from: e */
    private final int f12117e;

    /* renamed from: f */
    private final boolean f12118f;

    /* renamed from: g */
    private final List<Integer> f12119g;

    /* renamed from: h */
    private final boolean f12120h;

    /* renamed from: i */
    private final boolean f12121i;

    /* renamed from: j */
    private final Set<Integer> f12122j;

    /* renamed from: k */
    private final boolean f12123k;

    /* renamed from: l */
    private final boolean f12124l;

    /* renamed from: m */
    private final boolean f12125m;

    /* renamed from: n */
    private final boolean f12126n;

    /* renamed from: o */
    private final C4954b f12127o;

    /* renamed from: p */
    private final C4954b f12128p;

    /* renamed from: q */
    private final float f12129q;

    /* renamed from: r */
    private final long f12130r;

    /* renamed from: s */
    private final long f12131s;

    /* renamed from: t */
    private final long f12132t;

    /* renamed from: u */
    private final long f12133u;

    /* renamed from: v */
    private final boolean f12134v;

    /* renamed from: w */
    private final int f12135w;

    /* renamed from: x */
    private final boolean f12136x;

    /* renamed from: y */
    private final boolean f12137y;

    /* renamed from: g.d.b.e0.a$a */
    /* compiled from: PlaybackEngineConfig.kt */
    public static final class C4953a {

        /* renamed from: a */
        private boolean f12138a;

        /* renamed from: b */
        private C5294k f12139b;

        /* renamed from: c */
        private int f12140c;

        /* renamed from: d */
        private boolean f12141d = true;

        /* renamed from: e */
        private int f12142e;

        /* renamed from: f */
        private boolean f12143f;

        /* renamed from: g */
        private List<Integer> f12144g = C13185o.m40520c(Integer.valueOf(0), Integer.valueOf(25), Integer.valueOf(50), Integer.valueOf(75), Integer.valueOf(100));

        /* renamed from: h */
        private boolean f12145h;

        /* renamed from: i */
        private boolean f12146i;

        /* renamed from: j */
        private Set<Integer> f12147j = C13186o0.m40524a(Integer.valueOf(2));

        /* renamed from: k */
        private boolean f12148k;

        /* renamed from: l */
        private boolean f12149l;

        /* renamed from: m */
        private boolean f12150m = true;

        /* renamed from: n */
        private boolean f12151n;

        /* renamed from: o */
        private C4954b f12152o;

        /* renamed from: p */
        private C4954b f12153p;

        /* renamed from: q */
        private float f12154q;

        /* renamed from: r */
        private long f12155r;

        /* renamed from: s */
        private long f12156s;

        /* renamed from: t */
        private long f12157t;

        /* renamed from: u */
        private long f12158u;

        /* renamed from: v */
        private boolean f12159v;

        /* renamed from: w */
        private int f12160w;

        /* renamed from: x */
        private boolean f12161x;

        /* renamed from: y */
        private boolean f12162y;

        public C4953a() {
            C4954b bVar = C4954b.Default;
            this.f12152o = bVar;
            this.f12153p = bVar;
            this.f12155r = 250;
            long j = this.f12155r;
            this.f12156s = j;
            this.f12157t = j;
            this.f12158u = 42;
            this.f12160w = 4;
        }

        /* renamed from: a */
        public final C4953a mo16384a(int... iArr) {
            this.f12139b = new C5294k(Arrays.copyOf(iArr, iArr.length));
            return this;
        }

        /* renamed from: b */
        public final long mo16386b() {
            return this.f12155r;
        }

        /* renamed from: c */
        public final long mo16389c() {
            return this.f12156s;
        }

        /* renamed from: d */
        public final long mo16392d() {
            return this.f12157t;
        }

        /* renamed from: e */
        public final int mo16393e() {
            return this.f12142e;
        }

        /* renamed from: f */
        public final boolean mo16394f() {
            return this.f12146i;
        }

        /* renamed from: g */
        public final boolean mo16395g() {
            return this.f12145h;
        }

        /* renamed from: h */
        public final boolean mo16396h() {
            return this.f12138a;
        }

        /* renamed from: i */
        public final int mo16397i() {
            return this.f12140c;
        }

        /* renamed from: j */
        public final C4954b mo16398j() {
            return this.f12153p;
        }

        /* renamed from: k */
        public final Set<Integer> mo16399k() {
            return this.f12147j;
        }

        /* renamed from: l */
        public final List<Integer> mo16400l() {
            return this.f12144g;
        }

        /* renamed from: m */
        public final C5294k mo16401m() {
            return this.f12139b;
        }

        /* renamed from: n */
        public final int mo16402n() {
            return this.f12160w;
        }

        /* renamed from: o */
        public final C4954b mo16403o() {
            return this.f12152o;
        }

        /* renamed from: p */
        public final long mo16404p() {
            return this.f12158u;
        }

        /* renamed from: q */
        public final boolean mo16405q() {
            return this.f12149l;
        }

        /* renamed from: r */
        public final boolean mo16406r() {
            return this.f12162y;
        }

        /* renamed from: s */
        public final boolean mo16407s() {
            return this.f12161x;
        }

        /* renamed from: t */
        public final boolean mo16408t() {
            return this.f12143f;
        }

        /* renamed from: u */
        public final boolean mo16409u() {
            return this.f12150m;
        }

        /* renamed from: v */
        public final boolean mo16410v() {
            return this.f12148k;
        }

        /* renamed from: w */
        public final boolean mo16411w() {
            return this.f12141d;
        }

        /* renamed from: x */
        public final boolean mo16412x() {
            return this.f12159v;
        }

        /* renamed from: y */
        public final boolean mo16413y() {
            return this.f12151n;
        }

        /* renamed from: z */
        public final float mo16414z() {
            return this.f12154q;
        }

        /* renamed from: a */
        public final C4953a mo16380a(int i) {
            this.f12142e = i;
            return this;
        }

        /* renamed from: b */
        public final C4953a mo16387b(int i) {
            this.f12140c = i;
            return this;
        }

        /* renamed from: c */
        public final C4953a mo16391c(boolean z) {
            this.f12148k = z;
            return this;
        }

        /* renamed from: a */
        public final C4953a mo16382a(List<Integer> list) {
            this.f12144g = list;
            return this;
        }

        /* renamed from: b */
        public final C4953a mo16388b(boolean z) {
            this.f12143f = z;
            return this;
        }

        /* renamed from: c */
        public final C4953a mo16390c(int i) {
            this.f12160w = i;
            return this;
        }

        /* renamed from: a */
        public final C4953a mo16381a(long j) {
            this.f12155r = j;
            return this;
        }

        /* renamed from: a */
        public final C4953a mo16383a(boolean z) {
            this.f12161x = z;
            return this;
        }

        /* renamed from: a */
        public final C4952a mo16385a() {
            return new C4952a(this, null);
        }
    }

    /* renamed from: g.d.b.e0.a$b */
    /* compiled from: PlaybackEngineConfig.kt */
    public enum C4954b {
        Show,
        Hide,
        Default
    }

    public C4952a() {
        this(false, null, 0, false, 0, false, null, false, false, null, false, false, false, false, null, null, 0.0f, 0, 0, 0, 0, false, 0, false, false, 33554431, null);
    }

    public /* synthetic */ C4952a(C4953a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public final long mo16354a() {
        return this.f12131s;
    }

    /* renamed from: b */
    public final long mo16355b() {
        return this.f12132t;
    }

    /* renamed from: c */
    public final int mo16356c() {
        return this.f12117e;
    }

    /* renamed from: d */
    public final boolean mo16357d() {
        return this.f12121i;
    }

    /* renamed from: e */
    public final boolean mo16358e() {
        return this.f12120h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4952a) {
                C4952a aVar = (C4952a) obj;
                if ((this.f12113a == aVar.f12113a) && C12880j.m40224a((Object) this.f12114b, (Object) aVar.f12114b)) {
                    if (this.f12115c == aVar.f12115c) {
                        if (this.f12116d == aVar.f12116d) {
                            if (this.f12117e == aVar.f12117e) {
                                if ((this.f12118f == aVar.f12118f) && C12880j.m40224a((Object) this.f12119g, (Object) aVar.f12119g)) {
                                    if (this.f12120h == aVar.f12120h) {
                                        if ((this.f12121i == aVar.f12121i) && C12880j.m40224a((Object) this.f12122j, (Object) aVar.f12122j)) {
                                            if (this.f12123k == aVar.f12123k) {
                                                if (this.f12124l == aVar.f12124l) {
                                                    if (this.f12125m == aVar.f12125m) {
                                                        if ((this.f12126n == aVar.f12126n) && C12880j.m40224a((Object) this.f12127o, (Object) aVar.f12127o) && C12880j.m40224a((Object) this.f12128p, (Object) aVar.f12128p) && Float.compare(this.f12129q, aVar.f12129q) == 0) {
                                                            if (this.f12130r == aVar.f12130r) {
                                                                if (this.f12131s == aVar.f12131s) {
                                                                    if (this.f12132t == aVar.f12132t) {
                                                                        if (this.f12133u == aVar.f12133u) {
                                                                            if (this.f12134v == aVar.f12134v) {
                                                                                if (this.f12135w == aVar.f12135w) {
                                                                                    if (this.f12136x == aVar.f12136x) {
                                                                                        if (this.f12137y == aVar.f12137y) {
                                                                                            return true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo16360f() {
        return this.f12113a;
    }

    /* renamed from: g */
    public final int mo16361g() {
        return this.f12115c;
    }

    /* renamed from: h */
    public final C4954b mo16362h() {
        return this.f12128p;
    }

    public int hashCode() {
        boolean z = this.f12113a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        C5294k kVar = this.f12114b;
        int i3 = 0;
        int hashCode = (((i2 + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f12115c) * 31;
        boolean z2 = this.f12116d;
        if (z2) {
            z2 = true;
        }
        int i4 = (((hashCode + (z2 ? 1 : 0)) * 31) + this.f12117e) * 31;
        boolean z3 = this.f12118f;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        List<Integer> list = this.f12119g;
        int hashCode2 = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z4 = this.f12120h;
        if (z4) {
            z4 = true;
        }
        int i6 = (hashCode2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f12121i;
        if (z5) {
            z5 = true;
        }
        int i7 = (i6 + (z5 ? 1 : 0)) * 31;
        Set<Integer> set = this.f12122j;
        int hashCode3 = (i7 + (set != null ? set.hashCode() : 0)) * 31;
        boolean z6 = this.f12123k;
        if (z6) {
            z6 = true;
        }
        int i8 = (hashCode3 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f12124l;
        if (z7) {
            z7 = true;
        }
        int i9 = (i8 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f12125m;
        if (z8) {
            z8 = true;
        }
        int i10 = (i9 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f12126n;
        if (z9) {
            z9 = true;
        }
        int i11 = (i10 + (z9 ? 1 : 0)) * 31;
        C4954b bVar = this.f12127o;
        int hashCode4 = (i11 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C4954b bVar2 = this.f12128p;
        if (bVar2 != null) {
            i3 = bVar2.hashCode();
        }
        int floatToIntBits = (((hashCode4 + i3) * 31) + Float.floatToIntBits(this.f12129q)) * 31;
        long j = this.f12130r;
        int i12 = (floatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f12131s;
        int i13 = (i12 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f12132t;
        int i14 = (i13 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f12133u;
        int i15 = (i14 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z10 = this.f12134v;
        if (z10) {
            z10 = true;
        }
        int i16 = (((i15 + (z10 ? 1 : 0)) * 31) + this.f12135w) * 31;
        boolean z11 = this.f12136x;
        if (z11) {
            z11 = true;
        }
        int i17 = (i16 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f12137y;
        if (!z12) {
            i = z12;
        }
        return i17 + i;
    }

    /* renamed from: i */
    public final Set<Integer> mo16364i() {
        return this.f12122j;
    }

    /* renamed from: j */
    public final List<Integer> mo16365j() {
        return this.f12119g;
    }

    /* renamed from: k */
    public final C5294k mo16366k() {
        return this.f12114b;
    }

    /* renamed from: l */
    public final int mo16367l() {
        return this.f12135w;
    }

    /* renamed from: m */
    public final C4954b mo16368m() {
        return this.f12127o;
    }

    /* renamed from: n */
    public final long mo16369n() {
        return this.f12133u;
    }

    /* renamed from: o */
    public final boolean mo16370o() {
        return this.f12124l;
    }

    /* renamed from: p */
    public final boolean mo16371p() {
        return this.f12137y;
    }

    /* renamed from: q */
    public final boolean mo16372q() {
        return this.f12136x;
    }

    /* renamed from: r */
    public final boolean mo16373r() {
        return this.f12118f;
    }

    /* renamed from: s */
    public final boolean mo16374s() {
        return this.f12125m;
    }

    /* renamed from: t */
    public final boolean mo16375t() {
        return this.f12123k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackEngineConfig(enableRotationAfterManualOrientationChanges=");
        sb.append(this.f12113a);
        sb.append(", playbackRates=");
        sb.append(this.f12114b);
        sb.append(", jumpAmountSeconds=");
        sb.append(this.f12115c);
        sb.append(", shouldShowLoadingViewWhenPlayerIsIdle=");
        sb.append(this.f12116d);
        sb.append(", controlsHideTimeoutSeconds=");
        sb.append(this.f12117e);
        sb.append(", shouldRemoveLeadingZeroFromTime=");
        sb.append(this.f12118f);
        sb.append(", percentageCompletionNotificationList=");
        sb.append(this.f12119g);
        sb.append(", enableLandscapeToPortraitBackBehavior=");
        sb.append(this.f12120h);
        sb.append(", enableGestures=");
        sb.append(this.f12121i);
        sb.append(", nativePlaybackRates=");
        sb.append(this.f12122j);
        sb.append(", shouldShowControlsWhenPaused=");
        sb.append(this.f12123k);
        sb.append(", shouldHideControlsWhenBuffering=");
        sb.append(this.f12124l);
        sb.append(", shouldRequestAudioFocus=");
        sb.append(this.f12125m);
        sb.append(", shouldToggleSystemBars=");
        sb.append(this.f12126n);
        sb.append(", portraitSystemBarState=");
        sb.append(this.f12127o);
        sb.append(", landscapeSystemBarState=");
        sb.append(this.f12128p);
        sb.append(", touchGutterPercentage=");
        sb.append(this.f12129q);
        sb.append(", controlAnimationDuration=");
        sb.append(this.f12130r);
        sb.append(", controlAnimationHideDuration=");
        sb.append(this.f12131s);
        sb.append(", controlAnimationShowDuration=");
        sb.append(this.f12132t);
        sb.append(", seekBarTickRateMs=");
        sb.append(this.f12133u);
        sb.append(", shouldShowUnsupportedTracks=");
        sb.append(this.f12134v);
        sb.append(", playbuttonVisibilityWhileBuffering=");
        sb.append(this.f12135w);
        sb.append(", shouldPauseVideoWhileSeeking=");
        sb.append(this.f12136x);
        sb.append(", shouldKeepScreenOn=");
        sb.append(this.f12137y);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo16377u() {
        return this.f12116d;
    }

    /* renamed from: v */
    public final boolean mo16378v() {
        return this.f12126n;
    }

    /* renamed from: w */
    public final float mo16379w() {
        return this.f12129q;
    }

    public C4952a(boolean z, C5294k kVar, int i, boolean z2, int i2, boolean z3, List<Integer> list, boolean z4, boolean z5, Set<Integer> set, boolean z6, boolean z7, boolean z8, boolean z9, C4954b bVar, C4954b bVar2, float f, long j, long j2, long j3, long j4, boolean z10, int i3, boolean z11, boolean z12) {
        this.f12113a = z;
        this.f12114b = kVar;
        this.f12115c = i;
        this.f12116d = z2;
        this.f12117e = i2;
        this.f12118f = z3;
        this.f12119g = list;
        this.f12120h = z4;
        this.f12121i = z5;
        this.f12122j = set;
        this.f12123k = z6;
        this.f12124l = z7;
        this.f12125m = z8;
        this.f12126n = z9;
        this.f12127o = bVar;
        this.f12128p = bVar2;
        this.f12129q = f;
        this.f12130r = j;
        this.f12131s = j2;
        this.f12132t = j3;
        this.f12133u = j4;
        this.f12134v = z10;
        this.f12135w = i3;
        this.f12136x = z11;
        this.f12137y = z12;
    }

    public /* synthetic */ C4952a(boolean z, C5294k kVar, int i, boolean z2, int i2, boolean z3, List list, boolean z4, boolean z5, Set set, boolean z6, boolean z7, boolean z8, boolean z9, C4954b bVar, C4954b bVar2, float f, long j, long j2, long j3, long j4, boolean z10, int i3, boolean z11, boolean z12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        int i5 = i4;
        boolean z13 = (i5 & 1) != 0 ? false : z;
        C5294k kVar2 = (i5 & 2) != 0 ? null : kVar;
        int i6 = (i5 & 4) != 0 ? 0 : i;
        boolean z14 = true;
        boolean z15 = (i5 & 8) != 0 ? true : z2;
        int i7 = (i5 & 16) != 0 ? 0 : i2;
        boolean z16 = (i5 & 32) != 0 ? false : z3;
        List c = (i5 & 64) != 0 ? C13185o.m40520c(Integer.valueOf(0), Integer.valueOf(25), Integer.valueOf(50), Integer.valueOf(75), Integer.valueOf(100)) : list;
        boolean z17 = (i5 & 128) != 0 ? false : z4;
        boolean z18 = (i5 & 256) != 0 ? false : z5;
        Set a = (i5 & DateUtils.FORMAT_NO_NOON) != 0 ? C13186o0.m40524a(Integer.valueOf(2)) : set;
        boolean z19 = (i5 & 1024) != 0 ? false : z6;
        boolean z20 = (i5 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? true : z7;
        if ((i5 & 4096) == 0) {
            z14 = z8;
        }
        boolean z21 = (i5 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? false : z9;
        C4954b bVar3 = (i5 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? C4954b.Default : bVar;
        C4954b bVar4 = (i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? C4954b.Default : bVar2;
        float f2 = (i5 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? 0.0f : f;
        long j5 = (i5 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? 250 : j;
        this(z13, kVar2, i6, z15, i7, z16, c, z17, z18, a, z19, z20, z14, z21, bVar3, bVar4, f2, j5, (i5 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? j5 : j2, (i5 & DateUtils.FORMAT_ABBREV_ALL) != 0 ? j5 : j3, (i5 & 1048576) != 0 ? 42 : j4, (i5 & 2097152) != 0 ? false : z10, (i5 & 4194304) != 0 ? 4 : i3, (i5 & 8388608) != 0 ? false : z11, (i5 & 16777216) != 0 ? false : z12);
    }

    private C4952a(C4953a aVar) {
        this(aVar.mo16396h(), aVar.mo16401m(), aVar.mo16397i(), aVar.mo16411w(), aVar.mo16393e(), aVar.mo16408t(), aVar.mo16400l(), aVar.mo16395g(), aVar.mo16394f(), aVar.mo16399k(), aVar.mo16410v(), aVar.mo16405q(), aVar.mo16409u(), aVar.mo16413y(), aVar.mo16403o(), aVar.mo16398j(), aVar.mo16414z(), aVar.mo16386b(), aVar.mo16389c(), aVar.mo16392d(), aVar.mo16404p(), aVar.mo16412x(), aVar.mo16402n(), aVar.mo16407s(), aVar.mo16406r());
    }
}
