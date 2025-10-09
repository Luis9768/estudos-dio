package luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Estabelecimento;

import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Copiadora.Copiadora;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Digitalizadora.Digitalizadora;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Digitalizadora.Scanner;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Impressora.Deskjet;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Impressora.Impressora;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Impressora.Laserjet;
import luis.PilaresDoPOO.ExemploInterfaces.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Scanner laser = new Scanner();

        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = laser;
         em.imprimir();
         em.copiar();
         em.digitalizar();
    }
}
