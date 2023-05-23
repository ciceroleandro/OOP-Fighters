import javax.swing.*;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;

    private int empates;

    //Metodos

    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("CHEGOU A HORA!! Deste lado temos o Lutador " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kgs");
        System.out.println("Ganhou " + getVitorias() + " Lutas");
        System.out.println("Perdeu " + getDerrotas() + " Lutas");
        System.out.println("Empatou " + getEmpates() + " Lutas");
    }


    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");

    }

    public void ganhaLuta(){
        setVitorias(getVitorias() + 1);

    }

    public void perdeLuta(){
        setDerrotas(getDerrotas() + 1);

    }

    public void empataLuta(){
        setEmpates(getEmpates() + 1);

    }

    //Metodo Construtor


    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
           } else if (this.peso <=83.9) {
            this.categoria = "Medio";
           }else if (this.peso <=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        empates = em;
    }
}
