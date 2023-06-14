package ifsuldeminas.alunos;

 public class Aluno {
 private static String nome;
 private int ra;
 private String curso;
 private int período=1;


    
    public Aluno(String nome, int ra, int periodo, String curso) {
     this.nome=nome;
     this.curso=curso;
     this.ra=ra;
     this.período=periodo;
     
    }
 
 public String getNome(){
  return nome;
 }
 
 public void setNome(String nome) {
  this.nome = nome;
 }
 public int getRa() {
  return ra;
 }

 public void setRa(int ra) {
  this.ra = ra;
 }

 public String getCurso() {
  return curso;
 }

 public void setCurso(String curso) {
  this.curso = curso;
 }
 
 public int getPeríodo() {
  return período;
 }
 
 public void setPeríodo(int período) {
  this.período = período;
 }
    
 public void Aluno(String nome, int ra, String curso) {
     this.nome=nome;
     this.curso=curso;
     this.ra=ra;
   
    }
 public void mostrarInformacoes() {
  System.out.println(nome);
  System.out.println(ra);
  System.out.println(período);
  System.out.println(curso);
 
}
    }
