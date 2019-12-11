package com.bamtechmedia.dominguez.core.utils;

import com.bamtechmedia.dominguez.config.C3572r0;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "convertToReadableFormat", "", "value", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Ljava/lang/String;", "format", "Companion", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.c0 */
/* compiled from: RuntimeConverter.kt */
public final class C5821c0 {

    /* renamed from: a */
    private final C3572r0 f13610a;

    /* renamed from: com.bamtechmedia.dominguez.core.utils.c0$a */
    /* compiled from: RuntimeConverter.kt */
    public static final class C5822a {
        private C5822a() {
        }

        public /* synthetic */ C5822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5822a(null);
    }

    public C5821c0(C3572r0 r0Var) {
        this.f13610a = r0Var;
    }

    /* renamed from: a */
    public final String mo17730a(Long l, TimeUnit timeUnit) {
        return mo17731b(l, timeUnit);
    }

    /* renamed from: b */
    public final String mo17731b(Long l, TimeUnit timeUnit) {
        if (l == null) {
            return "";
        }
        long minutes = timeUnit.toMinutes(l.longValue());
        long hours = timeUnit.toHours(l.longValue());
        if (minutes == 0) {
            return this.f13610a.mo12772a(C5817a0.runtime_seconds, C13170i0.m40332a(C12907r.m40244a("runtime_seconds", Long.valueOf(timeUnit.toSeconds(l.longValue())))));
        } else if (hours == 0) {
            return this.f13610a.mo12772a(C5817a0.runtime_minutes, C13170i0.m40332a(C12907r.m40244a("runtime_minutes", Long.valueOf(minutes))));
        } else {
            long j = minutes - (60 * hours);
            return this.f13610a.mo12772a(C5817a0.media_playback_total_runtime, C13173j0.m40356a(C12907r.m40244a("runtime_hour", Long.valueOf(hours)), C12907r.m40244a("runtime_minute", Long.valueOf(j))));
        }
    }
}
