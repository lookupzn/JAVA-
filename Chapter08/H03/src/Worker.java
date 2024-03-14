public class Worker extends Employee{
    private final double levelNum = 1.0;

    public Worker(String name, double sal, int day) {
        super(name, sal, day);
    }

    @Override
    public double sumSal() {
        return super.sumSal()*levelNum;
    }

    @Override
    public String info() {
        return super.info();
    }
}
