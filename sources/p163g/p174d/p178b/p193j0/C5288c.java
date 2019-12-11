package p163g.p174d.p178b.p193j0;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5326w;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/player/tracks/SubtitleTrack;", "Lcom/bamtech/player/tracks/Track;", "nativeVideoPlayerTrack", "", "mimeType", "", "player", "Lcom/bamtech/player/VideoPlayer;", "label", "languageCode", "isForced", "", "isSDH", "(Ljava/lang/Object;Ljava/lang/String;Lcom/bamtech/player/VideoPlayer;Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getLanguageCode", "()Ljava/lang/String;", "select", "", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.j0.c */
/* compiled from: SubtitleTrack.kt */
public class C5288c extends C5290d {

    /* renamed from: h */
    public static final C5289a f12654h = new C5289a(null);

    /* renamed from: e */
    private final String f12655e;

    /* renamed from: f */
    private final boolean f12656f;

    /* renamed from: g */
    private final boolean f12657g;

    /* renamed from: g.d.b.j0.c$a */
    /* compiled from: SubtitleTrack.kt */
    public static final class C5289a {
        private C5289a() {
        }

        /* renamed from: a */
        public final boolean mo16865a(String str) {
            String lowerCase = str.toLowerCase();
            C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            if (C12833x.m40154a((CharSequence) lowerCase, (CharSequence) "application/cea-608", false, 2, (Object) null) || C12833x.m40154a((CharSequence) lowerCase, (CharSequence) "application/cea-708", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo16866b(String str) {
            String lowerCase = str.toLowerCase();
            C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            if (C12833x.m40154a((CharSequence) lowerCase, (CharSequence) "text/vtt", false, 2, (Object) null) || C12833x.m40154a((CharSequence) lowerCase, (CharSequence) "application/cea-608", false, 2, (Object) null) || C12833x.m40154a((CharSequence) lowerCase, (CharSequence) "application/cea-708", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C5289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C5288c(Object obj, String str, C5326w wVar, String str2, String str3, boolean z, boolean z2) {
        super(obj, str, str2, wVar);
        this.f12655e = str3;
        this.f12656f = z;
        this.f12657g = z2;
    }

    /* renamed from: f */
    public void mo16859f() {
        C5326w wVar = (C5326w) mo16871d().get();
        if (!this.f12656f) {
            String str = this.f12655e;
            if (str != null) {
                if (wVar != null) {
                    wVar.mo7613b(str);
                }
                if (wVar != null) {
                    wVar.mo7608a(this.f12657g);
                }
            } else {
                C5289a aVar = f12654h;
                String b = mo16869b();
                if (b == null) {
                    b = "";
                }
                if (aVar.mo16865a(b) && wVar != null) {
                    wVar.mo7614b(true);
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo16862g() {
        return this.f12655e;
    }

    /* renamed from: h */
    public final boolean mo16863h() {
        return this.f12656f;
    }

    /* renamed from: i */
    public final boolean mo16864i() {
        return this.f12657g;
    }
}
