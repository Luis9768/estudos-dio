package luis.CollectionsJava.MapCollections.OperacoesBasicasMap.MInhasAtividades.SistemaLogin;

import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {
    Map<String, String> loginMap;

    public SistemaLogin() {
        this.loginMap = new HashMap<>();
    }

    public void adicionarUsuario(String usuario, String senha) {
        loginMap.put(usuario, senha);
    }

    public void removerUsuario(String usuario) {
        if (!loginMap.isEmpty()) {
            loginMap.remove(usuario);
        }
    }

    public void exibirUsuarios() {
        System.out.println(loginMap);
    }

    public boolean fazerLogin(String usuario, String senha) {
        // 1. Primeiro, tentamos pegar a senha que está salva no Map.
        //    Se o 'usuario' (chave) não existir, 'senhaSalva' será 'null'.
        String senhaSalva = loginMap.get(usuario);

        // 2. Agora verificamos as duas condições para um login válido:
        //    a) O usuário deve existir (ou seja, senhaSalva NÃO é null)
        //    b) E (&&) a senha salva deve ser IGUAL à senha fornecida.
        //       (Usamos .equals() para comparar o conteúdo de Strings)
        if (senhaSalva != null && senhaSalva.equals(senha)) {
            // Se AMBAS as condições forem verdadeiras, o login deu certo.
            return true;
        }

        // 3. Se o 'if' falhar (seja por usuário nulo ou senha errada),
        //    o login falhou.
        return false;
    }

    public static void main(String[] args) {
        SistemaLogin s = new SistemaLogin();
        s.adicionarUsuario("luis@gmail.com","luiluis");
        s.adicionarUsuario("carlos@gmail.com","cacarlos");
        s.adicionarUsuario("kaique@gmail.com","kakaique");
        s.adicionarUsuario("erike@gmail.com","erierike");
        s.adicionarUsuario("henrique@gmail.com","henhenrique");
        s.adicionarUsuario("joao@gmail.com","jojoao");
        s.adicionarUsuario("vanderson@gmail.com","vanvanderson");
        System.out.println(">>>>>> Lista de Usuarios <<<<<<<<");
        s.exibirUsuarios();
        System.out.println(">>>>> Fazendo Login <<<<<<<<");
        System.out.println(s.fazerLogin("luis@gmail.com","luiluis"));
        System.out.println(s.fazerLogin("carlos@gmail.org","cacarlos"));
        System.out.println(s.fazerLogin("carlos@gmail.com","jecjebj"));
        System.out.println(">>>>>>>> Removendo Usuario <<<<<<<<<");
        s.removerUsuario("kaique@gmail.com");
        s.exibirUsuarios();
    }
}
