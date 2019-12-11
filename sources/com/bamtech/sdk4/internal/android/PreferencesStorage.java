package com.bamtech.sdk4.internal.android;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.networking.DefaultConverterProvider;
import kotlin.Metadata;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KClass;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0017J?\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010\"\u000e\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00100\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u0002H\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0017J1\u0010\u0018\u001a\u00020\u000e\"\b\b\u0000\u0010\u0010*\u00020\u00192\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001a\u001a\u0002H\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0002\u0010\u001bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/PreferencesStorage;", "Lcom/bamtech/sdk4/internal/core/Storage;", "prefs", "Landroid/content/SharedPreferences;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "defaultConverter", "Lcom/bamtech/sdk4/internal/networking/DefaultConverterProvider;", "(Landroid/content/SharedPreferences;Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Lcom/bamtech/sdk4/internal/networking/DefaultConverterProvider;)V", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "prefix", "", "clear", "", "get", "T", "U", "Lkotlin/reflect/KClass;", "key", "type", "overrideConverter", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lcom/bamtech/core/networking/converters/Converter;)Ljava/lang/Object;", "remove", "save", "", "value", "(Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/networking/converters/Converter;)V", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PreferencesStorage.kt */
public final class PreferencesStorage implements Storage {
    /* access modifiers changed from: private */
    public static final String COOKIE = COOKIE;
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final String NAME = NAME;
    /* access modifiers changed from: private */
    public static final String SESSION_INFO = SESSION_INFO;
    private final Converter converter;
    private String prefix;
    private final SharedPreferences prefs;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/PreferencesStorage$Companion;", "", "()V", "COOKIE", "", "getCOOKIE", "()Ljava/lang/String;", "NAME", "getNAME", "SESSION_INFO", "getSESSION_INFO", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PreferencesStorage.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getCOOKIE() {
            return PreferencesStorage.COOKIE;
        }

        public final String getNAME() {
            return PreferencesStorage.NAME;
        }

        public final String getSESSION_INFO() {
            return PreferencesStorage.SESSION_INFO;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PreferencesStorage(SharedPreferences sharedPreferences, BootstrapConfiguration bootstrapConfiguration, DefaultConverterProvider defaultConverterProvider) {
        this.prefs = sharedPreferences;
        this.converter = defaultConverterProvider.getIdentityForStorage();
        StringBuilder sb = new StringBuilder();
        sb.append("BAMSDK_");
        sb.append(bootstrapConfiguration.getClientId());
        sb.append('_');
        sb.append(bootstrapConfiguration.getEnvironment());
        this.prefix = sb.toString();
    }

    public <T, U extends KClass<T>> T get(String str, U u, Converter converter2) {
        SharedPreferences sharedPreferences = this.prefs;
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        sb.append('_');
        sb.append(str);
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            return null;
        }
        if (converter2 == null) {
            try {
                converter2 = this.converter;
            } catch (Throwable unused) {
                return null;
            }
        }
        return converter2.mo7495a(string, C12731a.m39866a((KClass<T>) u));
    }

    @SuppressLint({"ApplySharedPref"})
    public void remove(String str) {
        Editor edit = this.prefs.edit();
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        sb.append('_');
        sb.append(str);
        edit.remove(sb.toString()).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public <T> void save(String str, T t, Converter converter2) {
        Editor edit = this.prefs.edit();
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        sb.append('_');
        sb.append(str);
        String sb2 = sb.toString();
        if (converter2 == null) {
            converter2 = this.converter;
        }
        edit.putString(sb2, converter2.serialize(t)).commit();
    }
}
