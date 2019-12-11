package com.google.firebase.components;

import java.util.Map.Entry;
import p163g.p449j.p482b.p483e.C11519a;
import p163g.p449j.p482b.p483e.C11520b;

/* renamed from: com.google.firebase.components.q */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final /* synthetic */ class C10450q implements Runnable {

    /* renamed from: U */
    private final C11519a f24781U;

    /* renamed from: c */
    private final Entry f24782c;

    private C10450q(Entry entry, C11519a aVar) {
        this.f24782c = entry;
        this.f24781U = aVar;
    }

    /* renamed from: a */
    public static Runnable m33017a(Entry entry, C11519a aVar) {
        return new C10450q(entry, aVar);
    }

    public void run() {
        ((C11520b) this.f24782c.getKey()).mo27213a(this.f24781U);
    }
}
