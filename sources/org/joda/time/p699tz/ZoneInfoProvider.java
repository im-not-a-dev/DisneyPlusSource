package org.joda.time.p699tz;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.ZoneInfoProvider */
public class ZoneInfoProvider implements Provider {
    private final File iFileDir;
    /* access modifiers changed from: private */
    public final ClassLoader iLoader;
    private final String iResourcePath;
    private final Set<String> iZoneInfoKeys;
    private final Map<String, Object> iZoneInfoMap;

    public ZoneInfoProvider() throws IOException {
        this(DateTimeZone.DEFAULT_TZ_DATA_PATH);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.joda.time.DateTimeZone loadZoneData(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.openResource(r6)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            org.joda.time.DateTimeZone r2 = org.joda.time.p699tz.DateTimeZoneBuilder.readFrom(r1, r6)     // Catch:{ IOException -> 0x001b }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.iZoneInfoMap     // Catch:{ IOException -> 0x001b }
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch:{ IOException -> 0x001b }
            r4.<init>(r2)     // Catch:{ IOException -> 0x001b }
            r3.put(r6, r4)     // Catch:{ IOException -> 0x001b }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r6 = move-exception
            goto L_0x0030
        L_0x001b:
            r2 = move-exception
            goto L_0x0022
        L_0x001d:
            r6 = move-exception
            r1 = r0
            goto L_0x0030
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            r5.uncaughtException(r2)     // Catch:{ all -> 0x0019 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.iZoneInfoMap     // Catch:{ all -> 0x0019 }
            r2.remove(r6)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p699tz.ZoneInfoProvider.loadZoneData(java.lang.String):org.joda.time.DateTimeZone");
    }

    private static Map<String, Object> loadZoneInfoMap(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            readZoneInfoMap(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private InputStream openResource(String str) throws IOException {
        File file = this.iFileDir;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        final String concat = this.iResourcePath.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() {
            public InputStream run() {
                if (ZoneInfoProvider.this.iLoader != null) {
                    return ZoneInfoProvider.this.iLoader.getResourceAsStream(concat);
                }
                return ClassLoader.getSystemResourceAsStream(concat);
            }
        });
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.iLoader;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    private static void readZoneInfoMap(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort2) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    public Set<String> getAvailableIDs() {
        return this.iZoneInfoKeys;
    }

    public DateTimeZone getZone(String str) {
        if (str == null) {
            return null;
        }
        Object obj = this.iZoneInfoMap.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            return loadZoneData(str);
        } else if (str.equals(obj)) {
            return loadZoneData(str);
        } else {
            return getZone((String) obj);
        }
    }

    /* access modifiers changed from: protected */
    public void uncaughtException(Exception exc) {
        exc.printStackTrace();
    }

    public ZoneInfoProvider(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("No file directory provided");
        } else if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File directory doesn't exist: ");
            sb.append(file);
            throw new IOException(sb.toString());
        } else if (file.isDirectory()) {
            this.iFileDir = file;
            this.iResourcePath = null;
            this.iLoader = null;
            this.iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(this.iZoneInfoMap.keySet()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File doesn't refer to a directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public ZoneInfoProvider(String str) throws IOException {
        this(str, null, false);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader) throws IOException {
        this(str, classLoader, true);
    }

    private ZoneInfoProvider(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str != null) {
            if (!str.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                str = sb.toString();
            }
            this.iFileDir = null;
            this.iResourcePath = str;
            if (classLoader == null && !z) {
                classLoader = ZoneInfoProvider.class.getClassLoader();
            }
            this.iLoader = classLoader;
            this.iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(this.iZoneInfoMap.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
}
