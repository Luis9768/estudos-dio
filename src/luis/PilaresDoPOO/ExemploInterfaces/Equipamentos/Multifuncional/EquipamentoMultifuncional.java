package luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Multifuncional;

import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Copiadora.Copiadora;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Digitalizadora.Digitalizadora;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copinado via equipamento Multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional...");
    }
}
