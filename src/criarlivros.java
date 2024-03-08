//Classe de Execução = main
public class criarlivros {
    public static void main(String[] args) {
        //Instanciando um objeto=> criar o objeto na memória
        //tipoObjetivo nomeObjeto = operadorInstanciação construtor;
        //Livro favorito =       new     Livro()
        livro favorito = new livro();
        favorito.titulo = "O Hobbit" ;
        favorito.autor = "J. R.R. Talkien" ;
        favorito.valor = 37.27;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "COMUM";

        System.out.println("Meu livro favorito é: " + favorito.autor +
                "preço: R$" + favorito.valor);

        livro meuLivro = new livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 58.98;



    }




}
