package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.t */
/* compiled from: DefaultControlDispatcher */
public class C9269t implements C8898s {
    /* renamed from: a */
    public boolean mo23264a(Player player, int i, long j) {
        player.seekTo(i, j);
        return true;
    }

    /* renamed from: b */
    public boolean mo23266b(Player player, boolean z) {
        player.setShuffleModeEnabled(z);
        return true;
    }

    /* renamed from: c */
    public boolean mo23267c(Player player, boolean z) {
        player.setPlayWhenReady(z);
        return true;
    }

    /* renamed from: a */
    public boolean mo23263a(Player player, int i) {
        player.setRepeatMode(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo23265a(Player player, boolean z) {
        player.stop(z);
        return true;
    }
}
