package liaoxuefeng.AbstractFactory;

public class FastFactory implements AbstractFactory {

    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }

    public WordDocument createWord(String md) {
        return new FastWordDocument(md);
    }
}
