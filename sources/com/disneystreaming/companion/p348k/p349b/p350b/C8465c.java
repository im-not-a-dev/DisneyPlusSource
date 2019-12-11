package com.disneystreaming.companion.p348k.p349b.p350b;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13712p;
import p602m.p613d.p627b.C13713q;
import p602m.p613d.p627b.C13715s;
import p602m.p613d.p627b.p629b0.C13668b;
import p602m.p613d.p627b.p629b0.C13669c;
import p602m.p613d.p627b.p629b0.C13670d;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13683d;
import p602m.p613d.p627b.p632d0.C13684e;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p627b.p632d0.C13689j;
import p602m.p613d.p627b.p632d0.C13693n;
import p602m.p613d.p627b.p633e0.C13696a;
import p602m.p613d.p627b.p636x.C13720a;
import p602m.p613d.p627b.p637y.C13727g;
import p602m.p613d.p639c.p640a.p641a.p643b.C13774c;
import p602m.p613d.p639c.p648b.C13784a;
import p602m.p613d.p649d.p650a.C13787a;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p649d.p652c.C13802h;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p683g.C14090j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J0\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010!\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\fH\u0016J*\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J*\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020,H\u0016J\"\u0010/\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J0\u0010/\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, mo31007d2 = {"Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/IESGCMCipher;", "Ljavax/crypto/CipherSpi;", "engine", "Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/IESGCMEngine;", "ivLength", "", "(Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/IESGCMEngine;I)V", "buffer", "Ljava/io/ByteArrayOutputStream;", "dhaesMode", "", "engineParam", "Ljava/security/AlgorithmParameters;", "engineSpec", "Lorg/spongycastle/jce/spec/IESParameterSpec;", "helper", "Lorg/spongycastle/jcajce/util/BCJcaJceHelper;", "key", "Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;", "otherKeyParameter", "random", "Ljava/security/SecureRandom;", "state", "engineDoFinal", "", "input", "inputOffset", "inputLen", "inputLength", "output", "outputOffset", "engineGetBlockSize", "engineGetIV", "engineGetKeySize", "Ljava/security/Key;", "engineGetOutputSize", "engineGetParameters", "engineInit", "", "opmode", "params", "Ljava/security/spec/AlgorithmParameterSpec;", "engineSetMode", "mode", "", "engineSetPadding", "padding", "engineUpdate", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.k.b.b.c */
/* compiled from: IESGCMCipher.kt */
public final class C8465c extends CipherSpi {

    /* renamed from: k */
    public static final C8466a f18000k = new C8466a(null);

    /* renamed from: a */
    private final C13784a f18001a = new C13784a();

    /* renamed from: b */
    private int f18002b = -1;

    /* renamed from: c */
    private final ByteArrayOutputStream f18003c = new ByteArrayOutputStream();

    /* renamed from: d */
    private AlgorithmParameters f18004d;

    /* renamed from: e */
    private C13802h f18005e;

    /* renamed from: f */
    private C13681b f18006f;

    /* renamed from: g */
    private SecureRandom f18007g;

    /* renamed from: h */
    private C13681b f18008h;

    /* renamed from: i */
    private C8468d f18009i;

    /* renamed from: j */
    private int f18010j;

    /* renamed from: com.disneystreaming.companion.k.b.b.c$a */
    /* compiled from: IESGCMCipher.kt */
    public static final class C8466a {
        private C8466a() {
        }

        /* renamed from: a */
        public final C8465c mo21748a(int i) {
            return new C8465c(new C8468d(new C13720a(), new C13670d(new C13727g()), new C8463a()), i);
        }

        public /* synthetic */ C8466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.k.b.b.c$b */
    /* compiled from: IESGCMCipher.kt */
    static final class C8467b implements C13713q {

        /* renamed from: a */
        final /* synthetic */ boolean f18011a;

        C8467b(boolean z) {
            this.f18011a = z;
        }

        /* renamed from: a */
        public final byte[] mo21749a(C13681b bVar) {
            if (bVar != null) {
                return ((C13687h) bVar).mo34940c().mo35136a(this.f18011a);
            }
            throw new C13142s("null cannot be cast to non-null type org.spongycastle.crypto.params.ECPublicKeyParameters");
        }
    }

