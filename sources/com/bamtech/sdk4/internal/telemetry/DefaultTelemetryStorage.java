package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12801c;
import okio.BufferedSource;
import okio.C14287m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+H\u0016J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+H\u0016J\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030/H\u0002J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+2\u0006\u00101\u001a\u00020)H\u0016J\u001c\u00102\u001a\u0002032\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+H\u0016J&\u00104\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0+J\f\u00105\u001a\b\u0012\u0004\u0012\u00020)0/J\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020)0/J1\u00108\u001a\u0004\u0018\u00010)\"\u0010\b\u0000\u00109*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u0002H9H\u0016¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0016R$\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000e¨\u0006@"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DefaultTelemetryStorage;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;", "dustDir", "Ljava/io/File;", "helper", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;", "errorHandler", "Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "maxBatchLimit", "", "(Ljava/io/File;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;I)V", "value", "batchLimit", "getBatchLimit", "()I", "setBatchLimit", "(I)V", "getErrorHandler$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "hasEnoughValues", "", "getHasEnoughValues", "()Z", "getMaxBatchLimit", "setMaxBatchLimit", "minBatchLimit", "", "getMinBatchLimit", "()Ljava/lang/Long;", "setMinBatchLimit", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "queueLimit", "getQueueLimit", "()Ljava/lang/Integer;", "setQueueLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "size", "getSize", "convertBatchToPayload", "", "batch", "", "createBatch", "createBatchMap", "files", "", "createSingleBatch", "fileName", "deleteBatch", "", "filterInvalidValues", "getSortedFileNames", "getStorageFilesFromNames", "list", "storeEvent", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "event", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)Ljava/lang/String;", "trimSavedEvents", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStorage.kt */
public final class DefaultTelemetryStorage implements TelemetryStorage {
    private int batchLimit;
    private final File dustDir;
    private final ErrorHandler errorHandler;
    private final TelemetryEventStorageHelper helper;
    private int maxBatchLimit;
    private Long minBatchLimit;
    private Integer queueLimit;

    public DefaultTelemetryStorage(File file, TelemetryEventStorageHelper telemetryEventStorageHelper, ErrorHandler errorHandler2, int i) {
        this.dustDir = file;
        this.helper = telemetryEventStorageHelper;
        this.errorHandler = errorHandler2;
        this.maxBatchLimit = i;
        this.batchLimit = 20;
    }

