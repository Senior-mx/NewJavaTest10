package com.data.exception;

public class TesteException extends Exception {
    /**
     * @Name: TesteException
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 13:28 2019-06-23
     **/
    public TesteException(String message) {
        System.out.println("抛出异常信息：" + message);
    }
    
    public static void main(String[] args)
        throws TesteException {
        try {
            System.out.println(1 / 0);
        }
        catch (Exception e) {
            throw new TesteException("计算有错");
        }
    }
}
