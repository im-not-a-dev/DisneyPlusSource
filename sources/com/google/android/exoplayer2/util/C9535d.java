package com.google.android.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.exoplayer2.v0.d */
/* compiled from: lambda */
public final /* synthetic */ class C9535d implements ThreadFactory {

    /* renamed from: c */
    private final /* synthetic */ String f22246c;

    public /* synthetic */ C9535d(String str) {
        this.f22246c = str;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.m29401a(this.f22246c, runnable);
    }
}