    public C8465c(C8468d dVar, int i) {
        this.f18009i = dVar;
        this.f18010j = i;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (i2 != 0) {
            this.f18003c.write(bArr, i, i2);
        }
        byte[] byteArray = this.f18003c.toByteArray();
        this.f18003c.reset();
        C13802h hVar = this.f18005e;
        if (!(hVar != null)) {
            hVar = null;
        }
        if (hVar != null) {
            C13697f jVar = new C13689j(hVar.mo35053b(), hVar.mo35054c(), hVar.mo35055d(), hVar.mo35052a());
            if (hVar.mo35056e() != null) {
                jVar = new C13693n(jVar, hVar.mo35056e());
            }
            C13681b bVar = this.f18006f;
            String str = "null cannot be cast to non-null type org.spongycastle.crypto.params.ECKeyParameters";
            if (bVar != null) {
                C13682c b = ((C13684e) bVar).mo34938b();
                C13681b bVar2 = this.f18008h;
                String str2 = "bytesIn";
                if (bVar2 != null) {
                    try {
                        String str3 = "null cannot be cast to non-null type org.spongycastle.crypto.params.AsymmetricKeyParameter";
                        if (this.f18002b != 1) {
                            if (this.f18002b != 3) {
                                C8468d dVar = this.f18009i;
                                C13681b bVar3 = this.f18006f;
                                if (bVar3 != null) {
                                    C13684e eVar = (C13684e) bVar3;
                                    if (bVar2 != null) {
                                        dVar.mo21753a(false, eVar, bVar2, jVar);
                                        C8468d dVar2 = this.f18009i;
                                        Intrinsics.checkReturnedValueIsNotNull((Object) byteArray, str2);
                                        return dVar2.mo21754a(byteArray, 0, byteArray.length);
                                    }
                                    throw new C13142s(str3);
                                }
                                throw new C13142s(str);
                            }
                        }
                        C8468d dVar3 = this.f18009i;
                        C13681b bVar4 = this.f18008h;
                        if (bVar4 != null) {
                            C13681b bVar5 = this.f18006f;
                            if (bVar5 != null) {
                                dVar3.mo21753a(true, bVar4, (C13684e) bVar5, jVar);
                                C8468d dVar22 = this.f18009i;
                                Intrinsics.checkReturnedValueIsNotNull((Object) byteArray, str2);
                                return dVar22.mo21754a(byteArray, 0, byteArray.length);
                            }
                            throw new C13142s(str);
                        }
                        throw new C13142s(str3);
                    } catch (Exception e) {
                        throw new BadPaddingException(e.getMessage());
                    }
                } else {
                    int i3 = this.f18002b;
                    if (i3 == 1 || i3 == 3) {
                        C13668b bVar6 = new C13668b();
                        bVar6.mo34910a(new C13683d(b, this.f18007g));
                        C13669c cVar = new C13669c(bVar6, new C8467b(hVar.mo35057f()));
                        try {
                            C8468d dVar4 = this.f18009i;
                            C13681b bVar7 = this.f18006f;
                            if (bVar7 != null) {
                                dVar4.mo21751a((C13681b) (C13684e) bVar7, jVar, cVar);
                                C8468d dVar5 = this.f18009i;
                                Intrinsics.checkReturnedValueIsNotNull((Object) byteArray, str2);
                                return dVar5.mo21754a(byteArray, 0, byteArray.length);
                            }
                            throw new C13142s(str);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            throw new BadPaddingException(e2.getMessage());
                        }
                    } else if (i3 == 2 || i3 == 4) {
                        try {
                            C8468d dVar6 = this.f18009i;
                            C13681b bVar8 = this.f18006f;
                            if (bVar8 != null) {
                                dVar6.mo21752a((C13681b) (C13684e) bVar8, jVar, (C13715s) new C13696a(b));
                                C8468d dVar7 = this.f18009i;
                                Intrinsics.checkReturnedValueIsNotNull((Object) byteArray, str2);
                                return dVar7.mo21754a(byteArray, 0, byteArray.length);
                            }
                            throw new C13142s(str);
                        } catch (C13712p e3) {
                            throw new BadPaddingException(e3.getMessage());
                        }
                    } else {
                        throw new IllegalStateException("cipher not initialised");
                    }
                }
            } else {
                throw new C13142s(str);
            }
        } else {
            throw new IllegalStateException("Engine Spec not set");
        }
    }

