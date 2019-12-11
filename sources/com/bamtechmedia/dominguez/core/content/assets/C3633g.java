package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.C3651b;
import com.bamtechmedia.dominguez.core.content.C3651b.C3652a;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3793w;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.g */
/* compiled from: DmcBrowsable.kt */
public abstract class C3633g implements C3651b, C3632f, C3793w {

    /* renamed from: U */
    private final transient List<Release> f9130U;

    /* renamed from: V */
    private final transient List<Rating> f9131V;

    /* renamed from: W */
    private final transient MediaRights f9132W;

    /* renamed from: X */
    private final transient String f9133X;

    /* renamed from: Y */
    private final transient List<String> f9134Y;

    /* renamed from: Z */
    private final transient List<DmcTag> f9135Z;

    /* renamed from: a0 */
    private final transient List<GenreMeta> f9136a0;

    /* renamed from: c */
    private final transient List<TextEntry> f9137c;

    public C3633g(List<TextEntry> list, List<Image> list2, List<Participant> list3, List<Release> list4, List<Rating> list5, MediaRights mediaRights, String str, List<String> list6, List<? extends C3680n> list7, List<DmcTag> list8, List<GenreMeta> list9) {
        this.f9137c = list;
        this.f9130U = list4;
        this.f9131V = list5;
        this.f9132W = mediaRights;
        this.f9133X = str;
        this.f9134Y = list6;
        this.f9135Z = list8;
        this.f9136a0 = list9;
    }

    /* renamed from: K */
    public C3649t mo13260K() {
        return C3649t.FULL;
    }

    /* renamed from: a */
    public Image mo12845a(C3688j jVar, C3623a aVar) {
        return C3652a.m12417a((C3651b) this, jVar, aVar);
    }

    /* renamed from: b */
    public String mo13040b() {
        return C3652a.m12420b(this, C3649t.SLUG, null, 2, null);
    }

    /* renamed from: c */
    public List<GenreMeta> mo12896c() {
        return this.f9136a0;
    }

    /* renamed from: d */
    public boolean mo13263d() {
        return !this.f9132W.mo13118X();
    }

    /* renamed from: e */
    public String mo13264e() {
        String str = this.f9133X;
        if (str == null) {
            List<String> list = this.f9134Y;
            str = list != null ? (String) C13199w.m40591g((List) list) : null;
        }
        return str != null ? str : "";
    }

    /* renamed from: g */
    public Rating mo13265g() {
        return (Rating) C13199w.m40591g((List) this.f9131V);
    }

    public String getDescription() {
        return mo13261a(mo13260K(), mo13044j());
    }

    public String getTitle() {
        return mo13262b(mo13260K(), mo13044j());
    }

    /* renamed from: h */
    public String mo13267h() {
        List<Release> list = this.f9130U;
        if (list != null) {
            Release release = (Release) C13199w.m40591g((List) list);
            if (release != null) {
                String h = release.mo13202h();
                if (h != null) {
                    List a = C12833x.m40142a((CharSequence) h, new String[]{"."}, false, 0, 6, (Object) null);
                    if (a != null) {
                        return (String) C13199w.m40589f(a);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo13268i() {
        int i;
        List<DmcTag> list = this.f9135Z;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((DmcTag) next).mo13055a0()) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C3647r mo13044j() {
        return C3647r.PROGRAM;
    }

    /* renamed from: a */
    public Image mo12846a(String str, C3623a aVar) {
        return C3652a.m12418a((C3651b) this, str, aVar);
    }

    /* renamed from: b */
    public String mo13262b(C3649t tVar, C3647r rVar) {
        return C3650u.m12405a(this.f9137c, C3648s.TITLE, tVar, rVar);
    }

    /* renamed from: a */
    public String mo13261a(C3649t tVar, C3647r rVar) {
        return C3650u.m12405a(this.f9137c, C3648s.DESCRIPTION, tVar, rVar);
    }

    /* renamed from: a */
    public boolean mo12848a(C3626b bVar) {
        return (bVar instanceof C3651b) && C12880j.m40224a((Object) ((C3651b) bVar).mo12903f(), (Object) mo12903f());
    }
}
