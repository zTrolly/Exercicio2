import java.util.*;

public class principal {
	
    public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		int n;

        System.out.println("Entre com o valor que voce deseja: ");
        System.out.println("1) Listar");
        System.out.println("2) Inserir");
        System.out.println("3) Excluir");
        System.out.println("4) Atualizar");
        System.out.println("5) Sair");
        n = sc.nextInt();

        if (n == 1){
            //Mostrar usuários
		X = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < X.length; i++) {
			System.out.println(X[i].toString());
		}  
        } else if(n ==2) {
          //Inserir um elemento na tabela
		X usuario = new X(11, "pablo", "pablo",'M');
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}
        } else if(n == 3) {
            dao.excluirUsuario(usuario.getCodigo());
        } else if (n == 4) {
            //Atualizar usuário
		    usuario.setSenha("nova senha");
		    dao.atualizarUsuario(usuario);
        } else if (n == 5 ){
            dao.close();
        } else {
            System.out.println("Valor nao conhecido");
        }
	}
}