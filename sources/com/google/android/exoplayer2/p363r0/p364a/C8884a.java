package com.google.android.exoplayer2.p363r0.p364a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.MediaMetadataCompat.C0008b;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.MediaSessionCompat.C0027c;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p001v4.media.session.PlaybackStateCompat.C0047b;
import android.support.p001v4.media.session.PlaybackStateCompat.CustomAction;
import android.util.Pair;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.C8898s;
import com.google.android.exoplayer2.C9269t;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9555l;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.r0.a.a */
/* compiled from: MediaSessionConnector */
public final class C8884a {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final MediaMetadataCompat f19047v = new C0008b().mo55a();

    /* renamed from: a */
    public final MediaSessionCompat f19048a;

    /* renamed from: b */
    private final Looper f19049b = Util.m29432b();

    /* renamed from: c */
    private final C8887c f19050c = new C8887c();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayList<C8886b> f19051d = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList<C8886b> f19052e = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8898s f19053f = new C9269t();

    /* renamed from: g */
    private C8888d[] f19054g = new C8888d[0];
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<String, C8888d> f19055h = Collections.emptyMap();

    /* renamed from: i */
    private C8891g f19056i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Player f19057j;

    /* renamed from: k */
    private C9555l<? super ExoPlaybackException> f19058k;

    /* renamed from: l */
    private Pair<Integer, CharSequence> f19059l;

    /* renamed from: m */
    private Bundle f19060m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C8892h f19061n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8894j f19062o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8893i f19063p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C8895k f19064q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C8890f f19065r;

    /* renamed from: s */
    private long f19066s;

    /* renamed from: t */
    private int f19067t;

    /* renamed from: u */
    private int f19068u;

    /* renamed from: com.google.android.exoplayer2.r0.a.a$b */
    /* compiled from: MediaSessionConnector */
    public interface C8886b {
        /* renamed from: a */
        boolean mo23241a(Player player, C8898s sVar, String str, Bundle bundle, ResultReceiver resultReceiver);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$c */
    /* compiled from: MediaSessionConnector */
    private class C8887c extends C0027c implements EventListener {

        /* renamed from: X */
        private int f19069X;

        /* renamed from: Y */
        private int f19070Y;

        private C8887c() {
        }

        /* renamed from: a */
        public void mo7578a(boolean z) {
            C8884a.this.mo23239b();
        }

        /* renamed from: b */
        public void mo159b() {
            if (C8884a.this.m25975a(64)) {
                C8884a aVar = C8884a.this;
                aVar.m25983c(aVar.f19057j);
            }
        }

        /* renamed from: c */
        public void mo166c() {
            if (C8884a.this.m25975a(2)) {
                C8884a.this.f19053f.mo23267c(C8884a.this.f19057j, false);
            }
        }

        /* renamed from: d */
        public void mo168d() {
            if (C8884a.this.m25975a(4)) {
                if (C8884a.this.f19057j.getPlaybackState() == 1) {
                    if (C8884a.this.f19061n != null) {
                        C8884a.this.f19061n.mo23248a(true);
                    }
                } else if (C8884a.this.f19057j.getPlaybackState() == 4) {
                    C8884a.this.f19053f.mo23264a(C8884a.this.f19057j, C8884a.this.f19057j.getCurrentWindowIndex(), -9223372036854775807L);
                }
                C8898s m = C8884a.this.f19053f;
                Player i = C8884a.this.f19057j;
                Assertions.checkNotNull(i);
                m.mo23267c(i, true);
            }
        }

        /* renamed from: e */
        public void mo170e() {
            if (C8884a.this.m25980b(16384)) {
                C8884a.this.f19061n.mo23248a(false);
            }
        }

        /* renamed from: f */
        public void mo172f() {
            if (C8884a.this.m25975a(8)) {
                C8884a aVar = C8884a.this;
                aVar.m25987d(aVar.f19057j);
            }
        }

        /* renamed from: g */
        public void mo173g() {
            if (C8884a.this.m25984c(32)) {
                C8884a.this.f19062o.mo23254a(C8884a.this.f19057j, C8884a.this.f19053f);
            }
        }

