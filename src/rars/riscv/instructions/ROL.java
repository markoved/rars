package rars.riscv.instructions;

public class ROL extends Arithmetic {

    public ROL() {
        super("rol t1,t2,t3", "Left rotation of t2 by the amount in least-significant 5 bits of t3. The result saved in t1",
                "0110000", "001");
    }

    @Override
    public long compute(long value, long value2) {
        return Long.rotateLeft(value, (int) value2 & 0X1F);
    }
}

