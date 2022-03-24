package rars.riscv.instructions;

public class SEXTH extends ImmediateEncodedInstruction{

    public SEXTH() {
        super("sext.h t1,t2", "Sign-extend the least-significant halfword in t2 and save it in t1",
                "011000000101", "001");
    }

    @Override
    protected long compute(long value, long immediate) {
        // TODO: compute the result
        return value;
    }
}
