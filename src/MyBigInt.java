import java.math.BigInteger;

public class MyBigInt {
    private BigInteger value;

    public MyBigInt() {
        this.value = BigInteger.ZERO;
    }

    public MyBigInt(String hex) {
        this.value = new BigInteger(hex, 16);
    }

    public void setHex(String hex) {
        this.value = new BigInteger(hex, 16);
    }

    public String getHex() {
        return this.value.toString(16);
    }

    public MyBigInt XOR(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.xor(other.value);
        return result;
    }

    public MyBigInt ADD(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.add(other.value);
        return result;
    }

    public MyBigInt SUB(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.subtract(other.value);
        return result;
    }

    public MyBigInt MUL(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.multiply(other.value);
        return result;
    }

    public MyBigInt DIV(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        if (!other.value.equals(BigInteger.ZERO)) {
            result.value = this.value.divide(other.value);
        }
        return result;
    }

    public MyBigInt MOD(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        if (!other.value.equals(BigInteger.ZERO)) {
            result.value = this.value.mod(other.value);
        }
        return result;
    }

    public MyBigInt INV() {
        MyBigInt result = new MyBigInt();
        result.value = this.value.not();
        return result;
    }

    public MyBigInt OR(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.or(other.value);
        return result;
    }

    public MyBigInt AND(MyBigInt other) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.and(other.value);
        return result;
    }

    public MyBigInt shiftR(int n) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.shiftRight(n);
        return result;
    }

    public MyBigInt shiftL(int n) {
        MyBigInt result = new MyBigInt();
        result.value = this.value.shiftLeft(n);
        return result;
    }
}
