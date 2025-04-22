package dstu.csae.matocip.utils;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

public class PrimeNumberOperator {

    private static final int TEST_COUNT = 100;

    public static BigInteger nextBigInt(int bitCount, BigInteger origin, BigInteger bound) {
        BigInteger next;
        do {
            next = nextBigInt(bitCount);
        }while (isOutOfBounds(next, origin, bound));
        return next;
    }

    public static BigInteger nextBigInt(int bitCount){
        Random random = new Random();
        BigInteger next;
        do {
            next = BigInteger.probablePrime(bitCount, random);
        } while (!isProbablePrime(next));
        return next;
    }

    public static boolean isProbablePrime(BigInteger number){
        for(int i = 0; i < TEST_COUNT; i ++){
            if(!number.isProbablePrime(i)){
                return false;
            }
        }
        return true;
    }


    private static boolean isOutOfBounds(BigInteger number, BigInteger origin, BigInteger bound){
        return number.compareTo(origin) < 0 || number.compareTo(bound) >= 0;
    }
}
