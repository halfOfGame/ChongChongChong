package liaoxuefeng.FactoryMethod;

public interface NumberFactory {
    static NumberFactory impl = new NumberFactoryImpl();

    // 创建方法:
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

}
