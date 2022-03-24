package rars.riscv.instructions;

public class MIN extends Arithmetic {

    public MIN() {
        super("min t1,t2,t3", "min: save the smaller of t2 and t3 in t1",
                "0000101", "100");
    }

    @Override
    public long compute(long value, long value2) {
        return Math.min(value, value2);
    }
}

