public class Manager extends Employee{
    private final double levelNum = 1.2;

    public Manager(String name, double sal, int day) {
        super(name, sal, day);
    }

    @Override
    public double sumSal() {
        return super.sumSal()*levelNum + 1000;
    }

    @Override
    public String info() {
        return super.info();
    }
}
