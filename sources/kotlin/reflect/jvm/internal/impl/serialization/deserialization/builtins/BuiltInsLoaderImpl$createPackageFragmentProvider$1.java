package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: BuiltInsLoaderImpl.kt */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends C12879i implements Function1<String, InputStream> {
    BuiltInsLoaderImpl$createPackageFragmentProvider$1(BuiltInsResourceLoader builtInsResourceLoader) {
        super(1, builtInsResourceLoader);
    }

    public final String getName() {
        return "loadResource";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(BuiltInsResourceLoader.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    public final InputStream invoke(String str) {
        return ((BuiltInsResourceLoader) this.receiver).loadResource(str);
    }
}
