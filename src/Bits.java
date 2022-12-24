public class Bits {
    public static void main(String[] args) {
        BitValue bitvalue = new BitValue();
        System.out.println(bitvalue.getBit1());
        System.out.println(bitvalue.getBit2());
        System.out.println(bitvalue.getBit3());
        System.out.println("--------------------");
        bitvalue.setBit1(true);
        bitvalue.setBit2(true);
        System.out.println(bitvalue.getBit1());
        System.out.println(bitvalue.getBit2());
        System.out.println(bitvalue.getBit3());
    }
}