    public int engineGetBlockSize() {
        return this.f18009i.mo21750a().mo34951a();
    }

    public byte[] engineGetIV() {
        return null;
    }

    public int engineGetKeySize(Key key) {
        if (key instanceof C13787a) {
            C13799e parameters = ((C13787a) key).getParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) parameters, "(key as ECKey).parameters");
            C13806d a = parameters.mo35043a();
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "(key as ECKey).parameters.curve");
            return a.mo35090j();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    public int engineGetOutputSize(int i) {
        int i2;
        int i3;
        int i4;
        C13681b bVar = this.f18006f;
        String str = "cipher not initialised";
        if (bVar != null) {
            if (this.f18008h != null) {
                i2 = 0;
            } else if (bVar != null) {
                C13682c b = ((C13684e) bVar).mo34938b();
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "(key as ECKeyParameters).parameters");
                C13806d a = b.mo34930a();
                Intrinsics.checkReturnedValueIsNotNull((Object) a, "(key as ECKeyParameters).parameters.curve");
                i2 = (((a.mo35090j() + 7) * 2) / 8) + 1;
            } else {
                throw new C13142s("null cannot be cast to non-null type org.spongycastle.crypto.params.ECKeyParameters");
            }
            int i5 = this.f18002b;
            if (i5 == 1 || i5 == 3) {
                i3 = this.f18009i.mo21750a().mo21729a(i);
            } else if (i5 == 2 || i5 == 4) {
                i3 = this.f18009i.mo21750a().mo21729a((i - 0) - i2);
            } else {
                throw new IllegalStateException("Cipher not initalised");
            }
            int i6 = this.f18002b;
            if (i6 == 1 || i6 == 3) {
                i4 = this.f18003c.size() + 0 + i2;
            } else if (i6 == 2 || i6 == 4) {
                i4 = (this.f18003c.size() - 0) - i2;
            } else {
                throw new IllegalStateException(str);
            }
            return i4 + i3;
        }
        throw new IllegalStateException(str.toString());
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f18004d == null && this.f18005e != null) {
            try {
                this.f18004d = this.f18001a.mo35036a("IES");
                AlgorithmParameters algorithmParameters = this.f18004d;
                if (algorithmParameters != null) {
                    algorithmParameters.init(this.f18005e);
                }
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f18004d;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(C13802h.class);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot recognise parameters: ");
                sb.append(e);
                throw new InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.f18004d = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String b = C14090j.m44488b(str);
        if (b != null) {
            int hashCode = b.hashCode();
            if (hashCode != 2402104) {
                if (hashCode == 65009067 && b.equals("DHAES")) {
                    return;
                }
            } else if (b.equals("NONE")) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("can't support mode ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!C13185o.m40520c("NOPADDING", "PKCS5PADDING", "PKCS7PADDING").contains(C14090j.m44488b(str))) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f18003c.write(bArr, i, i2);
        return null;
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f18003c.write(bArr, i, i2);
        return 0;
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] bArr = null;
        this.f18008h = null;
        if (algorithmParameterSpec instanceof C13802h) {
            this.f18005e = (C13802h) algorithmParameterSpec;
            C13802h hVar = this.f18005e;
            if (hVar != null) {
                bArr = hVar.mo35056e();
            }
            if (bArr != null) {
                int i2 = this.f18010j;
                if (i2 == 0) {
                    throw new InvalidAlgorithmParameterException("NONCE present in IES Parameters when none required");
                } else if (bArr.length != i2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("NONCE in IES Parameters needs to be ");
                    sb.append(this.f18010j);
                    sb.append(" bytes long");
                    throw new InvalidAlgorithmParameterException(sb.toString());
                }
            }
            if (i == 1 || i == 3) {
                if (key instanceof PublicKey) {
                    this.f18006f = C13774c.m42285a((PublicKey) key);
                } else {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
            } else if (i != 2 && i != 4) {
                throw new InvalidKeyException("must be passed EC key");
            } else if (key instanceof PrivateKey) {
                this.f18006f = C13774c.m42284a((PrivateKey) key);
            } else {
                throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
            }
            this.f18007g = secureRandom;
            this.f18002b = i;
            this.f18003c.reset();
            return;
        }
        throw new InvalidAlgorithmParameterException("must be passed IES parameters");
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new IllegalArgumentException("can't handle supplied parameter spec");
        }
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }
}
