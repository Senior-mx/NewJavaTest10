package com.data.testinterface;

public interface TestInterface {
    /**
     * @Name: TestInterface
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 13:38 2019-06-23
     **/
    public static void name() {
        System.out.println("JDK1.8接口可以有静态方法");
    }
    
    public static void main(String[] args) {
        TestInterface.name();
    }
}
