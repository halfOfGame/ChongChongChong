package liaoxuefeng.FactoryMethod;


// 我们以具体的例子来说：假设我们希望实现一个解析字符串到Number的Factory
public class Z_ForTest {
    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        // 通过工厂直接将String对象转换得到一个Number对象
        //调用方可以完全忽略真正的工厂NumberFactoryImpl和实际的产品BigDecimal，这样做的好处是允许创建产品的代码独立地变换，而不会影响到调用方。
        Number result = factory.parse("123.456");
        System.out.println(result);
    }
}
