package rars.riscv.instructions;

public class MAXU extends Arithmetic {

    public MAXU() {
        super("maxu t1,t2,t3", "maxu: save the larger of t2 and t3 in t1 (unsigned)",
                "0000101", "111");
    }

    @Override
    public long compute(long value, long value2) {
        String unsignedValue = Long.toUnsignedString(value);
        String unsingedValue2 = Long.toUnsignedString(value2);
        return Math.max(Long.parseLong(unsignedValue), Long.parseLong(unsingedValue2));
    }
}

