package com.facebook.stetho.dumpapp.plugins;

import android.os.Process;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.ArgsHelper;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class CrashDumperPlugin implements DumperPlugin {
    private static final String NAME = "crash";
    private static final String OPTION_EXIT_DEFAULT = "0";
    private static final String OPTION_KILL_DEFAULT = "9";
    private static final String OPTION_THROW_DEFAULT = "java.lang.Error";

    private static class ThrowRunnable implements Runnable {
        private final Throwable mThrowable;

        public ThrowRunnable(Throwable th) {
            this.mThrowable = th;
        }

        public void run() {
            ExceptionUtil.sneakyThrow(this.mThrowable);
        }
    }

    private void doKill(DumperContext dumperContext, Iterator<String> it) throws DumpException {
        Process start;
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, OPTION_KILL_DEFAULT);
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("-");
            sb.append(nextOptionalArg);
            start = processBuilder.command(new String[]{"/system/bin/kill", sb.toString(), String.valueOf(Process.myPid())}).redirectErrorStream(true).start();
            Util.copy(start.getInputStream(), dumperContext.getStdout(), new byte[1024]);
            start.destroy();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to invoke kill: ");
            sb2.append(e);
            throw new DumpException(sb2.toString());
        } catch (Throwable th) {
            start.destroy();
            throw th;
        }
    }

    private void doSystemExit(Iterator<String> it) {
        System.exit(Integer.parseInt(ArgsHelper.nextOptionalArg(it, OPTION_EXIT_DEFAULT)));
    }

    private void doUncaughtException(Iterator<String> it) throws DumpException {
        Throwable th;
        try {
            Class cls = Class.forName(ArgsHelper.nextOptionalArg(it, OPTION_THROW_DEFAULT));
            Constructor tryGetDeclaredConstructor = tryGetDeclaredConstructor(cls, String.class);
            if (tryGetDeclaredConstructor != null) {
                th = (Throwable) tryGetDeclaredConstructor.newInstance(new Object[]{"Uncaught exception triggered by Stetho"});
            } else {
                th = (Throwable) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            Thread thread = new Thread(new ThrowRunnable(th));
            thread.start();
            Util.joinUninterruptibly(thread);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid supplied Throwable class: ");
            sb.append(e);
            throw new DumpException(sb.toString());
        } catch (InvocationTargetException e2) {
            throw ExceptionUtil.propagate(e2.getCause());
        }
    }

    private void doUsage(PrintStream printStream) {
        StringBuilder sb = new StringBuilder();
        String str = "Usage: dumpapp crash ";
        sb.append(str);
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("throw");
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        String str2 = "       dumpapp crash ";
        sb3.append(str2);
        sb3.append("kill");
        printStream.println(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append("exit");
        printStream.println(sb4.toString());
        printStream.println();
        printStream.println("dumpapp crash throw: Throw an uncaught exception (simulates a program crash)");
        printStream.println("    <Throwable>: Throwable class to use (default: java.lang.Error)");
        printStream.println();
        printStream.println("dumpapp crash kill: Send a signal to this process (simulates the low memory killer)");
        printStream.println("    <SIGNAL>: Either signal name or number to send (default: 9)");
        printStream.println("              See `adb shell kill -l` for more information");
        printStream.println();
        printStream.println("dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)");
        printStream.println("    <code>: Exit code (default: 0)");
    }

    private static <T> Constructor<? extends T> tryGetDeclaredConstructor(Class<T> cls, Class<?>... clsArr) {
        try {
            return cls.getDeclaredConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void dump(DumperContext dumperContext) throws DumpException {
        Iterator it = dumperContext.getArgsAsList().iterator();
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, null);
        if ("throw".equals(nextOptionalArg)) {
            doUncaughtException(it);
        } else if ("kill".equals(nextOptionalArg)) {
            doKill(dumperContext, it);
        } else if ("exit".equals(nextOptionalArg)) {
            doSystemExit(it);
        } else {
            doUsage(dumperContext.getStdout());
            if (nextOptionalArg != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported command: ");
                sb.append(nextOptionalArg);
                throw new DumpUsageException(sb.toString());
            }
        }
    }

    public String getName() {
        return NAME;
    }
}
