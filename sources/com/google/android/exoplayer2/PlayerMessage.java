package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;

public final class PlayerMessage {

    /* renamed from: a */
    private final Target f18376a;

    /* renamed from: b */
    private final C8667a f18377b;

    /* renamed from: c */
    private final Timeline f18378c;

    /* renamed from: d */
    private int f18379d;

    /* renamed from: e */
    private Object f18380e;

    /* renamed from: f */
    private Handler f18381f;

    /* renamed from: g */
    private int f18382g;

    /* renamed from: h */
    private long f18383h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f18384i = true;

    /* renamed from: j */
    private boolean f18385j;

    /* renamed from: k */
    private boolean f18386k;

    /* renamed from: l */
    private boolean f18387l;

    /* renamed from: m */
    private boolean f18388m;

    public interface Target {
        /* renamed from: a */
        void mo22648a(int i, Object obj) throws ExoPlaybackException;
    }

    /* renamed from: com.google.android.exoplayer2.PlayerMessage$a */
    public interface C8667a {
        /* renamed from: a */
        void mo22649a(PlayerMessage playerMessage);
    }

    public PlayerMessage(C8667a aVar, Target target, Timeline timeline, int i, Handler handler) {
        this.f18377b = aVar;
        this.f18376a = target;
        this.f18378c = timeline;
        this.f18381f = handler;
        this.f18382g = i;
    }

    /* renamed from: a */
    public PlayerMessage mo22634a(int i) {
        Assertions.checkState(!this.f18385j);
        this.f18379d = i;
        return this;
    }

    /* renamed from: b */
    public boolean mo22638b() {
        return this.f18384i;
    }

    /* renamed from: c */
    public Handler mo22639c() {
        return this.f18381f;
    }

    /* renamed from: d */
    public Object mo22640d() {
        return this.f18380e;
    }

    /* renamed from: e */
    public long mo22641e() {
        return this.f18383h;
    }

    /* renamed from: f */
    public Target mo22642f() {
        return this.f18376a;
    }

    /* renamed from: g */
    public Timeline mo22643g() {
        return this.f18378c;
    }

    /* renamed from: h */
    public int mo22644h() {
        return this.f18379d;
    }

    /* renamed from: i */
    public int mo22645i() {
        return this.f18382g;
    }

    /* renamed from: j */
    public synchronized boolean mo22646j() {
        return this.f18388m;
    }

    /* renamed from: k */
    public PlayerMessage mo22647k() {
        Assertions.checkState(!this.f18385j);
        if (this.f18383h == -9223372036854775807L) {
            Assertions.checkArgument(this.f18384i);
        }
        this.f18385j = true;
        this.f18377b.mo22649a(this);
        return this;
    }

    /* renamed from: a */
    public PlayerMessage mo22635a(Object obj) {
        Assertions.checkState(!this.f18385j);
        this.f18380e = obj;
        return this;
    }

    /* renamed from: a */
    public synchronized boolean mo22637a() throws InterruptedException {
        Assertions.checkState(this.f18385j);
        Assertions.checkState(this.f18381f.getLooper().getThread() != Thread.currentThread());
        while (!this.f18387l) {
            wait();
        }
        return this.f18386k;
    }

    /* renamed from: a */
    public synchronized void mo22636a(boolean z) {
        this.f18386k = z | this.f18386k;
        this.f18387l = true;
        notifyAll();
    }
}
