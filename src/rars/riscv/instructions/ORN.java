package rars.riscv.instructions;

public class ORN extends Arithmetic {

    public ORN() {
        super("orn t1,t2,t3", "OR with inverted operand: set t1 to bitwise OR of t2 and the bitwise inversion of t3",
                "0100000", "110");
    }

    @Override
    public long compute(long value, long value2) {
        return value | ~ value2;
    }
}

