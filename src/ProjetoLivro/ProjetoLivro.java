package ProjetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa [2];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa ("Maria", 26, "F");
		p[1] = new Pessoa ("Juracy", 23, "M");
		
		l[0] = new Livro ("O Capital", "Karl Marx", 208, p[1]);
		l[1] = new Livro ("Tiger Lily", "Jodi Lynn", 300, p[0]);
		l[2] = new Livro ("Game of Thrones", "J R R Martin", 800, p[1]);
		
		l[0].abrir ();
		l[0].folhear(100);
		l[0].avancarPag();
		System.out.println (l[0].detalhes());
		
		System.out.println(l[1].detalhes());

	}

}
