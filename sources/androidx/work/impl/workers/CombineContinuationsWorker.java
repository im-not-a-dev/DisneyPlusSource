package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public Result doWork() {
        return Result.m5468a(getInputData());
    }
}
