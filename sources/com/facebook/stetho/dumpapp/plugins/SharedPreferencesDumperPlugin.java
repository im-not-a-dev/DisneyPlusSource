package com.facebook.stetho.dumpapp.plugins;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class SharedPreferencesDumperPlugin implements DumperPlugin {
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;

    /* renamed from: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$1 */
    static /* synthetic */ class C86071 {

        /* renamed from: $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type */
        static final /* synthetic */ int[] f18329x96b4f424 = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type[] r0 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18329x96b4f424 = r0
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.INT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.LONG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.STRING     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f18329x96b4f424     // Catch:{ NoSuchFieldError -> 0x004b }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.SET     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.C86071.<clinit>():void");
        }
    }

    private enum Type {
        BOOLEAN("boolean"),
        INT("int"),
        LONG("long"),
        FLOAT("float"),
        STRING("string"),
        SET("set");
        
        private final String name;

        private Type(String str) {
            this.name = str;
        }

        public static StringBuilder appendNamesList(StringBuilder sb, String str) {
            Type[] values;
            boolean z = true;
            for (Type type : values()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                sb.append(type.name);
            }
            return sb;
        }

        /* renamed from: of */
        public static Type m24859of(String str) {
            Type[] values;
            for (Type type : values()) {
                if (type.name.equals(str)) {
                    return type;
                }
            }
            return null;
        }
    }

    public SharedPreferencesDumperPlugin(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    private void doPrint(PrintStream printStream, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mAppContext.getApplicationInfo().dataDir);
        sb.append("/shared_prefs");
        String str = "";
        printRecursive(printStream, sb.toString(), "", list.isEmpty() ? str : (String) list.get(0), list.size() > 1 ? (String) list.get(1) : str);
    }

    private void doUsage(PrintStream printStream) {
        StringBuilder sb = new StringBuilder();
        String str = "Usage: dumpapp prefs ";
        sb.append(str);
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("print [pathPrefix [keyPrefix]]");
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder("       dumpapp prefs ");
        sb3.append("write <path> <key> <");
        StringBuilder appendNamesList = Type.appendNamesList(sb3, "|");
        appendNamesList.append("> <value>");
        printStream.println(appendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }

    @SuppressLint({"CommitPrefEdits"})
    private void doWrite(List<String> list) throws DumpUsageException {
        Iterator it = list.iterator();
        String nextArg = nextArg(it, "Expected <path>");
        String nextArg2 = nextArg(it, "Expected <key>");
        Type of = Type.m24859of(nextArg(it, "Expected <type>"));
        if (of != null) {
            Editor edit = getSharedPreferences(nextArg).edit();
            switch (C86071.f18329x96b4f424[of.ordinal()]) {
                case 1:
                    edit.putBoolean(nextArg2, Boolean.valueOf(nextArgValue(it)).booleanValue());
                    break;
                case 2:
                    edit.putInt(nextArg2, Integer.valueOf(nextArgValue(it)).intValue());
                    break;
                case 3:
                    edit.putLong(nextArg2, Long.valueOf(nextArgValue(it)).longValue());
                    break;
                case 4:
                    edit.putFloat(nextArg2, Float.valueOf(nextArgValue(it)).floatValue());
                    break;
                case 5:
                    edit.putString(nextArg2, nextArgValue(it));
                    break;
                case 6:
                    putStringSet(edit, nextArg2, it);
                    break;
            }
            edit.commit();
            return;
        }
        throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
    }

    private SharedPreferences getSharedPreferences(String str) {
        return this.mAppContext.getSharedPreferences(str, 4);
    }

    private static String nextArg(Iterator<String> it, String str) throws DumpUsageException {
        if (it.hasNext()) {
            return (String) it.next();
        }
        throw new DumpUsageException(str);
    }

    private static String nextArgValue(Iterator<String> it) throws DumpUsageException {
        return nextArg(it, "Expected <value>");
    }

    private void printFile(PrintStream printStream, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        printStream.println(sb.toString());
        for (Entry entry : getSharedPreferences(str).getAll().entrySet()) {
            if (((String) entry.getKey()).startsWith(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  ");
                sb2.append((String) entry.getKey());
                sb2.append(" = ");
                sb2.append(entry.getValue());
                printStream.println(sb2.toString());
            }
        }
    }

    private void printRecursive(PrintStream printStream, String str, String str2, String str3, String str4) {
        String str5;
        File file = new File(str, str2);
        if (file.isFile()) {
            if (str2.endsWith(XML_SUFFIX)) {
                printFile(printStream, str2.substring(0, str2.length() - 4), str4);
            }
        } else if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (int i = 0; i < list.length; i++) {
                    if (TextUtils.isEmpty(str2)) {
                        str5 = list[i];
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(File.separator);
                        sb.append(list[i]);
                        str5 = sb.toString();
                    }
                    String str6 = str5;
                    if (str6.startsWith(str3)) {
                        printRecursive(printStream, str, str6, str3, str4);
                    }
                }
            }
        }
    }

    @TargetApi(11)
    private static void putStringSet(Editor editor, String str, Iterator<String> it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        editor.putStringSet(str, hashSet);
    }

    public void dump(DumperContext dumperContext) throws DumpUsageException {
        PrintStream stdout = dumperContext.getStdout();
        List argsAsList = dumperContext.getArgsAsList();
        String str = argsAsList.isEmpty() ? "" : (String) argsAsList.remove(0);
        if (str.equals("print")) {
            doPrint(stdout, argsAsList);
        } else if (str.equals("write")) {
            doWrite(argsAsList);
        } else {
            doUsage(stdout);
        }
    }

    public String getName() {
        return NAME;
    }
}
