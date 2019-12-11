package com.bamtech.player.exo.p045m;

import android.content.Intent;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.C8898s;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.p363r0.p364a.C8884a;
import com.google.android.exoplayer2.p363r0.p364a.C8884a.C8890f;

/* renamed from: com.bamtech.player.exo.m.a */
/* compiled from: ExoMediaSessionConnection.kt */
public final class C1733a implements C8890f {

    /* renamed from: a */
    private final SimpleExoPlayer f6016a;

    /* renamed from: b */
    private final C8884a f6017b;

    public C1733a(MediaSessionCompat mediaSessionCompat, SimpleExoPlayer o0Var, C8884a aVar) {
        this.f6016a = o0Var;
        this.f6017b = aVar;
    }

    /* renamed from: a */
    public boolean mo7746a(Player player, C8898s sVar, Intent intent) {
        Integer num = null;
        KeyEvent keyEvent = intent != null ? (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT") : null;
        if (keyEvent != null) {
            num = Integer.valueOf(keyEvent.getKeyCode());
        }
        return (num != null && num.intValue() == 85) || (num != null && num.intValue() == 126) || ((num != null && num.intValue() == 127) || ((num != null && num.intValue() == 90) || ((num != null && num.intValue() == 89) || (num != null && num.intValue() == 86))));
    }

    /* renamed from: b */
    public final void mo7747b() {
        this.f6017b.mo23237a((Player) null);
    }

    public /* synthetic */ C1733a(MediaSessionCompat mediaSessionCompat, SimpleExoPlayer o0Var, C8884a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            aVar = new C8884a(mediaSessionCompat);
        }
        this(mediaSessionCompat, o0Var, aVar);
    }

    /* renamed from: a */
    public final void mo7745a() {
        this.f6017b.mo23238a((C8890f) this);
        this.f6017b.mo23237a((Player) this.f6016a);
    }
}
