package com.bamtechmedia.dominguez.core.content;

import com.bamtechmedia.dominguez.core.content.assets.Participant;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/Series;", "Lcom/bamtechmedia/dominguez/core/content/Browsable;", "currentAvailability", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "getCurrentAvailability", "()Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "encodedSeriesId", "", "getEncodedSeriesId", "()Ljava/lang/String;", "maxYear", "", "getMaxYear", "()Ljava/lang/Integer;", "minYear", "getMinYear", "participants", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "getParticipants", "()Ljava/util/List;", "seriesId", "getSeriesId", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.v */
/* compiled from: DmcInterfaces.kt */
public interface C3791v extends C3651b {

    /* renamed from: com.bamtechmedia.dominguez.core.content.v$a */
    /* compiled from: DmcInterfaces.kt */
    public static final class C3792a {

        /* renamed from: a */
        static final /* synthetic */ C3792a f9442a = new C3792a();

        private C3792a() {
        }
    }

    static {
        C3792a aVar = C3792a.f9442a;
    }

    /* renamed from: C */
    String mo13024C();

    /* renamed from: D */
    String mo13025D();

    /* renamed from: M */
    Integer mo13026M();

    /* renamed from: N */
    Integer mo13027N();

    /* renamed from: z */
    List<Participant> mo13047z();
}
