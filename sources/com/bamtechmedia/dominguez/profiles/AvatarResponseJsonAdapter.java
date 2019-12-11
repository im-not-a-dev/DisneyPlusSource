package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/profiles/AvatarResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableListOfProfileAvatarAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/ProfileAvatar;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AvatarResponseJsonAdapter.kt */
public final class AvatarResponseJsonAdapter extends C11725h<AvatarResponse> {
    private final C11725h<List<ProfileAvatar>> nullableListOfProfileAvatarAdapter;
    private final C11739b options;

    public AvatarResponseJsonAdapter(C11760v vVar) {
        String str = "avatars";
        C11739b a = C11739b.m37729a(str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"avatars\")");
        this.options = a;
        C11725h<List<ProfileAvatar>> a2 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, ProfileAvatar.class), C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a2, "moshi.adapter<List<Profi…ns.emptySet(), \"avatars\")");
        this.nullableListOfProfileAvatarAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, AvatarResponse avatarResponse) {
        if (avatarResponse != null) {
            sVar.mo29791b();
            sVar.mo29796e("avatars");
            this.nullableListOfProfileAvatarAdapter.toJson(sVar, avatarResponse.mo19258a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AvatarResponse)";
    }

    public AvatarResponse fromJson(C11737m mVar) {
        mVar.mo29763b();
        List list = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                list = (List) this.nullableListOfProfileAvatarAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        return new AvatarResponse(list);
    }
}
