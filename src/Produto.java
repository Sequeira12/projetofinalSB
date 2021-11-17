


public class Produto{

    private String identificador;
    private String nome;
    private double preco_unitario;
    private int stock;

    private Promocao n;

    public String getIdentificador() {
        return identificador;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco_unitario() {
        return preco_unitario;
    }
    public int getStock() {
        return stock;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco_unitario(int preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Produto(String identificador, String nome, double preco_unitario, int stock) {
        this.identificador = identificador;
        this.nome = nome;
        this.preco_unitario = preco_unitario;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "identificador='" + identificador + '\'' +
                ", nome='" + nome + '\'' +
                ", preco_unitario=" + preco_unitario +
                ", stock=" + stock +
                ", n=" + n +
                '}';
    }
}

