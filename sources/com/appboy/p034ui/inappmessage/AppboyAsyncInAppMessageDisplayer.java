package com.appboy.p034ui.inappmessage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import com.appboy.C1440a;
import com.appboy.p025o.C1492a;
import com.appboy.p025o.p026k.C1510e;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1538h;
import com.appboy.p030r.C1539i;
import com.appboy.p030r.C1540j;
import com.appboy.p030r.C1542l;
import com.appboy.p030r.C1543m;
import com.appboy.p033s.C1555b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1565k;
import java.io.File;

/* renamed from: com.appboy.ui.inappmessage.AppboyAsyncInAppMessageDisplayer */
public class AppboyAsyncInAppMessageDisplayer extends AsyncTask<C1532b, Integer, C1532b> {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyAsyncInAppMessageDisplayer.class);

    /* access modifiers changed from: 0000 */
    public boolean prepareInAppMessageWithBitmapDownload(C1532b bVar) {
        if (bVar.mo6818q() != null) {
            C1557c.m7469c(TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
            bVar.mo6803a(true);
            return true;
        }
        String E = bVar.mo6799E();
        if (!C1563i.m7490d(E) && new File(E).exists()) {
            C1557c.m7469c(TAG, "In-app message has local image url.");
            bVar.mo6802a(C1555b.m7457b(Uri.parse(E)));
        }
        if (bVar.mo6818q() == null) {
            String n = bVar.mo6815n();
            if (!C1563i.m7490d(n)) {
                C1557c.m7469c(TAG, "In-app message has remote image url. Downloading.");
                C1492a aVar = C1492a.NO_BOUNDS;
                if (bVar instanceof C1543m) {
                    aVar = C1492a.IN_APP_MESSAGE_SLIDEUP;
                } else if (bVar instanceof C1542l) {
                    aVar = C1492a.IN_APP_MESSAGE_MODAL;
                }
                Context applicationContext = AppboyInAppMessageManager.getInstance().getApplicationContext();
                bVar.mo6802a(C1440a.m6921c(applicationContext).mo6578c().mo6659a(applicationContext, n, aVar));
            } else {
                C1557c.m7473e(TAG, "In-app message has no remote image url. Not downloading image.");
                if (!(bVar instanceof C1538h)) {
                    return true;
                }
                C1557c.m7473e(TAG, "In-app message full has no remote image url yet is required to have an image. Failing download.");
                return false;
            }
        }
        if (bVar.mo6818q() == null) {
            return false;
        }
        bVar.mo6803a(true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean prepareInAppMessageWithHtml(C1532b bVar) {
        C1539i iVar = (C1539i) bVar;
        String d = iVar.mo6836d();
        if (!C1563i.m7490d(d) && new File(d).exists()) {
            C1557c.m7469c(TAG, "Local assets for html in-app message are already populated. Not downloading assets.");
            return true;
        } else if (C1563i.m7490d(iVar.mo6835c())) {
            C1557c.m7469c(TAG, "Html in-app message has no remote asset zip. Continuing with in-app message preparation.");
            return true;
        } else {
            String a = C1565k.m7500a(C1565k.m7499a(AppboyInAppMessageManager.getInstance().getApplicationContext()), iVar.mo6835c());
            if (!C1563i.m7490d(a)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Local url for html in-app message assets is ");
                sb.append(a);
                C1557c.m7458a(str, sb.toString());
                iVar.mo6837d(a);
                return true;
            }
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download of html content to local directory failed for remote url: ");
            sb2.append(iVar.mo6835c());
            sb2.append(" . Returned local url is: ");
            sb2.append(a);
            C1557c.m7473e(str2, sb2.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public C1532b doInBackground(C1532b... bVarArr) {
        try {
            C1532b bVar = bVarArr[0];
            if (bVar.mo6814m()) {
                C1557c.m7458a(TAG, "Skipping in-app message preparation for control in-app message.");
                return bVar;
            }
            C1557c.m7458a(TAG, "Starting asynchronous in-app message preparation.");
            if (bVar instanceof C1540j) {
                if (!prepareInAppMessageWithHtml(bVar)) {
                    bVar.mo6804a(C1510e.ZIP_ASSET_DOWNLOAD);
                    return null;
                }
            } else if (!prepareInAppMessageWithBitmapDownload(bVar)) {
                bVar.mo6804a(C1510e.IMAGE_DOWNLOAD);
                return null;
            }
            return bVar;
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Error running AsyncInAppMessageDisplayer", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(final C1532b bVar) {
        if (bVar != null) {
            try {
                C1557c.m7458a(TAG, "Finished asynchronous in-app message preparation. Attempting to display in-app message.");
                new Handler(AppboyInAppMessageManager.getInstance().getApplicationContext().getMainLooper()).post(new Runnable(this) {
                    public void run() {
                        C1557c.m7458a(AppboyAsyncInAppMessageDisplayer.TAG, "Displaying in-app message.");
                        AppboyInAppMessageManager.getInstance().displayInAppMessage(bVar, false);
                    }
                });
            } catch (Exception e) {
                C1557c.m7470c(TAG, "Error running onPostExecute", e);
            }
        } else {
            C1557c.m7465b(TAG, "Cannot display the in-app message because the in-app message was null.");
        }
    }
}
