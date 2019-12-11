package com.disneystreaming.companion.messaging;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/MessagingEventError;", "", "()V", "Broadcast", "Connect", "Encryption", "Receive", "Send", "StartUp", "Lcom/disneystreaming/companion/messaging/MessagingEventError$StartUp;", "Lcom/disneystreaming/companion/messaging/MessagingEventError$Broadcast;", "Lcom/disneystreaming/companion/messaging/MessagingEventError$Connect;", "Lcom/disneystreaming/companion/messaging/MessagingEventError$Send;", "Lcom/disneystreaming/companion/messaging/MessagingEventError$Receive;", "Lcom/disneystreaming/companion/messaging/MessagingEventError$Encryption;", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessagingEvent.kt */
public abstract class MessagingEventError {

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$a */
    /* compiled from: MessagingEvent.kt */
    public static final class C8560a extends MessagingEventError {

        /* renamed from: a */
        private final Payload f18259a;

        /* renamed from: b */
        private final Throwable f18260b;

        public C8560a(Payload payload, Throwable th) {
            super(null);
            this.f18259a = payload;
            this.f18260b = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f18260b, (java.lang.Object) r3.f18260b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8560a
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.messaging.MessagingEventError$a r3 = (com.disneystreaming.companion.messaging.MessagingEventError.C8560a) r3
                com.disneystreaming.companion.messaging.Payload r0 = r2.f18259a
                com.disneystreaming.companion.messaging.Payload r1 = r3.f18259a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.Throwable r0 = r2.f18260b
                java.lang.Throwable r3 = r3.f18260b
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8560a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Payload payload = this.f18259a;
            int i = 0;
            int hashCode = (payload != null ? payload.hashCode() : 0) * 31;
            Throwable th = this.f18260b;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcast(payload=");
            sb.append(this.f18259a);
            sb.append(", error=");
            sb.append(this.f18260b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$b */
    /* compiled from: MessagingEvent.kt */
    public static final class C8561b extends MessagingEventError {

        /* renamed from: a */
        private final String f18261a;

        /* renamed from: b */
        private final Throwable f18262b;

        public C8561b(String str, Throwable th) {
            super(null);
            this.f18261a = str;
            this.f18262b = th;
        }

        /* renamed from: a */
        public final String mo21900a() {
            return this.f18261a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f18262b, (java.lang.Object) r3.f18262b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8561b
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.messaging.MessagingEventError$b r3 = (com.disneystreaming.companion.messaging.MessagingEventError.C8561b) r3
                java.lang.String r0 = r2.f18261a
                java.lang.String r1 = r3.f18261a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.Throwable r0 = r2.f18262b
                java.lang.Throwable r3 = r3.f18262b
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8561b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f18261a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Throwable th = this.f18262b;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Connect(to=");
            sb.append(this.f18261a);
            sb.append(", error=");
            sb.append(this.f18262b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$c */
    /* compiled from: MessagingEvent.kt */
    public static final class C8562c extends MessagingEventError {

        /* renamed from: a */
        private final Throwable f18263a;

        public C8562c(Throwable th) {
            super(null);
            this.f18263a = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f18263a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEventError.C8562c) r2).f18263a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8562c
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEventError$c r2 = (com.disneystreaming.companion.messaging.MessagingEventError.C8562c) r2
                java.lang.Throwable r0 = r1.f18263a
                java.lang.Throwable r2 = r2.f18263a
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
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8562c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Throwable th = this.f18263a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Encryption(error=");
            sb.append(this.f18263a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$d */
    /* compiled from: MessagingEvent.kt */
    public static final class C8563d extends MessagingEventError {

        /* renamed from: a */
        private final Throwable f18264a;

        public C8563d(Throwable th) {
            super(null);
            this.f18264a = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f18264a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEventError.C8563d) r2).f18264a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8563d
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEventError$d r2 = (com.disneystreaming.companion.messaging.MessagingEventError.C8563d) r2
                java.lang.Throwable r0 = r1.f18264a
                java.lang.Throwable r2 = r2.f18264a
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
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8563d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Throwable th = this.f18264a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Receive(error=");
            sb.append(this.f18264a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$e */
    /* compiled from: MessagingEvent.kt */
    public static final class C8564e extends MessagingEventError {

        /* renamed from: a */
        private final Payload f18265a;

        /* renamed from: b */
        private final String f18266b;

        /* renamed from: c */
        private final Throwable f18267c;

        public C8564e(Payload payload, String str, Throwable th) {
            super(null);
            this.f18265a = payload;
            this.f18266b = str;
            this.f18267c = th;
        }

        /* renamed from: a */
        public final String mo21910a() {
            return this.f18266b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f18267c, (java.lang.Object) r3.f18267c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8564e
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.MessagingEventError$e r3 = (com.disneystreaming.companion.messaging.MessagingEventError.C8564e) r3
                com.disneystreaming.companion.messaging.Payload r0 = r2.f18265a
                com.disneystreaming.companion.messaging.Payload r1 = r3.f18265a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.f18266b
                java.lang.String r1 = r3.f18266b
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.Throwable r0 = r2.f18267c
                java.lang.Throwable r3 = r3.f18267c
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8564e.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Payload payload = this.f18265a;
            int i = 0;
            int hashCode = (payload != null ? payload.hashCode() : 0) * 31;
            String str = this.f18266b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Throwable th = this.f18267c;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Send(payload=");
            sb.append(this.f18265a);
            sb.append(", to=");
            sb.append(this.f18266b);
            sb.append(", error=");
            sb.append(this.f18267c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEventError$f */
    /* compiled from: MessagingEvent.kt */
    public static final class C8565f extends MessagingEventError {

        /* renamed from: a */
        private final Throwable f18268a;

        public C8565f(Throwable th) {
            super(null);
            this.f18268a = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f18268a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEventError.C8565f) r2).f18268a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEventError.C8565f
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEventError$f r2 = (com.disneystreaming.companion.messaging.MessagingEventError.C8565f) r2
                java.lang.Throwable r0 = r1.f18268a
                java.lang.Throwable r2 = r2.f18268a
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
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEventError.C8565f.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Throwable th = this.f18268a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StartUp(error=");
            sb.append(this.f18268a);
            sb.append(")");
            return sb.toString();
        }
    }

    private MessagingEventError() {
    }

    public /* synthetic */ MessagingEventError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
