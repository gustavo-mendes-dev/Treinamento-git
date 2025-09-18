public class CriandoNinjas {

    public static void main(String[] args) {

        //Nninja 1
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        String nomeNinja1 = "Naruto";
        String aldeiea1 = "Vila da Folha";
        String missao1 = "Capiturar o inimigo";
        char nivelDaMissao1 = 'A';
        String statusConclusao1 = "Concluido";
        int idade1 = 16;

        System.out.println("Nome do Ninja1: " + nomeNinja1);
        System.out.println("Idade do Ninja1: " + idade1);
        System.out.println("Missão do Ninja1: " + missao1);
        System.out.println("Nivel da Missão: " + nivelDaMissao1);

        if (idade1 >= 15){
            if (nivelDaMissao1 == 'A'){
                System.out.println("Missão: " + statusConclusao1);
            }
        }else {
            System.out.println("Missão não concluida");
        }


        //Nninja 2
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        String nomeNinja2 = "Sasuke";
        String aldeiea2 = "Vila da Folha";
        String missao2 = "Fazer Reconhecimento ";
        char nivelDaMissao2 = 'S';
        String statusConclusao2 = "Concluido";
        int idade2 = 24;

        System.out.println("Nome do Ninja2: " + nomeNinja2);
        System.out.println("Idade do Ninja2: " + idade2);
        System.out.println("Missão do Ninja2: " + missao2);
        System.out.println("Nivel da Missão: " + nivelDaMissao2);

        if (idade2 <= 14){
            if (nivelDaMissao2 == 'D'){
                System.out.printf("Missão: " + statusConclusao2);
            }
        }else {
            System.out.println("Missão não concluida");
        }
        //Ninja 3
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");


        String nomeNinja3 = "sukuna";
        String aldeiea3 = "Vila da Folha";
        String missao3 = "Resatar os feridos";
        char nivelDaMissao3 = 'D';
        String statusConclusao3 = "Concluido";
        int idade3 = 15;

        System.out.println("Nome do Ninja3: " + nomeNinja3);
        System.out.println("Idade do Ninja3: " + idade3);
        System.out.println("Missão do Ninja3: " + missao3);
        System.out.println("Nivel da Missão: " + nivelDaMissao3);

        if (idade3 <= 14){
            if (nivelDaMissao3 == 'D'){
                System.out.printf("Missão: " + statusConclusao3);
            }
        }else {
            System.out.println("Missão não concluida");
        }




    }
}
