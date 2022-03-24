package rars.riscv.instructions;

import rars.ProgramStatement;
import rars.riscv.BasicInstruction;
import rars.riscv.BasicInstructionFormat;
import rars.riscv.InstructionSet;
import rars.riscv.hardware.RegisterFile;

public class CTZ extends CTZInstruction{

    public CTZ() {
        super("ctz t1,t2", "Count trailing zero bits: counts trailing zero bits of t2 and stores the value in t1",
                "001");

    }

    @Override
    protected long compute(long value, long immediate) {
        String valueString = Long.toBinaryString(value);
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (valueString.charAt(i) == '1') break;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CTZ ctz = new CTZ();
        System.out.println(ctz.compute(9, 234));
    }
}

abstract class CTZInstruction extends BasicInstruction {
    public CTZInstruction(String usage, String description, String funct) {
        super(usage, description, BasicInstructionFormat.I_FORMAT,
                "011000000001 sssss " + funct + " fffff 0010011");
    }
    public CTZInstruction(String usage, String description, String funct, boolean rv64) {
        super(usage, description, BasicInstructionFormat.I_FORMAT,
                "011000000001 sssss " + funct + " fffff 0010011",rv64);
    }

    public void simulate(ProgramStatement statement) {
        int[] operands = statement.getOperands();
        if (InstructionSet.rv64){
            RegisterFile.updateRegister(operands[0], compute(RegisterFile.getValueLong(operands[1]),
                    (operands[2] << 20) >> 20)); // make sure the immediate is sign-extended
        } else {
            RegisterFile.updateRegister(operands[0], computeW(RegisterFile.getValue(operands[1]),
                    (operands[2] << 20) >> 20)); // make sure the immediate is sign-extended
        }
    }

    /**
     * @param value     the value from the register
     * @param immediate the value from the immediate
     * @return the result to be stored from the instruction
     */
    protected abstract long compute(long value, long immediate);
    /**
     * @param value     the truncated value from the register
     * @param immediate the value from the immediate
     * @return the result to be stored from the instruction
     */
    protected int computeW(int value, int immediate){
        return (int) compute(value,immediate);
    }
}