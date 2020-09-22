package com.company;

public class UnidadeManhattan extends UnidadeMonitora{

  public UnidadeManhattan(String id, PontoDeLocalizacao local, boolean video, boolean termometro, boolean co2, boolean ch4) {
    super(id, local, video, termometro, co2, ch4);
  }

  @Override
  public double calcularDistancia(PontoDeLocalizacao destino) {
    double distancia = 0;
    if(this.getCoordenadas() != null && destino != null){
      double diffAbcissa = this.getCoordenadas().getAbcissa() - destino.getAbcissa();
      double diffOrdenada = this.getCoordenadas().getOrdenada() - destino.getOrdenada();
      distancia = Math.abs(diffAbcissa) + Math.abs(diffOrdenada);
    }

    return distancia;
  }
}