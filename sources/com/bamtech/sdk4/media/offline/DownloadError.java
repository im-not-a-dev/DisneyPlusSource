package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.ServiceException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadError;", "", "cause", "", "(Ljava/lang/Throwable;)V", "errorReasons", "", "Lcom/bamtech/sdk4/media/offline/DownloadErrorReason;", "(Ljava/util/List;)V", "errors", "", "getErrors", "()Ljava/util/List;", "httpCode", "", "getHttpCode", "()Ljava/lang/Integer;", "setHttpCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "retriesInitiated", "getRetriesInitiated", "()I", "setRetriesInitiated", "(I)V", "uniqueThrowables", "getUniqueThrowables", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "appendErrorReasons", "", "reasons", "processReasons", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadError.kt */
public final class DownloadError {
    private final List<DownloadErrorReason> errors = new ArrayList();
    private Integer httpCode;
    private int retriesInitiated;
    private final List<Throwable> uniqueThrowables = new ArrayList();
    private String url;

    public DownloadError(Throwable th) {
        processReasons(th);
    }

    private final void appendErrorReasons(Throwable th, List<DownloadErrorReason> list) {
        if (list.size() < 10 && !this.uniqueThrowables.contains(th)) {
            this.uniqueThrowables.add(th);
            String qualifiedName = C12895y.m40230a(th.getClass()).getQualifiedName();
            if (qualifiedName == null) {
                qualifiedName = "Unknown";
            }
            list.add(new DownloadErrorReason(qualifiedName, th.getMessage()));
            if (th instanceof ServiceException) {
                for (ErrorReason downloadErrorReason : ((ServiceException) th).getErrors()) {
                    list.add(DownloadErrorKt.toDownloadErrorReason(downloadErrorReason));
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                appendErrorReasons(cause, list);
            }
        }
    }

    private final void processReasons(Throwable th) {
        appendErrorReasons(th, this.errors);
        this.uniqueThrowables.clear();
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final int getRetriesInitiated() {
        return this.retriesInitiated;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setHttpCode(Integer num) {
        this.httpCode = num;
    }

    public final void setRetriesInitiated(int i) {
        this.retriesInitiated = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
