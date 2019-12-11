package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.ThumbnailManifest;
import com.bamtech.sdk4.ThumbnailsNotAvailable;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.NotFoundException;
import com.bamtech.sdk4.service.ServiceException;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0014\u0010\b\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\t"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/DefaultOnlineMediaClient$thumbnailErrorResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/ThumbnailManifest;", "canHandle", "", "response", "Lokhttp3/Response;", "Lcom/bamtech/core/networking/OkResponse;", "handle", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
public final class DefaultOnlineMediaClient$thumbnailErrorResponseHandler$1 implements ResponseHandler<ThumbnailManifest> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultOnlineMediaClient$thumbnailErrorResponseHandler$1(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return true;
    }

    public ThumbnailManifest handle(Response response) {
        Throwable th = (Throwable) ResponseHandlersKt.exceptionHandler(this.$transaction).handle(response);
        if (th instanceof NotFoundException) {
            List c = C13199w.m40574c((Collection) ((NotFoundException) th).getErrors());
            ArrayList arrayList = new ArrayList();
            for (Object next : c) {
                if ("thumbnails-unavailable".equals(((ErrorReason) next).getCode())) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("url: ");
                sb.append(response.mo35870m().mo35837g());
                c.add(new ThumbnailsNotAvailable(sb.toString()));
            }
            th = ServiceException.Companion.create(HttpStatus.HTTP_NOT_FOUND, this.$transaction.getId(), c, th.getCause());
        }
        throw th;
    }
}
