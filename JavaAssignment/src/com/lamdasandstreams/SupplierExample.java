//Prog to supply 6-digit Random OTP using Supplier
package com.lamdasandstreams;

import java.util.function.*;
import java.util.*;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> otps = () -> {
            String otp = "";
            for (int i = 0; i <=6 ; i++)
                otp += (int)(Math.random()*10);
            return otp;
        };
        System.out.println("Otp:"+otps.get());
    }
}
