package 建造者模式;

public class ConcreteDecorator1 extends Decorator{
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
//具体建造者：具体装修工人2
class ConcreteDecorator2 extends Decorator {
    public void buildWall() {
        product.setWall("w2");
    }
    public void buildTV() {
        product.setTV("TV2");
    }
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
