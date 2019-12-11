package com.bamtech.core.networking.converters.shadow.gson;

import com.bamtech.shadow.gson.C2132h;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonDeserializationContext;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0016¢\u0006\u0002\u0010\u0004B,\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0017H\u0016R#\u0010\u0007\u001a\u0017\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/core/networking/converters/shadow/gson/JodaTimeTypeAdapter;", "Lcom/bamtech/shadow/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/bamtech/shadow/gson/JsonSerializer;", "()V", "formatter", "Lorg/joda/time/format/DateTimeFormatter;", "exceptionHandler", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ExtensionFunctionType;", "(Lorg/joda/time/format/DateTimeFormatter;Lkotlin/jvm/functions/Function1;)V", "deserialize", "json", "Lcom/bamtech/shadow/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/bamtech/shadow/gson/JsonDeserializationContext;", "serialize", "src", "typeOfSrc", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "networking-gson-shadow"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: JodaTimeTypeAdapter.kt */
public final class JodaTimeTypeAdapter implements C2132h<DateTime>, C2236m<DateTime> {

    /* renamed from: a */
    private DateTimeFormatter f5880a;

    /* renamed from: b */
    private final Function1<Exception, DateTime> f5881b;

    /* renamed from: com.bamtech.core.networking.converters.shadow.gson.JodaTimeTypeAdapter$a */
    /* compiled from: JodaTimeTypeAdapter.kt */
    static final class C1688a extends C12881k implements Function1 {

        /* renamed from: c */
        public static final C1688a f5882c = new C1688a();

        C1688a() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo7503a(Exception exc) {
            throw exc;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7503a((Exception) obj);
            throw null;
        }
    }

    public JodaTimeTypeAdapter(DateTimeFormatter dateTimeFormatter, Function1<? super Exception, DateTime> function1) {
        this.f5880a = dateTimeFormatter;
        this.f5881b = function1;
    }

    /* renamed from: a */
    public JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        if (this.f5880a.isPrinter()) {
            return new C2235l(this.f5880a.print((ReadableInstant) dateTime));
        }
        return new C2235l(dateTime.toString());
    }

    public /* synthetic */ JodaTimeTypeAdapter(DateTimeFormatter dateTimeFormatter, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            function1 = C1688a.f5882c;
        }
        this(dateTimeFormatter, function1);
    }

    public DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            DateTime parse = DateTime.parse(jsonElement.mo11074e(), this.f5880a);
            C12880j.m40222a((Object) parse, "DateTime.parse(json.asString, formatter)");
            return parse;
        } catch (Exception e) {
            return (DateTime) this.f5881b.invoke(e);
        }
    }

    public JodaTimeTypeAdapter() {
        DateTimeFormatter withOffsetParsed = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        C12880j.m40222a((Object) withOffsetParsed, "ISODateTimeFormat.dateTi…rser().withOffsetParsed()");
        this(withOffsetParsed, null, 2, null);
    }
}
