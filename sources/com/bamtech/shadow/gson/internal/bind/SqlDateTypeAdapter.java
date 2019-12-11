package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2237n;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends C2241p<Date> {

    /* renamed from: b */
    public static final C2243q f6190b = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f6191a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public synchronized Date m8346a(C2249a aVar) throws IOException {
        if (aVar.peek() == C2251b.NULL) {
            aVar.mo11173n();
            return null;
        }
        try {
            return new Date(this.f6191a.parse(aVar.mo11174o()).getTime());
        } catch (ParseException e) {
            throw new C2237n((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo11057a(C2252c cVar, Date date) throws IOException {
        cVar.mo11192g(date == null ? null : this.f6191a.format(date));
    }
}
