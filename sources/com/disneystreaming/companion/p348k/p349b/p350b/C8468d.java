package com.disneystreaming.companion.p348k.p349b.p350b;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p602m.p613d.p627b.C13664a;
import p602m.p613d.p627b.C13671c;
import p602m.p613d.p627b.C13695e;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13706j;
import p602m.p613d.p627b.C13710n;
import p602m.p613d.p627b.C13712p;
import p602m.p613d.p627b.C13715s;
import p602m.p613d.p627b.p629b0.C13669c;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p627b.p632d0.C13688i;
import p602m.p613d.p627b.p632d0.C13689j;
import p602m.p613d.p627b.p632d0.C13691l;
import p602m.p613d.p627b.p632d0.C13692m;
import p602m.p613d.p627b.p632d0.C13693n;
import p602m.p613d.p683g.C14081b;

/* renamed from: com.disneystreaming.companion.k.b.b.d */
/* compiled from: IESGCMEngine.kt */
public final class C8468d {

    /* renamed from: a */
    private boolean f18012a;

    /* renamed from: b */
    private C13669c f18013b;

    /* renamed from: c */
    private C13715s f18014c;

    /* renamed from: d */
    private byte[] f18015d;

    /* renamed from: e */
    private C13697f f18016e;

    /* renamed from: f */
    private C13697f f18017f;

    /* renamed from: g */
    private C13688i f18018g;

    /* renamed from: h */
    private byte[] f18019h;

    /* renamed from: i */
    private C13671c f18020i;

    /* renamed from: j */
    private C13706j f18021j;

    /* renamed from: k */
    private C13695e f18022k;

    public C8468d(C13671c cVar, C13706j jVar, C13695e eVar) {
        this.f18020i = cVar;
        this.f18021j = jVar;
        this.f18022k = eVar;
    }

