package 建造者模式;

abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
