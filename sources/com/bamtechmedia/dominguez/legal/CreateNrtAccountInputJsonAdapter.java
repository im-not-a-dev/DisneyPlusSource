package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/CreateNrtAccountInputJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/legal/CreateNrtAccountInput;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfMarketingInputAdapter", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "nrtProfileAdapter", "Lcom/bamtechmedia/dominguez/legal/NrtProfile;", "nullableListOfStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateNrtAccountInputJsonAdapter.kt */
public final class CreateNrtAccountInputJsonAdapter extends C11725h<CreateNrtAccountInput> {
    private final C11725h<List<MarketingInput>> listOfMarketingInputAdapter;
    private final C11725h<NrtProfile> nrtProfileAdapter;
    private final C11725h<List<String>> nullableListOfStringAdapter;
    private final C11739b options;

    public CreateNrtAccountInputJsonAdapter(C11760v vVar) {
        String str = "legalAssertions";
        String str2 = DefaultLegalApi.NRT_MARKETING_ENDPOINT;
        String str3 = "profile";
        C11739b a = C11739b.m37729a(str3, str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"p…ting\", \"legalAssertions\")");
        this.options = a;
        C11725h<NrtProfile> a2 = vVar.mo29869a((Type) NrtProfile.class, C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<NrtProfile…ns.emptySet(), \"profile\")");
        this.nrtProfileAdapter = a2;
        C11725h<List<MarketingInput>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, MarketingInput.class), C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<List<Marke….emptySet(), \"marketing\")");
        this.listOfMarketingInputAdapter = a3;
        C11725h<List<String>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<Strin…Set(), \"legalAssertions\")");
        this.nullableListOfStringAdapter = a4;
    }

    public String toString() {
        return "GeneratedJsonAdapter(CreateNrtAccountInput)";
    }

    public CreateNrtAccountInput fromJson(C11737m mVar) {
        mVar.mo29763b();
        NrtProfile nrtProfile = null;
        List list = null;
        List list2 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                nrtProfile = (NrtProfile) this.nrtProfileAdapter.fromJson(mVar);
                if (nrtProfile == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'profile' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                list = (List) this.listOfMarketingInputAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'marketing' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                list2 = (List) this.nullableListOfStringAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (nrtProfile == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'profile' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (list != null) {
            return new CreateNrtAccountInput(nrtProfile, list, list2);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'marketing' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }

    public void toJson(C11747s sVar, CreateNrtAccountInput createNrtAccountInput) {
        if (createNrtAccountInput != null) {
            sVar.mo29791b();
            sVar.mo29796e("profile");
            this.nrtProfileAdapter.toJson(sVar, createNrtAccountInput.getProfile());
            sVar.mo29796e(DefaultLegalApi.NRT_MARKETING_ENDPOINT);
            this.listOfMarketingInputAdapter.toJson(sVar, createNrtAccountInput.getMarketing());
            sVar.mo29796e("legalAssertions");
            this.nullableListOfStringAdapter.toJson(sVar, createNrtAccountInput.getLegalAssertions());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
