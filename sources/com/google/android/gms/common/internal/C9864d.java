package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p096e.p113e.C3928b;
import p163g.p449j.p450a.p451a.p465e.C11406a;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C9864d {

    /* renamed from: a */
    private final Account f23096a;

    /* renamed from: b */
    private final Set<Scope> f23097b;

    /* renamed from: c */
    private final Set<Scope> f23098c;

    /* renamed from: d */
    private final Map<C9678a<?>, C9866b> f23099d;

    /* renamed from: e */
    private final String f23100e;

    /* renamed from: f */
    private final String f23101f;

    /* renamed from: g */
    private final C11406a f23102g;

    /* renamed from: h */
    private final boolean f23103h;

    /* renamed from: i */
    private Integer f23104i;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C9865a {

        /* renamed from: a */
        private Account f23105a;

        /* renamed from: b */
        private C3928b<Scope> f23106b;

        /* renamed from: c */
        private Map<C9678a<?>, C9866b> f23107c;

        /* renamed from: d */
        private int f23108d = 0;

        /* renamed from: e */
        private View f23109e;

        /* renamed from: f */
        private String f23110f;

        /* renamed from: g */
        private String f23111g;

        /* renamed from: h */
        private C11406a f23112h = C11406a.f26736b0;

        /* renamed from: i */
        private boolean f23113i;

        /* renamed from: a */
        public final C9865a mo25366a(Account account) {
            this.f23105a = account;
            return this;
        }

        /* renamed from: b */
        public final C9865a mo25370b(String str) {
            this.f23110f = str;
            return this;
        }

        /* renamed from: a */
        public final C9865a mo25368a(Collection<Scope> collection) {
            if (this.f23106b == null) {
                this.f23106b = new C3928b<>();
            }
            this.f23106b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C9865a mo25367a(String str) {
            this.f23111g = str;
            return this;
        }

        /* renamed from: a */
        public final C9864d mo25369a() {
            C9864d dVar = new C9864d(this.f23105a, this.f23106b, this.f23107c, this.f23108d, this.f23109e, this.f23110f, this.f23111g, this.f23112h, this.f23113i);
            return dVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C9866b {

        /* renamed from: a */
        public final Set<Scope> f23114a;
    }

    public C9864d(Account account, Set<Scope> set, Map<C9678a<?>, C9866b> map, int i, View view, String str, String str2, C11406a aVar, boolean z) {
        this.f23096a = account;
        this.f23097b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f23099d = map;
        this.f23100e = str;
        this.f23101f = str2;
        this.f23102g = aVar;
        this.f23103h = z;
        HashSet hashSet = new HashSet(this.f23097b);
        for (C9866b bVar : this.f23099d.values()) {
            hashSet.addAll(bVar.f23114a);
        }
        this.f23098c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Account mo25353a() {
        return this.f23096a;
    }

    @Deprecated
    /* renamed from: b */
    public final String mo25356b() {
        Account account = this.f23096a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public final Account mo25357c() {
        Account account = this.f23096a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> mo25358d() {
        return this.f23098c;
    }

    /* renamed from: e */
    public final Integer mo25359e() {
        return this.f23104i;
    }

    /* renamed from: f */
    public final Map<C9678a<?>, C9866b> mo25360f() {
        return this.f23099d;
    }

    /* renamed from: g */
    public final String mo25361g() {
        return this.f23101f;
    }

    /* renamed from: h */
    public final String mo25362h() {
        return this.f23100e;
    }

    /* renamed from: i */
    public final Set<Scope> mo25363i() {
        return this.f23097b;
    }

    /* renamed from: j */
    public final C11406a mo25364j() {
        return this.f23102g;
    }

    /* renamed from: k */
    public final boolean mo25365k() {
        return this.f23103h;
    }

    /* renamed from: a */
    public final void mo25355a(Integer num) {
        this.f23104i = num;
    }

    /* renamed from: a */
    public final Set<Scope> mo25354a(C9678a<?> aVar) {
        C9866b bVar = (C9866b) this.f23099d.get(aVar);
        if (bVar == null || bVar.f23114a.isEmpty()) {
            return this.f23097b;
        }
        HashSet hashSet = new HashSet(this.f23097b);
        hashSet.addAll(bVar.f23114a);
        return hashSet;
    }
}
