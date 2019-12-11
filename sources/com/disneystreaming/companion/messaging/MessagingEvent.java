package com.disneystreaming.companion.messaging;

import com.disneystreaming.companion.p352m.C8489l;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/MessagingEvent;", "", "()V", "BroadCastReceived", "BroadcastListenerStarted", "BroadcastSent", "Error", "HostDisconnected", "MessageListenerStarted", "MessageReceived", "MessageSent", "PairingComplete", "StartUpComplete", "TearDownComplete", "Lcom/disneystreaming/companion/messaging/MessagingEvent$StartUpComplete;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$MessageListenerStarted;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$BroadcastListenerStarted;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$TearDownComplete;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$MessageSent;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$BroadcastSent;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$MessageReceived;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$BroadCastReceived;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$PairingComplete;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$HostDisconnected;", "Lcom/disneystreaming/companion/messaging/MessagingEvent$Error;", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessagingEvent.kt */
public abstract class MessagingEvent {

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$a */
    /* compiled from: MessagingEvent.kt */
    public static final class C8550a extends MessagingEvent {

        /* renamed from: a */
        private final C8489l f18239a;

        public C8550a(C8489l lVar) {
            super(null);
            this.f18239a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f18239a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEvent.C8550a) r2).f18239a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8550a
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEvent$a r2 = (com.disneystreaming.companion.messaging.MessagingEvent.C8550a) r2
                com.disneystreaming.companion.m.l r0 = r1.f18239a
                com.disneystreaming.companion.m.l r2 = r2.f18239a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8550a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C8489l lVar = this.f18239a;
            if (lVar != null) {
                return lVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BroadcastListenerStarted(type=");
            sb.append(this.f18239a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$b */
    /* compiled from: MessagingEvent.kt */
    public static final class C8551b extends MessagingEvent {

        /* renamed from: a */
        private final Payload f18240a;

        /* renamed from: b */
        private final String f18241b;

        /* renamed from: c */
        private final C8489l f18242c;

        public C8551b(Payload payload, String str, C8489l lVar) {
            super(null);
            this.f18240a = payload;
            this.f18241b = str;
            this.f18242c = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18242c, (java.lang.Object) r3.f18242c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8551b
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.MessagingEvent$b r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8551b) r3
                com.disneystreaming.companion.messaging.Payload r0 = r2.f18240a
                com.disneystreaming.companion.messaging.Payload r1 = r3.f18240a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.f18241b
                java.lang.String r1 = r3.f18241b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.m.l r0 = r2.f18242c
                com.disneystreaming.companion.m.l r3 = r3.f18242c
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8551b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Payload payload = this.f18240a;
            int i = 0;
            int hashCode = (payload != null ? payload.hashCode() : 0) * 31;
            String str = this.f18241b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C8489l lVar = this.f18242c;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BroadcastSent(payload=");
            sb.append(this.f18240a);
            sb.append(", host=");
            sb.append(this.f18241b);
            sb.append(", type=");
            sb.append(this.f18242c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$c */
    /* compiled from: MessagingEvent.kt */
    public static final class C8552c extends MessagingEvent {

        /* renamed from: a */
        private final MessagingEventError f18243a;

        /* renamed from: b */
        private final C8489l f18244b;

        public C8552c(MessagingEventError messagingEventError, C8489l lVar) {
            super(null);
            this.f18243a = messagingEventError;
            this.f18244b = lVar;
        }

        /* renamed from: a */
        public final MessagingEventError mo21867a() {
            return this.f18243a;
        }

        /* renamed from: b */
        public final C8489l mo21868b() {
            return this.f18244b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18244b, (java.lang.Object) r3.f18244b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8552c
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.messaging.MessagingEvent$c r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8552c) r3
                com.disneystreaming.companion.messaging.MessagingEventError r0 = r2.f18243a
                com.disneystreaming.companion.messaging.MessagingEventError r1 = r3.f18243a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.m.l r0 = r2.f18244b
                com.disneystreaming.companion.m.l r3 = r3.f18244b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8552c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            MessagingEventError messagingEventError = this.f18243a;
            int i = 0;
            int hashCode = (messagingEventError != null ? messagingEventError.hashCode() : 0) * 31;
            C8489l lVar = this.f18244b;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error(event=");
            sb.append(this.f18243a);
            sb.append(", type=");
            sb.append(this.f18244b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$d */
    /* compiled from: MessagingEvent.kt */
    public static final class C8553d extends MessagingEvent {

        /* renamed from: a */
        private final String f18245a;

        /* renamed from: b */
        private final C8489l f18246b;

        public C8553d(String str, C8489l lVar) {
            super(null);
            this.f18245a = str;
            this.f18246b = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18246b, (java.lang.Object) r3.f18246b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8553d
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.messaging.MessagingEvent$d r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8553d) r3
                java.lang.String r0 = r2.f18245a
                java.lang.String r1 = r3.f18245a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.disneystreaming.companion.m.l r0 = r2.f18246b
                com.disneystreaming.companion.m.l r3 = r3.f18246b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8553d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f18245a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C8489l lVar = this.f18246b;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HostDisconnected(host=");
            sb.append(this.f18245a);
            sb.append(", type=");
            sb.append(this.f18246b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$e */
    /* compiled from: MessagingEvent.kt */
    public static final class C8554e extends MessagingEvent {

        /* renamed from: a */
        private final C8489l f18247a;

        public C8554e(C8489l lVar) {
            super(null);
            this.f18247a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f18247a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEvent.C8554e) r2).f18247a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8554e
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEvent$e r2 = (com.disneystreaming.companion.messaging.MessagingEvent.C8554e) r2
                com.disneystreaming.companion.m.l r0 = r1.f18247a
                com.disneystreaming.companion.m.l r2 = r2.f18247a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8554e.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C8489l lVar = this.f18247a;
            if (lVar != null) {
                return lVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageListenerStarted(type=");
            sb.append(this.f18247a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$f */
    /* compiled from: MessagingEvent.kt */
    public static final class C8555f extends MessagingEvent {

        /* renamed from: a */
        private final Message f18248a;

        /* renamed from: b */
        private final String f18249b;

        /* renamed from: c */
        private final C8489l f18250c;

        public C8555f(Message message, String str, C8489l lVar) {
            super(null);
            this.f18248a = message;
            this.f18249b = str;
            this.f18250c = lVar;
        }

        /* renamed from: a */
        public final String mo21878a() {
            return this.f18249b;
        }

        /* renamed from: b */
        public final Message mo21879b() {
            return this.f18248a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18250c, (java.lang.Object) r3.f18250c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8555f
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.MessagingEvent$f r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8555f) r3
                com.disneystreaming.companion.messaging.Message r0 = r2.f18248a
                com.disneystreaming.companion.messaging.Message r1 = r3.f18248a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.f18249b
                java.lang.String r1 = r3.f18249b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.m.l r0 = r2.f18250c
                com.disneystreaming.companion.m.l r3 = r3.f18250c
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8555f.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Message message = this.f18248a;
            int i = 0;
            int hashCode = (message != null ? message.hashCode() : 0) * 31;
            String str = this.f18249b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C8489l lVar = this.f18250c;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageReceived(message=");
            sb.append(this.f18248a);
            sb.append(", from=");
            sb.append(this.f18249b);
            sb.append(", type=");
            sb.append(this.f18250c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$g */
    /* compiled from: MessagingEvent.kt */
    public static final class C8556g extends MessagingEvent {

        /* renamed from: a */
        private final Payload f18251a;

        /* renamed from: b */
        private final String f18252b;

        /* renamed from: c */
        private final C8489l f18253c;

        public C8556g(Payload payload, String str, C8489l lVar) {
            super(null);
            this.f18251a = payload;
            this.f18252b = str;
            this.f18253c = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18253c, (java.lang.Object) r3.f18253c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8556g
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.MessagingEvent$g r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8556g) r3
                com.disneystreaming.companion.messaging.Payload r0 = r2.f18251a
                com.disneystreaming.companion.messaging.Payload r1 = r3.f18251a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.f18252b
                java.lang.String r1 = r3.f18252b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.m.l r0 = r2.f18253c
                com.disneystreaming.companion.m.l r3 = r3.f18253c
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8556g.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Payload payload = this.f18251a;
            int i = 0;
            int hashCode = (payload != null ? payload.hashCode() : 0) * 31;
            String str = this.f18252b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C8489l lVar = this.f18253c;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageSent(payload=");
            sb.append(this.f18251a);
            sb.append(", host=");
            sb.append(this.f18252b);
            sb.append(", type=");
            sb.append(this.f18253c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$h */
    /* compiled from: MessagingEvent.kt */
    public static final class C8557h extends MessagingEvent {

        /* renamed from: a */
        private final String f18254a;

        /* renamed from: b */
        private final Payload f18255b;

        /* renamed from: c */
        private final C8489l f18256c;

        public C8557h(String str, Payload payload, C8489l lVar) {
            super(null);
            this.f18254a = str;
            this.f18255b = payload;
            this.f18256c = lVar;
        }

        /* renamed from: a */
        public final String mo21886a() {
            return this.f18254a;
        }

        /* renamed from: b */
        public final Payload mo21887b() {
            return this.f18255b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18256c, (java.lang.Object) r3.f18256c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8557h
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.MessagingEvent$h r3 = (com.disneystreaming.companion.messaging.MessagingEvent.C8557h) r3
                java.lang.String r0 = r2.f18254a
                java.lang.String r1 = r3.f18254a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.messaging.Payload r0 = r2.f18255b
                com.disneystreaming.companion.messaging.Payload r1 = r3.f18255b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.disneystreaming.companion.m.l r0 = r2.f18256c
                com.disneystreaming.companion.m.l r3 = r3.f18256c
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8557h.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f18254a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Payload payload = this.f18255b;
            int hashCode2 = (hashCode + (payload != null ? payload.hashCode() : 0)) * 31;
            C8489l lVar = this.f18256c;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PairingComplete(host=");
            sb.append(this.f18254a);
            sb.append(", payload=");
            sb.append(this.f18255b);
            sb.append(", type=");
            sb.append(this.f18256c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$i */
    /* compiled from: MessagingEvent.kt */
    public static final class C8558i extends MessagingEvent {

        /* renamed from: a */
        private final C8489l f18257a;

        public C8558i(C8489l lVar) {
            super(null);
            this.f18257a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f18257a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEvent.C8558i) r2).f18257a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8558i
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEvent$i r2 = (com.disneystreaming.companion.messaging.MessagingEvent.C8558i) r2
                com.disneystreaming.companion.m.l r0 = r1.f18257a
                com.disneystreaming.companion.m.l r2 = r2.f18257a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8558i.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C8489l lVar = this.f18257a;
            if (lVar != null) {
                return lVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StartUpComplete(type=");
            sb.append(this.f18257a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.disneystreaming.companion.messaging.MessagingEvent$j */
    /* compiled from: MessagingEvent.kt */
    public static final class C8559j extends MessagingEvent {

        /* renamed from: a */
        private final C8489l f18258a;

        public C8559j(C8489l lVar) {
            super(null);
            this.f18258a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f18258a, (java.lang.Object) ((com.disneystreaming.companion.messaging.MessagingEvent.C8559j) r2).f18258a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.disneystreaming.companion.messaging.MessagingEvent.C8559j
                if (r0 == 0) goto L_0x0013
                com.disneystreaming.companion.messaging.MessagingEvent$j r2 = (com.disneystreaming.companion.messaging.MessagingEvent.C8559j) r2
                com.disneystreaming.companion.m.l r0 = r1.f18258a
                com.disneystreaming.companion.m.l r2 = r2.f18258a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.MessagingEvent.C8559j.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C8489l lVar = this.f18258a;
            if (lVar != null) {
                return lVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TearDownComplete(type=");
            sb.append(this.f18258a);
            sb.append(")");
            return sb.toString();
        }
    }

    private MessagingEvent() {
    }

    public /* synthetic */ MessagingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
