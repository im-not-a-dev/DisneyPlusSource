package p551j.p552a.p556h;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import p520io.sentry.event.Event;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.h.b */
/* compiled from: DiskBuffer */
public class C12602b implements C12601a {

    /* renamed from: c */
    private static final C13459b f29237c = C13460c.m41415a(C12602b.class);

    /* renamed from: a */
    private int f29238a;

    /* renamed from: b */
    private final File f29239b;

    /* renamed from: j.a.h.b$a */
    /* compiled from: DiskBuffer */
    class C12603a implements Iterator<Event> {

        /* renamed from: U */
        final /* synthetic */ Iterator f29240U;

        /* renamed from: c */
        private Event f29242c = C12602b.this.m39596a(this.f29240U);

        C12603a(Iterator it) {
            this.f29240U = it;
        }

        public boolean hasNext() {
            return this.f29242c != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Event next() {
            Event event = this.f29242c;
            this.f29242c = C12602b.this.m39596a(this.f29240U);
            return event;
        }
    }

    public C12602b(File file, int i) {
        this.f29239b = file;
        this.f29238a = i;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not create or write to disk buffer dir: ");
        sb.append(file.getAbsolutePath());
        String sb2 = sb.toString();
        try {
            file.mkdirs();
            if (!file.isDirectory() || !file.canWrite()) {
                throw new RuntimeException(sb2);
            }
            C13459b bVar = f29237c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Integer.toString(m39593a()));
            sb3.append(" stored events found in dir: ");
            sb3.append(file.getAbsolutePath());
            bVar.mo34720a(sb3.toString());
        } catch (Exception e) {
            throw new RuntimeException(sb2, e);
        }
    }

    /* renamed from: b */
    public void mo30915b(Event event) {
        File file = this.f29239b;
        StringBuilder sb = new StringBuilder();
        sb.append(event.getId().toString());
        sb.append(".sentry-event");
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            C13459b bVar = f29237c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Discarding Event from offline storage: ");
            sb2.append(file2.getAbsolutePath());
            bVar.mo34720a(sb2.toString());
            if (!file2.delete()) {
                C13459b bVar2 = f29237c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete Event: ");
                sb3.append(file2.getAbsolutePath());
                bVar2.mo34724b(sb3.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30913a(p520io.sentry.event.Event r5) {
        /*
            r4 = this;
            int r0 = r4.m39593a()
            int r1 = r4.f29238a
            if (r0 < r1) goto L_0x0031
            m.c.b r0 = f29237c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not adding Event because at least "
            r1.append(r2)
            int r2 = r4.f29238a
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r1.append(r2)
            java.lang.String r2 = " events are already stored: "
            r1.append(r2)
            java.util.UUID r5 = r5.getId()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.mo34724b(r5)
            return
        L_0x0031:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.f29239b
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.UUID r3 = r5.getId()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = ".sentry-event"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0076
            m.c.b r5 = f29237c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not adding Event to offline storage because it already exists: "
            r1.append(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.mo34728c(r0)
            return
        L_0x0076:
            m.c.b r1 = f29237c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Adding Event to offline storage: "
            r2.append(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo34720a(r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00bc }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00bc }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
            r0.writeObject(r5)     // Catch:{ all -> 0x00a4 }
            r0.close()     // Catch:{ all -> 0x00b0 }
            r1.close()     // Catch:{ Exception -> 0x00bc }
            goto L_0x00d7
        L_0x00a4:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r3     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ Exception -> 0x00bc }
        L_0x00bb:
            throw r2     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            m.c.b r1 = f29237c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error writing Event to offline storage: "
            r2.append(r3)
            java.util.UUID r5 = r5.getId()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.mo34723a(r5, r0)
        L_0x00d7:
            m.c.b r5 = f29237c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.m39593a()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " stored events are now in dir: "
            r0.append(r1)
            java.io.File r1 = r4.f29239b
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.mo34720a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p556h.C12602b.mo30913a(io.sentry.event.Event):void");
    }

    /* renamed from: b */
    public Iterator<Event> mo30914b() {
        return new C12603a(Arrays.asList(this.f29239b.listFiles()).iterator());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p520io.sentry.event.Event m39595a(java.io.File r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to delete Event: "
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0069 }
            r3.<init>(r2)     // Catch:{ all -> 0x0069 }
            java.lang.Object r4 = r3.readObject()     // Catch:{ all -> 0x005d }
            r3.close()     // Catch:{ all -> 0x0069 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
            io.sentry.event.Event r4 = (p520io.sentry.event.Event) r4     // Catch:{ Exception -> 0x0023 }
            return r4
        L_0x0023:
            r2 = move-exception
            m.c.b r3 = f29237c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error casting Object to Event: "
            r4.append(r5)
            java.lang.String r5 = r7.getAbsolutePath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.mo34723a(r4, r2)
            boolean r2 = r7.delete()
            if (r2 != 0) goto L_0x005c
            m.c.b r2 = f29237c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.mo34724b(r7)
        L_0x005c:
            return r1
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r5 = move-exception
            r3.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x006b }
        L_0x006b:
            r4 = move-exception
            r2.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
        L_0x0074:
            throw r4     // Catch:{ FileNotFoundException -> 0x00ae, Exception -> 0x0075 }
        L_0x0075:
            r2 = move-exception
            m.c.b r3 = f29237c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error reading Event file: "
            r4.append(r5)
            java.lang.String r5 = r7.getAbsolutePath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.mo34723a(r4, r2)
            boolean r2 = r7.delete()
            if (r2 != 0) goto L_0x00ae
            m.c.b r2 = f29237c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.mo34724b(r7)
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p556h.C12602b.m39595a(java.io.File):io.sentry.event.Event");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Event m39596a(Iterator<File> it) {
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.getAbsolutePath().endsWith(".sentry-event")) {
                Event a = m39595a(file);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private int m39593a() {
        int i = 0;
        for (File absolutePath : this.f29239b.listFiles()) {
            if (absolutePath.getAbsolutePath().endsWith(".sentry-event")) {
                i++;
            }
        }
        return i;
    }
}
