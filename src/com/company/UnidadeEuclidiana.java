package com.company;

public class UnidadeEuclidiana extends UnidadeMonitora{

  public UnidadeEuclidiana(String id, PontoDeLocalizacao local, boolean video,boolean termometro, boolean medidorco2, boolean medidorch4){
    super(id, local, video, termometro, medidorco2, medidorch4);
  }

  @Override
  public double calcularDistancia(PontoDeLocalizacao destino) {
    double distancia = 0d;
    if (this.getCoordenadas() != null && destino != null) {
      double diffAbcissa = this.getCoordenadas().getAbcissa() - destino.getAbcissa();
      double diffOrdenada = this.getCoordenadas().getOrdenada() - destino.getOrdenada();
      distancia = Math.sqrt(Math.pow(diffAbcissa, 2) + Math.pow(diffOrdenada, 2));
    }
    return distancia;
  }
}