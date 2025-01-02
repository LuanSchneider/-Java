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
                case 11:
                ativade11();
                break;  
                case 12:
                ativade12();
                break;  
                case 13:    
                ativade13();
                break;
                case 14:
                ativade14();
                break;
                case 15:
                ativade15();
                break;
                case 16:
            
               
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
        int x = 5;
        boolean resultado = (x <= 7) ? true : false;
        System.out.println("O resultado é: " + resultado);
        
      
    }
    public static void ativade10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Informe o operador (*, +, -, /, %): ");
        char operador = scanner.next().charAt(0);

        if (operador == '+') {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (operador == '-') {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if (operador == '*') {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else if (operador == '/') {
            if (numero2 != 0) {
                System.out.println("Resultado: " + (numero1 / numero2));
            } else {
                System.out.println("Divisão por zero não é permitida.");
            }
        } else if (operador == '%') {
            if (numero2 != 0) {
                System.out.println("Resultado: " + (numero1 % numero2));
            } else {
                System.out.println("Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operador inválido.");
        }
      
    }
    public static void ativade11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu peso na Terra (em kg): ");
        double pesoTerra = scanner.nextDouble();

        System.out.println("Escolha um planeta:");
        System.out.println("1. Mercúrio");
        System.out.println("2. Vênus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Netuno");
        System.out.print("Digite o número correspondente ao planeta: ");
        int escolha = scanner.nextInt();

        double fator = 0;
        String planeta = "";

        switch (escolha) {
            case 1:
                fator = 0.38;
                planeta = "Mercúrio";
                break;
            case 2:
                fator = 0.91;
                planeta = "Vênus";
                break;
            case 3:
                fator = 0.38;
                planeta = "Marte";
                break;
            case 4:
                fator = 2.36;
                planeta = "Júpiter";
                break;
            case 5:
                fator = 0.92;
                planeta = "Saturno";
                break;
            case 6:
                fator = 0.89;
                planeta = "Urano";
                break;
            case 7:
                fator = 1.13;
                planeta = "Netuno";
                break;
            default:
                System.out.println("Escolha inválida.");
                System.exit(0);
        }

        double pesoPlaneta = pesoTerra * fator;
        System.out.println("Seu peso em " + planeta + " é " + pesoPlaneta + " kg.");
        scanner.close();
      
    }
    public static void ativade12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você foi orador da turma? (true/false): ");
        boolean oradorTurma = scanner.nextBoolean();

        System.out.print("Quantos alunos havia na sua escola? ");
        int tamanhoEscola = scanner.nextInt();

        System.out.print("Qual sua média geral? ");
        double mediaGeral = scanner.nextDouble();

        System.out.print("Qual sua pontuação no SAT? ");
        int pontuacaoSAT = scanner.nextInt();

        boolean admitido = (oradorTurma && tamanhoEscola >= 1400) ||
                           (mediaGeral >= 4.0 && pontuacaoSAT >= 1100) ||
                           (mediaGeral >= 3.5 && pontuacaoSAT >= 1300) ||
                           (mediaGeral >= 3.0 && pontuacaoSAT >= 1500);

        if (admitido) {
            System.out.println("Parabéns! Você foi aceito na Mountville University.");
        } else {
            System.out.println("Infelizmente, você não atende aos critérios de admissão.");
        }

        scanner.close();
      
    }
    public static void ativade13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura da sala (em metros): ");
        double altura = scanner.nextDouble();
        System.out.print("Informe o comprimento da sala (em metros): ");
        double comprimento = scanner.nextDouble();
        System.out.print("Informe a largura da sala (em metros): ");
        double largura = scanner.nextDouble();

        double areaParedes = 2 * (altura * comprimento + altura * largura);
        double areaTeto = comprimento * largura;
        double areaTotal = areaParedes + areaTeto;

        int latas5Litros = (int) (areaTotal / 140);
        double sobraArea = areaTotal % 140;

        int latas1Litro = (int) Math.ceil(sobraArea / 28);

        double custoTotal = (latas5Litros * 15) + (latas1Litro * 4);

        System.out.println("Área total a ser pintada: " + areaTotal + " m²");
        System.out.println("Latas de 5 litros necessárias: " + latas5Litros);
        System.out.println("Latas de 1 litro necessárias: " + latas1Litro);
        System.out.println("Custo total: $" + custoTotal);
    }
    public static void ativade14() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder mensagemDecodificada = new StringBuilder();
        int[] mapaNumeros = {0, 'D', 'W', 'E', 'L', 'H', 'O', 'R'};

        System.out.println("Insira 10 números para decodificar a mensagem (1 a 7):");

        int contador = 0;
        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 7) {
                mensagemDecodificada.append((char) mapaNumeros[numero]);
                contador++;
            } else {
                System.out.println("Número inválido. Insira um número entre 1 e 7.");
            }
        }

        System.out.println("Mensagem decodificada: " + mensagemDecodificada.toString());
    }
    public static void ativade15() {
 
                String texto = "Pesquise até aqui.";
                for (int i = 0; i < texto.length(); i++) {
                    if (texto.charAt(i) == ' ') {
                        System.out.println("Espaço encontrado na posição: " + i);
                        break;
                    }
                }
            }

            
            
        }
        



    
    
           
        
    
    
