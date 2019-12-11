package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.b0 */
final class C9849b0 extends C9870f {

    /* renamed from: U */
    private final /* synthetic */ Activity f23050U;

    /* renamed from: V */
    private final /* synthetic */ int f23051V;

    /* renamed from: c */
    private final /* synthetic */ Intent f23052c;

    C9849b0(Intent intent, Activity activity, int i) {
        this.f23052c = intent;
        this.f23050U = activity;
        this.f23051V = i;
    }

    /* renamed from: a */
    public final void mo25303a() {
        Intent intent = this.f23052c;
        if (intent != null) {
            this.f23050U.startActivityForResult(intent, this.f23051V);
        }
    }
}
