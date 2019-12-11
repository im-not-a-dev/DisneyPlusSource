package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline.C8670c;

/* renamed from: com.google.android.exoplayer2.p */
/* compiled from: BasePlayer */
public abstract class C8812p implements Player {

    /* renamed from: a */
    protected final C8670c f18741a = new C8670c();

    /* renamed from: com.google.android.exoplayer2.p$a */
    /* compiled from: BasePlayer */
    protected static final class C8813a {

        /* renamed from: a */
        public final EventListener f18742a;

        /* renamed from: b */
        private boolean f18743b;

        public C8813a(EventListener eventListener) {
            this.f18742a = eventListener;
        }

        /* renamed from: a */
        public void mo23045a() {
            this.f18743b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8813a.class != obj.getClass()) {
                return false;
            }
            return this.f18742a.equals(((C8813a) obj).f18742a);
        }

        public int hashCode() {
            return this.f18742a.hashCode();
        }

        /* renamed from: a */
        public void mo23046a(C8814b bVar) {
            if (!this.f18743b) {
                bVar.mo22694a(this.f18742a);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.p$b */
    /* compiled from: BasePlayer */
    protected interface C8814b {
        /* renamed from: a */
        void mo22694a(EventListener eventListener);
    }

    /* renamed from: f */
    private int mo23005f() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    /* renamed from: a */
    public final boolean mo22618a() {
        return getPlaybackState() == 3 && getPlayWhenReady() && mo22619b() == 0;
    }

    /* renamed from: e */
    public final long mo23044e() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.mo22671c()) {
            return -9223372036854775807L;
        }
        return currentTimeline.mo22663a(getCurrentWindowIndex(), this.f18741a).mo22692c();
    }

    public final int getNextWindowIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.mo22671c()) {
            return -1;
        }
        return currentTimeline.mo22654a(getCurrentWindowIndex(), mo23005f(), getShuffleModeEnabled());
    }

    public final int getPreviousWindowIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.mo22671c()) {
            return -1;
        }
        return currentTimeline.mo22668b(getCurrentWindowIndex(), mo23005f(), getShuffleModeEnabled());
    }

    public final boolean hasNext() {
        return getNextWindowIndex() != -1;
    }

    public final boolean hasPrevious() {
        return getPreviousWindowIndex() != -1;
    }

    public final boolean isCurrentWindowDynamic() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.mo22671c() && currentTimeline.mo22663a(getCurrentWindowIndex(), this.f18741a).f18400b;
    }

    public final boolean isCurrentWindowSeekable() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.mo22671c() && currentTimeline.mo22663a(getCurrentWindowIndex(), this.f18741a).f18399a;
    }

    public final void stop() {
        stop(false);
    }

    /* renamed from: a */
    public final void mo23043a(long j) {
        seekTo(getCurrentWindowIndex(), j);
    }
}
