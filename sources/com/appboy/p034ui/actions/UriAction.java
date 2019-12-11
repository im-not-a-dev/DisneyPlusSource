package com.appboy.p034ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.C0490n;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.C1497e;
import com.appboy.p033s.C1554a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.AppboyWebViewActivity;
import com.appboy.p034ui.support.UriUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appboy.ui.actions.UriAction */
public class UriAction implements IAction {
    private static final String TAG = C1557c.m7461a(UriAction.class);
    private final C1497e mChannel;
    private final Bundle mExtras;
    private Uri mUri;
    private boolean mUseWebView;

    UriAction(Uri uri, Bundle bundle, boolean z, C1497e eVar) {
        this.mUri = uri;
        this.mExtras = bundle;
        this.mUseWebView = z;
        this.mChannel = eVar;
    }

    private static Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() > 1) {
            Iterator it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                if (resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting deep link activity to ");
                    sb.append(resolveInfo.activityInfo.packageName);
                    sb.append(".");
                    C1557c.m7458a(str, sb.toString());
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    private static C0490n getConfiguredTaskBackStackBuilder(Context context, Bundle bundle) {
        C1489b bVar = new C1489b(context);
        C0490n a = C0490n.m2621a(context);
        if (bVar.mo6721n()) {
            String s = bVar.mo6726s();
            if (C1563i.m7490d(s)) {
                C1557c.m7469c(TAG, "Adding main activity intent to back stack while opening uri from push");
                a.mo2700a(UriUtils.getMainActivityIntent(context, bundle));
            } else if (UriUtils.isActivityRegisteredInManifest(context, s)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Adding custom back stack activity while opening uri from push: ");
                sb.append(s);
                C1557c.m7469c(str, sb.toString());
                a.mo2700a(new Intent().setClassName(context, s));
            } else {
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not adding unregistered activity to the back stack while opening uri from push: ");
                sb2.append(s);
                C1557c.m7469c(str2, sb2.toString());
            }
        } else {
            C1557c.m7469c(TAG, "Not adding back stack activity while opening uri from push due to disabled configuration setting.");
        }
        return a;
    }

    private static Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent = new Intent(context, AppboyWebViewActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    private static void openUriWithActionView(Context context, Uri uri, Bundle bundle) {
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(872415232);
        if (actionViewIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(actionViewIntent);
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find appropriate activity to open for deep link ");
        sb.append(uri);
        sb.append(".");
        C1557c.m7473e(str, sb.toString());
    }

    private static void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle) {
        C0490n configuredTaskBackStackBuilder = getConfiguredTaskBackStackBuilder(context, bundle);
        configuredTaskBackStackBuilder.mo2700a(getActionViewIntent(context, uri, bundle));
        try {
            configuredTaskBackStackBuilder.mo2701a(bundle);
        } catch (ActivityNotFoundException e) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find appropriate activity to open for deep link ");
            sb.append(uri);
            C1557c.m7474e(str, sb.toString(), e);
        }
    }

    static void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) {
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(872415232);
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Appboy AppboyWebViewActivity not opened successfully.", e);
        }
    }

    private static void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) {
        C0490n configuredTaskBackStackBuilder = getConfiguredTaskBackStackBuilder(context, bundle);
        configuredTaskBackStackBuilder.mo2700a(getWebViewActivityIntent(context, uri, bundle));
        try {
            configuredTaskBackStackBuilder.mo2701a(bundle);
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Appboy AppboyWebViewActivity not opened successfully.", e);
        }
    }

    public void execute(Context context) {
        if (C1554a.m7444a(this.mUri)) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Not executing local Uri: ");
            sb.append(this.mUri);
            C1557c.m7458a(str, sb.toString());
            return;
        }
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Executing Uri action from channel ");
        sb2.append(this.mChannel);
        sb2.append(": ");
        sb2.append(this.mUri);
        sb2.append(". UseWebView: ");
        sb2.append(this.mUseWebView);
        sb2.append(". Extras: ");
        sb2.append(this.mExtras);
        C1557c.m7458a(str2, sb2.toString());
        if (!this.mUseWebView || !C1554a.f5700b.contains(this.mUri.getScheme())) {
            if (this.mChannel.equals(C1497e.PUSH)) {
                openUriWithActionViewFromPush(context, this.mUri, this.mExtras);
            } else {
                openUriWithActionView(context, this.mUri, this.mExtras);
            }
        } else if (this.mChannel.equals(C1497e.PUSH)) {
            openUriWithWebViewActivityFromPush(context, this.mUri, this.mExtras);
        } else {
            openUriWithWebViewActivity(context, this.mUri, this.mExtras);
        }
    }

    public Uri getUri() {
        return this.mUri;
    }
}
