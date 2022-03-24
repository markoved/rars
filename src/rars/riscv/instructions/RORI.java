package rars.riscv.instructions;

public class RORI extends ImmediateEncodedInstruction {

    public RORI() {
        super("rori t1,t2,t3", "Right rotation of t2 by the amount in least-significant 5 bits of shamt. The result saved in t1",
                "0110000", "101");
        // TODO: write new ShamtInstruction abstract class for this class to inherit
    }

    @Override
    public long compute(long value, long immediate) {
        return Long.rotateRight(value, (int) immediate & 0X1F);
    }
}