    /* renamed from: b */
    private final byte[] m24605b(byte[] bArr, int i, int i2) throws C13712p {
        int i3 = i2;
        byte[] bArr2 = this.f18019h;
        String str = "encodedPublicKey";
        if (bArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (i3 >= bArr2.length) {
            C13688i iVar = this.f18018g;
            String str2 = "param";
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            } else if (iVar != null) {
                byte[] bArr3 = new byte[(((C13689j) iVar).mo34942b() / 8)];
                C13688i iVar2 = this.f18018g;
                if (iVar2 != null) {
                    byte[] bArr4 = new byte[(iVar2.mo34941a() / 8)];
                    byte[] bArr5 = new byte[(bArr3.length + bArr4.length)];
                    this.f18021j.mo34908a(bArr5, 0, bArr5.length);
                    System.arraycopy(bArr5, 0, bArr3, 0, bArr3.length);
                    System.arraycopy(bArr5, bArr3.length, bArr4, 0, bArr4.length);
                    if (this.f18015d != null) {
                        C13695e eVar = this.f18022k;
                        C13692m mVar = new C13692m(bArr3);
                        byte[] bArr6 = this.f18015d;
                        if (bArr6 != null) {
                            eVar.mo21732a(false, (C13697f) new C13693n(mVar, bArr6));
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    } else {
                        this.f18022k.mo21732a(false, (C13697f) new C13693n(new C13692m(bArr3), bArr4));
                    }
                    C13695e eVar2 = this.f18022k;
                    byte[] bArr7 = this.f18019h;
                    if (bArr7 != null) {
                        byte[] bArr8 = new byte[eVar2.mo21729a(i3 - bArr7.length)];
                        C13695e eVar3 = this.f18022k;
                        byte[] bArr9 = this.f18019h;
                        if (bArr9 != null) {
                            int length = i + bArr9.length;
                            if (bArr9 != null) {
                                int a = eVar3.mo21731a(bArr, length, i3 - bArr9.length, bArr8, 0);
                                byte[] copyOfRange = Arrays.copyOfRange(bArr8, 0, a + this.f18022k.mo21730a(bArr8, a));
                                Intrinsics.checkReturnedValueIsNotNull((Object) copyOfRange, "Arrays.copyOfRange(m, 0, len)");
                                return copyOfRange;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.spongycastle.crypto.params.IESWithCipherParameters");
            }
        } else {
            throw new C13712p("Length of input must be greater than the MAC and encodedPublicKey combined");
        }
    }

    /* renamed from: c */
    private final byte[] m24606c(byte[] bArr, int i, int i2) throws C13712p {
        C13688i iVar = this.f18018g;
        String str = "param";
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (iVar != null) {
            byte[] bArr2 = new byte[(((C13689j) iVar).mo34942b() / 8)];
            C13688i iVar2 = this.f18018g;
            if (iVar2 != null) {
                byte[] bArr3 = new byte[(iVar2.mo34941a() / 8)];
                byte[] bArr4 = new byte[(bArr2.length + bArr3.length)];
                this.f18021j.mo34908a(bArr4, 0, bArr4.length);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                if (this.f18015d != null) {
                    C13695e eVar = this.f18022k;
                    C13692m mVar = new C13692m(bArr2);
                    byte[] bArr5 = this.f18015d;
                    if (bArr5 != null) {
                        eVar.mo21732a(true, (C13697f) new C13693n(mVar, bArr5));
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else {
                    this.f18022k.mo21732a(true, (C13697f) new C13693n(new C13692m(bArr2), bArr3));
                }
                byte[] bArr6 = new byte[this.f18022k.mo21729a(i2)];
                int a = this.f18022k.mo21731a(bArr, i, i2, bArr6, 0);
                int a2 = a + this.f18022k.mo21730a(bArr6, a);
                byte[] bArr7 = this.f18019h;
                String str2 = "encodedPublicKey";
                if (bArr7 != null) {
                    byte[] bArr8 = new byte[(bArr7.length + a2)];
                    if (bArr7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        throw null;
                    } else if (bArr7 != null) {
                        System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                        byte[] bArr9 = this.f18019h;
                        if (bArr9 != null) {
                            System.arraycopy(bArr6, 0, bArr8, bArr9.length, a2);
                            return bArr8;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        throw null;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.spongycastle.crypto.params.IESWithCipherParameters");
        }
    }

    /* renamed from: a */
    public final C13695e mo21750a() {
        return this.f18022k;
    }

    /* renamed from: a */
    public final void mo21753a(boolean z, C13697f fVar, C13697f fVar2, C13697f fVar3) {
        this.f18012a = z;
        this.f18016e = fVar;
        this.f18017f = fVar2;
        this.f18019h = new byte[0];
        m24604a(fVar3);
    }

    /* renamed from: a */
    public final void mo21751a(C13681b bVar, C13697f fVar, C13669c cVar) {
        this.f18012a = true;
        this.f18017f = bVar;
        this.f18013b = cVar;
        m24604a(fVar);
    }

    /* renamed from: a */
    public final void mo21752a(C13681b bVar, C13697f fVar, C13715s sVar) {
        this.f18012a = false;
        this.f18016e = bVar;
        this.f18014c = sVar;
        m24604a(fVar);
    }

    /* renamed from: a */
    private final void m24604a(C13697f fVar) {
        String str = "null cannot be cast to non-null type org.spongycastle.crypto.params.IESParameters";
        if (fVar instanceof C13693n) {
            C13693n nVar = (C13693n) fVar;
            this.f18015d = nVar.mo34947a();
            C13697f b = nVar.mo34948b();
            if (b != null) {
                this.f18018g = (C13688i) b;
                return;
            }
            throw new TypeCastException(str);
        }
        this.f18015d = null;
        if (fVar != null) {
            this.f18018g = (C13688i) fVar;
            return;
        }
        throw new TypeCastException(str);
    }

    /* renamed from: a */
    public final byte[] mo21754a(byte[] bArr, int i, int i2) throws C13712p {
        byte[] bArr2;
        if (this.f18012a) {
            C13669c cVar = this.f18013b;
            if (cVar != null) {
                if (cVar != null) {
                    C13710n a = cVar.mo34912a();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "ephKeyPair");
                    C13664a b = a.mo34976b();
                    Intrinsics.checkReturnedValueIsNotNull((Object) b, "ephKeyPair.keyPair");
                    C13681b a2 = b.mo34901a();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a2, "ephKeyPair.keyPair.private");
                    this.f18016e = a2;
                    byte[] a3 = a.mo34975a();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a3, "ephKeyPair.encodedPublicKey");
                    this.f18019h = a3;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        } else if (this.f18014c != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                C13715s sVar = this.f18014c;
                if (sVar != null) {
                    C13681b a4 = sVar.mo34952a(byteArrayInputStream);
                    Intrinsics.checkReturnedValueIsNotNull((Object) a4, "keyParser!!.readKey(bIn)");
                    this.f18017f = a4;
                    this.f18019h = C13171j.m40339a(bArr, i, (i2 - byteArrayInputStream.available()) + i);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to recover ephemeral public key: ");
                sb.append(e.getMessage());
                throw new C13712p(sb.toString(), e);
            }
        }
        C13671c cVar2 = this.f18020i;
        C13697f fVar = this.f18016e;
        if (fVar != null) {
            cVar2.mo34915b(fVar);
            C13671c cVar3 = this.f18020i;
            C13697f fVar2 = this.f18017f;
            if (fVar2 != null) {
                byte[] a5 = C14081b.m44465a(this.f18020i.mo34913a(), cVar3.mo34914a(fVar2));
                try {
                    byte[] bArr3 = this.f18019h;
                    if (bArr3 != null) {
                        this.f18021j.mo34909a(new C13691l(a5, bArr3));
                        if (this.f18012a) {
                            bArr2 = m24606c(bArr, i, i2);
                        } else {
                            bArr2 = m24605b(bArr, i, i2);
                        }
                        return bArr2;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("encodedPublicKey");
                    throw null;
                } finally {
                    Arrays.fill(a5, (byte) 0);
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("publicParam");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("privateParam");
            throw null;
        }
    }
}
