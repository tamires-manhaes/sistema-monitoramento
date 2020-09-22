package com.company;

public interface IAreaMonitorada {
  public String monitorar(PontoDeLocalizacao localizacao, boolean video, boolean termometro, boolean co2, boolean ch4);

  public void addUnidade(UnidadeMonitora unidade);
}