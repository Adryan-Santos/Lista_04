package Lista_04_Alysson;

public class Livro implements Comparable{
    private String titulo;
    private String autor;
    private int ano;

    public Livro(){

    }

    public Livro(String titulo, String autor, int ano){
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\nAutor: " + getAutor() + "\nLivro: " + getTitulo() + "\nAno: " + getAno();
    }

    private String geraChave(){
        String chave = (this.getAutor() + this.getTitulo() + this.getAno()).toLowerCase();
        return chave;
    }

    @Override
    public int compareTo(Object obj) {
        Livro outroLivro = (Livro) obj;
        String chaveThis = this.geraChave();
        String outroLivroAutorTituloAno = outroLivro.geraChave();
        return chaveThis.compareTo(outroLivroAutorTituloAno);  
    }

}
