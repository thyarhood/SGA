package ifsuldeminas.main;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionarios.Professor;
import ifsuldeminas.academico.Disciplina;

public class Main {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Aluno a1;
  a1= new Aluno ("Eduardo Anacleto de Rezende", 1001, 3, "Integrado em Informática");
  Aluno a2;
  a2= new Aluno ("Ana Clara do Espirito Santo Vilas Boas", 1001, 3, "Integrado em Informática");
  Aluno a3;
  a3= new Aluno ("Breno Henrique Moreira de Jesus", 1001, 3, "Integrado em Informática");
  Aluno a4;
  a4= new Aluno ("Maria Eduarda Marangon", 1001, 3, "Integrado em Informática");
  Aluno a5;
  a5= new Aluno ("Renan Cristiano Costa", 1001, 3, "Integrado em Informática");
  Aluno a6;
  a6= new Aluno ("Bruna Cristina Carvalho", 1006, 2, "Integrado em Administração");
  Aluno a7;
  a7= new Aluno ("Juan Carlos Hernandez Estrada", 1007, 2, "Integrado em Administração");
  Aluno a8;
  a8= new Aluno ("Gabrielle Rodrigues", 1008, 2, "Integrado em Administração");
  Aluno a9;
  a9= new Aluno ("Heloísa Felicio Faria", 1009, 2, "Integrado em Administração");
  Aluno a10;
  a10= new Aluno ("João Augusto", 1010, 2, "Integrado em Administração");
  Aluno a11;
  a11= new Aluno ("Lucas Felipe Vilas Boas", 1011, 1, "Integrado em Eletroeletrônica");
  Aluno a12;
  a12= new Aluno ("Maria Clara de Branco Veloso", 1012, 1, "Integrado em Eletroeletrônica");
  Aluno a13;
  a13= new Aluno ("Bruna Tavares Frazao", 1013, 1, "Integrado em Eletroeletrônica");
  Aluno a14;
  a14= new Aluno ("Leticia Maria Batista", 1014, 1, "Integrado em Eletroeletrônica");
  Aluno a15;
  a15= new Aluno ("Maria Luisa Martins", 1015, 1, "Integrado em Eletroeletrônica");
  
  Professor p1 = new Professor("Ricardo Ramos de Oliveira", 2001);
  Professor p2 = new Professor("Mateus dos Santos", 2002);
  Professor p3 = new Professor("André Gripp", 2003);
  
  Disciplina d1 = new Disciplina("Matemática", 1, 4, 4,p3);
  Disciplina d2 = new Disciplina("Programação Mobile", 1, 4, 4,p2);
  Disciplina d3 = new Disciplina("Espanhol", 1, 5, 2,p1);
  
 System.out.println(d1.matricularAluno(a1));
 System.out.println(d1.matricularAluno(a2));
 System.out.println(d1.matricularAluno(a3));
 System.out.println(d1.matricularAluno(a4));
 System.out.println(d1.matricularAluno(a5));
  
 System.out.println(" ");
 System.out.println(d2.matricularAluno(a6));
 System.out.println(d2.matricularAluno(a7));
 System.out.println(d2.matricularAluno(a8));
 System.out.println(d2.matricularAluno(a9));
 System.out.println(d2.matricularAluno(a10));
  
 System.out.println(" ");
 System.out.println(d3.matricularAluno(a11));
 System.out.println(d3.matricularAluno(a12));
 System.out.println(d3.matricularAluno(a13));
 System.out.println(d3.matricularAluno(a14));
 System.out.println(d3.matricularAluno(a15));
 
 d3.addNota(0, 8);
 d3.addNota(1, 9);
 d3.addNota(2, 10);
 d3.addNota(3, 7);
 d3.addNota(4, 6);
 
 System.out.println(" ");
 System.out.println(d3.addFrequencia(0, 8));
 System.out.println(d3.addFrequencia(1, 9));
 System.out.println(d3.addFrequencia(2, 10));
 System.out.println(d3.addFrequencia(3, 7));
 System.out.println(d3.addFrequencia(4, 6));
 
 
 System.out.println(" ");
 System.out.println(d1.desmatricularAluno(4));
 
 d3.removerProfessor();
 
 System.out.println(" ");
 d3.exibirAprovados();
 
 System.out.println(" ");
 d3.exibirReprovados();
 
 System.out.println(" ");
 System.out.println(d3.getQuantidadeReprovados());
 
 System.out.println(" ");
 System.out.println(d3.estaAprovado(2));
 
 System.out.println(" ");
 System.out.println(d3.getNotaAluno(3));
 
 System.out.println(" ");
 System.out.println(d3.getQuantidadeAprovados());
 
 System.out.println(" ");
 d3.exibirProfessor();
 
 System.out.println(" ");
 d3.getAproveitamentoAluno();
 
 System.out.println(" ");
 d3.exibirAlunosAcimaDaMedia();
 
 System.out.println(" ");
 d3.exibirAlunosAbaixoDaMedia();

System.out.println(" ");
d3.exibirOrdenadoPorNotas(4);

System.out.println(" ");
d3.exibirOrdenadosPorNotas();

System.out.println(" ");
System.out.println(d3.calcularMedia());

System.out.println(" ");
d3.exibeDisciplina();

System.out.println(" ");
d3.exibirMaiorNota();

System.out.println(" ");
 d3.exibirMenorNota();
 
 
 
 }

}
