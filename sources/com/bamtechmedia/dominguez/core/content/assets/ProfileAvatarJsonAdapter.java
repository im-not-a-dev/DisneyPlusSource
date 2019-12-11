package com.bamtechmedia.dominguez.core.content.assets;

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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/ProfileAvatarJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/ProfileAvatar;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfTextEntryAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "nullableListOfImageAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ProfileAvatarJsonAdapter.kt */
public final class ProfileAvatarJsonAdapter extends C11725h<ProfileAvatar> {
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<List<Image>> nullableListOfImageAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public ProfileAvatarJsonAdapter(C11760v vVar) {
        String str = "images";
        String str2 = "texts";
        String str3 = "avatarId";
        C11739b a = C11739b.m37729a(str3, str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"a…arId\", \"texts\", \"images\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…s.emptySet(), \"avatarId\")");
        this.stringAdapter = a2;
        C11725h<List<TextEntry>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a3;
        C11725h<List<Image>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Image.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<Image…ons.emptySet(), \"images\")");
        this.nullableListOfImageAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, ProfileAvatar profileAvatar) {
        if (profileAvatar != null) {
            sVar.mo29791b();
            sVar.mo29796e("avatarId");
            this.stringAdapter.toJson(sVar, profileAvatar.mo12824j());
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, profileAvatar.mo13176c());
            sVar.mo29796e("images");
            this.nullableListOfImageAdapter.toJson(sVar, profileAvatar.mo12847a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ProfileAvatar)";
    }

    public ProfileAvatar fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        List list = null;
        List list2 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'avatarId' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                list = (List) this.listOfTextEntryAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'texts' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                list2 = (List) this.nullableListOfImageAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'avatarId' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (list != null) {
            return new ProfileAvatar(str, list, list2);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'texts' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
