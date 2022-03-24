package rars.riscv.instructions;

public class XNOR extends Arithmetic {

    public XNOR() {
        super("xnor t1,t2,t3", "Set t1 to bit-wise exclusive-NOR of t2 and t3",
                "0100000", "100");
    }

    @Override
    public long compute(long value, long value2) {
        return ~ (value ^ value2);
    }
}

