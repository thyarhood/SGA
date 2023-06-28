package ifsuldeminas.academico;
import java.util.ArrayList;
import ifsuldeminas.funcionarios.Professor;
import ifsuldeminas.alunos.Aluno;


public class Disciplina {
private String nome;
private int periodo;
private int numAulasSemana;
private int numTotalAulas;
private Professor professor;
private ArrayList<Aluno> alunos;
private ArrayList<Double>notas;
private ArrayList<Integer>frequencia;

 public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas){
  this.nome = nome;
  this.periodo = periodo;
  this.numAulasSemana = numAulasSemana;
  this.numTotalAulas = numAulasSemana * numSemanas;
  alunos = new ArrayList<Aluno>();
  notas = new ArrayList<Double>();
  frequencia = new ArrayList<Integer>();
  professor = null;
 }
 
 public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas, Professor professor){
  this.nome = nome;
  this.periodo = periodo;
  this.numAulasSemana = numAulasSemana;
  this.numTotalAulas = numAulasSemana * numSemanas;
  alunos = new ArrayList<Aluno>();
  notas = new ArrayList<Double>();
  frequencia = new ArrayList<Integer>();
  this.professor = professor;
 }
 
 public boolean matricularAluno(Aluno aluno){
 alunos.add(aluno);
 if(verificaRaAluno(aluno) == true) {
  alunos.remove(this.alunos.size() - 1);
  return false; 
 }  
 else {
 this.notas.add(0.0);
 this.frequencia.add(0);
 return true;
 }
}
 
 private boolean verificaRaAluno(Aluno aluno) {
  boolean a = false;
  if(this.alunos.size() > 1) {
  for(int i = 0; i < this.alunos.size() - 1; i++) {
   if(this.alunos.get(i).getRa() == aluno.getRa()) {
    a = true;
   }
  }
 }
  return a;
 }
 
 public boolean desmatricularAluno(int posAluno) {
  if(posAluno < alunos.size() && posAluno >= 0) {
  alunos.remove(posAluno);
  frequencia.remove(posAluno);
  notas.remove(posAluno);
  return true;
  }
  else {
   return false;
  }
 }
 
 public void setProfessor(Professor professor) {
  this.professor = professor;
 }
 
 public void removerProfessor() {
  this.professor = null;
 }
 
 public void exibirAprovados() {
  int a = 0;
  if(alunos.size() != 0) {
   for(int i = 0; i <= alunos.size() - 1; i++) {
    if(notas.get(i) >= 6 && frequencia.get(i) >= 7.5) {
     System.out.println("O aluno " + alunos.get(i).getNome() + " cujo o RA é " + alunos.get(i).getRa() + " foi aprovado");
    }
    else {
     a++;
    }
   }
   if(a == alunos.size() - 1) {
    System.out.println("Não há alunos aprovados");
   }
  }
  else {
  System.out.println("Disciplinas não possui alunos matriculados");
  }
 }
 
 public int getQuantidadeReprovados() {
  int a = 0;
  for(int i = 0; i <= alunos.size() - 1; i++) {
   if(notas.get(i) < 6 || frequencia.get(i) < 7.5) {
    a++;
   }
  }
  return a;
 }
 
 public int getQuantidadeAprovados() {
  int a;
  a = (alunos.size()) -  this.getQuantidadeReprovados();
  return a;
 }
 
 public boolean estaAprovado(int posAluno) {
  if(notas.get(posAluno) >= 6 && frequencia.get(posAluno) >= 7.5) {
   return true;
  }
  else {
   return false;
  }
 }
 
 public double getNotaAluno(int posAluno) {
  return notas.get(posAluno);
 }
 
 public int getNumeroAlunos() {
  return alunos.size() - 1;
 }

 public double getFrequenciaAluno(int posAluno) {
  return frequencia.get(posAluno);
 }
 
 public void exibirReprovados() {
  int a = 0;
  if(alunos.size() != 0) {
   for(int i = 0; i <= alunos.size() - 1; i++) {
    if(notas.get(i) < 6 || frequencia.get(i) < 7.5) {
     System.out.println("O aluno " + alunos.get(i).getNome() + " cujo o RA é " + alunos.get(i).getRa() + " foi reprovado");
    }
    else {
     a++;
    }
   }
   if(a == alunos.size() - 1) {
    System.out.println("Não há alunos reprovados");
   }
  }
  else {
  System.out.println("Disciplinas não possui alunos matriculados");
  }
}
  
 
 public void exibirProfessor() {
  if(this.professor != null) {
  System.out.println(this.professor.getNome());
  System.out.println(this.professor.getSuap());
  }
  else {
   System.out.println("Essa disciplina nao possui professor ministrante");
  }
 }
 
 public void getAproveitamentoAluno() {
  for(int i = 0; i <= alunos.size() - 1; i++) {
  double a = (frequencia.get(i) * 100)/this.numTotalAulas;
  System.out.println("Aproveitamento do aluno " + a);
  System.out.println("Nota do aluno " + notas.get(i));
  System.out.println("Nome do aluno " + alunos.get(i).getNome());
  System.out.println(" ");
  }
 }
 
 public boolean addFrequencia(int posAluno, int frequenciaTotal) {
  if(posAluno >= 0 && posAluno <= alunos.size() - 1) {
  frequencia.set(posAluno,frequenciaTotal);
  return true;
  }
  else {
  return false;
  }

 }
 
 public void desmatricularAlunos() {
  for(int i = 0; i <= alunos.size() - 1; i++) {
   this.alunos.remove(i);
   this.frequencia.remove(i);
   this.notas.remove(i);
  }
 }
 
 public void exibirAlunosAcimaDaMedia() {
  int a = 0;
  if(alunos.size() != 0) {
   for(int i = 0; i <= alunos.size() - 1; i++) {
    if(notas.get(i) >= 6) {
     System.out.println("O aluno " + alunos.get(i).getNome() + " cujo o RA é " + alunos.get(i).getRa() + " esta acima da media");
     a++;
    }
   }
   if(a == 0) {
    System.out.println("Nenhum aluno esta acima da media");
   }
  }
  else {
   System.out.println("Essa disciplina nao possui alunos matriculados");
  }
 }
 
 public void exibirAlunosAbaixoDaMedia() {
  int a = 0;
  if(alunos.size() != 0) {
   for(int i = 0; i <= alunos.size() - 1; i++) {
    if(notas.get(i) < 6) {
     System.out.println("O aluno " + alunos.get(i).getNome() + " cujo o RA é " + alunos.get(i).getRa() + " esta abaixo da media");
     a++;
    }
   }
   if(a == 0) {
    System.out.println("Nenhum aluno esta abaixo da media");
   }
  }
  else {
   System.out.println("Essa disciplina nao possui alunos matriculados");
  }
 }
 
 public void addNota(int posAluno, double nota) {
  notas.set(posAluno, nota);
 }
 
 public String[][] ordenaNotas() {
  int contador=0,contadorMaior=0;
  String n="", m="", n1="", m1="";
  String numNomes[][] = new String[notas.size()][notas.size()];
  
  for(int i = 0; i <= notas.size() - 1; i++) {
   numNomes[i][0] = String.valueOf(notas.get(i));
   numNomes[i][1] = alunos.get(i).getNome();
   
   if(i > 0) {
    for(int a = i - 1; a >= 0; a-- ) {
     if(Double.parseDouble(numNomes[a][0]) <= Double.parseDouble(numNomes[i][0])) {
      contadorMaior++;
     }
     else {
      continue;
     }
    }
     contador = 0;
     if(contadorMaior > 0) {
      for(int b = i - contadorMaior; b <= i; b++ ) {
       if(contador == 0) {
        m = numNomes[b][0];
        numNomes[i - contadorMaior][0] = numNomes[i][0];
        numNomes[i][0] = m;
        
        m1 = numNomes[b][1];
        numNomes[i - contadorMaior][1] = numNomes[i][1];
        numNomes[i][1] = m1;
        
        contador++;
       }
       else if(contador%2 == 0 && contador != 0) {
        m = numNomes[b][0];
        numNomes[b][0] = n;
        
        m1 = numNomes[b][1];
        numNomes[b][1] = n1;
  
        contador++;
       }
       else if(contador%2 != 0){
        n = numNomes[b][0];
        numNomes[b][0] = m;
        
        n1 = numNomes[b][1];
        numNomes[b][1] = m1;
        
        contador++;
       }
      }
      contadorMaior = 0;   
     }
   }
  }
  
   return numNomes;
 }
 
 public void exibirOrdenadoPorNotas(int posAluno) {
  int contador = 0;
  String a[][] = ordenaNotas();
  for(int i = 0; i <= notas.size() - 1; i++) {
   if(notas.get(posAluno) == Double.parseDouble(a[i][0]) && contador == 0) {
  System.out.println(a[i][0] + " nota do aluno especificado");
  contador++;
   }
   else {
  System.out.println(a[i][0]);
   }
  }
 }
 
 public void exibirOrdenadosPorNotas() {
  String a[][] = ordenaNotas();
  for(int i = 0; i <= notas.size() - 1; i++) {
  System.out.println(a[i][0] + " " + a[i][1]);
  }
 }
 
 
 
 
}

