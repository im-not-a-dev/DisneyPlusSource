package com.bamtechmedia.dominguez.playback.p237m.p241l;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.playback.p236l.C6334b;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/deeplinking/PlaybackLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "context", "Landroid/content/Context;", "intentFactory", "Lcom/bamtechmedia/dominguez/playback/api/PlaybackIntentFactory;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/playback/api/PlaybackIntentFactory;)V", "createDeepLinkedIntent", "Landroid/content/Intent;", "link", "Lokhttp3/HttpUrl;", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.l.a */
/* compiled from: PlaybackLinkHandler.kt */
public final class C6419a implements C7290d {

    /* renamed from: c */
    private static final Pattern f14560c = Pattern.compile("/video/([a-zA-Z0-9-]+)");

    /* renamed from: a */
    private final Context f14561a;

    /* renamed from: b */
    private final C6334b f14562b;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.l.a$a */
    /* compiled from: PlaybackLinkHandler.kt */
    public static final class C6420a {
        private C6420a() {
        }

        public /* synthetic */ C6420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6420a(null);
    }

    public C6419a(Context context, C6334b bVar) {
        this.f14561a = context;
        this.f14562b = bVar;
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        return C7291a.m21909a(this, httpUrl);
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        Matcher matcher = f14560c.matcher(httpUrl.mo35750c());
        if (!matcher.find()) {
            return null;
        }
        C6334b bVar = this.f14562b;
        Context context = this.f14561a;
        String group = matcher.group(1);
        C12880j.m40222a((Object) group, "matcher.group(1)");
        return bVar.mo18948a(context, group);
    }
}
