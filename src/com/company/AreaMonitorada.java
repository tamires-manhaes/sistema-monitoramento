package com.company;

import java.util.ArrayList;
import java.util.List;

public class AreaMonitorada implements IAreaMonitorada{
  private List<UnidadeMonitora> unidades = new ArrayList<>();

  public AreaMonitorada() {
  }

  public UnidadeMonitora unidadeMaisProxima(PontoDeLocalizacao localizacao, List<UnidadeMonitora> unidades){
    UnidadeMonitora unidade = null;
    Double maiorDistancia = Double.MAX_VALUE;
    for(UnidadeMonitora u : unidades) {
      if(u.calcularDistancia(localizacao) < maiorDistancia) {
        unidade = u;
      }
    }
    return unidade;
  }

  @Override
  public String monitorar(PontoDeLocalizacao localizacao, boolean video, boolean termometro, boolean co2, boolean ch4) {
    List<UnidadeMonitora> unidadesCondifMinima = new ArrayList<>();
    try {
      for(UnidadeMonitora unidade : unidades){
        if(unidade.temConfiguracaoMinima(video, termometro, co2, ch4)){
          unidadesCondifMinima.add(unidade);
        }
      }

      UnidadeMonitora unidadeProxima = unidadeMaisProxima(localizacao, unidadesCondifMinima);
      unidadeProxima.atualizarUnidade(localizacao);
      return unidadeProxima.getId();

    }catch(NullPointerException e){
      throw new NullPointerException("unidade compatível não encontrada");
    }
  }

  public void addUnidade(UnidadeMonitora unidade) {
    unidades.add(unidade);
  }
}