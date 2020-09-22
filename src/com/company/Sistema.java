package com.company;

import java.util.Scanner;

public class Sistema {

    public void run() {
        Scanner sc = new Scanner(System.in);
        IAreaMonitorada area = new AreaMonitorada();

        System.out.println("AREA A SER MONITORADA: ");
        Double x = sc.nextDouble();
        Double y = sc.nextDouble();

        UnidadeManhattan unidade0 = new UnidadeManhattan("1997", new PontoDeLocalizacao(98, 34), true, false, true, true);
        UnidadeManhattan unidade1 = new UnidadeManhattan("1539", new PontoDeLocalizacao(71, 65), true, true, true, true);

        area.addUnidade(unidade0);
        area.addUnidade(unidade1);

        System.out.println(area.monitorar(new PontoDeLocalizacao(x, y), false, false, false, true));

        sc.close();
    }

    public static void main(String[] args) {
        Sistema app = new Sistema();
        app.run();
    }
}