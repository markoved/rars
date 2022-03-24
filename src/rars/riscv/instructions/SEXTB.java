package rars.riscv.instructions;

public class SEXTB extends ImmediateEncodedInstruction{

    public SEXTB() {
        super("sext.b t1,t2", "Sign-extend the least-significant byte in t2 and save it in t1",
                "011000000100", "001");
    }

    @Override
    protected long compute(long value, long immediate) {
        // TODO: compute the result
        return value;
    }
}
