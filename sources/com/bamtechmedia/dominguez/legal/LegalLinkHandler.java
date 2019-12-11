package com.bamtechmedia.dominguez.legal;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.legal.LegalCenterFragment.Companion;
import com.bamtechmedia.dominguez.legal.LegalDocumentFinder.LegalItem;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "()V", "pattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalLinkHandler.kt */
public final class LegalLinkHandler implements C7290d {
    private final Pattern pattern = Pattern.compile("/legal(/([a-z-]+)/?)?");

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = this.pattern.matcher(httpUrl.mo35750c());
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(2);
        if (group == null) {
            return Companion.newInstanceFromDeepLink$default(LegalCenterFragment.Companion, null, 1, null);
        }
        switch (group.hashCode()) {
            case -1684346247:
                if (group.equals("eu-privacy-rights")) {
                    return LegalCenterFragment.Companion.newInstanceFromDeepLink(LegalItem.EU_PRIVACY_RIGHTS);
                }
                return null;
            case -1033986512:
                if (group.equals("cookies-policy")) {
                    return LegalCenterFragment.Companion.newInstanceFromDeepLink(LegalItem.COOKIES_POLICY);
                }
                return null;
            case -565301353:
                if (group.equals("terms-of-use")) {
                    return LegalCenterFragment.Companion.newInstanceFromDeepLink(LegalItem.SUBSCRIBER_AGGREMENT);
                }
                return null;
            case -498638057:
                if (group.equals("privacy-policy")) {
                    return LegalCenterFragment.Companion.newInstanceFromDeepLink(LegalItem.PRIVACY_POLICY);
                }
                return null;
            default:
                return null;
        }
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
