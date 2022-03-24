package rars.riscv.instructions;

public class ROR extends Arithmetic {

    public ROR() {
        super("ror t1,t2,t3", "Right rotation of t2 by the amount in least-significant 5 bits of t3. The result saved in t1",
                "0110000", "101");
    }

    @Override
    public long compute(long value, long value2) {
        return Long.rotateRight(value, (int) value2 & 0X1F);
    }
}

