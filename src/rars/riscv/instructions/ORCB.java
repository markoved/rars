package rars.riscv.instructions;

public class ORCB extends ImmediateEncodedInstruction{

    public ORCB() {
        super("orc.b t1,t2", "Bitwise OR-Combine: combines the bits within every byte through a " +
                        "reciprocal bitwise logical OR. This sets the bits of each byte in the result t1 to all " +
                        "zeros if no bit within the respective byte of t2 is set, or to all ones if any bit within " +
                        "the respective byte of rs is set.",
                "001010000111", "101");
    }

    @Override
    protected long compute(long value, long immediate) {
        // TODO: compute the result
        return value;
    }
}
