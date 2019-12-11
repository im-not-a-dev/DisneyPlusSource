package com.bamtechmedia.dominguez.profiles.p258db;

import androidx.room.C0938i;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtechmedia.dominguez.profiles.C6654e0;
import com.bamtechmedia.dominguez.profiles.C6659f0;
import com.bamtechmedia.dominguez.profiles.C7019z;
import java.util.List;
import java.util.concurrent.Callable;
import p520io.reactivex.Completable;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.d */
/* compiled from: ProfilesDao_Impl */
public final class C6640d extends C6639c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f14969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter f14970b;

    /* renamed from: c */
    private final SharedSQLiteStatement f14971c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedSQLiteStatement f14972d;

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$a */
    /* compiled from: ProfilesDao_Impl */
    class C6641a extends EntityInsertionAdapter<C6659f0> {
        C6641a(C6640d dVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C6659f0 f0Var) {
            SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
            if (f0Var.getProfileId() == null) {
                supportSQLiteStatement2.mo5235a(1);
            } else {
                supportSQLiteStatement2.mo5238a(1, f0Var.getProfileId());
            }
            if (f0Var.getProfileName() == null) {
                supportSQLiteStatement2.mo5235a(2);
            } else {
                supportSQLiteStatement2.mo5238a(2, f0Var.getProfileName());
            }
            supportSQLiteStatement2.mo5237a(3, f0Var.mo19357a() ? 1 : 0);
            C6654e0 attributes = f0Var.getAttributes();
            if (attributes != null) {
                supportSQLiteStatement2.mo5237a(4, attributes.mo19338Y() ? 1 : 0);
                supportSQLiteStatement2.mo5237a(5, attributes.mo19337X() ? 1 : 0);
                supportSQLiteStatement2.mo5237a(6, attributes.isDefault() ? 1 : 0);
                if (attributes.mo19343j() == null) {
                    supportSQLiteStatement2.mo5235a(7);
                } else {
                    supportSQLiteStatement2.mo5238a(7, attributes.mo19343j());
                }
                supportSQLiteStatement2.mo5237a(8, attributes.mo19336S() ? 1 : 0);
                supportSQLiteStatement2.mo5237a(9, attributes.mo19334O() ? 1 : 0);
                C7019z P = attributes.mo19335P();
                if (P != null) {
                    if (P.mo19792X() == null) {
                        supportSQLiteStatement2.mo5235a(10);
                    } else {
                        supportSQLiteStatement2.mo5238a(10, P.mo19792X());
                    }
                    if (P.mo19793Y() == null) {
                        supportSQLiteStatement2.mo5235a(11);
                    } else {
                        supportSQLiteStatement2.mo5238a(11, P.mo19793Y());
                    }
                    Integer num = null;
                    Integer valueOf = P.mo19794Z() == null ? null : Integer.valueOf(P.mo19794Z().booleanValue() ? 1 : 0);
                    if (valueOf == null) {
                        supportSQLiteStatement2.mo5235a(12);
                    } else {
                        supportSQLiteStatement2.mo5237a(12, (long) valueOf.intValue());
                    }
                    Integer valueOf2 = P.mo19796a0() == null ? null : Integer.valueOf(P.mo19796a0().booleanValue() ? 1 : 0);
                    if (valueOf2 == null) {
                        supportSQLiteStatement2.mo5235a(13);
                    } else {
                        supportSQLiteStatement2.mo5237a(13, (long) valueOf2.intValue());
                    }
                    if (P.mo19797b0() == null) {
                        supportSQLiteStatement2.mo5235a(14);
                    } else {
                        supportSQLiteStatement2.mo5238a(14, P.mo19797b0());
                    }
                    if (P.mo19798c0() != null) {
                        num = Integer.valueOf(P.mo19798c0().booleanValue() ? 1 : 0);
                    }
                    if (num == null) {
                        supportSQLiteStatement2.mo5235a(15);
                    } else {
                        supportSQLiteStatement2.mo5237a(15, (long) num.intValue());
                    }
                } else {
                    supportSQLiteStatement2.mo5235a(10);
                    supportSQLiteStatement2.mo5235a(11);
                    supportSQLiteStatement2.mo5235a(12);
                    supportSQLiteStatement2.mo5235a(13);
                    supportSQLiteStatement2.mo5235a(14);
                    supportSQLiteStatement2.mo5235a(15);
                }
            } else {
                supportSQLiteStatement2.mo5235a(4);
                supportSQLiteStatement2.mo5235a(5);
                supportSQLiteStatement2.mo5235a(6);
                supportSQLiteStatement2.mo5235a(7);
                supportSQLiteStatement2.mo5235a(8);
                supportSQLiteStatement2.mo5235a(9);
                supportSQLiteStatement2.mo5235a(10);
                supportSQLiteStatement2.mo5235a(11);
                supportSQLiteStatement2.mo5235a(12);
                supportSQLiteStatement2.mo5235a(13);
                supportSQLiteStatement2.mo5235a(14);
                supportSQLiteStatement2.mo5235a(15);
            }
        }

        public String createQuery() {
            return "INSERT OR ABORT INTO `ProfileImpl`(`profileId`,`profileName`,`active`,`isKidsModeEnabled`,`isAutoPlayEnabled`,`isDefault`,`avatarId`,`avatarUserSelected`,`backgroundVideo`,`appLanguage`,`playbackLanguage`,`preferAudioDescription`,`preferSDH`,`subtitleLanguage`,`subtitlesEnabled`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$b */
    /* compiled from: ProfilesDao_Impl */
    class C6642b extends SharedSQLiteStatement {
        C6642b(C6640d dVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ProfileImpl";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$c */
    /* compiled from: ProfilesDao_Impl */
    class C6643c extends SharedSQLiteStatement {
        C6643c(C6640d dVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE ProfileImpl SET active = CASE WHEN profileId = ? THEN 1 ELSE 0 END";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$d */
    /* compiled from: ProfilesDao_Impl */
    class C6644d implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C6659f0 f14974c;

        C6644d(C6659f0 f0Var) {
            this.f14974c = f0Var;
        }

        public Void call() throws Exception {
            C6640d.this.f14969a.beginTransaction();
            try {
                C6640d.this.f14970b.insert(this.f14974c);
                C6640d.this.f14969a.setTransactionSuccessful();
                return null;
            } finally {
                C6640d.this.f14969a.endTransaction();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$e */
    /* compiled from: ProfilesDao_Impl */
    class C6645e implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ String f14976c;

        C6645e(String str) {
            this.f14976c = str;
        }

        public Void call() throws Exception {
            SupportSQLiteStatement acquire = C6640d.this.f14972d.acquire();
            String str = this.f14976c;
            if (str == null) {
                acquire.mo5235a(1);
            } else {
                acquire.mo5238a(1, str);
            }
            C6640d.this.f14969a.beginTransaction();
            try {
                acquire.mo5323k0();
                C6640d.this.f14969a.setTransactionSuccessful();
                return null;
            } finally {
                C6640d.this.f14969a.endTransaction();
                C6640d.this.f14972d.release(acquire);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$f */
    /* compiled from: ProfilesDao_Impl */
    class C6646f implements Callable<List<C6659f0>> {

        /* renamed from: c */
        final /* synthetic */ RoomSQLiteQuery f14978c;

        C6646f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f14978c = roomSQLiteQuery;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f14978c.mo5242b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0101 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0109 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x010c A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0117 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0123 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0126 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x012e A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0131 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0157 A[Catch:{ all -> 0x020c }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0158 A[Catch:{ all -> 0x020c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.bamtechmedia.dominguez.profiles.C6659f0> call() throws java.lang.Exception {
            /*
                r37 = this;
                r1 = r37
                com.bamtechmedia.dominguez.profiles.db.d r0 = com.bamtechmedia.dominguez.profiles.p258db.C6640d.this
                androidx.room.RoomDatabase r0 = r0.f14969a
                androidx.room.RoomSQLiteQuery r2 = r1.f14978c
                r3 = 0
                android.database.Cursor r2 = androidx.room.p003k.C0946b.m5157a(r0, r2, r3)
                java.lang.String r0 = "profileId"
                int r0 = androidx.room.p003k.C0945a.m5155a(r2, r0)     // Catch:{ all -> 0x020c }
                java.lang.String r4 = "profileName"
                int r4 = androidx.room.p003k.C0945a.m5155a(r2, r4)     // Catch:{ all -> 0x020c }
                java.lang.String r5 = "active"
                int r5 = androidx.room.p003k.C0945a.m5155a(r2, r5)     // Catch:{ all -> 0x020c }
                java.lang.String r6 = "isKidsModeEnabled"
                int r6 = androidx.room.p003k.C0945a.m5155a(r2, r6)     // Catch:{ all -> 0x020c }
                java.lang.String r7 = "isAutoPlayEnabled"
                int r7 = androidx.room.p003k.C0945a.m5155a(r2, r7)     // Catch:{ all -> 0x020c }
                java.lang.String r8 = "isDefault"
                int r8 = androidx.room.p003k.C0945a.m5155a(r2, r8)     // Catch:{ all -> 0x020c }
                java.lang.String r9 = "avatarId"
                int r9 = androidx.room.p003k.C0945a.m5155a(r2, r9)     // Catch:{ all -> 0x020c }
                java.lang.String r10 = "avatarUserSelected"
                int r10 = androidx.room.p003k.C0945a.m5155a(r2, r10)     // Catch:{ all -> 0x020c }
                java.lang.String r11 = "backgroundVideo"
                int r11 = androidx.room.p003k.C0945a.m5155a(r2, r11)     // Catch:{ all -> 0x020c }
                java.lang.String r12 = "appLanguage"
                int r12 = androidx.room.p003k.C0945a.m5155a(r2, r12)     // Catch:{ all -> 0x020c }
                java.lang.String r13 = "playbackLanguage"
                int r13 = androidx.room.p003k.C0945a.m5155a(r2, r13)     // Catch:{ all -> 0x020c }
                java.lang.String r14 = "preferAudioDescription"
                int r14 = androidx.room.p003k.C0945a.m5155a(r2, r14)     // Catch:{ all -> 0x020c }
                java.lang.String r15 = "preferSDH"
                int r15 = androidx.room.p003k.C0945a.m5155a(r2, r15)     // Catch:{ all -> 0x020c }
                java.lang.String r3 = "subtitleLanguage"
                int r3 = androidx.room.p003k.C0945a.m5155a(r2, r3)     // Catch:{ all -> 0x020c }
                java.lang.String r1 = "subtitlesEnabled"
                int r1 = androidx.room.p003k.C0945a.m5155a(r2, r1)     // Catch:{ all -> 0x020c }
                r16 = r1
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x020c }
                r17 = r3
                int r3 = r2.getCount()     // Catch:{ all -> 0x020c }
                r1.<init>(r3)     // Catch:{ all -> 0x020c }
            L_0x0076:
                boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x020c }
                if (r3 == 0) goto L_0x0207
                java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x020c }
                r18 = r0
                java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x020c }
                int r19 = r2.getInt(r5)     // Catch:{ all -> 0x020c }
                r20 = 1
                if (r19 == 0) goto L_0x0092
                r19 = r4
                r4 = 1
                goto L_0x0095
            L_0x0092:
                r19 = r4
                r4 = 0
            L_0x0095:
                boolean r21 = r2.isNull(r6)     // Catch:{ all -> 0x020c }
                r22 = 0
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r7)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r8)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r10)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r11)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r12)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r13)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r14)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                boolean r21 = r2.isNull(r15)     // Catch:{ all -> 0x020c }
                if (r21 == 0) goto L_0x00f0
                r21 = r5
                r5 = r17
                boolean r17 = r2.isNull(r5)     // Catch:{ all -> 0x020c }
                if (r17 == 0) goto L_0x00f4
                r17 = r1
                r1 = r16
                boolean r16 = r2.isNull(r1)     // Catch:{ all -> 0x020c }
                if (r16 != 0) goto L_0x00e8
                goto L_0x00f8
            L_0x00e8:
                r20 = r1
                r16 = r5
                r1 = r22
                goto L_0x01f0
            L_0x00f0:
                r21 = r5
                r5 = r17
            L_0x00f4:
                r17 = r1
                r1 = r16
            L_0x00f8:
                int r16 = r2.getInt(r6)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0101
                r24 = 1
                goto L_0x0103
            L_0x0101:
                r24 = 0
            L_0x0103:
                int r16 = r2.getInt(r7)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x010c
                r25 = 1
                goto L_0x010e
            L_0x010c:
                r25 = 0
            L_0x010e:
                int r16 = r2.getInt(r8)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0117
                r26 = 1
                goto L_0x0119
            L_0x0117:
                r26 = 0
            L_0x0119:
                java.lang.String r27 = r2.getString(r9)     // Catch:{ all -> 0x020c }
                int r16 = r2.getInt(r10)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0126
                r28 = 1
                goto L_0x0128
            L_0x0126:
                r28 = 0
            L_0x0128:
                int r16 = r2.getInt(r11)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0131
                r29 = 1
                goto L_0x0133
            L_0x0131:
                r29 = 0
            L_0x0133:
                boolean r16 = r2.isNull(r12)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x015c
                boolean r16 = r2.isNull(r13)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x015c
                boolean r16 = r2.isNull(r14)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x015c
                boolean r16 = r2.isNull(r15)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x015c
                boolean r16 = r2.isNull(r5)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x015c
                boolean r16 = r2.isNull(r1)     // Catch:{ all -> 0x020c }
                if (r16 != 0) goto L_0x0158
                goto L_0x015c
            L_0x0158:
                r30 = r22
                goto L_0x01e3
            L_0x015c:
                java.lang.String r31 = r2.getString(r12)     // Catch:{ all -> 0x020c }
                java.lang.String r32 = r2.getString(r13)     // Catch:{ all -> 0x020c }
                boolean r16 = r2.isNull(r14)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x016d
                r16 = r22
                goto L_0x0175
            L_0x016d:
                int r16 = r2.getInt(r14)     // Catch:{ all -> 0x020c }
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x020c }
            L_0x0175:
                if (r16 != 0) goto L_0x017a
                r33 = r22
                goto L_0x018b
            L_0x017a:
                int r16 = r16.intValue()     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0183
                r16 = 1
                goto L_0x0185
            L_0x0183:
                r16 = 0
            L_0x0185:
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x020c }
                r33 = r16
            L_0x018b:
                boolean r16 = r2.isNull(r15)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x0194
                r16 = r22
                goto L_0x019c
            L_0x0194:
                int r16 = r2.getInt(r15)     // Catch:{ all -> 0x020c }
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x020c }
            L_0x019c:
                if (r16 != 0) goto L_0x01a1
                r34 = r22
                goto L_0x01b2
            L_0x01a1:
                int r16 = r16.intValue()     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x01aa
                r16 = 1
                goto L_0x01ac
            L_0x01aa:
                r16 = 0
            L_0x01ac:
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x020c }
                r34 = r16
            L_0x01b2:
                java.lang.String r35 = r2.getString(r5)     // Catch:{ all -> 0x020c }
                boolean r16 = r2.isNull(r1)     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x01bf
                r16 = r22
                goto L_0x01c7
            L_0x01bf:
                int r16 = r2.getInt(r1)     // Catch:{ all -> 0x020c }
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x020c }
            L_0x01c7:
                if (r16 != 0) goto L_0x01cc
            L_0x01c9:
                r36 = r22
                goto L_0x01da
            L_0x01cc:
                int r16 = r16.intValue()     // Catch:{ all -> 0x020c }
                if (r16 == 0) goto L_0x01d3
                goto L_0x01d5
            L_0x01d3:
                r20 = 0
            L_0x01d5:
                java.lang.Boolean r22 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x020c }
                goto L_0x01c9
            L_0x01da:
                com.bamtechmedia.dominguez.profiles.z r16 = new com.bamtechmedia.dominguez.profiles.z     // Catch:{ all -> 0x020c }
                r30 = r16
                r30.<init>(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x020c }
                r30 = r16
            L_0x01e3:
                com.bamtechmedia.dominguez.profiles.e0 r16 = new com.bamtechmedia.dominguez.profiles.e0     // Catch:{ all -> 0x020c }
                r23 = r16
                r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x020c }
                r20 = r1
                r1 = r16
                r16 = r5
            L_0x01f0:
                com.bamtechmedia.dominguez.profiles.f0 r5 = new com.bamtechmedia.dominguez.profiles.f0     // Catch:{ all -> 0x020c }
                r5.<init>(r3, r0, r1, r4)     // Catch:{ all -> 0x020c }
                r0 = r17
                r0.add(r5)     // Catch:{ all -> 0x020c }
                r1 = r0
                r17 = r16
                r0 = r18
                r4 = r19
                r16 = r20
                r5 = r21
                goto L_0x0076
            L_0x0207:
                r0 = r1
                r2.close()
                return r0
            L_0x020c:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p258db.C6640d.C6646f.call():java.util.List");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$g */
    /* compiled from: ProfilesDao_Impl */
    class C6647g implements Callable<C6659f0> {

        /* renamed from: c */
        final /* synthetic */ RoomSQLiteQuery f14980c;

        C6647g(RoomSQLiteQuery roomSQLiteQuery) {
            this.f14980c = roomSQLiteQuery;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f14980c.mo5242b();
        }

        /* JADX WARNING: type inference failed for: r18v0 */
        /* JADX WARNING: type inference failed for: r18v1, types: [com.bamtechmedia.dominguez.profiles.f0] */
        /* JADX WARNING: type inference failed for: r3v3, types: [com.bamtechmedia.dominguez.profiles.f0] */
        /* JADX WARNING: type inference failed for: r18v2 */
        /* JADX WARNING: type inference failed for: r18v3, types: [java.lang.Boolean] */
        /* JADX WARNING: type inference failed for: r18v4 */
        /* JADX WARNING: type inference failed for: r32v0, types: [java.lang.Boolean] */
        /* JADX WARNING: type inference failed for: r18v5 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r18v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.lang.Boolean]
          uses: [com.bamtechmedia.dominguez.profiles.f0, ?[OBJECT, ARRAY]]
          mth insns count: 177
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bamtechmedia.dominguez.profiles.C6659f0 call() throws java.lang.Exception {
            /*
                r33 = this;
                r1 = r33
                com.bamtechmedia.dominguez.profiles.db.d r0 = com.bamtechmedia.dominguez.profiles.p258db.C6640d.this
                androidx.room.RoomDatabase r0 = r0.f14969a
                androidx.room.RoomSQLiteQuery r2 = r1.f14980c
                r3 = 0
                android.database.Cursor r2 = androidx.room.p003k.C0946b.m5157a(r0, r2, r3)
                java.lang.String r0 = "profileId"
                int r0 = androidx.room.p003k.C0945a.m5155a(r2, r0)     // Catch:{ all -> 0x01cc }
                java.lang.String r4 = "profileName"
                int r4 = androidx.room.p003k.C0945a.m5155a(r2, r4)     // Catch:{ all -> 0x01cc }
                java.lang.String r5 = "active"
                int r5 = androidx.room.p003k.C0945a.m5155a(r2, r5)     // Catch:{ all -> 0x01cc }
                java.lang.String r6 = "isKidsModeEnabled"
                int r6 = androidx.room.p003k.C0945a.m5155a(r2, r6)     // Catch:{ all -> 0x01cc }
                java.lang.String r7 = "isAutoPlayEnabled"
                int r7 = androidx.room.p003k.C0945a.m5155a(r2, r7)     // Catch:{ all -> 0x01cc }
                java.lang.String r8 = "isDefault"
                int r8 = androidx.room.p003k.C0945a.m5155a(r2, r8)     // Catch:{ all -> 0x01cc }
                java.lang.String r9 = "avatarId"
                int r9 = androidx.room.p003k.C0945a.m5155a(r2, r9)     // Catch:{ all -> 0x01cc }
                java.lang.String r10 = "avatarUserSelected"
                int r10 = androidx.room.p003k.C0945a.m5155a(r2, r10)     // Catch:{ all -> 0x01cc }
                java.lang.String r11 = "backgroundVideo"
                int r11 = androidx.room.p003k.C0945a.m5155a(r2, r11)     // Catch:{ all -> 0x01cc }
                java.lang.String r12 = "appLanguage"
                int r12 = androidx.room.p003k.C0945a.m5155a(r2, r12)     // Catch:{ all -> 0x01cc }
                java.lang.String r13 = "playbackLanguage"
                int r13 = androidx.room.p003k.C0945a.m5155a(r2, r13)     // Catch:{ all -> 0x01cc }
                java.lang.String r14 = "preferAudioDescription"
                int r14 = androidx.room.p003k.C0945a.m5155a(r2, r14)     // Catch:{ all -> 0x01cc }
                java.lang.String r15 = "preferSDH"
                int r15 = androidx.room.p003k.C0945a.m5155a(r2, r15)     // Catch:{ all -> 0x01cc }
                java.lang.String r3 = "subtitleLanguage"
                int r3 = androidx.room.p003k.C0945a.m5155a(r2, r3)     // Catch:{ all -> 0x01cc }
                java.lang.String r1 = "subtitlesEnabled"
                int r1 = androidx.room.p003k.C0945a.m5155a(r2, r1)     // Catch:{ all -> 0x01cc }
                boolean r17 = r2.moveToFirst()     // Catch:{ all -> 0x01cc }
                r18 = 0
                if (r17 == 0) goto L_0x01c8
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x01cc }
                java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x01cc }
                int r5 = r2.getInt(r5)     // Catch:{ all -> 0x01cc }
                r17 = 1
                if (r5 == 0) goto L_0x0083
                r5 = 1
                goto L_0x0084
            L_0x0083:
                r5 = 0
            L_0x0084:
                boolean r19 = r2.isNull(r6)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r7)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r8)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r9)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r10)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r11)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r12)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r13)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r14)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r15)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r3)     // Catch:{ all -> 0x01cc }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r1)     // Catch:{ all -> 0x01cc }
                if (r19 != 0) goto L_0x00cd
                goto L_0x00d1
            L_0x00cd:
                r1 = r18
                goto L_0x01c1
            L_0x00d1:
                int r6 = r2.getInt(r6)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x00da
                r20 = 1
                goto L_0x00dc
            L_0x00da:
                r20 = 0
            L_0x00dc:
                int r6 = r2.getInt(r7)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x00e5
                r21 = 1
                goto L_0x00e7
            L_0x00e5:
                r21 = 0
            L_0x00e7:
                int r6 = r2.getInt(r8)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x00f0
                r22 = 1
                goto L_0x00f2
            L_0x00f0:
                r22 = 0
            L_0x00f2:
                java.lang.String r23 = r2.getString(r9)     // Catch:{ all -> 0x01cc }
                int r6 = r2.getInt(r10)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x00ff
                r24 = 1
                goto L_0x0101
            L_0x00ff:
                r24 = 0
            L_0x0101:
                int r6 = r2.getInt(r11)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x010a
                r25 = 1
                goto L_0x010c
            L_0x010a:
                r25 = 0
            L_0x010c:
                boolean r6 = r2.isNull(r12)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r13)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r14)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r15)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r3)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r1)     // Catch:{ all -> 0x01cc }
                if (r6 != 0) goto L_0x0131
                goto L_0x0135
            L_0x0131:
                r26 = r18
                goto L_0x01ba
            L_0x0135:
                java.lang.String r27 = r2.getString(r12)     // Catch:{ all -> 0x01cc }
                java.lang.String r28 = r2.getString(r13)     // Catch:{ all -> 0x01cc }
                boolean r6 = r2.isNull(r14)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0146
                r6 = r18
                goto L_0x014e
            L_0x0146:
                int r6 = r2.getInt(r14)     // Catch:{ all -> 0x01cc }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01cc }
            L_0x014e:
                if (r6 != 0) goto L_0x0153
                r29 = r18
                goto L_0x0162
            L_0x0153:
                int r6 = r6.intValue()     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x015b
                r6 = 1
                goto L_0x015c
            L_0x015b:
                r6 = 0
            L_0x015c:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x01cc }
                r29 = r6
            L_0x0162:
                boolean r6 = r2.isNull(r15)     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x016b
                r6 = r18
                goto L_0x0173
            L_0x016b:
                int r6 = r2.getInt(r15)     // Catch:{ all -> 0x01cc }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01cc }
            L_0x0173:
                if (r6 != 0) goto L_0x0178
                r30 = r18
                goto L_0x0187
            L_0x0178:
                int r6 = r6.intValue()     // Catch:{ all -> 0x01cc }
                if (r6 == 0) goto L_0x0180
                r6 = 1
                goto L_0x0181
            L_0x0180:
                r6 = 0
            L_0x0181:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x01cc }
                r30 = r6
            L_0x0187:
                java.lang.String r31 = r2.getString(r3)     // Catch:{ all -> 0x01cc }
                boolean r3 = r2.isNull(r1)     // Catch:{ all -> 0x01cc }
                if (r3 == 0) goto L_0x0194
                r1 = r18
                goto L_0x019c
            L_0x0194:
                int r1 = r2.getInt(r1)     // Catch:{ all -> 0x01cc }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01cc }
            L_0x019c:
                if (r1 != 0) goto L_0x01a1
            L_0x019e:
                r32 = r18
                goto L_0x01b1
            L_0x01a1:
                int r1 = r1.intValue()     // Catch:{ all -> 0x01cc }
                if (r1 == 0) goto L_0x01aa
                r16 = 1
                goto L_0x01ac
            L_0x01aa:
                r16 = 0
            L_0x01ac:
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x01cc }
                goto L_0x019e
            L_0x01b1:
                com.bamtechmedia.dominguez.profiles.z r1 = new com.bamtechmedia.dominguez.profiles.z     // Catch:{ all -> 0x01cc }
                r26 = r1
                r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x01cc }
                r26 = r1
            L_0x01ba:
                com.bamtechmedia.dominguez.profiles.e0 r1 = new com.bamtechmedia.dominguez.profiles.e0     // Catch:{ all -> 0x01cc }
                r19 = r1
                r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01cc }
            L_0x01c1:
                com.bamtechmedia.dominguez.profiles.f0 r3 = new com.bamtechmedia.dominguez.profiles.f0     // Catch:{ all -> 0x01cc }
                r3.<init>(r0, r4, r1, r5)     // Catch:{ all -> 0x01cc }
                r18 = r3
            L_0x01c8:
                r2.close()
                return r18
            L_0x01cc:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p258db.C6640d.C6647g.call():com.bamtechmedia.dominguez.profiles.f0");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.d$h */
    /* compiled from: ProfilesDao_Impl */
    class C6648h implements Callable<C6659f0> {

        /* renamed from: c */
        final /* synthetic */ RoomSQLiteQuery f14982c;

        C6648h(RoomSQLiteQuery roomSQLiteQuery) {
            this.f14982c = roomSQLiteQuery;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f14982c.mo5242b();
        }

        /* JADX WARNING: type inference failed for: r18v0 */
        /* JADX WARNING: type inference failed for: r18v1, types: [com.bamtechmedia.dominguez.profiles.f0] */
        /* JADX WARNING: type inference failed for: r3v7, types: [com.bamtechmedia.dominguez.profiles.f0] */
        /* JADX WARNING: type inference failed for: r18v2 */
        /* JADX WARNING: type inference failed for: r18v3, types: [java.lang.Boolean] */
        /* JADX WARNING: type inference failed for: r18v4 */
        /* JADX WARNING: type inference failed for: r32v0, types: [java.lang.Boolean] */
        /* JADX WARNING: type inference failed for: r18v5 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r18v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.lang.Boolean]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.bamtechmedia.dominguez.profiles.f0, ?[OBJECT, ARRAY]]
          mth insns count: 194
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bamtechmedia.dominguez.profiles.C6659f0 call() throws java.lang.Exception {
            /*
                r33 = this;
                r1 = r33
                com.bamtechmedia.dominguez.profiles.db.d r0 = com.bamtechmedia.dominguez.profiles.p258db.C6640d.this
                androidx.room.RoomDatabase r0 = r0.f14969a
                androidx.room.RoomSQLiteQuery r2 = r1.f14982c
                r3 = 0
                android.database.Cursor r2 = androidx.room.p003k.C0946b.m5157a(r0, r2, r3)
                java.lang.String r0 = "profileId"
                int r0 = androidx.room.p003k.C0945a.m5155a(r2, r0)     // Catch:{ all -> 0x01f3 }
                java.lang.String r4 = "profileName"
                int r4 = androidx.room.p003k.C0945a.m5155a(r2, r4)     // Catch:{ all -> 0x01f3 }
                java.lang.String r5 = "active"
                int r5 = androidx.room.p003k.C0945a.m5155a(r2, r5)     // Catch:{ all -> 0x01f3 }
                java.lang.String r6 = "isKidsModeEnabled"
                int r6 = androidx.room.p003k.C0945a.m5155a(r2, r6)     // Catch:{ all -> 0x01f3 }
                java.lang.String r7 = "isAutoPlayEnabled"
                int r7 = androidx.room.p003k.C0945a.m5155a(r2, r7)     // Catch:{ all -> 0x01f3 }
                java.lang.String r8 = "isDefault"
                int r8 = androidx.room.p003k.C0945a.m5155a(r2, r8)     // Catch:{ all -> 0x01f3 }
                java.lang.String r9 = "avatarId"
                int r9 = androidx.room.p003k.C0945a.m5155a(r2, r9)     // Catch:{ all -> 0x01f3 }
                java.lang.String r10 = "avatarUserSelected"
                int r10 = androidx.room.p003k.C0945a.m5155a(r2, r10)     // Catch:{ all -> 0x01f3 }
                java.lang.String r11 = "backgroundVideo"
                int r11 = androidx.room.p003k.C0945a.m5155a(r2, r11)     // Catch:{ all -> 0x01f3 }
                java.lang.String r12 = "appLanguage"
                int r12 = androidx.room.p003k.C0945a.m5155a(r2, r12)     // Catch:{ all -> 0x01f3 }
                java.lang.String r13 = "playbackLanguage"
                int r13 = androidx.room.p003k.C0945a.m5155a(r2, r13)     // Catch:{ all -> 0x01f3 }
                java.lang.String r14 = "preferAudioDescription"
                int r14 = androidx.room.p003k.C0945a.m5155a(r2, r14)     // Catch:{ all -> 0x01f3 }
                java.lang.String r15 = "preferSDH"
                int r15 = androidx.room.p003k.C0945a.m5155a(r2, r15)     // Catch:{ all -> 0x01f3 }
                java.lang.String r3 = "subtitleLanguage"
                int r3 = androidx.room.p003k.C0945a.m5155a(r2, r3)     // Catch:{ all -> 0x01f3 }
                java.lang.String r1 = "subtitlesEnabled"
                int r1 = androidx.room.p003k.C0945a.m5155a(r2, r1)     // Catch:{ all -> 0x01ef }
                boolean r17 = r2.moveToFirst()     // Catch:{ all -> 0x01ef }
                r18 = 0
                if (r17 == 0) goto L_0x01c8
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x01ef }
                java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x01ef }
                int r5 = r2.getInt(r5)     // Catch:{ all -> 0x01ef }
                r17 = 1
                if (r5 == 0) goto L_0x0083
                r5 = 1
                goto L_0x0084
            L_0x0083:
                r5 = 0
            L_0x0084:
                boolean r19 = r2.isNull(r6)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r7)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r8)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r9)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r10)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r11)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r12)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r13)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r14)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r15)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r3)     // Catch:{ all -> 0x01ef }
                if (r19 == 0) goto L_0x00d1
                boolean r19 = r2.isNull(r1)     // Catch:{ all -> 0x01ef }
                if (r19 != 0) goto L_0x00cd
                goto L_0x00d1
            L_0x00cd:
                r1 = r18
                goto L_0x01c1
            L_0x00d1:
                int r6 = r2.getInt(r6)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x00da
                r20 = 1
                goto L_0x00dc
            L_0x00da:
                r20 = 0
            L_0x00dc:
                int r6 = r2.getInt(r7)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x00e5
                r21 = 1
                goto L_0x00e7
            L_0x00e5:
                r21 = 0
            L_0x00e7:
                int r6 = r2.getInt(r8)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x00f0
                r22 = 1
                goto L_0x00f2
            L_0x00f0:
                r22 = 0
            L_0x00f2:
                java.lang.String r23 = r2.getString(r9)     // Catch:{ all -> 0x01ef }
                int r6 = r2.getInt(r10)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x00ff
                r24 = 1
                goto L_0x0101
            L_0x00ff:
                r24 = 0
            L_0x0101:
                int r6 = r2.getInt(r11)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x010a
                r25 = 1
                goto L_0x010c
            L_0x010a:
                r25 = 0
            L_0x010c:
                boolean r6 = r2.isNull(r12)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r13)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r14)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r15)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r3)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0135
                boolean r6 = r2.isNull(r1)     // Catch:{ all -> 0x01ef }
                if (r6 != 0) goto L_0x0131
                goto L_0x0135
            L_0x0131:
                r26 = r18
                goto L_0x01ba
            L_0x0135:
                java.lang.String r27 = r2.getString(r12)     // Catch:{ all -> 0x01ef }
                java.lang.String r28 = r2.getString(r13)     // Catch:{ all -> 0x01ef }
                boolean r6 = r2.isNull(r14)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0146
                r6 = r18
                goto L_0x014e
            L_0x0146:
                int r6 = r2.getInt(r14)     // Catch:{ all -> 0x01ef }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01ef }
            L_0x014e:
                if (r6 != 0) goto L_0x0153
                r29 = r18
                goto L_0x0162
            L_0x0153:
                int r6 = r6.intValue()     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x015b
                r6 = 1
                goto L_0x015c
            L_0x015b:
                r6 = 0
            L_0x015c:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x01ef }
                r29 = r6
            L_0x0162:
                boolean r6 = r2.isNull(r15)     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x016b
                r6 = r18
                goto L_0x0173
            L_0x016b:
                int r6 = r2.getInt(r15)     // Catch:{ all -> 0x01ef }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01ef }
            L_0x0173:
                if (r6 != 0) goto L_0x0178
                r30 = r18
                goto L_0x0187
            L_0x0178:
                int r6 = r6.intValue()     // Catch:{ all -> 0x01ef }
                if (r6 == 0) goto L_0x0180
                r6 = 1
                goto L_0x0181
            L_0x0180:
                r6 = 0
            L_0x0181:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x01ef }
                r30 = r6
            L_0x0187:
                java.lang.String r31 = r2.getString(r3)     // Catch:{ all -> 0x01ef }
                boolean r3 = r2.isNull(r1)     // Catch:{ all -> 0x01ef }
                if (r3 == 0) goto L_0x0194
                r1 = r18
                goto L_0x019c
            L_0x0194:
                int r1 = r2.getInt(r1)     // Catch:{ all -> 0x01ef }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01ef }
            L_0x019c:
                if (r1 != 0) goto L_0x01a1
            L_0x019e:
                r32 = r18
                goto L_0x01b1
            L_0x01a1:
                int r1 = r1.intValue()     // Catch:{ all -> 0x01ef }
                if (r1 == 0) goto L_0x01aa
                r16 = 1
                goto L_0x01ac
            L_0x01aa:
                r16 = 0
            L_0x01ac:
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x01ef }
                goto L_0x019e
            L_0x01b1:
                com.bamtechmedia.dominguez.profiles.z r1 = new com.bamtechmedia.dominguez.profiles.z     // Catch:{ all -> 0x01ef }
                r26 = r1
                r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x01ef }
                r26 = r1
            L_0x01ba:
                com.bamtechmedia.dominguez.profiles.e0 r1 = new com.bamtechmedia.dominguez.profiles.e0     // Catch:{ all -> 0x01ef }
                r19 = r1
                r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01ef }
            L_0x01c1:
                com.bamtechmedia.dominguez.profiles.f0 r3 = new com.bamtechmedia.dominguez.profiles.f0     // Catch:{ all -> 0x01ef }
                r3.<init>(r0, r4, r1, r5)     // Catch:{ all -> 0x01ef }
                r18 = r3
            L_0x01c8:
                if (r18 == 0) goto L_0x01ce
                r2.close()
                return r18
            L_0x01ce:
                androidx.room.a r0 = new androidx.room.a     // Catch:{ all -> 0x01ef }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ef }
                r1.<init>()     // Catch:{ all -> 0x01ef }
                java.lang.String r3 = "Query returned empty result set: "
                r1.append(r3)     // Catch:{ all -> 0x01ef }
                r3 = r33
                androidx.room.RoomSQLiteQuery r4 = r3.f14982c     // Catch:{ all -> 0x01ed }
                java.lang.String r4 = r4.mo5234a()     // Catch:{ all -> 0x01ed }
                r1.append(r4)     // Catch:{ all -> 0x01ed }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01ed }
                r0.<init>(r1)     // Catch:{ all -> 0x01ed }
                throw r0     // Catch:{ all -> 0x01ed }
            L_0x01ed:
                r0 = move-exception
                goto L_0x01f5
            L_0x01ef:
                r0 = move-exception
                r3 = r33
                goto L_0x01f5
            L_0x01f3:
                r0 = move-exception
                r3 = r1
            L_0x01f5:
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p258db.C6640d.C6648h.call():com.bamtechmedia.dominguez.profiles.f0");
        }
    }

    public C6640d(RoomDatabase roomDatabase) {
        this.f14969a = roomDatabase;
        this.f14970b = new C6641a(this, roomDatabase);
        this.f14971c = new C6642b(this, roomDatabase);
        this.f14972d = new C6643c(this, roomDatabase);
    }

    /* renamed from: d */
    public Flowable<List<C6659f0>> mo19319d() {
        return C0938i.m5149a(this.f14969a, false, new String[]{"ProfileImpl"}, new C6646f(RoomSQLiteQuery.m5112b("SELECT * FROM ProfileImpl", 0)));
    }

    /* renamed from: b */
    public void mo19317b(List<C6659f0> list) {
        this.f14969a.beginTransaction();
        try {
            super.mo19317b(list);
            this.f14969a.setTransactionSuccessful();
        } finally {
            this.f14969a.endTransaction();
        }
    }

    /* renamed from: c */
    public void mo19318c() {
        this.f14969a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14971c.acquire();
        this.f14969a.beginTransaction();
        try {
            acquire.mo5323k0();
            this.f14969a.setTransactionSuccessful();
        } finally {
            this.f14969a.endTransaction();
            this.f14971c.release(acquire);
        }
    }

    /* renamed from: a */
    public void mo19315a(List<C6659f0> list) {
        this.f14969a.assertNotSuspendingTransaction();
        this.f14969a.beginTransaction();
        try {
            this.f14970b.insert((Iterable<T>) list);
            this.f14969a.setTransactionSuccessful();
        } finally {
            this.f14969a.endTransaction();
        }
    }

    /* renamed from: b */
    public Flowable<C6659f0> mo19316b() {
        return C0938i.m5149a(this.f14969a, false, new String[]{"ProfileImpl"}, new C6647g(RoomSQLiteQuery.m5112b("SELECT * FROM ProfileImpl WHERE active = 1", 0)));
    }

    /* renamed from: a */
    public Completable mo19312a(C6659f0 f0Var) {
        return Completable.m38168c((Callable<?>) new C6644d<Object>(f0Var));
    }

    /* renamed from: a */
    public Completable mo19313a(String str) {
        return Completable.m38168c((Callable<?>) new C6645e<Object>(str));
    }

    /* renamed from: a */
    public Single<C6659f0> mo19314a() {
        return Single.m38401c((Callable<? extends T>) new C6648h<Object>(RoomSQLiteQuery.m5112b("SELECT * FROM ProfileImpl WHERE active = 1", 0)));
    }
}
