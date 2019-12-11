package com.disneystreaming.companion.p348k.p349b.p350b;

import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p602m.p613d.p639c.p640a.p641a.p642a.C13770e.C13771a;
import p602m.p613d.p649d.p652c.C13796b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyPairGenerator;", "", "()V", "generator", "Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyPairGeneratorSpi$EC;", "generateKeyPair", "Ljava/security/KeyPair;", "generateKeyPair$companion_release", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.k.b.b.f */
/* compiled from: KeyPairGenerator.kt */
public final class C8471f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8471f f18026b = new C8471f();

    /* renamed from: c */
    public static final C8472a f18027c = new C8472a(null);

    /* renamed from: a */
    private final C13771a f18028a = new C13771a();

    /* renamed from: com.disneystreaming.companion.k.b.b.f$a */
    /* compiled from: KeyPairGenerator.kt */
    public static final class C8472a {
        private C8472a() {
        }

        /* renamed from: a */
        public final C8471f mo21758a() {
            return C8471f.f18026b;
        }

        public /* synthetic */ C8472a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C8471f() {
        this.f18028a.initialize((AlgorithmParameterSpec) new C13796b("secp256r1"), new SecureRandom());
    }

    /* renamed from: a */
    public final KeyPair mo21757a() {
        KeyPair generateKeyPair = this.f18028a.generateKeyPair();
        C12880j.m40222a((Object) generateKeyPair, "generator.generateKeyPair()");
        return generateKeyPair;
    }
}
