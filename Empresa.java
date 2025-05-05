public class Empresa {
    public static void main(String[] args) {
        Funcionario v = new Vendedor(200, 500);
        Funcionario f = new FreeLancer(20, 150);
        Funcionario g = new Gerente(2000);

        System.out.println("Salário do vendedor:" + obterSalarioDoFuncionario(v));
        System.out.println("Salário do vendedor:" + obterSalarioDoFuncionario(f));
        System.out.println("Salário do vendedor:" + obterSalarioDoFuncionario(g));
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario){
        return funcionario.calcularSalarioFinal();
    }
}