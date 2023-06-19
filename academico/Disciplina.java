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
 
 public void removerProfessor() {
  this.professor = null;
 }
 
 public void exibirAprovados() {
  int a = 0;
  if(alunos.size() != 0) {
   for(int i = 0; i < alunos.size() - 1; i++) {
    if(notas.get(i) >= 6 && frequencia.get(i) >= 75) {
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
  for(int i = 0; i < alunos.size() - 1; i++) {
   if(notas.get(i) <= 6 && frequencia.get(i) >= 75) {
    a++;
   }
  }
  return a;
 }
 
 public boolean estaAprovado(int posAluno) {
  if(notas.get(posAluno) >= 6 && frequencia.get(posAluno) >= 75) {
   return true;
  }
  else {
   return false;
  }
 }
 
 public double getNotaAluno(int posAluno) {
  return notas.get(posAluno);
 }

    
}

