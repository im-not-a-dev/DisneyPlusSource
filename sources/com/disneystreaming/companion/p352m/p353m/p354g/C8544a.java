package com.disneystreaming.companion.p352m.p353m.p354g;

import com.disneystreaming.companion.messaging.C8566a;
import com.disneystreaming.companion.messaging.C8569d;
import com.disneystreaming.companion.p351l.C8476c;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12801c;
import okio.BufferedSource;
import okio.C14280f;
import okio.C14287m;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.disneystreaming.companion.m.m.g.a */
/* compiled from: TypedTcpSocket.kt */
public final class C8544a {

    /* renamed from: a */
    private final BufferedSource f18232a;

    /* renamed from: b */
    private final C14280f f18233b;

    /* renamed from: c */
    private final C11760v f18234c;

    public C8544a(BufferedSource bufferedSource, C14280f fVar, C11760v vVar) {
        this.f18232a = bufferedSource;
        this.f18233b = fVar;
        this.f18234c = vVar;
    }

    /* renamed from: a */
    public final <T extends C8566a> T mo21828a(Class<T> cls) {
        C11725h a = this.f18234c.mo29866a(cls);
        String b0 = this.f18232a.mo36315b0();
        if (!(b0 != null)) {
            b0 = null;
        }
        if (b0 == null) {
            return null;
        }
        C8476c cVar = C8476c.f18029a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received data: ");
        sb.append(b0);
        sb.append(" on TCP socket");
        C8476c.m24621a(cVar, sb.toString(), null, null, 6, null);
        T t = (C8566a) a.fromJson(b0);
        if (t != null) {
            return t;
        }
        throw new IOException("Unable to parse JSON");
    }

    public C8544a(Socket socket) {
        this(C14287m.m45716a(C14287m.m45727b(socket)), C14287m.m45717a(C14287m.m45723a(socket)), C8569d.f18269a.mo21939a());
    }

    /* renamed from: a */
    public final <T extends C8566a> void mo21829a(Class<T> cls, T t) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18234c.mo29866a(cls).toJson(t));
        sb.append("\n");
        String sb2 = sb.toString();
        C14280f fVar = this.f18233b;
        Charset charset = C12801c.f29474a;
        if (sb2 != null) {
            byte[] bytes = sb2.getBytes(charset);
            C12880j.m40222a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            fVar.write(bytes);
            this.f18233b.flush();
            return;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }
}
