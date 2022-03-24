package rars.riscv.instructions;

public class ANDN extends Arithmetic {

    public ANDN() {
        super("andn t1,t2,t3", "AND with inverted operand: set t1 to bitwise AND of t2 and the bitwise inversion of t3",
                "0100000", "111");
    }

    @Override
    public long compute(long value, long value2) {
        return value & ~ value2;
    }
}

