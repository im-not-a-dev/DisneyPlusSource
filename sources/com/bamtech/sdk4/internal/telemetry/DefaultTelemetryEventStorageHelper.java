package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.TaskResponse.Failure;
import com.bamtech.sdk4.internal.telemetry.TaskResponse.Success;
import com.bamtech.sdk4.service.InvalidStateException;
import java.io.File;
import java.util.UUID;
import kotlin.C13147x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\b\"\u0010\b\u0000\u0010\u0014*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0016¢\u0006\u0002\u0010\u0017J9\u0010\u0018\u001a\u0004\u0018\u00010\f\"\u0010\b\u0000\u0010\u0014*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u0002H\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DefaultTelemetryEventStorageHelper;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;", "dustDir", "Ljava/io/File;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "(Ljava/io/File;Lcom/bamtech/core/networking/converters/Converter;)V", "createDustFile", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "", "file", "generateFilename", "", "getDustFile", "folder", "fileName", "persistToFile", "contents", "removeEmptyFile", "serialize", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "event", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "storeEvent", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "callback", "Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;)Ljava/lang/String;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStoreEventHelper.kt */
public final class DefaultTelemetryEventStorageHelper implements TelemetryEventStorageHelper {
    private final Converter converter;
    private final File dustDir;

    public DefaultTelemetryEventStorageHelper(File file, Converter converter2) {
        this.dustDir = file;
        this.converter = converter2;
    }

