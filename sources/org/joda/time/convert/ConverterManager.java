package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

public final class ConverterManager {
    private static ConverterManager INSTANCE;
    private ConverterSet iDurationConverters = new ConverterSet(new Converter[]{ReadableDurationConverter.INSTANCE, ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE});
    private ConverterSet iInstantConverters = new ConverterSet(new Converter[]{ReadableInstantConverter.INSTANCE, StringConverter.INSTANCE, CalendarConverter.INSTANCE, DateConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE});
    private ConverterSet iIntervalConverters = new ConverterSet(new Converter[]{ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, NullConverter.INSTANCE});
    private ConverterSet iPartialConverters = new ConverterSet(new Converter[]{ReadablePartialConverter.INSTANCE, ReadableInstantConverter.INSTANCE, StringConverter.INSTANCE, CalendarConverter.INSTANCE, DateConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE});
    private ConverterSet iPeriodConverters = new ConverterSet(new Converter[]{ReadableDurationConverter.INSTANCE, ReadablePeriodConverter.INSTANCE, ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, NullConverter.INSTANCE});

    protected ConverterManager() {
    }

    private void checkAlterDurationConverters() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }

    private void checkAlterInstantConverters() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }

    private void checkAlterIntervalConverters() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }

    private void checkAlterPartialConverters() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }

    private void checkAlterPeriodConverters() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }

    public static ConverterManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConverterManager();
        }
        return INSTANCE;
    }

    public DurationConverter addDurationConverter(DurationConverter durationConverter) throws SecurityException {
        checkAlterDurationConverters();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.iDurationConverters = this.iDurationConverters.add(durationConverter, durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter addInstantConverter(InstantConverter instantConverter) throws SecurityException {
        checkAlterInstantConverters();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.iInstantConverters = this.iInstantConverters.add(instantConverter, instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter addIntervalConverter(IntervalConverter intervalConverter) throws SecurityException {
        checkAlterIntervalConverters();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.iIntervalConverters = this.iIntervalConverters.add(intervalConverter, intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter addPartialConverter(PartialConverter partialConverter) throws SecurityException {
        checkAlterPartialConverters();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.iPartialConverters = this.iPartialConverters.add(partialConverter, partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter addPeriodConverter(PeriodConverter periodConverter) throws SecurityException {
        checkAlterPeriodConverters();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.iPeriodConverters = this.iPeriodConverters.add(periodConverter, periodConverterArr);
        return periodConverterArr[0];
    }

    public DurationConverter getDurationConverter(Object obj) {
        Class cls;
        String str;
        ConverterSet converterSet = this.iDurationConverters;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        DurationConverter durationConverter = (DurationConverter) converterSet.select(cls);
        if (durationConverter != null) {
            return durationConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public DurationConverter[] getDurationConverters() {
        ConverterSet converterSet = this.iDurationConverters;
        DurationConverter[] durationConverterArr = new DurationConverter[converterSet.size()];
        converterSet.copyInto(durationConverterArr);
        return durationConverterArr;
    }

    public InstantConverter getInstantConverter(Object obj) {
        Class cls;
        String str;
        ConverterSet converterSet = this.iInstantConverters;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        InstantConverter instantConverter = (InstantConverter) converterSet.select(cls);
        if (instantConverter != null) {
            return instantConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public InstantConverter[] getInstantConverters() {
        ConverterSet converterSet = this.iInstantConverters;
        InstantConverter[] instantConverterArr = new InstantConverter[converterSet.size()];
        converterSet.copyInto(instantConverterArr);
        return instantConverterArr;
    }

    public IntervalConverter getIntervalConverter(Object obj) {
        Class cls;
        String str;
        ConverterSet converterSet = this.iIntervalConverters;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        IntervalConverter intervalConverter = (IntervalConverter) converterSet.select(cls);
        if (intervalConverter != null) {
            return intervalConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public IntervalConverter[] getIntervalConverters() {
        ConverterSet converterSet = this.iIntervalConverters;
        IntervalConverter[] intervalConverterArr = new IntervalConverter[converterSet.size()];
        converterSet.copyInto(intervalConverterArr);
        return intervalConverterArr;
    }

    public PartialConverter getPartialConverter(Object obj) {
        Class cls;
        String str;
        ConverterSet converterSet = this.iPartialConverters;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        PartialConverter partialConverter = (PartialConverter) converterSet.select(cls);
        if (partialConverter != null) {
            return partialConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public PartialConverter[] getPartialConverters() {
        ConverterSet converterSet = this.iPartialConverters;
        PartialConverter[] partialConverterArr = new PartialConverter[converterSet.size()];
        converterSet.copyInto(partialConverterArr);
        return partialConverterArr;
    }

    public PeriodConverter getPeriodConverter(Object obj) {
        Class cls;
        String str;
        ConverterSet converterSet = this.iPeriodConverters;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        PeriodConverter periodConverter = (PeriodConverter) converterSet.select(cls);
        if (periodConverter != null) {
            return periodConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public PeriodConverter[] getPeriodConverters() {
        ConverterSet converterSet = this.iPeriodConverters;
        PeriodConverter[] periodConverterArr = new PeriodConverter[converterSet.size()];
        converterSet.copyInto(periodConverterArr);
        return periodConverterArr;
    }

    public DurationConverter removeDurationConverter(DurationConverter durationConverter) throws SecurityException {
        checkAlterDurationConverters();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.iDurationConverters = this.iDurationConverters.remove((Converter) durationConverter, (Converter[]) durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter removeInstantConverter(InstantConverter instantConverter) throws SecurityException {
        checkAlterInstantConverters();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.iInstantConverters = this.iInstantConverters.remove((Converter) instantConverter, (Converter[]) instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter removeIntervalConverter(IntervalConverter intervalConverter) throws SecurityException {
        checkAlterIntervalConverters();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.iIntervalConverters = this.iIntervalConverters.remove((Converter) intervalConverter, (Converter[]) intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter removePartialConverter(PartialConverter partialConverter) throws SecurityException {
        checkAlterPartialConverters();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.iPartialConverters = this.iPartialConverters.remove((Converter) partialConverter, (Converter[]) partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter removePeriodConverter(PeriodConverter periodConverter) throws SecurityException {
        checkAlterPeriodConverters();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.iPeriodConverters = this.iPeriodConverters.remove((Converter) periodConverter, (Converter[]) periodConverterArr);
        return periodConverterArr[0];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConverterManager[");
        sb.append(this.iInstantConverters.size());
        sb.append(" instant,");
        sb.append(this.iPartialConverters.size());
        sb.append(" partial,");
        sb.append(this.iDurationConverters.size());
        sb.append(" duration,");
        sb.append(this.iPeriodConverters.size());
        sb.append(" period,");
        sb.append(this.iIntervalConverters.size());
        sb.append(" interval]");
        return sb.toString();
    }
}
