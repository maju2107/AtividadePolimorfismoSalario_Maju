public class Gerente extends Funcionario{

    private double salarioBase;
    private int bonusFixo = 1000;

    public Gerente(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal(){
        return salarioBase + bonusFixo;
    }
}