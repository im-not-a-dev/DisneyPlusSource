package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.converters.shadow.gson.C1689a;
import com.bamtech.core.networking.converters.shadow.gson.InterfaceAdapter;
import com.bamtech.core.networking.converters.shadow.gson.JodaTimeTypeAdapter;
import com.bamtech.sdk4.internal.networking.converters.ServiceExceptionConverter;
import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.shadow.gson.C2123d;
import com.bamtech.shadow.gson.Gson;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/GsonModule;", "", "()V", "dustEventConverter", "Lcom/bamtech/core/networking/converters/Converter;", "identityConverter", "identityConverterForStorage", "nullIdentityConverter", "snakeConverter", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GsonModule.kt */
public final class GsonModule {
    public final Converter dustEventConverter() {
        Gson a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11065a(ServiceException.class, (Object) new ServiceExceptionConverter()).mo11063a();
        C12880j.m40222a((Object) a, "DefaultGsonBuilderFactor…())\n            .create()");
        return new C1689a(a);
    }

    public final Converter identityConverter() {
        Gson a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11063a();
        C12880j.m40222a((Object) a, "DefaultGsonBuilderFactor…                .create()");
        return new C1689a(a);
    }

    public final Converter identityConverterForStorage() {
        Gson a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11066a((Type) ServiceException.class, (Object) new InterfaceAdapter()).mo11066a((Type) ErrorReason.class, (Object) new InterfaceAdapter()).mo11063a();
        C12880j.m40222a((Object) a, "gson");
        return new C1689a(a);
    }

    public final Converter nullIdentityConverter() {
        Gson a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11068c().mo11063a();
        C12880j.m40222a((Object) a, "DefaultGsonBuilderFactor…                .create()");
        return new C1689a(a);
    }

    public final Converter snakeConverter() {
        Gson a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11064a(C2123d.LOWER_CASE_WITH_UNDERSCORES).mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11063a();
        C12880j.m40222a((Object) a, "gson");
        return new C1689a(a);
    }
}