        /* renamed from: h */
        public void mo174h() {
            if (C8884a.this.m25984c(16)) {
                C8884a.this.f19062o.mo23257b(C8884a.this.f19057j, C8884a.this.f19053f);
            }
        }

        /* renamed from: i */
        public void mo175i() {
            if (C8884a.this.m25975a(1)) {
                C8884a.this.f19053f.mo23265a(C8884a.this.f19057j, true);
            }
        }

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C8729j0.m25323b((EventListener) this, z);
        }

        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C8884a.this.mo23239b();
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C8729j0.m25316a((EventListener) this, exoPlaybackException);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            C8884a.this.mo23239b();
        }

        public void onPositionDiscontinuity(int i) {
            if (this.f19069X != C8884a.this.f19057j.getCurrentWindowIndex()) {
                if (C8884a.this.f19062o != null) {
                    C8884a.this.f19062o.mo23253a(C8884a.this.f19057j);
                }
                this.f19069X = C8884a.this.f19057j.getCurrentWindowIndex();
                C8884a.this.mo23239b();
                C8884a.this.mo23236a();
                return;
            }
            C8884a.this.mo23239b();
        }

        public void onRepeatModeChanged(int i) {
            MediaSessionCompat mediaSessionCompat = C8884a.this.f19048a;
            int i2 = 2;
            if (i == 1) {
                i2 = 1;
            } else if (i != 2) {
                i2 = 0;
            }
            mediaSessionCompat.mo121b(i2);
            C8884a.this.mo23239b();
        }

        public /* synthetic */ void onSeekProcessed() {
            C8729j0.m25314a(this);
        }

