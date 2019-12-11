package com.bamtech.sdk4.internal.media;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/BookmarksStorageContextModule;", "", "()V", "bookmarksContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceModule.kt */
public final class BookmarksStorageContextModule {
    public final Context bookmarksContext(Application application) {
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }
}
