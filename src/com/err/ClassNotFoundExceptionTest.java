package com.err;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
