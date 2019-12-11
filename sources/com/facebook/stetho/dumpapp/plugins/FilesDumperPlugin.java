package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.os.Environment;
import com.facebook.stetho.dumpapp.ArgsHelper;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FilesDumperPlugin implements DumperPlugin {
    private static final String NAME = "files";
    private final Context mContext;

    public FilesDumperPlugin(Context context) {
        this.mContext = context;
    }

    private void addFiles(ZipOutputStream zipOutputStream, byte[] bArr, File[] fileArr) throws IOException {
        for (File file : fileArr) {
            if (file.isDirectory()) {
                addFiles(zipOutputStream, bArr, file.listFiles());
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(relativizePath(getBaseDir(this.mContext).getParentFile(), file)));
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    copy(fileInputStream, zipOutputStream, bArr);
                } finally {
                    fileInputStream.close();
                }
            }
        }
    }

    private static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.io.PrintStream, code=java.io.OutputStream, for r5v0, types: [java.io.PrintStream, java.io.OutputStream] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doDownload(java.io.OutputStream r5, java.util.Iterator<java.lang.String> r6) throws com.facebook.stetho.dumpapp.DumpUsageException {
        /*
            r4 = this;
            java.lang.String r0 = "Must specify output file or '-'"
            java.lang.String r0 = com.facebook.stetho.dumpapp.ArgsHelper.nextArg(r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x000b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0021
            android.content.Context r2 = r4.mContext
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r2 = resolvePossibleAppStoragePath(r2, r3)
            r1.add(r2)
            goto L_0x000b
        L_0x0021:
            java.lang.String r6 = "-"
            boolean r6 = r6.equals(r0)     // Catch:{ IOException -> 0x0078 }
            if (r6 == 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0078 }
            java.io.File r6 = resolvePossibleSdcardPath(r0)     // Catch:{ IOException -> 0x0078 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0078 }
        L_0x0033:
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x0078 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0078 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0078 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0078 }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x006e }
            int r2 = r1.size()     // Catch:{ all -> 0x006e }
            if (r2 <= 0) goto L_0x0057
            int r2 = r1.size()     // Catch:{ all -> 0x006e }
            java.io.File[] r2 = new java.io.File[r2]     // Catch:{ all -> 0x006e }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x006e }
            java.io.File[] r1 = (java.io.File[]) r1     // Catch:{ all -> 0x006e }
            r4.addFiles(r6, r0, r1)     // Catch:{ all -> 0x006e }
            goto L_0x0064
        L_0x0057:
            android.content.Context r1 = r4.mContext     // Catch:{ all -> 0x006e }
            java.io.File r1 = getBaseDir(r1)     // Catch:{ all -> 0x006e }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x006e }
            r4.addFiles(r6, r0, r1)     // Catch:{ all -> 0x006e }
        L_0x0064:
            r6.close()     // Catch:{ IOException -> 0x0068 }
            return
        L_0x0068:
            r6 = move-exception
            r0 = 0
            com.facebook.stetho.common.Util.close(r5, r0)     // Catch:{ IOException -> 0x0078 }
            throw r6     // Catch:{ IOException -> 0x0078 }
        L_0x006e:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r6 = 1
            com.facebook.stetho.common.Util.close(r5, r6)     // Catch:{ IOException -> 0x0078 }
        L_0x0077:
            throw r0     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin.doDownload(java.io.PrintStream, java.util.Iterator):void");
    }

    private void doLs(PrintStream printStream) throws DumpUsageException {
        File baseDir = getBaseDir(this.mContext);
        if (baseDir.isDirectory()) {
            printDirectoryText(baseDir, "", printStream);
        }
    }

    private void doTree(PrintStream printStream) throws DumpUsageException {
        printDirectoryVisual(getBaseDir(this.mContext), 0, printStream);
    }

    private void doUsage(PrintStream printStream) {
        StringBuilder sb = new StringBuilder();
        sb.append("Usage: dumpapp files ");
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        String str = "       dumpapp files ";
        sb2.append(str);
        sb2.append("ls");
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("tree");
        printStream.println(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("download <output.zip> [<path>...]");
        printStream.println(sb4.toString());
        printStream.println();
        printStream.println("dumpapp files ls: List files similar to the ls command");
        printStream.println();
        printStream.println("dumpapp files tree: List files similar to the tree command");
        printStream.println();
        printStream.println("dumpapp files download: Fetch internal application storage");
        printStream.println("    <output.zip>: Output location or '-' for stdout");
        printStream.println("    <path>: Fetch only those paths named (directories fetch recursively)");
    }

    private static File getBaseDir(Context context) {
        return context.getFilesDir().getParentFile();
    }

    private static void printDirectoryText(File file, String str, PrintStream printStream) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(file2.getName());
                sb.append("/");
                printDirectoryText(file2, sb.toString(), printStream);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(file2.getName());
                printStream.println(sb2.toString());
            }
        }
    }

    private static void printDirectoryVisual(File file, int i, PrintStream printStream) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            printHeaderVisual(i, printStream);
            printStream.print("+---");
            printStream.print(file2.getName());
            printStream.println();
            if (file2.isDirectory()) {
                printDirectoryVisual(file2, i + 1, printStream);
            }
        }
    }

    private static void printHeaderVisual(int i, PrintStream printStream) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print("|   ");
        }
    }

    private static String relativizePath(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        return absolutePath2.startsWith(absolutePath) ? absolutePath2.substring(absolutePath.length() + 1) : absolutePath2;
    }

    private static File resolvePossibleAppStoragePath(Context context, String str) {
        if (str.startsWith("/")) {
            return new File(str);
        }
        return new File(getBaseDir(context), str);
    }

    private static File resolvePossibleSdcardPath(String str) {
        if (str.startsWith("/")) {
            return new File(str);
        }
        return new File(Environment.getExternalStorageDirectory(), str);
    }

    public void dump(DumperContext dumperContext) throws DumpException {
        Iterator it = dumperContext.getArgsAsList().iterator();
        String str = "";
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, str);
        if ("ls".equals(nextOptionalArg)) {
            doLs(dumperContext.getStdout());
        } else if ("tree".equals(nextOptionalArg)) {
            doTree(dumperContext.getStdout());
        } else if ("download".equals(nextOptionalArg)) {
            doDownload(dumperContext.getStdout(), it);
        } else {
            doUsage(dumperContext.getStdout());
            if (!str.equals(nextOptionalArg)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown command: ");
                sb.append(nextOptionalArg);
                throw new DumpUsageException(sb.toString());
            }
        }
    }

    public String getName() {
        return NAME;
    }
}
