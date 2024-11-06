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
        

}

    
    
           
        
    
    