    public TaskResponse<Boolean> createDustFile(File file) {
        try {
            return new Success(Boolean.valueOf(file.createNewFile()));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public TaskResponse<String> generateFilename() {
        try {
            StringBuilder sb = new StringBuilder();
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            sb.append(now.getMillis());
            sb.append('-');
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkReturnedValueIsNotNull((Object) uuid, "UUID.randomUUID().toString()");
            sb.append(C12839z.m40187f(uuid, 7));
            sb.append(".json");
            return new Success(sb.toString());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public TaskResponse<File> getDustFile(File file, String str) {
        try {
            return new Success(new File(file, str));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.internal.telemetry.TaskResponse<java.lang.Boolean> persistToFile(java.lang.String r7, java.io.File r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            okio.v r3 = okio.C14287m.m45721a(r8, r2, r1, r0)     // Catch:{ all -> 0x0043 }
            okio.f r4 = okio.C14287m.m45717a(r3)     // Catch:{ all -> 0x003c }
            java.nio.charset.Charset r5 = kotlin.p588j0.C12801c.f29474a     // Catch:{ all -> 0x0035 }
            r4.mo36304a(r7, r5)     // Catch:{ all -> 0x0035 }
            r4.flush()     // Catch:{ all -> 0x0035 }
            kotlin.v r7 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0035 }
            kotlin.p580c0.C12724b.m39863a(r4, r0)     // Catch:{ all -> 0x003c }
            kotlin.v r7 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x003c }
            kotlin.p580c0.C12724b.m39863a(r3, r0)     // Catch:{ all -> 0x0043 }
            byte[] r7 = kotlin.p580c0.C12725c.m39864a(r8)     // Catch:{ all -> 0x0043 }
            int r7 = r7.length     // Catch:{ all -> 0x0043 }
            if (r7 != 0) goto L_0x0026
            r7 = 1
            goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            if (r7 != 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0043 }
            com.bamtech.sdk4.internal.telemetry.TaskResponse$Success r0 = new com.bamtech.sdk4.internal.telemetry.TaskResponse$Success     // Catch:{ all -> 0x0043 }
            r0.<init>(r7)     // Catch:{ all -> 0x0043 }
            goto L_0x004c
        L_0x0035:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r4, r7)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r3, r7)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r7 = move-exception
            r8.delete()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            com.bamtech.sdk4.internal.telemetry.TaskResponse$Failure r0 = new com.bamtech.sdk4.internal.telemetry.TaskResponse$Failure
            r0.<init>(r7)
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.DefaultTelemetryEventStorageHelper.persistToFile(java.lang.String, java.io.File):com.bamtech.sdk4.internal.telemetry.TaskResponse");
    }

    public TaskResponse<Boolean> removeEmptyFile(String str) {
        if (str != null) {
            try {
                if (new File(str).exists()) {
                    new File(str).delete();
                }
            } catch (Throwable th) {
                return new Failure(th);
            }
        }
        return new Success(Boolean.valueOf(true));
    }

    public <T extends TelemetryEvent<?, ?>> TaskResponse<String> serialize(T t) {
        try {
            String serialize = this.converter.serialize(t);
            boolean z = !C12832w.m40118a(serialize);
            if (C13147x.f29590a) {
                if (!z) {
                    throw new AssertionError("Assertion failed");
                }
            }
            return new Success(serialize);
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public <T extends TelemetryEvent<?, ?>> String storeEvent(ServiceTransaction serviceTransaction, T t, ErrorHandler errorHandler) {
        TaskResponse generateFilename = generateFilename();
        boolean z = generateFilename instanceof Success;
        if (z) {
            TaskResponse dustFile = getDustFile(this.dustDir, (String) ((Success) generateFilename).getItem());
            if (dustFile instanceof Success) {
                Success success = (Success) dustFile;
                TaskResponse createDustFile = createDustFile((File) success.getItem());
                if (!(createDustFile instanceof Success) || !((Boolean) ((Success) createDustFile).getItem()).booleanValue()) {
                    T t2 = t;
                    if (createDustFile instanceof Failure) {
                        String absolutePath = ((File) success.getItem()).getAbsolutePath();
                        UUID id = serviceTransaction.getId();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unable to create dust file ");
                        sb.append(((File) success.getItem()).getAbsolutePath());
                        errorHandler.handleError(this, serviceTransaction, absolutePath, new InvalidStateException(id, C13183n.m40498a(new ServiceError("dust.file.created.failure", sb.toString())), ((Failure) createDustFile).getError()), t);
                    }
                } else {
                    TaskResponse serialize = serialize(t);
                    if (serialize instanceof Success) {
                        TaskResponse persistToFile = persistToFile((String) ((Success) serialize).getItem(), (File) success.getItem());
                        if (persistToFile instanceof Failure) {
                            errorHandler.handleError(this, serviceTransaction, ((File) success.getItem()).getAbsolutePath(), ((Failure) persistToFile).getError(), t);
                        } else if ((persistToFile instanceof Success) && !((Boolean) ((Success) persistToFile).getItem()).booleanValue()) {
                            String absolutePath2 = ((File) success.getItem()).getAbsolutePath();
                            InvalidStateException invalidStateException = new InvalidStateException(serviceTransaction.getId(), C13183n.m40498a(new ServiceError("dust.empty.file", "dust file was empty after writing contents")), null, 4, null);
                            errorHandler.handleError(this, serviceTransaction, absolutePath2, invalidStateException, t);
                        }
                    } else if (serialize instanceof Failure) {
                        errorHandler.handleError(this, serviceTransaction, ((File) success.getItem()).getAbsolutePath(), new InvalidStateException(serviceTransaction.getId(), C13183n.m40498a(new ServiceError("dust.serialization.failed", "Unable to serialize dust contents to json")), ((Failure) serialize).getError()), t);
                    }
                }
            } else {
                T t3 = t;
                if (dustFile instanceof Failure) {
                    UUID id2 = serviceTransaction.getId();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to create a file object in ");
                    sb2.append(this.dustDir.getAbsolutePath());
                    sb2.append(" named: ");
                    sb2.append(generateFilename);
                    errorHandler.handleError(this, serviceTransaction, null, new InvalidStateException(id2, C13183n.m40498a(new ServiceError("dust.file.path.failure", sb2.toString())), ((Failure) dustFile).getError()), t);
                }
            }
        } else {
            T t4 = t;
            if (generateFilename instanceof Failure) {
                InvalidStateException invalidStateException2 = new InvalidStateException(serviceTransaction.getId(), C13183n.m40498a(new ServiceError("dust.file.name.generation.failure", "Failed to generate the dust file name")), null, 4, null);
                errorHandler.handleError(this, serviceTransaction, null, invalidStateException2, t);
            }
        }
        if (!z) {
            generateFilename = null;
        }
        Success success2 = (Success) generateFilename;
        if (success2 != null) {
            return (String) success2.getItem();
        }
        return null;
    }
}
