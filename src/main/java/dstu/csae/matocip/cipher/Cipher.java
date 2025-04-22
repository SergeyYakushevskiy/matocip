package dstu.csae.matocip.cipher;

import java.math.BigInteger;

public interface Cipher {

    BigInteger encrypt(BigInteger plaintext);

    BigInteger decrypt(BigInteger ciphertext);

}