        public void onShuffleModeEnabledChanged(boolean z) {
            C8884a.this.f19048a.mo123c(z ? 1 : 0);
            C8884a.this.mo23239b();
            C8884a.this.mo23240c();
        }

        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            int b = C8884a.this.f19057j.getCurrentTimeline().mo22667b();
            int currentWindowIndex = C8884a.this.f19057j.getCurrentWindowIndex();
            if (C8884a.this.f19062o != null) {
                C8884a.this.f19062o.mo23259d(C8884a.this.f19057j);
                C8884a.this.mo23239b();
            } else if (!(this.f19070Y == b && this.f19069X == currentWindowIndex)) {
                C8884a.this.mo23239b();
            }
            this.f19070Y = b;
            this.f19069X = currentWindowIndex;
            C8884a.this.mo23236a();
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C8729j0.m25319a((EventListener) this, trackGroupArray, trackSelectionArray);
        }

        /* renamed from: a */
        public void mo149a(long j) {
            if (C8884a.this.m25975a(256)) {
                C8884a aVar = C8884a.this;
                aVar.m25972a(aVar.f19057j, j);
            }
        }

        /* renamed from: b */
        public void mo160b(int i) {
            if (C8884a.this.m25975a(2097152)) {
                boolean z = true;
                if (!(i == 1 || i == 2)) {
                    z = false;
                }
                C8884a.this.f19053f.mo23266b(C8884a.this.f19057j, z);
            }
        }

        /* renamed from: c */
        public void mo167c(String str, Bundle bundle) {
            if (C8884a.this.m25980b(2048)) {
                C8884a.this.f19061n.mo23247a(str, true, bundle);
            }
        }

        /* renamed from: e */
        public void mo171e(String str, Bundle bundle) {
            if (C8884a.this.m25980b(65536)) {
                C8884a.this.f19061n.mo23247a(str, false, bundle);
            }
        }

        /* renamed from: a */
        public void mo148a(int i) {
            if (C8884a.this.m25975a(262144)) {
                int i2 = 2;
                if (i == 1) {
                    i2 = 1;
                } else if (!(i == 2 || i == 3)) {
                    i2 = 0;
                }
                C8884a.this.f19053f.mo23263a(C8884a.this.f19057j, i2);
            }
        }

        /* renamed from: b */
        public void mo161b(long j) {
            if (C8884a.this.m25984c(4096)) {
                C8884a.this.f19062o.mo23255a(C8884a.this.f19057j, C8884a.this.f19053f, j);
            }
        }

        /* renamed from: a */
        public void mo156a(String str, Bundle bundle) {
            if (C8884a.this.f19057j != null && C8884a.this.f19055h.containsKey(str)) {
                ((C8888d) C8884a.this.f19055h.get(str)).mo23243a(C8884a.this.f19057j, C8884a.this.f19053f, str, bundle);
                C8884a.this.mo23239b();
            }
        }

        /* renamed from: b */
        public void mo162b(Uri uri, Bundle bundle) {
            if (C8884a.this.m25980b(131072)) {
                C8884a.this.f19061n.mo23246a(uri, false, bundle);
            }
        }

        /* renamed from: a */
        public void mo157a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (C8884a.this.f19057j != null) {
                int i = 0;
                int i2 = 0;
                while (i2 < C8884a.this.f19051d.size()) {
                    if (!((C8886b) C8884a.this.f19051d.get(i2)).mo23241a(C8884a.this.f19057j, C8884a.this.f19053f, str, bundle, resultReceiver)) {
                        i2++;
                    } else {
                        return;
                    }
                }
                while (i < C8884a.this.f19052e.size() && !((C8886b) C8884a.this.f19052e.get(i)).mo23241a(C8884a.this.f19057j, C8884a.this.f19053f, str, bundle, resultReceiver)) {
                    i++;
                }
            }
        }

        /* renamed from: b */
        public void mo164b(String str, Bundle bundle) {
            if (C8884a.this.m25980b(1024)) {
                C8884a.this.f19061n.mo23249b(str, true, bundle);
            }
        }

        /* renamed from: d */
        public void mo169d(String str, Bundle bundle) {
            if (C8884a.this.m25980b(32768)) {
                C8884a.this.f19061n.mo23249b(str, false, bundle);
            }
        }

        /* renamed from: b */
        public void mo163b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (C8884a.this.m25994g()) {
                C8884a.this.f19063p.mo23250a(C8884a.this.f19057j, mediaDescriptionCompat);
            }
        }

        /* renamed from: a */
        public void mo150a(Uri uri, Bundle bundle) {
            if (C8884a.this.m25980b(8192)) {
                C8884a.this.f19061n.mo23246a(uri, true, bundle);
            }
        }

        /* renamed from: a */
        public void mo153a(RatingCompat ratingCompat) {
            if (C8884a.this.m25995h()) {
                C8884a.this.f19064q.mo23260a(C8884a.this.f19057j, ratingCompat);
            }
        }

        /* renamed from: a */
        public void mo154a(RatingCompat ratingCompat, Bundle bundle) {
            if (C8884a.this.m25995h()) {
                C8884a.this.f19064q.mo23261a(C8884a.this.f19057j, ratingCompat, bundle);
            }
        }

        /* renamed from: a */
        public void mo151a(MediaDescriptionCompat mediaDescriptionCompat) {
            if (C8884a.this.m25994g()) {
                C8884a.this.f19063p.mo23252b(C8884a.this.f19057j, mediaDescriptionCompat);
            }
        }

        /* renamed from: a */
        public void mo152a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (C8884a.this.m25994g()) {
                C8884a.this.f19063p.mo23251a(C8884a.this.f19057j, mediaDescriptionCompat, i);
            }
        }

        /* renamed from: a */
        public boolean mo158a(Intent intent) {
            if ((C8884a.this.m25991f() && C8884a.this.f19065r.mo7746a(C8884a.this.f19057j, C8884a.this.f19053f, intent)) || super.mo158a(intent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$d */
    /* compiled from: MediaSessionConnector */
    public interface C8888d {
        /* renamed from: a */
        CustomAction mo23242a(Player player);

        /* renamed from: a */
        void mo23243a(Player player, C8898s sVar, String str, Bundle bundle);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$e */
    /* compiled from: MediaSessionConnector */
    public static final class C8889e implements C8891g {

        /* renamed from: a */
        private final MediaControllerCompat f19072a;

        /* renamed from: b */
        private final String f19073b;

        public C8889e(MediaControllerCompat mediaControllerCompat, String str) {
            this.f19072a = mediaControllerCompat;
            if (str == null) {
                str = "";
            }
            this.f19073b = str;
        }

        /* renamed from: a */
        public MediaMetadataCompat mo23244a(Player player) {
            if (player.getCurrentTimeline().mo22671c()) {
                return C8884a.f19047v;
            }
            C0008b bVar = new C0008b();
            if (player.isPlayingAd()) {
                bVar.mo50a("android.media.metadata.ADVERTISEMENT", 1);
            }
            bVar.mo50a("android.media.metadata.DURATION", (player.isCurrentWindowDynamic() || player.getDuration() == -9223372036854775807L) ? -1 : player.getDuration());
            long Y = this.f19072a.mo74a().mo289Y();
            if (Y != -1) {
                List b = this.f19072a.mo75b();
                int i = 0;
                while (true) {
                    if (b == null || i >= b.size()) {
                        break;
                    }
                    QueueItem queueItem = (QueueItem) b.get(i);
                    if (queueItem.mo124X() == Y) {
                        MediaDescriptionCompat description = queueItem.getDescription();
                        Bundle X = description.mo19X();
                        if (X != null) {
                            for (String str : X.keySet()) {
                                Object obj = X.get(str);
                                if (obj instanceof String) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.f19073b);
                                    sb.append(str);
                                    bVar.mo54a(sb.toString(), (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f19073b);
                                    sb2.append(str);
                                    bVar.mo53a(sb2.toString(), (CharSequence) obj);
                                } else if (obj instanceof Long) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(this.f19073b);
                                    sb3.append(str);
                                    bVar.mo50a(sb3.toString(), ((Long) obj).longValue());
                                } else if (obj instanceof Integer) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(this.f19073b);
                                    sb4.append(str);
                                    bVar.mo50a(sb4.toString(), (long) ((Integer) obj).intValue());
                                } else if (obj instanceof Bitmap) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(this.f19073b);
                                    sb5.append(str);
                                    bVar.mo51a(sb5.toString(), (Bitmap) obj);
                                } else if (obj instanceof RatingCompat) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(this.f19073b);
                                    sb6.append(str);
                                    bVar.mo52a(sb6.toString(), (RatingCompat) obj);
                                }
                            }
                        }
                        if (description.mo25d0() != null) {
                            String valueOf = String.valueOf(description.mo25d0());
                            bVar.mo54a("android.media.metadata.TITLE", valueOf);
                            bVar.mo54a("android.media.metadata.DISPLAY_TITLE", valueOf);
                        }
                        if (description.mo24c0() != null) {
                            bVar.mo54a("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(description.mo24c0()));
                        }
                        if (description.getDescription() != null) {
                            bVar.mo54a("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(description.getDescription()));
                        }
                        if (description.mo20Y() != null) {
                            bVar.mo51a("android.media.metadata.DISPLAY_ICON", description.mo20Y());
                        }
                        if (description.mo21Z() != null) {
                            bVar.mo54a("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(description.mo21Z()));
                        }
                        if (description.getMediaId() != null) {
                            bVar.mo54a("android.media.metadata.MEDIA_ID", String.valueOf(description.getMediaId()));
                        }
                        if (description.mo23b0() != null) {
                            bVar.mo54a("android.media.metadata.MEDIA_URI", String.valueOf(description.mo23b0()));
                        }
                    } else {
                        i++;
                    }
                }
            }
            return bVar.mo55a();
        }
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$f */
    /* compiled from: MediaSessionConnector */
    public interface C8890f {
        /* renamed from: a */
        boolean mo7746a(Player player, C8898s sVar, Intent intent);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$g */
    /* compiled from: MediaSessionConnector */
    public interface C8891g {
        /* renamed from: a */
        MediaMetadataCompat mo23244a(Player player);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$h */
    /* compiled from: MediaSessionConnector */
    public interface C8892h extends C8886b {
        /* renamed from: a */
        long mo23245a();

        /* renamed from: a */
        void mo23246a(Uri uri, boolean z, Bundle bundle);

        /* renamed from: a */
        void mo23247a(String str, boolean z, Bundle bundle);

        /* renamed from: a */
        void mo23248a(boolean z);

        /* renamed from: b */
        void mo23249b(String str, boolean z, Bundle bundle);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$i */
    /* compiled from: MediaSessionConnector */
    public interface C8893i extends C8886b {
        /* renamed from: a */
        void mo23250a(Player player, MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: a */
        void mo23251a(Player player, MediaDescriptionCompat mediaDescriptionCompat, int i);

        /* renamed from: b */
        void mo23252b(Player player, MediaDescriptionCompat mediaDescriptionCompat);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$j */
    /* compiled from: MediaSessionConnector */
    public interface C8894j extends C8886b {
        /* renamed from: a */
        void mo23253a(Player player);

        /* renamed from: a */
        void mo23254a(Player player, C8898s sVar);

        /* renamed from: a */
        void mo23255a(Player player, C8898s sVar, long j);

        /* renamed from: b */
        long mo23256b(Player player);

        /* renamed from: b */
        void mo23257b(Player player, C8898s sVar);

        /* renamed from: c */
        long mo23258c(Player player);

        /* renamed from: d */
        void mo23259d(Player player);
    }

    /* renamed from: com.google.android.exoplayer2.r0.a.a$k */
    /* compiled from: MediaSessionConnector */
    public interface C8895k extends C8886b {
        /* renamed from: a */
        void mo23260a(Player player, RatingCompat ratingCompat);

        /* renamed from: a */
        void mo23261a(Player player, RatingCompat ratingCompat, Bundle bundle);
    }

    static {
        C8672a0.m24990a("goog.exo.mediasession");
    }

    public C8884a(MediaSessionCompat mediaSessionCompat) {
        this.f19048a = mediaSessionCompat;
        this.f19056i = new C8889e(mediaSessionCompat.mo113a(), null);
        this.f19066s = 2360143;
        this.f19067t = 5000;
        this.f19068u = 15000;
        mediaSessionCompat.mo114a(3);
        mediaSessionCompat.mo117a((C0027c) this.f19050c, new Handler(this.f19049b));
    }

    /* renamed from: a */
    private static int m25969a(int i, boolean z) {
        int i2 = 2;
        if (i == 2) {
            return 6;
        }
        if (i != 3) {
            return i != 4 ? 0 : 1;
        }
        if (z) {
            i2 = 3;
        }
        return i2;
    }

    /* renamed from: e */
    private long m25989e() {
        C8892h hVar = this.f19061n;
        if (hVar == null) {
            return 0;
        }
        return hVar.mo23245a() & 257024;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m25991f() {
        return (this.f19057j == null || this.f19065r == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m25994g() {
        return (this.f19057j == null || this.f19063p == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m25995h() {
        return (this.f19057j == null || this.f19064q == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25987d(Player player) {
        if (player.isCurrentWindowSeekable() && this.f19067t > 0) {
            m25972a(player, player.getCurrentPosition() - ((long) this.f19067t));
        }
    }

    /* renamed from: c */
    public final void mo23240c() {
        C8894j jVar = this.f19062o;
        if (jVar != null) {
            Player player = this.f19057j;
            if (player != null) {
                jVar.mo23259d(player);
            }
        }
    }

    /* renamed from: b */
    public final void mo23239b() {
        C8888d[] dVarArr;
        int i;
        C0047b bVar = new C0047b();
        if (this.f19057j == null) {
            bVar.mo309a(m25989e());
            bVar.mo307a(0, 0, 0.0f, SystemClock.elapsedRealtime());
            this.f19048a.mo118a(bVar.mo312a());
            return;
        }
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C8888d dVar : this.f19054g) {
            CustomAction a = dVar.mo23242a(this.f19057j);
            if (a != null) {
                hashMap.put(a.mo298X(), dVar);
                bVar.mo311a(a);
            }
        }
        this.f19055h = Collections.unmodifiableMap(hashMap);
        Bundle bundle = new Bundle();
        ExoPlaybackException playbackError = this.f19057j.getPlaybackError();
        if (!(playbackError == null && this.f19059l == null)) {
            z = true;
        }
        if (z) {
            i = 7;
        } else {
            i = m25969a(this.f19057j.getPlaybackState(), this.f19057j.getPlayWhenReady());
        }
        Pair<Integer, CharSequence> pair = this.f19059l;
        if (pair != null) {
            bVar.mo308a(((Integer) pair.first).intValue(), (CharSequence) this.f19059l.second);
            Bundle bundle2 = this.f19060m;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        } else if (playbackError != null) {
            C9555l<? super ExoPlaybackException> lVar = this.f19058k;
            if (lVar != null) {
                Pair a2 = lVar.mo24646a(playbackError);
                bVar.mo308a(((Integer) a2.first).intValue(), (CharSequence) a2.second);
            }
        }
        C8894j jVar = this.f19062o;
        long c = jVar != null ? jVar.mo23258c(this.f19057j) : -1;
        PlaybackParameters playbackParameters = this.f19057j.getPlaybackParameters();
        bundle.putFloat("EXO_SPEED", playbackParameters.f18372a);
        bundle.putFloat("EXO_PITCH", playbackParameters.f18373b);
        float f = this.f19057j.mo22618a() ? playbackParameters.f18372a : 0.0f;
        bVar.mo309a(m25989e() | m25977b(this.f19057j));
        bVar.mo313b(c);
        bVar.mo314c(this.f19057j.getBufferedPosition());
        bVar.mo307a(i, this.f19057j.getCurrentPosition(), f, SystemClock.elapsedRealtime());
        bVar.mo310a(bundle);
        this.f19048a.mo118a(bVar.mo312a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m25984c(long j) {
        Player player = this.f19057j;
        if (player != null) {
            C8894j jVar = this.f19062o;
            if (!(jVar == null || (j & jVar.mo23256b(player)) == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23237a(Player player) {
        Assertions.m29299a(player == null || player.getApplicationLooper() == this.f19049b);
        Player player2 = this.f19057j;
        if (player2 != null) {
            player2.removeListener(this.f19050c);
        }
        this.f19057j = player;
        if (player != null) {
            player.addListener(this.f19050c);
        }
        mo23239b();
        mo23236a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25983c(Player player) {
        if (player.isCurrentWindowSeekable() && this.f19068u > 0) {
            m25972a(player, player.getCurrentPosition() + ((long) this.f19068u));
        }
    }

    /* renamed from: a */
    public void mo23238a(C8890f fVar) {
        this.f19065r = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23236a() {
        /*
            r2 = this;
            com.google.android.exoplayer2.r0.a.a$g r0 = r2.f19056i
            if (r0 == 0) goto L_0x000d
            com.google.android.exoplayer2.Player r1 = r2.f19057j
            if (r1 == 0) goto L_0x000d
            android.support.v4.media.MediaMetadataCompat r0 = r0.mo23244a(r1)
            goto L_0x000f
        L_0x000d:
            android.support.v4.media.MediaMetadataCompat r0 = f19047v
        L_0x000f:
            android.support.v4.media.session.MediaSessionCompat r1 = r2.f19048a
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            android.support.v4.media.MediaMetadataCompat r0 = f19047v
        L_0x0016:
            r1.mo115a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p363r0.p364a.C8884a.mo23236a():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25975a(long j) {
        return (this.f19057j == null || (j & this.f19066s) == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25972a(Player player, long j) {
        m25971a(player, player.getCurrentWindowIndex(), j);
    }

    /* renamed from: a */
    private void m25971a(Player player, int i, long j) {
        long duration = player.getDuration();
        if (duration != -9223372036854775807L) {
            j = Math.min(j, duration);
        }
        this.f19053f.mo23264a(player, i, Math.max(j, 0));
    }

    /* renamed from: b */
    private long m25977b(Player player) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (player.getCurrentTimeline().mo22671c() || player.isPlayingAd()) {
            z2 = false;
            z3 = false;
            z = false;
        } else {
            z2 = player.isCurrentWindowSeekable();
            z = z2 && this.f19067t > 0;
            if (z2 && this.f19068u > 0) {
                z4 = true;
            }
        }
        long j = 2359815;
        if (z2) {
            j = 2360071;
        }
        if (z4) {
            j |= 64;
        }
        if (z) {
            j |= 8;
        }
        long j2 = this.f19066s & j;
        C8894j jVar = this.f19062o;
        if (jVar != null) {
            j2 |= 4144 & jVar.mo23256b(player);
        }
        return (this.f19064q == null || !z3) ? j2 : j2 | 128;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m25980b(long j) {
        C8892h hVar = this.f19061n;
        return (hVar == null || (j & hVar.mo23245a()) == 0) ? false : true;
    }
}
