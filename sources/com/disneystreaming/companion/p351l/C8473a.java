package com.disneystreaming.companion.p351l;

import kotlin.C12898l;
import kotlin.Metadata;
import p163g.p498l.p499a.C11697c;
import p163g.p498l.p499a.C11697c.C11699b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo31007d2 = {"Lcom/disneystreaming/companion/logger/KLogger;", "", "getLevel", "Lcom/soywiz/klogger/Logger$Level;", "level", "Lcom/disneystreaming/companion/logger/LoggerLevel;", "setLevel", "", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.l.a */
/* compiled from: Logger.kt */
public interface C8473a {

    /* renamed from: com.disneystreaming.companion.l.a$a */
    /* compiled from: Logger.kt */
    public static final class C8474a {
        /* renamed from: a */
        public static C11699b m24618a(C8473a aVar, C8477d dVar) {
            switch (C8475b.$EnumSwitchMapping$1[dVar.ordinal()]) {
                case 1:
                    return C11699b.NONE;
                case 2:
                    return C11699b.FATAL;
                case 3:
                    return C11699b.ERROR;
                case 4:
                    return C11699b.WARN;
                case 5:
                    return C11699b.INFO;
                case 6:
                    return C11699b.DEBUG;
                case 7:
                    return C11699b.TRACE;
                default:
                    throw new C12898l();
            }
        }

        /* renamed from: b */
        public static void m24619b(C8473a aVar, C8477d dVar) {
            switch (C8475b.$EnumSwitchMapping$0[dVar.ordinal()]) {
                case 1:
                    C11697c.f27229b.mo29716a(C11699b.NONE);
                    return;
                case 2:
                    C11697c.f27229b.mo29716a(C11699b.FATAL);
                    return;
                case 3:
                    C11697c.f27229b.mo29716a(C11699b.ERROR);
                    return;
                case 4:
                    C11697c.f27229b.mo29716a(C11699b.WARN);
                    return;
                case 5:
                    C11697c.f27229b.mo29716a(C11699b.INFO);
                    return;
                case 6:
                    C11697c.f27229b.mo29716a(C11699b.DEBUG);
                    return;
                case 7:
                    C11697c.f27229b.mo29716a(C11699b.TRACE);
                    return;
                default:
                    return;
            }
        }
    }
}
