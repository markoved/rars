package rars.riscv.instructions;

public class MINU extends Arithmetic {

    public MINU() {
        super("minu t1,t2,t3", "minu: save the smaller of t2 and t3 in t1 (unsigned)",
                "0000101", "101");
    }

    @Override
    public long compute(long value, long value2) {
        String unsignedValue = Long.toUnsignedString(value);
        String unsingedValue2 = Long.toUnsignedString(value2);
        return Math.min(Long.parseLong(unsignedValue), Long.parseLong(unsingedValue2));
    }
}