    private final Map<String, String> createBatchMap(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (File file : list) {
            BufferedSource a = C14287m.m45716a(C14287m.m45728c(file));
            String a2 = a.mo36300a(C12801c.f29474a);
            a.close();
            arrayList.add(new Pair(file.getPath(), a2));
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }

    public String convertBatchToPayload(Map<String, String> map) {
        return C13199w.m40559a(filterInvalidValues(map).values(), ",", "[", "]", 0, null, null, 56, null);
    }

    public Map<String, String> createBatch() {
        return createBatchMap(getStorageFilesFromNames(getSortedFileNames()));
    }

    public Map<String, String> createSingleBatch(String str) {
        return createBatchMap(getStorageFilesFromNames(C13183n.m40498a(str)));
    }

    public void deleteBatch(Map<String, String> map) {
        for (String file : map.keySet()) {
            new File(file).delete();
        }
    }

    public final Map<String, String> filterInvalidValues(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if (!(charSequence == null || C12832w.m40118a(charSequence))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public int getBatchLimit() {
        return this.batchLimit;
    }

    public boolean getHasEnoughValues() {
        Long minBatchLimit2 = getMinBatchLimit();
        if (minBatchLimit2 == null || ((long) getBatchLimit()) < minBatchLimit2.longValue()) {
            if (minBatchLimit2 == null || ((long) getBatchLimit()) >= minBatchLimit2.longValue()) {
                String[] list = this.dustDir.list();
                if (list == null) {
                    list = new String[0];
                }
                if (!(list.length == 0)) {
                    return true;
                }
            } else if (this.dustDir.list().length >= getBatchLimit()) {
                return true;
            }
        } else if (((long) this.dustDir.list().length) >= minBatchLimit2.longValue()) {
            return true;
        }
        return false;
    }

    public int getMaxBatchLimit() {
        return this.maxBatchLimit;
    }

    public Long getMinBatchLimit() {
        return this.minBatchLimit;
    }

    public Integer getQueueLimit() {
        return this.queueLimit;
    }

    public int getSize() {
        return this.dustDir.list().length;
    }

    public final List<String> getSortedFileNames() {
        String[] list = this.dustDir.list();
        C12880j.m40222a((Object) list, "list");
        if (list != null) {
            C13171j.m40344b(list);
            return C13174k.m40390b((Object[]) list, getBatchLimit());
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final List<File> getStorageFilesFromNames(List<String> list) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (String file : list) {
            arrayList.add(new File(this.dustDir, file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((File) next).isFile()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public void setBatchLimit(int i) {
        if (i == 0) {
            i = 1;
        } else {
            int maxBatchLimit2 = getMaxBatchLimit();
            if (1 > i || maxBatchLimit2 < i) {
                i = getMaxBatchLimit();
            }
        }
        this.batchLimit = i;
    }

    public void setMaxBatchLimit(int i) {
        this.maxBatchLimit = i;
    }

    public void setMinBatchLimit(Long l) {
        this.minBatchLimit = l;
    }

    public void setQueueLimit(Integer num) {
        this.queueLimit = num;
    }

    public <T extends TelemetryEvent<?, ?>> String storeEvent(ServiceTransaction serviceTransaction, T t) {
        return this.helper.storeEvent(serviceTransaction, t, this.errorHandler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimSavedEvents(com.bamtech.sdk4.internal.service.ServiceTransaction r7) {
        /*
            r6 = this;
            java.io.File r0 = r6.dustDir
            monitor-enter(r0)
            java.io.File r1 = r6.dustDir     // Catch:{ all -> 0x005c }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            java.lang.Integer r2 = r6.getQueueLimit()     // Catch:{ all -> 0x005c }
            int r3 = r1.length     // Catch:{ all -> 0x005c }
            int r4 = r6.getMaxBatchLimit()     // Catch:{ all -> 0x005c }
            int r4 = r4 * 2
            int r3 = r3 - r4
            int r3 = r3 + 1
            if (r2 != 0) goto L_0x001d
            monitor-exit(r0)
            return
        L_0x001d:
            int r2 = r2.intValue()     // Catch:{ all -> 0x005c }
            int r4 = r1.length     // Catch:{ all -> 0x005c }
            if (r2 < r4) goto L_0x0026
            monitor-exit(r0)
            return
        L_0x0026:
            if (r3 > 0) goto L_0x002a
            monitor-exit(r0)
            return
        L_0x002a:
            if (r1 == 0) goto L_0x0052
            kotlin.p590y.C13171j.m40344b(r1)     // Catch:{ all -> 0x005c }
            r2 = 0
            java.lang.Object[] r1 = kotlin.p590y.C13171j.m40340a(r1, r2, r3)     // Catch:{ all -> 0x005c }
            int r3 = r1.length     // Catch:{ all -> 0x005c }
            r4 = 0
        L_0x0036:
            if (r2 >= r3) goto L_0x0047
            r5 = r1[r2]     // Catch:{ all -> 0x005c }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x005c }
            boolean r5 = r5.delete()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0044
            int r4 = r4 + 1
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0047:
            com.bamtech.sdk4.internal.telemetry.QueueTrimmed r1 = new com.bamtech.sdk4.internal.telemetry.QueueTrimmed     // Catch:{ all -> 0x005c }
            r1.<init>(r6, r4)     // Catch:{ all -> 0x005c }
            r7.log(r1)     // Catch:{ all -> 0x005c }
            kotlin.v r7 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x005c }
            goto L_0x005a
        L_0x0052:
            kotlin.s r7 = new kotlin.s     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            r7.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r7     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r0)
            return
        L_0x005c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.DefaultTelemetryStorage.trimSavedEvents(com.bamtech.sdk4.internal.service.ServiceTransaction):void");
    }

    public /* synthetic */ DefaultTelemetryStorage(File file, TelemetryEventStorageHelper telemetryEventStorageHelper, ErrorHandler errorHandler2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            i = 20;
        }
        this(file, telemetryEventStorageHelper, errorHandler2, i);
    }
}
