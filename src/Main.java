public class Main {
    public static void main(String[] args) {
        MyBigInt numberA = new MyBigInt();
        MyBigInt numberB = new MyBigInt();

        System.out.println("XOR");
        numberA.setHex("51bf608414ad5726a3c1bec098f77b1b54ffb2787f8d528a74c1d7fde6470ea4");
        numberB.setHex("403db8ad88a3932a0b7e8189aed9eeffb8121dfac05c3512fdb396dd73f6331c");
        MyBigInt numberC = numberA.XOR(numberB);
        System.out.println(numberC.getHex());

        System.out.println("ADD");
        numberA.setHex("36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80");
        numberB.setHex("70983d692f648185febe6d6fa607630ae68649f7e6fc45b94680096c06e4fadb");
        numberC = numberA.ADD(numberB);
        System.out.println(numberC.getHex());

        System.out.println("SUB");
        numberA.setHex("33ced2c76b26cae94e162c4c0d2c0ff7c13094b0185a3c122e732d5ba77efebc");
        numberB.setHex("22e962951cb6cd2ce279ab0e2095825c141d48ef3ca9dabf253e38760b57fe03");
        numberC = numberA.SUB(numberB);
        System.out.println(numberC.getHex());

        System.out.println("MUL");
        numberA.setHex("7d7deab2affa38154326e96d350deee1");
        numberB.setHex("97f92a75b3faf8939e8e98b96476fd22");
        numberC = numberA.MUL(numberB);
        System.out.println(numberC.getHex());

    }
}

