package escola;
import java.util.Scanner;

public class Turma {
    public static void main(String[] args) throws Exception {
        
        Scanner textInput = new Scanner(System.in);
        Aluno cadastrarNovoAluno = new Aluno(); 
        Professor cadastrarNovoProfessor = new Professor();
        
        String keyNomeAluno = "Nome do Aluno:";
        String keyCPF = "CPF do Aluno";
        String keyMatricula = "Matricula";

        for (int i = 0; i < 3; i++) {

            System.out.println("Nome");
            String nome = textInput.next();
            cadastrarNovoAluno.listaDeAlunos.put(keyNomeAluno, nome);

            System.out.println("CPF");
            String cpf = textInput.next();
            cadastrarNovoAluno.listaDeAlunos.put(keyCPF, cpf);

            System.out.println("Matricula");
            String matricula = textInput.next();
            cadastrarNovoAluno.listaDeAlunos.put(keyMatricula, matricula);            

        }

        System.out.println("Nome Prof");
        cadastrarNovoProfessor.nomeProfessor = textInput.next();

        System.out.println("Formação");
        cadastrarNovoProfessor.formacaoProfessor = textInput.next();

        System.out.println("Cadastro");
        cadastrarNovoProfessor.cadastroProfessor = textInput.nextInt();

        cadastrarNovoAluno.listaDeAlunos.elements();
        cadastrarNovoProfessor.informacaoDoProfessor();
        textInput.close();
    }
}
