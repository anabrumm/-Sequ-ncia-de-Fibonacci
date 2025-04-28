public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sequência de Fibonacci.");
        int num1 = 0;
        int num2 = 1;
        int soma = 0;
        int i = 0;
        System.out.println(num1);
        System.out.println(num2);
         while(i<8){
          soma=(num1+num2);
          System.out.println(""+soma);
          num1 = num2;
          num2 = soma;
          i = i+1;
        }
    }
}
