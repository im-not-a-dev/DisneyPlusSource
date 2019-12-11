package com.disneystreaming.companion.p348k.p349b;

import com.disneystreaming.companion.messaging.C8569d;
import com.disneystreaming.companion.messaging.EncryptedMessage;
import com.disneystreaming.companion.messaging.Message;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p348k.C8456a;
import com.disneystreaming.companion.p348k.p349b.p350b.C8465c;
import com.disneystreaming.companion.p348k.p349b.p350b.C8469e;
import com.disneystreaming.companion.p348k.p349b.p350b.C8471f;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p588j0.C12801c;
import kotlin.reflect.KProperty;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.p634f0.C13698a;
import p602m.p613d.p627b.p634f0.C13700c;
import p602m.p613d.p627b.p637y.C13727g;
import p602m.p613d.p639c.p640a.p641a.p643b.C13774c;
import p602m.p613d.p649d.p650a.C13789c;
import p602m.p613d.p649d.p650a.C13790d;
import p602m.p613d.p649d.p652c.C13802h;
import p602m.p613d.p683g.p684k.C14092a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0019\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0002\u00101J\n\u00102\u001a\u0004\u0018\u000103H\u0002J\n\u00104\u001a\u0004\u0018\u00010\u0019H\u0002J\u0017\u00105\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020\u0018H\u0000¢\u0006\u0002\b6J\b\u00107\u001a\u00020\u0018H\u0016J\u0018\u00108\u001a\u00020,2\u0006\u0010$\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020,2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010;\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020,H\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0018H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015X\u000e¢\u0006\u0002\n\u0000R.\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019`\u001aX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001e¨\u0006@"}, mo31007d2 = {"Lcom/disneystreaming/companion/encryption/ellipticcurve/EllipticCurveEncryptionProvider;", "Lcom/disneystreaming/companion/encryption/EncryptionProvider;", "()V", "iesParams", "Lorg/spongycastle/jce/spec/IESParameterSpec;", "getIesParams", "()Lorg/spongycastle/jce/spec/IESParameterSpec;", "iesParams$delegate", "Lkotlin/Lazy;", "keyFactory", "Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyFactory;", "getKeyFactory", "()Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyFactory;", "keyFactory$delegate", "keyPairGenerator", "Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyPairGenerator;", "getKeyPairGenerator", "()Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyPairGenerator;", "keyPairGenerator$delegate", "localKeyPair", "Ljava/security/KeyPair;", "Lcom/disneystreaming/companion/encryption/ellipticcurve/KeyPair;", "peerKeyStore", "Ljava/util/HashMap;", "", "Lorg/spongycastle/jce/interfaces/ECPublicKey;", "Lkotlin/collections/HashMap;", "signer", "Lorg/spongycastle/crypto/signers/DSADigestSigner;", "getSigner", "()Lorg/spongycastle/crypto/signers/DSADigestSigner;", "signer$delegate", "decrypt", "Lcom/disneystreaming/companion/messaging/Message;", "message", "Lcom/disneystreaming/companion/messaging/EncryptedMessage;", "host", "encrypt", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "data", "", "publicKey", "generateKeys", "", "getCipher", "Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/IESGCMCipher;", "ivLen", "", "(Ljava/lang/Integer;)Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/IESGCMCipher;", "getLocalPrivateKey", "Lorg/spongycastle/jce/interfaces/ECPrivateKey;", "getLocalPublicKey", "getPeerPublicKey", "getPeerPublicKey$companion_release", "getPublicKeyForPairing", "importPeerPublicKey", "key", "removePeerPublicKey", "sign", "tearDown", "verify", "", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.k.b.a */
/* compiled from: EllipticCurveEncryptionProvider.kt */
public final class C8457a implements C8456a {

    /* renamed from: g */
    static final /* synthetic */ KProperty[] f17986g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8457a f17987h = new C8457a();

    /* renamed from: i */
    public static final C8458a f17988i = new C8458a(null);

    /* renamed from: a */
    private KeyPair f17989a;

    /* renamed from: b */
    private HashMap<String, C13790d> f17990b = new HashMap<>();

    /* renamed from: c */
    private final Lazy f17991c = C12763i.m39921a(C8462e.f17998c);

    /* renamed from: d */
    private final Lazy f17992d = C12763i.m39921a(C8460c.f17996c);

    /* renamed from: e */
    private final Lazy f17993e = C12763i.m39921a(C8461d.f17997c);

    /* renamed from: f */
    private final Lazy f17994f = C12763i.m39921a(C8459b.f17995c);

    /* renamed from: com.disneystreaming.companion.k.b.a$a */
    /* compiled from: EllipticCurveEncryptionProvider.kt */
    public static final class C8458a {
        private C8458a() {
        }

        /* renamed from: a */
        public final C8457a mo21728a() {
            return C8457a.f17987h;
        }

        public /* synthetic */ C8458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.k.b.a$b */
    /* compiled from: EllipticCurveEncryptionProvider.kt */
    static final class C8459b extends C12881k implements Function0<C13802h> {

        /* renamed from: c */
        public static final C8459b f17995c = new C8459b();

        C8459b() {
            super(0);
        }

        public final C13802h invoke() {
            C13802h hVar = new C13802h(null, null, 128, 128, null);
            return hVar;
        }
    }

    /* renamed from: com.disneystreaming.companion.k.b.a$c */
    /* compiled from: EllipticCurveEncryptionProvider.kt */
    static final class C8460c extends C12881k implements Function0<C8469e> {

        /* renamed from: c */
        public static final C8460c f17996c = new C8460c();

        C8460c() {
            super(0);
        }

        public final C8469e invoke() {
            return C8469e.f18024c.mo21756a();
        }
    }

    /* renamed from: com.disneystreaming.companion.k.b.a$d */
    /* compiled from: EllipticCurveEncryptionProvider.kt */
    static final class C8461d extends C12881k implements Function0<C8471f> {

        /* renamed from: c */
        public static final C8461d f17997c = new C8461d();

        C8461d() {
            super(0);
        }

        public final C8471f invoke() {
            return C8471f.f18027c.mo21758a();
        }
    }

    /* renamed from: com.disneystreaming.companion.k.b.a$e */
    /* compiled from: EllipticCurveEncryptionProvider.kt */
    static final class C8462e extends C12881k implements Function0<C13698a> {

        /* renamed from: c */
        public static final C8462e f17998c = new C8462e();

        C8462e() {
            super(0);
        }

        public final C13698a invoke() {
            return new C13698a(new C13700c(), new C13727g());
        }
    }

    static {
        Class<C8457a> cls = C8457a.class;
        f17986g = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "signer", "getSigner()Lorg/spongycastle/crypto/signers/DSADigestSigner;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "keyFactory", "getKeyFactory()Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyFactory;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "keyPairGenerator", "getKeyPairGenerator()Lcom/disneystreaming/companion/encryption/ellipticcurve/ecies/KeyPairGenerator;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "iesParams", "getIesParams()Lorg/spongycastle/jce/spec/IESParameterSpec;"))};
    }

    private C8457a() {
    }

    /* renamed from: e */
    private final C13802h m24580e() {
        Lazy lazy = this.f17994f;
        KProperty kProperty = f17986g[3];
        return (C13802h) lazy.getValue();
    }

    /* renamed from: f */
    private final C8469e m24581f() {
        Lazy lazy = this.f17992d;
        KProperty kProperty = f17986g[1];
        return (C8469e) lazy.getValue();
    }

    /* renamed from: g */
    private final C8471f m24582g() {
        Lazy lazy = this.f17993e;
        KProperty kProperty = f17986g[2];
        return (C8471f) lazy.getValue();
    }

    /* renamed from: h */
    private final C13789c m24583h() {
        KeyPair keyPair = this.f17989a;
        PrivateKey privateKey = keyPair != null ? keyPair.getPrivate() : null;
        if (privateKey != null) {
            return (C13789c) privateKey;
        }
        throw new C13142s("null cannot be cast to non-null type org.spongycastle.jce.interfaces.ECPrivateKey");
    }

    /* renamed from: i */
    private final C13790d m24584i() {
        KeyPair keyPair = this.f17989a;
        PublicKey publicKey = keyPair != null ? keyPair.getPublic() : null;
        if (publicKey != null) {
            return (C13790d) publicKey;
        }
        throw new C13142s("null cannot be cast to non-null type org.spongycastle.jce.interfaces.ECPublicKey");
    }

    /* renamed from: j */
    private final C13698a m24585j() {
        Lazy lazy = this.f17991c;
        KProperty kProperty = f17986g[0];
        return (C13698a) lazy.getValue();
    }

    /* renamed from: a */
    public String mo21720a() throws SecurityException {
        C13790d i = m24584i();
        if (!(i != null)) {
            i = null;
        }
        if (i != null) {
            PublicKey a = m24581f().mo21755a(new X509EncodedKeySpec(i.getEncoded()));
            if (a != null) {
                String b = C14092a.m44494b(((C13790d) a).getEncoded());
                C12880j.m40222a((Object) b, "Base64.toBase64String(publicKey.encoded)");
                return b;
            }
            throw new C13142s("null cannot be cast to non-null type org.spongycastle.jce.interfaces.ECPublicKey");
        }
        throw new SecurityException("No local public key present for exporting");
    }

    /* renamed from: b */
    public void mo21724b() {
        this.f17989a = null;
        this.f17990b.clear();
    }

    /* renamed from: c */
    public void mo21725c() {
        this.f17989a = m24582g().mo21757a();
    }

    /* renamed from: b */
    public final C13790d mo21727b(String str) throws SecurityException {
        return (C13790d) this.f17990b.get(str);
    }

    /* renamed from: a */
    public void mo21722a(String str, String str2) {
        HashMap<String, C13790d> hashMap = this.f17990b;
        PublicKey a = m24581f().mo21755a(new X509EncodedKeySpec(C14092a.m44491a(str2)));
        if (a != null) {
            hashMap.put(str, (C13790d) a);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type org.spongycastle.jce.interfaces.ECPublicKey");
    }

    /* renamed from: a */
    public void mo21721a(String str) {
        this.f17990b.remove(str);
    }

    /* renamed from: a */
    public EncryptedMessage mo21718a(Payload payload, String str) throws SecurityException {
        String a = C8569d.f18269a.mo21942a(payload);
        C13790d b = mo21727b(str);
        if (!(b != null)) {
            b = null;
        }
        if (b != null) {
            Charset charset = C12801c.f29474a;
            if (a != null) {
                byte[] bytes = a.getBytes(charset);
                C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                EncryptedMessage encryptedMessage = new EncryptedMessage(0, mo21726a(payload), m24578a(bytes, b), 1, null);
                return encryptedMessage;
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        }
        throw new SecurityException("No public key present for encryption");
    }

    /* renamed from: a */
    private final String m24578a(byte[] bArr, C13790d dVar) {
        C8465c a = m24576a(this, null, 1, null);
        a.engineInit(1, (Key) dVar, (AlgorithmParameterSpec) m24580e(), new SecureRandom());
        String b = C14092a.m44494b(a.engineDoFinal(bArr, 0, bArr.length));
        C12880j.m40222a((Object) b, "Base64.toBase64String(bytes)");
        return b;
    }

    /* renamed from: a */
    public String mo21726a(Payload payload) {
        C13789c h = m24583h();
        if (!(h != null)) {
            h = null;
        }
        if (h != null) {
            String a = C8569d.f18269a.mo21942a(payload);
            Charset charset = C12801c.f29474a;
            if (a != null) {
                byte[] bytes = a.getBytes(charset);
                C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                m24585j().mo34953a(true, (C13697f) C13774c.m42284a((PrivateKey) h));
                m24585j().mo34954a(bytes, 0, bytes.length);
                String b = C14092a.m44494b(m24585j().mo34956a());
                C12880j.m40222a((Object) b, "Base64.toBase64String(sig)");
                return b;
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        }
        throw new SecurityException("No local private key for signing");
    }

    /* renamed from: a */
    public Message mo21719a(EncryptedMessage encryptedMessage, String str) throws SecurityException {
        C13789c h = m24583h();
        boolean z = true;
        if (!(h != null)) {
            h = null;
        }
        if (h != null) {
            C8465c a = m24576a(this, null, 1, null);
            a.engineInit(2, (Key) h, (AlgorithmParameterSpec) m24580e(), new SecureRandom());
            String payload = encryptedMessage.getPayload();
            Charset charset = C12801c.f29474a;
            if (payload != null) {
                byte[] bytes = payload.getBytes(charset);
                C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] a2 = C14092a.m44492a(bytes);
                C12880j.m40222a((Object) a2, "encryptedData");
                Object a3 = C8569d.f18269a.mo21940a(Payload.class, new String(a.engineDoFinal(a2, 0, a2.length), C12801c.f29474a));
                if (((Payload) a3) == null) {
                    z = false;
                }
                if (!z) {
                    a3 = null;
                }
                Payload payload2 = (Payload) a3;
                if (payload2 != null) {
                    return new Message(encryptedMessage.getVersion(), encryptedMessage.getSignature(), payload2);
                }
                throw new SecurityException("Unable to deserialize Payload");
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        }
        throw new SecurityException("No local PrivateKey available");
    }

    /* renamed from: a */
    public boolean mo21723a(Message message, String str) {
        C13790d b = mo21727b(str);
        boolean z = true;
        if (!(b != null)) {
            b = null;
        }
        if (b != null) {
            String signature = message.getSignature();
            if (signature == null) {
                z = false;
            }
            if (!z) {
                signature = null;
            }
            if (signature != null) {
                String a = C8569d.f18269a.mo21942a(message.getPayload());
                Charset charset = C12801c.f29474a;
                if (a != null) {
                    byte[] bytes = a.getBytes(charset);
                    C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                    m24585j().mo34953a(false, (C13697f) C13774c.m42285a((PublicKey) b));
                    m24585j().mo34954a(bytes, 0, bytes.length);
                    return m24585j().mo34955a(C14092a.m44491a(signature));
                }
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
            throw new SecurityException("No signature present for verification");
        }
        throw new SecurityException("No public key present for signature verification");
    }

    /* renamed from: a */
    static /* synthetic */ C8465c m24576a(C8457a aVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return aVar.m24577a(num);
    }

    /* renamed from: a */
    private final C8465c m24577a(Integer num) {
        return C8465c.f18000k.mo21748a(num != null ? num.intValue() : 16);
    }
}
