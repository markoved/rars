package rars.riscv.instructions;

public class MAX extends Arithmetic {

    public MAX() {
        super("max t1,t2,t3", "max: save the larger of t2 and t3 in t1",
                "0000101", "110");
    }

    @Override
    public long compute(long value, long value2) {
        return Math.max(value, value2);
    }
}

