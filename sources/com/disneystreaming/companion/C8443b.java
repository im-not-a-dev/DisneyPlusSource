package com.disneystreaming.companion;

import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.p352m.C8485h;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.p592j2.C13303d;
import kotlinx.coroutines.p592j2.C13310j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"Lcom/disneystreaming/companion/Coordinator;", "", "()V", "events", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "getEvents", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "events$delegate", "Lkotlin/Lazy;", "startMessageListeners", "", "listeners", "", "Lcom/disneystreaming/companion/service/ReceiverService;", "stopMessageListeners", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.b */
/* compiled from: Coordinator.kt */
public class C8443b {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f17979b = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C8443b.class), "events", "getEvents()Lkotlinx/coroutines/channels/BroadcastChannel;"))};

    /* renamed from: a */
    private final Lazy f17980a = C12763i.m39921a(C8444a.f17981c);

    /* renamed from: com.disneystreaming.companion.b$a */
    /* compiled from: Coordinator.kt */
    static final class C8444a extends C12881k implements Function0<C13310j<MessagingEvent>> {

        /* renamed from: c */
        public static final C8444a f17981c = new C8444a();

        C8444a() {
            super(0);
        }

        public final C13310j<MessagingEvent> invoke() {
            return new C13310j<>();
        }
    }

    /* renamed from: a */
    public final C13303d<MessagingEvent> mo21675a() {
        Lazy lazy = this.f17980a;
        KProperty kProperty = f17979b[0];
        return (C13303d) lazy.getValue();
    }

    /* renamed from: a */
    public final void mo21676a(Collection<? extends C8485h> collection) {
        for (C8485h e : collection) {
            e.mo21768e();
        }
    }

    /* renamed from: b */
    public final void mo21677b(Collection<? extends C8485h> collection) {
        for (C8485h f : collection) {
            f.mo21769f();
        }
    }
}
