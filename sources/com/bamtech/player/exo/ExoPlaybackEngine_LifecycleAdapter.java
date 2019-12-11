package com.bamtech.player.exo;

import androidx.lifecycle.C0713g;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0729r;

public class ExoPlaybackEngine_LifecycleAdapter implements C0713g {

    /* renamed from: a */
    final ExoPlaybackEngine f5928a;

    ExoPlaybackEngine_LifecycleAdapter(ExoPlaybackEngine exoPlaybackEngine) {
        this.f5928a = exoPlaybackEngine;
    }

    /* renamed from: a */
    public void mo4132a(C0722m mVar, C0716a aVar, boolean z, C0729r rVar) {
        boolean z2 = rVar != null;
        if (!z) {
            if (aVar == C0716a.ON_DESTROY) {
                if (!z2 || rVar.mo4148a("lifecycleDestroy", 1)) {
                    this.f5928a.lifecycleDestroy();
                }
            } else if (aVar == C0716a.ON_START) {
                if (!z2 || rVar.mo4148a("lifecycleStart", 1)) {
                    this.f5928a.lifecycleStart();
                }
            } else {
                if (aVar == C0716a.ON_STOP && (!z2 || rVar.mo4148a("lifecycleStop", 1))) {
                    this.f5928a.lifecycleStop();
                }
            }
        }
    }
}
