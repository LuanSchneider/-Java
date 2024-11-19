import java.util.Scanner;
import java.lang.Math;

public class atividade {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero da atividade que deseja executar");
        int atividade = scanner.nextInt();
        switch (atividade) {
        
            case 1:
                areaTriangulo();
                case 2: 
                ativiade2();
                break;
                case 3:
                ativiade3();
                break;
                case 4:
                ativiade4();
                break;
                case 5:
                ativiade5();
                break;
                case 6:
                ativade6();
                break;
                case 7:
                ativade7();
                break;
                case 8:
                ativade8();
                break;
                case 9:
                ativade9();
                break;
                case 10:
                ativade10();
                break;
               
            default:
                System.out.println("atividade nao encontrada");
                break;
        }
    }
        public static void areaTriangulo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite base do triangulo");
            double base = scanner.nextDouble();
            System.out.println("digite altura do triangulo");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("area do triangulo " + area);
        }
        public static void ativiade2() {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite o primeiro numero");
            double num1 = scanner.nextDouble();

     for (int i = 1; i <= 5; i++) {
         double resultado = (int) Math.pow(num1, i);
        System.out.println(num1 + " elevado a " + i + " = " + resultado);
        resultado-=6 ;
        
        
         resultado = Math.sqrt(resultado);
         System.out.println("raiz quadrada de " + resultado);
         resultado/=4;
         System.out.println("quadrado de " + resultado);

     }

     }

     public static void ativiade3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero");
        double num2 = scanner.nextDouble();
         double resultado = Math.pow(num1, num2);
         
         resultado-=Math.pow(6,num1);
         System.out.println("resultado = " + resultado);


    }
    public static void ativiade4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o cosseno");
        double num1 = scanner.nextDouble();
        System.out.println("digite o seno");
        double num2 = scanner.nextDouble();
         num1= Math.cos(num1/5);
        num2= Math.sin(num2*num2);
        num1*=4;
num1-=num2;
System.out.println("resultado = " + num1);

    

        
    }
    public static void ativiade5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero");
        double num2 = scanner.nextDouble();
        double resultado= num1*6;
        resultado-=Math.pow(num2,3);
        resultado=Math.sqrt(resultado);
        num1= Math.pow(num1,4);
    num1-=resultado;
        System.out.println("resultado = " + num1);
    }
    public static void ativade6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de e: ");
        double e = scanner.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = scanner.nextDouble();
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();
        double resultado = (e * e) / (1 * ((y - 1) / (x - 2 * y)));
        System.out.println("Resultado: " + resultado);
        scanner.close();
      
    }
    public static void ativade7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        System.out.print("Digite o valor de s: ");
        double s = scanner.nextDouble();
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = 7 * (Math.pow(c, 6) * (Math.sqrt(5 - s * s * Math.sqrt(3 * x - 4))));
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
      
    }
    public static void ativade8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de pessoas inscritas para a viagem: ");
        int totalPessoas = scanner.nextInt();

        int capacidadeOnibus = 45;
        int onibusNecessarios = totalPessoas / capacidadeOnibus;
        int pessoasEmVans = totalPessoas % capacidadeOnibus;

        System.out.println("Número de ônibus necessários: " + onibusNecessarios);
        System.out.println("Número de pessoas que deverão ser transportadas em vans: " + pessoasEmVans);

        scanner.close();
      
    }
    public static void ativade9() {

      
    }
    public static void ativade10() {
      
    }
}

    
    
           
        
    
    
