package com.disneystreaming.companion.messaging;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/MessageType;", "", "()V", "Custom", "Pair", "Ping", "Pong", "Lcom/disneystreaming/companion/messaging/MessageType$Pair;", "Lcom/disneystreaming/companion/messaging/MessageType$Ping;", "Lcom/disneystreaming/companion/messaging/MessageType$Pong;", "Lcom/disneystreaming/companion/messaging/MessageType$Custom;", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessageTypes.kt */
public abstract class MessageType {

    /* renamed from: com.disneystreaming.companion.messaging.MessageType$a */
    /* compiled from: MessageTypes.kt */
    public static final class C8545a extends MessageType {

        /* renamed from: a */
        private final String f18235a;

        public C8545a(String str) {
            super(null);
            this.f18235a = str;
        }

        /* renamed from: a */
        public final String mo21856a() {
            return this.f18235a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f18235a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessageType.C8545a) r2).f18235a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessageType.C8545a
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessageType$a r2 = (com.disneystreaming.companion.messaging.MessageType.C8545a) r2
                java.lang.String r0 = r1.f18235a
                java.lang.String r2 = r2.f18235a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessageType.C8545a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f18235a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Custom(value=");
            sb.append(this.f18235a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessageType$b */
    /* compiled from: MessageTypes.kt */
    public static final class C8546b extends MessageType {

        /* renamed from: a */
        public static final C8546b f18236a = new C8546b();

        private C8546b() {
            super(null);
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessageType$c */
    /* compiled from: MessageTypes.kt */
    public static final class C8547c extends MessageType {

        /* renamed from: a */
        public static final C8547c f18237a = new C8547c();

        private C8547c() {
            super(null);
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessageType$d */
    /* compiled from: MessageTypes.kt */
    public static final class C8548d extends MessageType {

        /* renamed from: a */
        public static final C8548d f18238a = new C8548d();

        private C8548d() {
            super(null);
        }
    }

    private MessageType() {
    }

    public /* synthetic */ MessageType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
