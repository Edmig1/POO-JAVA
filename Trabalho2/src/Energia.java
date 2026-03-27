        import java.util.Scanner;


        public class Energia {
            static Scanner entrada = new Scanner(System.in);

            public static int insereQtd() {
                int qtd;
                System.out.print("Insira a quantidade de clientes: ");
                qtd = entrada.nextInt();

                return qtd;
            }
            public static double[] insereEnergia(int qtd) {
                double[] energia = new double[qtd];
                double kwh;
                for (int i=0; i< energia.length;i++){
                    System.out.print("Insira quantos KWh o cliente "+(i+1)+" gastou: ");
                    kwh = entrada.nextDouble();
                    while(kwh<1){
                        System.out.println("O valor de KWh precisa ser maior do que 0");
                        System.out.print("Insira quantos KWh o cliente "+(i+1)+" gastou: ");
                        kwh = entrada.nextDouble();
                    }
                    energia[i] = kwh;
                }

                return energia;
            }
            public static char[] insereTipo(int qtd) {
                char[] tipo = new char[qtd];
                for (int i=0; i< tipo.length;i++){
                    char classif;
                    System.out.println("Tipos de cliente: I - Industrial | R - Residencial | C - Comercial");
                    System.out.print("Insira o tipo do cliente "+(i+1)+": ");
                    classif = entrada.next().charAt(0);
                    entrada.nextLine();
                    while( classif !='I' && classif != 'C' && classif != 'R'){
                        System.out.print("Tipos de cliente: I - Industrial | R - Residencial | C - Comercial");
                        System.out.print("Tipo Inválido! Insira o tipo do cliente "+(i+1)+": ");
                        classif = entrada.next().charAt(0);
                        entrada.nextLine();
                    }
                    tipo[i] = classif;
                }

                return tipo;
            }
            public static double cobrancaResidencial(char tipo, double energia, double v){
                double extra;
                double valor;
                if(energia >100){
                    extra = energia -100;
                    valor = (100*0.5) + extra*0.75;
                }else{
                    valor = energia*0.5;
                }
                return valor;

            }
            public static double cobrancaComercial(char tipo, double energia, double v){
                double extra;
                double valor;
                if(energia >200){
                    extra = energia -200;
                    valor = (200*0.65) + extra*0.8;
                }else{
                    valor = energia*0.65;
                }
                return valor;

            }
            public static double cobrancaIndustrial(char tipo, double energia){
                double extra;
                double valor;
                if(energia >500){
                    extra = energia -500;
                    valor = (500*0.55) + extra*0.70;
                }else{
                    valor = energia*0.55;
                }
                return valor;

            }
            public static double[] controleCobrancas(char[] tipo, double[] energia,double[]valor){
                for (int i=0; i< tipo.length;i++){
                    switch (tipo[i]){
                        case 'I':
                            valor[i]= cobrancaIndustrial(tipo[i],energia[i]);
                            break;

                        case 'R':
                            valor[i]= cobrancaResidencial(tipo[i],energia[i],valor[i]);
                            break;

                        case 'C':
                            valor[i]= cobrancaComercial(tipo[i],energia[i],valor[i]);
                            break;

                    }

                }
                return valor;
            }
            public static void printaLista(char[] tipo, double[] energia){
                System.out.println("Quantidade de KWh que cada cliente gastou: ");
                for (int i=0; i< tipo.length;i++){
                    System.out.println("O cliente "+(i+1)+" do tipo "+tipo[i]+" gastou um total de "+energia[i]+ "KWh");
                    System.out.print("\n");

                }
                System.out.println("______________________________________________________________");
            }
            public static void printaGastos(char[] tipo, double[] valor){
                System.out.println("Valor que cada cliente gastou: ");
                for (int i=0; i< tipo.length;i++){
                    System.out.println("O cliente "+(i+1)+" do tipo "+tipo[i]+" gastou um total de R$"+valor[i]);
                    System.out.print("\n");

                }
                System.out.println("______________________________________________________________");
            }
            public static double[] taxas(double[] energia, double[] valor){
                for (int i=0; i< valor.length; i++){
                    if (energia[i]>300){
                        valor[i] -= valor[i]*0.05;
                    }if(energia[i]>500){
                        valor[i]+= 50;
                    }
                }

                return valor;
            }

            public static void estatisticas(double[]valor){
                double maior=valor[0], menor=valor[0], soma = 0,qtdmediamais=0;
                for (int i=0; i< valor.length; i++){
                    if(valor[i]>maior){
                        maior = valor[i];
                    }
                    if(valor[i] < menor){
                        menor = valor[i];
                    }
                    soma+= valor[i];
                }
                double media =soma/valor.length;
                for (int i=0; i<valor.length;i++){
                    if (valor[i]>media){
                        qtdmediamais+=1;
                    }
                }
                System.out.println("O maior valor pago foi:  "+maior);
                System.out.println("O menor valor pago foi:  "+menor);
                System.out.println("A média dos valores é: "+media);
                System.out.println("A quantidade de valores que ultrapassa a média é: "+qtdmediamais);

            }

            /**
             * Main - Chama as outras funções
             */
            public static void main(String[] args) {
                int qtd = insereQtd();
                double[] energia = insereEnergia(qtd);
                char[] tipo =  insereTipo(qtd);
                double[] valor = new double[qtd];
                printaLista(tipo,energia);
                controleCobrancas(tipo,energia,valor);
                valor = taxas(energia, valor);
                printaGastos(tipo,valor);
                estatisticas(valor);

            }
        }