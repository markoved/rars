package rars.riscv.instructions;

import rars.ProgramStatement;
import rars.riscv.BasicInstruction;
import rars.riscv.BasicInstructionFormat;
import rars.riscv.InstructionSet;
import rars.riscv.hardware.RegisterFile;

abstract class ImmediateEncodedInstruction extends BasicInstruction {
    public ImmediateEncodedInstruction(String usage, String description, String immediate, String funct) {
        super(usage, description, BasicInstructionFormat.I_FORMAT,
                immediate + " sssss " + funct + " fffff 0010011");
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