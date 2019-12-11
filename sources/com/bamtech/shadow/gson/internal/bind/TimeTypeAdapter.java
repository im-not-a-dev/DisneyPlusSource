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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends C2241p<Time> {

    /* renamed from: b */
    public static final C2243q f6192b = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f6193a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public synchronized Time m8351a(C2249a aVar) throws IOException {
        if (aVar.peek() == C2251b.NULL) {
            aVar.mo11173n();
            return null;
        }
        try {
            return new Time(this.f6193a.parse(aVar.mo11174o()).getTime());
        } catch (ParseException e) {
            throw new C2237n((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo11057a(C2252c cVar, Time time) throws IOException {
        cVar.mo11192g(time == null ? null : this.f6193a.format(time));
    }
}
